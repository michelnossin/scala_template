import com.github.retronym.SbtOneJar._

scalaVersion := "2.11.5"

name := "dev_env"

version := "1.0"

/*
libraryDependencies ++= Seq(
	"com.rockymadden.stringmetric" %% "stringmetric-core" % "0.27.4",
  "com.typesafe.slick" %% "slick" % "3.1.1",
  "org.slf4j" % "slf4j-nop" % "1.6.4"
)
*/
/*
libraryDependencies ++= Seq(
  "com.fasterxml.jackson.core" % "jackson-core" % "2.1.1",
  "com.fasterxml.jackson.core" % "jackson-annotations" % "2.1.1",
  "com.fasterxml.jackson.core" % "jackson-databind" % "2.1.1",
  "com.fasterxml.jackson.dataformat" % "jackson-dataformat-yaml" % "2.1.1"
)
*/
libraryDependencies += "org.yaml" % "snakeyaml" % "1.14"

oneJarSettings
libraryDependencies += "commons-lang" % "commons-lang" % "2.6"

