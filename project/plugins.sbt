resolvers ++= DefaultOptions.resolvers(snapshot = true)
resolvers ++= Seq(
  Resolver.sonatypeRepo("releases"),
  Resolver.sonatypeRepo("snapshots"), // used by deploy nightlies, which publish here & use -Dplay.version
)

addSbtPlugin("com.typesafe.play" % "sbt-plugin"           % sys.props.getOrElse("play.version", "2.8.13"))
addSbtPlugin("com.typesafe.play" % "play-docs-sbt-plugin" % sys.props.getOrElse("play.version", "2.8.13"))
addSbtPlugin("com.typesafe.play" % "interplay"            % sys.props.get("interplay.version").getOrElse("3.0.3"))

addSbtPlugin("org.scalameta" % "sbt-scalafmt"    % "2.4.6")
addSbtPlugin("com.typesafe"  % "sbt-mima-plugin" % "0.9.2")

addSbtPlugin("com.dwijnand" % "sbt-dynver" % "4.1.1")
