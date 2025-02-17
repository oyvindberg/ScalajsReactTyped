organization := "org.scalablytyped.japgolly"
name := "jest-config"
version := "29.2.0-da8326"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "istanbul-lib-coverage" % "2.0-dt-20211223Z-59a441",
  "org.scalablytyped.japgolly" %%% "istanbul-lib-report" % "3.0-dt-20211202Z-4ab34b",
  "org.scalablytyped.japgolly" %%% "istanbul-reports" % "3.0-dt-20211202Z-2c0222",
  "org.scalablytyped.japgolly" %%% "jest-validate" % "29.2.0-e8aedd",
  "org.scalablytyped.japgolly" %%% "jest__schemas" % "29.0.0-3cabfb",
  "org.scalablytyped.japgolly" %%% "jest__types" % "29.2.0-b8d122",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "sinclair__typebox" % "0.24.42-a97bd0",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "yargs" % "17.0-dt-20220923Z-5c6d88",
  "org.scalablytyped.japgolly" %%% "yargs-parser" % "21.0-dt-20220624Z-532e39")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
