JFLAGS = -g -cp "./lib/*:./"
#WINDOWSJFLAGS = -g -cp "./lib/*;./"
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = ExampleClass.java ExampleTests.java ExampleVintageTests.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class
runTests:
	java -jar "./lib/junit-platform-console-standalone-1.9.2.jar" -cp ./ --scan-classpath
runVTests:
	java -jar "./lib/junit-platform-console-standalone-1.9.2.jar" -cp ./ --scan-classpath --details=verbose