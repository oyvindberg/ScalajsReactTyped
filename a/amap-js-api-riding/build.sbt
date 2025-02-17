organization := "org.scalablytyped.japgolly"
name := "amap-js-api-riding"
version := "1.4-dt-20211202Z-d55200"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "amap-js-api" % "1.4-dt-20220624Z-b39b02",
  "org.scalablytyped.japgolly" %%% "amap-js-api-place-search" % "1.4-dt-20211202Z-492bff",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
