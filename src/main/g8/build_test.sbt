Defaults.itSettings

Test / parallelExecution := false

IntegrationTest / parallelExecution := false

Test / scalacOptions ++= Seq("-Yrangepos")

libraryDependencies += "dev.mongocamp" %% "mongocamp-test-server" % "$mongocamp_test_version$" % Test