organization := "com.aphelia"

name := "amqp-client"

version := "1.0-SNAPSHOT"

scalaVersion := "2.9.1"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "com.rabbitmq" % "amqp-client" % "2.8.2",
  "com.typesafe.akka" % "akka-actor" % "2.0.2",
  "com.typesafe.akka" % "akka-testkit" % "2.0.2" % "test",
  "org.scala-tools.testing" %% "specs" % "1.6.9" % "test",
  "org.scalatest" %% "scalatest" % "1.6.1" % "test",
  "junit" % "junit" % "4.8.2" % "test"
)
