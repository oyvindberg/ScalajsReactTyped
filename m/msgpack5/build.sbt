organization := "org.scalablytyped.japgolly"
name := "msgpack5"
version := "v3.4.0-dt-20220818Z-2f45b7"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "bl" % "v5.0-dt-20220818Z-3f01c0",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "readable-stream" % "2.3-dt-20220717Z-f085f8",
  "org.scalablytyped.japgolly" %%% "safe-buffer" % "5.2.1-09a0c8",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
