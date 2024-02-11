val zioVersion            = "2.0.21"
val zioJsonVersion        = "0.6.2"

lazy val root = (project in file("."))
  .settings(
    inThisBuild(
      List(
        organization := "dev.iz",
        scalaVersion := "3.3.1",
      )
    ),
    name           := "stay-manager",
    libraryDependencies ++= Seq(
      "dev.zio"       %% "zio"                 % zioVersion,
      "dev.zio"       %% "zio-json"            % zioJsonVersion,

      // test
      "dev.zio"      %% "zio-test"                        % zioVersion            % Test,
      "dev.zio"      %% "zio-test-sbt"                    % zioVersion            % Test,
      "dev.zio"      %% "zio-test-junit"                  % zioVersion            % Test,
      "dev.zio"      %% "zio-test-magnolia"               % zioVersion            % Test,
    ),
    testFrameworks := Seq(new TestFramework("zio.test.sbt.ZTestFramework")),
  )
  .enablePlugins(JavaAppPackaging)
