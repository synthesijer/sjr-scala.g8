import Dependencies._

// give the user a nice default project!
ThisBuild / organization := "com.example"
ThisBuild / scalaVersion := "2.13.4"

lazy val root = (project in file(".")).
  settings(
    name := "$name$",
    resolvers += "Github Repository" at "https://synthesijer.github.io/web/pub/",
    libraryDependencies += "synthesijer" % "synthesijer" % "3.1.0"
  )
