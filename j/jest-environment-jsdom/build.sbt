organization := "org.scalablytyped.japgolly"
name := "jest-environment-jsdom"
version := "29.0.3-6775e4"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "istanbul-lib-coverage" % "2.0-dt-20211223Z-59a441",
  "org.scalablytyped.japgolly" %%% "istanbul-lib-report" % "3.0-dt-20211202Z-4ab34b",
  "org.scalablytyped.japgolly" %%% "istanbul-reports" % "3.0-dt-20211202Z-2c0222",
  "org.scalablytyped.japgolly" %%% "jest-message-util" % "29.2.0-d07bfc",
  "org.scalablytyped.japgolly" %%% "jest-mock" % "29.2.0-8e5ee0",
  "org.scalablytyped.japgolly" %%% "jest__environment" % "29.2.0-233214",
  "org.scalablytyped.japgolly" %%% "jest__fake-timers" % "29.2.0-91f147",
  "org.scalablytyped.japgolly" %%% "jest__schemas" % "29.0.0-3cabfb",
  "org.scalablytyped.japgolly" %%% "jest__types" % "29.2.0-b8d122",
  "org.scalablytyped.japgolly" %%% "jsdom" % "20.0-dt-20220723Z-d4106a",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "parse5" % "7.1.1-73c81c",
  "org.scalablytyped.japgolly" %%% "sinclair__typebox" % "0.24.42-a97bd0",
  "org.scalablytyped.japgolly" %%% "stack-utils" % "2.0-dt-20211202Z-fd9cdc",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "tough-cookie" % "4.0-dt-20220414Z-f938b4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
