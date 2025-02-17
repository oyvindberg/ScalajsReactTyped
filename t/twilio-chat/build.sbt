organization := "org.scalablytyped.japgolly"
name := "twilio-chat"
version := "6.0.0-a91b78"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "loglevel" % "1.8.0-688420",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "twilio-sync" % "3.1.0-4f9d14",
  "org.scalablytyped.japgolly" %%% "twilio__mcs-client" % "0.5.3-7fd44e",
  "org.scalablytyped.japgolly" %%% "twilio__notifications" % "1.0.5-5541d9",
  "org.scalablytyped.japgolly" %%% "twilio__replay-event-emitter" % "0.2.4-534531",
  "org.scalablytyped.japgolly" %%% "twilsock" % "0.12.2-b6137d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
