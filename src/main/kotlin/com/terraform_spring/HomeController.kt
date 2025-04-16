package com.terraform_spring

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import software.amazon.awssdk.services.s3.S3Client

@RestController
class HomeController(
    private val s3Client: S3Client
) {

    @GetMapping
    fun main():String{
        return "Hi"
    }

    @GetMapping("/bucket")
    fun bucket():List<String>{
        return s3Client.listBuckets().buckets().map {
            it.name()
        }
    }

}