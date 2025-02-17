organization := "org.scalablytyped.japgolly"
name := "azure__core-http"
version := "2.2.7-58a15c"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "azure__abort-controller" % "1.1.0-21258e",
  "org.scalablytyped.japgolly" %%% "azure__core-auth" % "1.4.0-4e7c67",
  "org.scalablytyped.japgolly" %%% "azure__core-tracing" % "1.0.1-ffac56",
  "org.scalablytyped.japgolly" %%% "azure__logger" % "1.0.3-ef36cc",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "tunnel" % "0.0-dt-20211202Z-d08bb6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
