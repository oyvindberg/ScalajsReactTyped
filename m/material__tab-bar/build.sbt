organization := "org.scalablytyped.japgolly"
name := "material__tab-bar"
version := "14.0.0-110d12"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "material__base" % "14.0.0-29b455",
  "org.scalablytyped.japgolly" %%% "material__ripple" % "14.0.0-caf9c9",
  "org.scalablytyped.japgolly" %%% "material__tab" % "14.0.0-e0db9c",
  "org.scalablytyped.japgolly" %%% "material__tab-indicator" % "14.0.0-fdcaad",
  "org.scalablytyped.japgolly" %%% "material__tab-scroller" % "14.0.0-c6a123",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
