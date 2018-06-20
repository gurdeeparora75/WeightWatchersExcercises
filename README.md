# GurdeepWeightWatchers

#### How to run ####
IMPORTANT: I've deployed the code so that it runs with single command using **_Maven_** (https://maven.apache.org/index.html). You must have Maven installed before executing any program.

So, you need to have either mvn, mvn2 or mvn3 binaries in your path, i.e., assuming you've installed Maven, you should be able to run mvn command in a terminal or shell command prompt.

#### Question 1 ####
**This works on Windows, Linux or Mac OSes**
This questions asks me to parse the input file and print key value pairs.

To run this, go to root path of the project and type:

**mvn package exec:java -Dexec.mainClass=arora.gurdeep.weightwatchers.Question1 -Dexec.args="data/sample.txt"**

This first compiles and packages Question1 class and then runs Question1 and passes "sample.txt" file name under data directory as the input. You may also pass data/bad.txt to test a file with some badly formatted lines.


#### Question 3 ####
**This works on Windows, Linux or Mac OSes**
This questions asks find 500 random numbers and print the "n"th.

To run this, go to root path of the project and type:

**mvn package exec:java -Dexec.mainClass=arora.gurdeep.weightwatchers.Question3 -Dexec.args="3"**

This will print all 500 random numbers and then print the 3rd largest amongst them.

#### Question 2 (WebDriver Project)
**This project runs _ONLY on WINDOWS_ OS**
Pre-requisites : 
1. Java (JRE and JDK should be installed and JAVA_HOME should be set.)
2. Maven should be installed.
3. This project uses 3.x version of Selenium Webriver. So you need to have latest firefox version.
4. Browsers supported: Chrome and Firefox.

To run this project do the following:
Go to root path of project and type: **mvn test**
