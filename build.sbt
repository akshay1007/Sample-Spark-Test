ThisBuild / scalaVersion := "2.12.12"
ThisBuild / organization := "com.akshay"

lazy val hello = (project in file("."))
  .settings(
    name := "Hello",
    libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.2",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.2" % "test",
    libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.6",
    libraryDependencies += "org.apache.spark" %% "spark-core" % "2.4.6",
    libraryDependencies += "com.holdenkarau" %% "spark-testing-base" % "2.4.2_0.14.0" % Test



  )