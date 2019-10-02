package io.mbo.microstation.msdiscoveryservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class MsDiscoveryServiceApplication

fun main(args: Array<String>) {
    runApplication<MsDiscoveryServiceApplication>(*args)
}
