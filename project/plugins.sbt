addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.6.3")

val Giter8Version = "0.14.0"

addSbtPlugin("org.foundweekends.giter8" % "sbt-giter8-scaffold" % Giter8Version)
addSbtPlugin("org.foundweekends.giter8" %% "sbt-giter8" % Giter8Version)

libraryDependencies += { "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value }
