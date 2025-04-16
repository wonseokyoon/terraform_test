package com.terraform_spring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TerraformSpringApplication

fun main(args: Array<String>) {
    runApplication<TerraformSpringApplication>(*args)
}
