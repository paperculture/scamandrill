name := "scamandrill"

organization := "io.github.scamandrill"

lazy val root = project.in(file("."))

licenses += ("Apache-2.0", url("https://spdx.org/licenses/Apache-2.0"))

description := "Scala client for Mandrill api"

scalaVersion := "2.12.16"

crossScalaVersions := Seq("2.12.16", "2.13.15")

scalacOptions := Seq(
  "-feature", "-unchecked", "-deprecation", "-encoding", "utf8"
)

Test / parallelExecution := true

dependencyOverrides += "org.scala-lang.modules" %% "scala-java8-compat" % "1.0.2"

libraryDependencies ++= {
  Seq(
    "com.typesafe.play" %% "play-ahc-ws-standalone"       % "2.1.10",
    "com.typesafe.play" %% "play-ws-standalone-json"      % "2.1.10",
    "org.slf4j"         % "slf4j-api"                     % "1.7.25"
  ) ++ Seq(
    "org.scalatest"            %%  "scalatest"       % "3.0.8"   % "test",
    "com.typesafe.play"        %%  "play-test"       % "2.8.19"   % "test",
    "org.slf4j"                %   "slf4j-simple"    % "2.0.17"  % "test"
  )
}

githubOwner := "paperculture"

githubRepository := "scamandrill"

githubTokenSource := TokenSource.GitConfig("github.token")

Test / publishArtifact := false

publishMavenStyle := true

pomIncludeRepository := { _ => false }

pomExtra :=
  <url>http://github.com/scamandrill/scamandrill</url>
    <scm>
      <connection>scm:git:github.com/scamandrill/scamandrill.git</connection>
      <developerConnection>scm:git:git@github.com:scamandrill/scamandrill.git</developerConnection>
      <url>github.com/scamandrill/scamandrill</url>
    </scm>
    <developers>
      <developer>
        <id>dzsessona</id>
        <name>Diego Zambelli Sessona</name>
        <url>https://www.linkedin.com/in/diegozambellisessona</url>
      </developer>
      <developer>
        <id>graingert</id>
        <name>Thomas Grainger</name>
        <url>https://graingert.co.uk/</url>
      </developer>
    </developers>

publishTo := githubPublishTo.value

publishConfiguration := publishConfiguration.value.withOverwrite(true)

publishLocalConfiguration := publishLocalConfiguration.value.withOverwrite(true)
