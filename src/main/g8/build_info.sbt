import dev.quadstingray.sbt.json.JsonFile

val json = JsonFile(file("package.json"))

enablePlugins(BuildInfoPlugin)

buildInfoPackage := "$package$"

buildInfoOptions += BuildInfoOption.BuildTime

val MongoCampHomepage = "https://www.$organization;format="dot-reverse"$"

organizationHomepage := Some(url(MongoCampHomepage))

homepage := Some(url(json.stringValue("homepage")))

scmInfo := Some(
  ScmInfo(
    url("https://github.com/$github_user_or_organisation$/$github_repo_name$"),
    "scm:https://github.com/$github_user_or_organisation$/$github_repo_name$"
  )
)

developers := List(
  Developer(
    id = "$organization;format="lower,hyphen"$",
    name = "Team of $organization;format="dot-reverse"$",
    email = "$author$",
    url = url(MongoCampHomepage)
  )
)

licenses += (json.stringValue("license"), url("https://github.com/$github_user_or_organisation$/$github_repo_name$/blob/main/LICENSE"))