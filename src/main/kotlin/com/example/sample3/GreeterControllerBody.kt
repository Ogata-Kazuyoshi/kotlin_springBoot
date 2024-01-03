package com.example.sample3

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("greeter3")
class GreeterControllerBody {
    @PostMapping("hello")
    fun helloByPost(@RequestBody request: HelloRequest):HelloResponse {
        println("req.body : $request")
        return HelloResponse("Hello ${request.name} & ${request.test}")
        //変数名ではなく、あるオブジェクトのプロパティにアクセスに行く時は{}でくくる
    }
}