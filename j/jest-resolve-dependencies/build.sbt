organization := "org.scalablytyped.japgolly"
name := "jest-resolve-dependencies"
version := "29.2.0-b166f4"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "expect" % "29.2.0-d439d9",
  "org.scalablytyped.japgolly" %%% "graceful-fs" % "4.1-dt-20211202Z-fa8869",
  "org.scalablytyped.japgolly" %%% "istanbul-lib-coverage" % "2.0-dt-20211223Z-59a441",
  "org.scalablytyped.japgolly" %%% "istanbul-lib-report" % "3.0-dt-20211202Z-4ab34b",
  "org.scalablytyped.japgolly" %%% "istanbul-reports" % "3.0-dt-20211202Z-2c0222",
  "org.scalablytyped.japgolly" %%% "jest-diff" % "29.2.0-b60f93",
  "org.scalablytyped.japgolly" %%% "jest-haste-map" % "29.2.0-83e8ce",
  "org.scalablytyped.japgolly" %%% "jest-matcher-utils" % "29.2.0-331d47",
  "org.scalablytyped.japgolly" %%% "jest-resolve" % "29.2.0-0d693c",
  "org.scalablytyped.japgolly" %%% "jest-snapshot" % "29.2.0-75e2dc",
  "org.scalablytyped.japgolly" %%% "jest__expect-utils" % "29.2.0-933f66",
  "org.scalablytyped.japgolly" %%% "jest__schemas" % "29.0.0-3cabfb",
  "org.scalablytyped.japgolly" %%% "jest__types" % "29.2.0-b8d122",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "pretty-format" % "29.2.0-dde28b",
  "org.scalablytyped.japgolly" %%% "sinclair__typebox" % "0.24.42-a97bd0",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
