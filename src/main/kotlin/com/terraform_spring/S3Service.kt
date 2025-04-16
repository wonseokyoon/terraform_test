package com.terraform_spring

interface S3Service {

    fun getBucketNames(): List<String>

}