organization := "org.scalablytyped.japgolly"
name := "webdriver"
version := "7.25.1-945fb4"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "typescript" % "4.8.4-7a2e7a",
  "org.scalablytyped.japgolly" %%% "wdio__protocols" % "7.22.0-3b09f4",
  "org.scalablytyped.japgolly" %%% "wdio__types" % "7.25.1-b94743")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
