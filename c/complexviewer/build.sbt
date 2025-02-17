organization := "org.scalablytyped.japgolly"
name := "complexviewer"
version := "2.1-dt-20211202Z-aa723a"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "d3-scale" % "4.0-dt-20220624Z-718053",
  "org.scalablytyped.japgolly" %%% "d3-time" % "3.0-dt-20211202Z-0604bb",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
