name := "hyrax"

version := "0.1"

scalaVersion := "2.10.2"

libraryDependencies += "com.netflix.hystrix" % "hystrix-core" % "1.3.6"

libraryDependencies += "io.spray" % "spray-client" % "1.1-M8"

libraryDependencies += "io.spray" %  "spray-json_2.10" % "1.2.5"

libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.1.4"

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.0.RC1-SNAP6" % "test"

resolvers += "spray repo" at "http://repo.spray.io"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
