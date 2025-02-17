organization := "org.scalablytyped.japgolly"
name := "hexo"
version := "3.8-dt-20220910Z-74d83f"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "bluebird" % "3.5-dt-20220923Z-dde6a1",
  "org.scalablytyped.japgolly" %%% "bunyan" % "1.8-dt-20211202Z-40b88d",
  "org.scalablytyped.japgolly" %%% "connect" % "v3.4.0-dt-20220818Z-62b6dd",
  "org.scalablytyped.japgolly" %%% "hexo-util" % "0.6-dt-20220911Z-4ef7e1",
  "org.scalablytyped.japgolly" %%% "minimist" % "1.2-dt-20211202Z-6b7ca4",
  "org.scalablytyped.japgolly" %%% "moment" % "2.29.4-49fb6c",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "underscore" % "1.11-dt-20220722Z-16472a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
