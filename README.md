#This project is a scala template project.
#To use it without IDE
Download scala-sbt.org (for windows just install the msi. For the others, unpack the zip and
 puth the bin directory  within the PATH variable , .bashrc )
#To use it (after cloning the project)
sbt clean/compile/run
#To run without sbt create a runnable jar file:
sbt one-jar (jar will be placed in target/scala<version>)
<copy the new jar to main project folder.
java -jar <name>.jar


