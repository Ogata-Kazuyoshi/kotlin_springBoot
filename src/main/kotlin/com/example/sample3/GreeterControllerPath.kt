package com.example.sample3

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("greeter2")
class GreeterControllerPath {
    @GetMapping("/hello/{name}/{test}") //JSの/:nameの部分が/{name}となる
    fun helloPathParameter(@PathVariable("name") name:String, @PathVariable("test") test:String):HelloResponse {
        // ex: /greeter2/hello/Naoto/intiraimu
        println("Frontから受け取ったパスパラメーター : $name & $test ")
        return HelloResponse("Hello $name&$test")
    }
}