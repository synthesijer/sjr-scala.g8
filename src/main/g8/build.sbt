import Dependencies._

// give the user a nice default project!
ThisBuild / organization := "com.example"
ThisBuild / scalaVersion := "2.12.8"

lazy val root = (project in file(".")).
  settings(
    name := "sjr-scala.g8",
    libraryDependencies += scalaTest % Test,
    resolvers += "Github Repository" at "https://synthesijer.github.io/web/pub/",
    libraryDependencies += "synthesijer" % "synthesijer" % "3.0.1"
  )
