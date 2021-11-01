lazy val scalaXml = "org.scala-lang.modules" %% "scala-xml" % "2.0.1"
lazy val scalaParser = "org.scala-lang.modules" %% "scala-parser-combinators" % "2.0.0"
lazy val dispatchV = "0.13.4"
lazy val dispatch = "net.databinder.dispatch" %% "dispatch-core" % dispatchV

lazy val root = (project in file(".")).

  // enablePlugins(ScalaxbPlugin).
  settings(inThisBuild(List(
    scalaVersion  := "2.13.7"
  ))).
  settings(
    sonatypeProfileName := "net.sigmalab",
    organization  := "net.sigmalab",
    name          := "sportsml-scala",

    libraryDependencies ++= Seq(dispatch),
    libraryDependencies ++= {
      if (scalaVersion.value startsWith "2.10") Seq()
      else Seq(scalaXml, scalaParser)
    }

    ).
  settings(

    pomExtra in Global := {
      <url>https://github.com/schrepfler/sportsml-scala</url>

      <licenses>
        <license>
          <name>Apache 2</name>
          <url>http://www.apache.org/licenses/LICENSE-2.0.txt</url>
        </license>
      </licenses>

      <scm>
        <connection>scm:git:github.com/schrepfler/sportsml-scala</connection>
        <developerConnection>scm:git:git@github.com:schrepfler/sportsml-scala.git</developerConnection>
        <url>github.com/schrepfler/sportsml-scala</url>
      </scm>

      <developers>
        <developer>
          <id>schrepfler</id>
          <name>Srdan Srepfler</name>
          <url>github.com/schrepfler</url>
        </developer>
      </developers>
    }

    // scalaxbDispatchVersion in (Compile, scalaxb) := dispatchV
    // scalaxbPackageName in (Compile, scalaxb)     := "org.iptc.sportsml.v3"
    // scalaxbPackageNames in (Compile, scalaxb)    := Map(uri("http://schemas.microsoft.com/2003/10/Serialization/") -> "microsoft.serialization"),
    // logLevel in (Compile, scalaxb) := Level.Debug
  )