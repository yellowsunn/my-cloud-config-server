package com.yellowsunn.mycloudconfigserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@EnableConfigServer
@SpringBootApplication
class MyCloudConfigServerApplication

fun main(args: Array<String>) {
    runApplication<MyCloudConfigServerApplication>(*args)
}
