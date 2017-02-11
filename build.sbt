import com.github.retronym.SbtOneJar._

scalaVersion := "2.11.5"

name := "dev_env"

version := "1.0"

libraryDependencies ++= Seq(
	"com.rockymadden.stringmetric" %% "stringmetric-core" % "0.27.4"
)

oneJarSettings
libraryDependencies += "commons-lang" % "commons-lang" % "2.6"