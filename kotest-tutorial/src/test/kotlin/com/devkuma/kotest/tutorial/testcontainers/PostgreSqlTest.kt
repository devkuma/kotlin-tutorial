package com.devkuma.kotest.tutorial.testcontainers

import io.kotest.core.spec.style.FreeSpec
import io.kotest.core.test.TestCase
import io.kotest.core.test.TestResult
import io.kotest.matchers.shouldBe
import org.testcontainers.containers.PostgreSQLContainer
import org.testcontainers.junit.jupiter.Container
import org.testcontainers.junit.jupiter.Testcontainers
import org.testcontainers.utility.DockerImageName

@Testcontainers
class PostgreSqlTest : FreeSpec({
    beforeTest {
        postgresContainer.start()
        System.setProperty("DB_URL", postgresContainer.jdbcUrl)
        System.setProperty("DB_USERNAME", postgresContainer.username)
        System.setProperty("DB_PASSWORD", postgresContainer.password)
    }

     afterTest {
        postgresContainer.stop()
    }

}) {

    companion object {
        @JvmStatic
        @Container
        val postgresContainer: PostgreSQLContainer<*> = PostgreSQLContainer(DockerImageName.parse("postgres:14.1"))
  //          .withDatabaseName("test")
           .withUsername("test")
            .withPassword("test")
            .withExposedPorts(5432)
//            .also {
//                it.start()
//            }
    }


    init {
        "Database test" {
            // 데이터베이스 테스트 코드 작성
            postgresContainer.isRunning() shouldBe true
        }
    }
}