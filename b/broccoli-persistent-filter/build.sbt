organization := "org.scalablytyped.japgolly"
name := "broccoli-persistent-filter"
version := "3.1.3-2e98ac"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "broccoli-node-api" % "1.7.0-c1e939",
  "org.scalablytyped.japgolly" %%% "broccoli-output-wrapper" % "3.2.5-fb9a06",
  "org.scalablytyped.japgolly" %%% "broccoli-plugin" % "4.0.7-cb028c",
  "org.scalablytyped.japgolly" %%% "fs-merger" % "3.2.1-8d1b9c",
  "org.scalablytyped.japgolly" %%% "fs-tree-diff" % "2.0.1-ba716c",
  "org.scalablytyped.japgolly" %%% "minimatch" % "5.1-dt-20220831Z-eb11ff",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "walk-sync" % "3.0.0-da9544")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
