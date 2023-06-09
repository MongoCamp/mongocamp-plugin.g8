// This build is for this Giter8 template.
// To test the template run `g8` or `g8Test` from the sbt session.
// See https://www.foundweekends.org/giter8/testing.html#Using+the+Giter8Plugin for more details.
lazy val mongocamp_server_plugin_g8 = (project in file(".")).
  settings(
    name := "mongocamp-server-$if(add_server_plugin.truthy)$plugin$endif$-g8",
    version in ThisBuild:= "1.0.0",
      test in Test := {
      val _ = (g8Test in Test).toTask("").value
    },
    scriptedLaunchOpts ++= List("-Xms1024m", "-Xmx1024m", "-XX:ReservedCodeCacheSize=128m", "-XX:MaxPermSize=256m", "-Xss2m", "-Dfile.encoding=UTF-8"),
    resolvers += Resolver.url("typesafe", url("https://repo.typesafe.com/typesafe/ivy-releases/"))(Resolver.ivyStylePatterns)
  )
