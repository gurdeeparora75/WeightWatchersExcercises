# GurdeepWeightWatchers

#### How to run ####
IMPORTANT: I've deployed the code so that it runs with single command using Maven.
So, you need to have mvn, mvn2 or mvn3 in your path, i.e., assuming you've installed Maven, you should be able
to run mvn in terminal or command prompt.


#### Question 1 ####
This questions asks me to parse the input file and print key value pairs.

To run this, go to root path of the project and type:

mvn -e exec:java -Dexec.mainClass=arora.gurdeep.weightwatchers.Question1 -Dexec.args="data/sample.txt"
This runs Question 1 and passes "sample.txt" as the input. You may also pass data/bad.txt for file with some badly
formatted lines.


#### Question 3 ####
This questions asks find 500 random numbers and print the "n"th.

To run this, go to root path of the project and type:

mvn -e exec:java -Dexec.mainClass=arora.gurdeep.weightwatchers.Question3 -Dexec.args="3"
This will print all 500 random numbers and print the 3rd.

#### Question 2 (WebDriver Project)
Pre-requisites : 
1. Java (JRE and JDK should be installed)
2. Maven should be installed.
3. This project runs ONLY on WINDOWS operating system.
4. This project uses 3.x version of Selenium Webriver. So you need to have latest firefox version.
5. Browsers supported -  Chrome and Firefox

To run this project-
Go to root path of project and type :
mvn test
