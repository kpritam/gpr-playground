import Dependencies._

ThisBuild / scalaVersion := "2.13.1"
ThisBuild / version := "1.0.2"
ThisBuild / organization := "com.github.kpritam.gpr-playground"
ThisBuild / organizationName := "kpritam"

ThisBuild / githubOwner := "kpritam"
ThisBuild / githubRepository := "gpr-playground"
ThisBuild / publishMavenStyle := true
ThisBuild / githubTokenSource := TokenSource.Environment("GITHUB_TOKEN")

lazy val root = (project in file("."))
  .settings(
    name := "gpr-playground",
    libraryDependencies += scalaTest % Test
  )
