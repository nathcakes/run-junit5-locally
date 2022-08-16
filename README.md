## Who should use this
This project showcases how to run and use JUnit5 without using an IDE. This was required for demoing my coursework at university and it might benefit other students in the same position.
If you can run JUnit 5 tests through your IDE, you should probably just do that. See [JUnit5 Docs](https://junit.org/junit5/docs/current/user-guide/#running-tests-ide) for set-up advice.

This uses the GNU make which is available for unix environments (MacOS & Linux). I'm not sure if this would work with Cmake or how to install for Windows, 
please see the Java Makefile link below to read more about setting up for Windows. I have included what I believe to be the correct JFlags variable for windows,
comment the normal one by placing a # in front (or removing) and uncomment the WindowsJFlags and feel free to update the name. 

## How to use this project 
You can download the files as a zip and just extract the lib folder and makefile into your project. Alternatively git clone this into your project and delete the un-needed files 
`git clone git@github.com:nathcakes/run-junit5-locally`. 

Or just replicate this repo by using the below link to download the launcher, place it in a lib folder and copy the makefile. 

If all your files are in the same root directory (as per the example set-up):
1. Update the makefile line "Classes: " to the name of your .java files separated with spaces, including the .java file extension.
2. In the terminal type: `make`  
3. To run your tests type: `make runTests`
4. If you update any files, type `make` again, Make will automatically detect which files need to be recompiled
5. If you need to remove all your .class files for submission, type: `make clean`

**NOTE:** This relies on the junit-console file being in a local lib folder, if you update the name you **must** update the makefile and if you submit your work **INCLUDE THE LIB FOLDER.**

I will do my best to keep the junit-console up to date with the latest release, you can manually update the console by replacing the jar file in "./lib/" with the latest release available [here](https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/).
If you are updating the junit-console make sure you also update the makefile. Please feel free to open an issue in GitHub if the console is updated to notify me. 

If you separate your files (e.g. "src", "out", "tests" etc.):
1. Update the JFLAGS in the makefile to include the dir of your .java files and add a wildcard (*), separated by : e.g. "./lib/\*:./src/\*:./tests/\*"
2. Update the JFLAGS in the makefile to include the -d flag for your directory e.g. -d "./out/dev"
3. Update the runTests in the makefile to include the dir of your test .class files in the -cp e.g. `java -jar "./lib/junit-platform-console-standalone-1.9.0.jar" -cp ./out/dev/* --scan-classpath`

I'm not sure how to update the Clean command, unfortunately. You might also want to make some other make commands, but at this point you're probably better off using an IDE.
## Customizations
In the makefile, you can add the below flags to the runTests command, there are more listed on JUnit5 docs.
- --reports-dir=DIR (Creates a report and stores it in the DIR provided)
- --fail-if-no-tests (If there are no tests, it will exit with a status code 2)
- --details=MODE (Available modes are none,summary,flat,tree,verbose) default is tree.
See [here](https://junit.org/junit5/docs/current/user-guide/#running-tests)for additional flags you can pass to the runTests command.


## Thanks & Shout-outs 
Thanks to Tia Newhall of Swarthmore College, PA USA for her [Java makefile examples](https://www.cs.swarthmore.edu/~newhall/unixhelp/javamakefiles.html), this helped me build the Java makefile.

ExampleClass & ExampleTests are adapted from the [JUnit-5 samples](https://github.com/junit-team/junit5-samples/tree/HEAD/junit5-jupiter-starter-gradle) provided by the junit-team under the Eclipse Public License - v2.0

## LICENSE 
This project uses code provided under the Eclipse Public License - v2.0 and this project itself is made available under the same license. As of 16 Aug, 2022.
You can read the license here: [Eclipse Public License - v2.0](http://www.eclipse.org/legal/epl-v20.html)

Author - Nate Brown 16/08/2022