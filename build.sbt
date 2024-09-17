val ScalatraVersion = "3.1.0"

ThisBuild / scalaVersion := "3.3.3"
ThisBuild / organization := "com.example"

lazy val hello = (project in file("."))
  .settings(
    name := "ErrorHandlerRepro",
    version := "0.1.0-SNAPSHOT",
    libraryDependencies ++= Seq(
      "org.scalatra" %% "scalatra-jakarta" % ScalatraVersion,
      "org.scalatra" %% "scalatra-scalatest-jakarta" % ScalatraVersion % "test",
      "ch.qos.logback" % "logback-classic" % "1.5.6" % "runtime",
      "jakarta.servlet" % "jakarta.servlet-api" % "6.0.0" % "provided"
    ),
  )

enablePlugins(SbtTwirl)
