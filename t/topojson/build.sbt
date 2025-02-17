organization := "org.scalablytyped.japgolly"
name := "topojson"
version := "3.2-dt-20220624Z-9c4e06"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "geojson" % "7946.0-dt-20220713Z-3b0707",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "topojson-client" % "3.1-dt-20220330Z-09579d",
  "org.scalablytyped.japgolly" %%% "topojson-simplify" % "3.0-dt-20220624Z-084dcd",
  "org.scalablytyped.japgolly" %%% "topojson-specification" % "1.0-dt-20220624Z-e289e5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
