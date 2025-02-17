organization := "org.scalablytyped.japgolly"
name := "pacote"
version := "11.1-dt-20220616Z-e269b8"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "formdata-polyfill" % "4.0.10-5be100",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "node-fetch" % "3.2.10-78ad93",
  "org.scalablytyped.japgolly" %%% "npm-package-arg" % "6.1-dt-20211202Z-57658f",
  "org.scalablytyped.japgolly" %%% "npm-registry-fetch" % "8.0-dt-20220214Z-b5e754",
  "org.scalablytyped.japgolly" %%% "npmlog" % "4.1-dt-20211223Z-15c049",
  "org.scalablytyped.japgolly" %%% "ssri" % "7.1-dt-20211202Z-541c8a",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
