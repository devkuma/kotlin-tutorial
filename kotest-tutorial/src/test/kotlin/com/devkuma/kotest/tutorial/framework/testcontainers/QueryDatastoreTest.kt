//package com.devkuma.kotest.tutorial.testcontainers
//
//import com.devkuma.kotest.tutorial.assertions.Person
//import io.kotest.core.spec.style.FunSpec
//
//class QueryDatastoreTest : FunSpec({
//
//    val mysql = MySQLContainer<Nothing>("mysql:8.0.26").apply {
//        startupAttempts = 1
//        withUrlParam("connectionTimeZone", "Z")
//        withUrlParam("zeroDateTimeBehavior", "convertToNull")
//    }
//
//    val ds = install(JdbcDatabaseContainerExtension(mysql)) {
//        poolName = "myconnectionpool"
//        maximumPoolSize = 8
//        idleTimeout = 10000
//    }
//
//    val datastore = PersonDatastore(ds)
//
//    test("insert happy path") {
//
//        datastore.insert(Person("sam", "Chicago"))
//        datastore.insert(Person("jim", "Seattle"))
//
//        datastore.findAll().shouldBe(listOf(
//            Person("sam", "Chicago"),
//            Person("jim", "Seattle"),
//        ))
//    }
//})