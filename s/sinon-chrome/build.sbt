organization := "org.scalablytyped.japgolly"
name := "sinon-chrome"
version := "v2.2.4-dt-20220913Z-aefbd3"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "chrome" % "0.0-unknown-dt-20221015Z-c1e33d",
  "org.scalablytyped.japgolly" %%% "filesystem" % "0.0-unknown-dt-20220818Z-6a0c2c",
  "org.scalablytyped.japgolly" %%% "filewriter" % "0.0-unknown-dt-20220818Z-a124df",
  "org.scalablytyped.japgolly" %%% "har-format" % "1.2-dt-20220923Z-409a8b",
  "org.scalablytyped.japgolly" %%% "sinon" % "10.0-dt-20220720Z-30f991",
  "org.scalablytyped.japgolly" %%% "sinonjs__fake-timers" % "8.1-dt-20220323Z-f8d735",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
