name := "media-alerts"

version := "0.0.1"

scalaVersion := "2.11.11"

sparkVersion := "2.2.0"

sparkComponents ++= Seq("sql")

spDependencies += "mrpowers/spark-daria:2.2.0_0.13.0"

libraryDependencies += "MrPowers" % "spark-fast-tests" % "2.2.0_0.5.0" % "test"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"

fork in Test := true
javaOptions ++= Seq("-Xms512M", "-Xmx2048M", "-XX:MaxPermSize=2048M", "-XX:+CMSClassUnloadingEnabled")
