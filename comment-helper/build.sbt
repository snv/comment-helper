organization := "unofficial.fernuni-hagen.de"

name := "comment-helper"

version := "2.10.0"

libraryDependencies += "org.jsoup" % "jsoup" % "1.8.1"

autoScalaLibrary := false

// Include only src/main/java in the compile configuration
unmanagedSourceDirectories in Compile := (javaSource in Compile).value :: Nil

// Include only src/test/java in the test configuration
unmanagedSourceDirectories in Test := (javaSource in Test).value :: Nil

javacOptions ++= Seq("-source", "1.8")

javacOptions ++= Seq("-target", "1.8")

scalacOptions += "-target:jvm-1.8"

//eclipse settings
EclipseKeys.projectFlavor := EclipseProjectFlavor.Java

EclipseKeys.withSource := true

EclipseKeys.withJavadoc := true