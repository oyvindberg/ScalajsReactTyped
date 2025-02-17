organization := "org.scalablytyped.japgolly"
name := "d3-graphviz"
version := "2.6-dt-20211202Z-97fed4"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "d3-color" % "3.1-dt-20220522Z-ee6702",
  "org.scalablytyped.japgolly" %%% "d3-interpolate" % "3.0-dt-20220624Z-f5cf27",
  "org.scalablytyped.japgolly" %%% "d3-selection" % "3.0-dt-20220720Z-ea39dc",
  "org.scalablytyped.japgolly" %%% "d3-transition" % "3.0-dt-20220817Z-4b8cb3",
  "org.scalablytyped.japgolly" %%% "d3-zoom" % "3.0-dt-20220624Z-463097",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
