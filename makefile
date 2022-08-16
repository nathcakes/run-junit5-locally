JFLAGS = -g -cp "./lib/*:./"
#WINDOWSJFLAGS = -g -cp "./lib/*;./"
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = ExampleClass.java ExampleTests.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class
runTests:
	java -jar "./lib/junit-platform-console-standalone-1.9.0.jar" -cp ./ --scan-classpath

