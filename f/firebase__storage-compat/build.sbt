organization := "org.scalablytyped.japgolly"
name := "firebase__storage-compat"
version := "0.1.20-753419"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "firebase__app" % "0.8.2-bfba1f",
  "org.scalablytyped.japgolly" %%% "firebase__app-check-interop-types" % "0.1.0-13e1f4",
  "org.scalablytyped.japgolly" %%% "firebase__app-types" % "0.8.0-d25a07",
  "org.scalablytyped.japgolly" %%% "firebase__auth-interop-types" % "0.1.6-bdd746",
  "org.scalablytyped.japgolly" %%% "firebase__component" % "0.5.20-97e94a",
  "org.scalablytyped.japgolly" %%% "firebase__logger" % "0.3.3-2bcaf2",
  "org.scalablytyped.japgolly" %%% "firebase__storage" % "0.9.12-50e265",
  "org.scalablytyped.japgolly" %%% "firebase__storage-types" % "0.6.0-2a73c4",
  "org.scalablytyped.japgolly" %%% "firebase__util" % "1.7.2-2aee96",
  "org.scalablytyped.japgolly" %%% "formdata-polyfill" % "4.0.10-5be100",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "node-fetch" % "3.2.10-78ad93",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
