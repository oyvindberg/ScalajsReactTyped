organization := "org.scalablytyped.japgolly"
name := "octokit__rest"
version := "19.0.5-624b66"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "before-after-hook" % "3.0.2-1743ac",
  "org.scalablytyped.japgolly" %%% "octokit__core" % "4.1.0-772344",
  "org.scalablytyped.japgolly" %%% "octokit__graphql" % "5.0.3-1e3f65",
  "org.scalablytyped.japgolly" %%% "octokit__openapi-types" % "14.0.0-106969",
  "org.scalablytyped.japgolly" %%% "octokit__plugin-paginate-rest" % "5.0.1-f98cbd",
  "org.scalablytyped.japgolly" %%% "octokit__plugin-rest-endpoint-methods" % "6.7.0-9c902d",
  "org.scalablytyped.japgolly" %%% "octokit__request-error" % "3.0.2-b62292",
  "org.scalablytyped.japgolly" %%% "octokit__types" % "8.0.0-2349ec",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
