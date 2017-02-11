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

#To use with an IDE

### Eclipse
Download Scala ide (Eclipse):
http://scala-ide.org/download/sdk.html
To use sbt within eclipse:
https://github.com/typesafehub/sbteclipse

### Intellij with Graddle

Download Intellij community edition:
https://www.jetbrains.com/idea/download/

https://gradle.org/install
Put the bin path (eg C:\Users\Gebruiker\Downloads\gradle-3.3-bin\gradle-3.3\bin in your PATH

At prompt make sure configure -> plugins , shows gradle actived (if not do that and restart the ide)
Make sure JAVA_HOME is set also in your path
In new project creation use "local gradle"

Use : gradle scala to build, or within the ide go to the gradle menu and use Other -> compileScala to build.


