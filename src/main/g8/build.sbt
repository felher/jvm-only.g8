val scala3Version = "3.7.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "$name$",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    scalacOptions ++= Seq(
      "-language:strictEquality",
      "-source:future",
      "-feature",
      "-deprecation",
      "-Xkind-projector:underscores",
      "-Xmax-inlines:256",
      "-Wall"
    )
  )
