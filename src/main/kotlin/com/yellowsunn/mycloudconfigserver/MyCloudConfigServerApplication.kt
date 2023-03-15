package com.yellowsunn.mycloudconfigserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MyCloudConfigServerApplication

fun main(args: Array<String>) {
    runApplication<MyCloudConfigServerApplication>(*args)
}
