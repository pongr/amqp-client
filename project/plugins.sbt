addSbtPlugin("com.pongr" % "pongr-sbt-plugin" % "1.0.1")

resolvers += "Pongr" at "http://pongrdev.com:8081/nexus/content/groups/public"

credentials += Credentials(Path.userHome / ".ivy2" / ".pongr_credentials")

resolvers += "gseitz@github" at "http://gseitz.github.com/maven/"

addSbtPlugin("com.github.gseitz" % "sbt-release" % "0.4")