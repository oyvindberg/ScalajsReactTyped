organization := "org.scalablytyped.japgolly"
name := "socketcluster-client"
version := "16.0-dt-20220215Z-2052c8"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "ag-channel" % "5.0-dt-20220215Z-330f6f",
  "org.scalablytyped.japgolly" %%% "ag-simple-broker" % "5.0-dt-20220215Z-65dc42",
  "org.scalablytyped.japgolly" %%% "async-stream-emitter" % "4.0-dt-20220215Z-7c96f4",
  "org.scalablytyped.japgolly" %%% "consumable-stream" % "2.0-dt-20220215Z-eba991",
  "org.scalablytyped.japgolly" %%% "jsonwebtoken" % "8.5-dt-20220824Z-9a567d",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "sc-errors" % "1.4-dt-20211202Z-6de8d8",
  "org.scalablytyped.japgolly" %%% "socketcluster-server" % "16.1-dt-20220215Z-68393a",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "stream-demux" % "8.0-dt-20220215Z-891644",
  "org.scalablytyped.japgolly" %%% "writable-consumable-stream" % "2.0-dt-20220215Z-94a351",
  "org.scalablytyped.japgolly" %%% "ws" % "8.5-dt-20220624Z-5c45c7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
