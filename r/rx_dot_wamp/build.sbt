organization := "org.scalablytyped.japgolly"
name := "rx_dot_wamp"
version := "0.5.0-dt-20220818Z-9c6e50"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "autobahn" % "20.9-dt-20220913Z-04315c",
  "org.scalablytyped.japgolly" %%% "rx-core" % "4.0-dt-20220818Z-218266",
  "org.scalablytyped.japgolly" %%% "rx-lite" % "4.0-dt-20220818Z-ced06c",
  "org.scalablytyped.japgolly" %%% "rx-lite-aggregates" % "4.0-dt-20220818Z-0f0b21",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "when" % "2.4.0-dt-20220818Z-3f36ff")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
