organization := "org.scalablytyped.japgolly"
name := "prosemirror-changeset"
version := "2.1-dt-20220525Z-4e1aec"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "orderedmap" % "2.0.0-7669b5",
  "org.scalablytyped.japgolly" %%% "prosemirror-model" % "1.18.1-409be1",
  "org.scalablytyped.japgolly" %%% "prosemirror-transform" % "1.7.0-717c6f",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
