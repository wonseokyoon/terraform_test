package com.terraform_spring

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController(
    private val s3Service: S3Service
) {

    @Value("\${custom.secretWord}")
    private val secretWord: String = ""

    @GetMapping
    fun main(): String {
        return "Hi, $secretWord"
    }

    @GetMapping("/buckets")
    fun buckets(): List<String> {
        return s3Service.getBucketNames()
    }

}