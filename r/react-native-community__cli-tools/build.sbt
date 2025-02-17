organization := "org.scalablytyped.japgolly"
name := "react-native-community__cli-tools"
version := "9.2.1-2bde84"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "cli-spinners" % "2.7.0-d32144",
  "org.scalablytyped.japgolly" %%% "formdata-polyfill" % "4.0.10-5be100",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "node-fetch" % "3.2.10-78ad93",
  "org.scalablytyped.japgolly" %%% "ora" % "6.1.2-ad96ef",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
