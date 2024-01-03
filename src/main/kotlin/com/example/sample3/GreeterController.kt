package com.example.sample3

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("greeter")
class GreeterController {
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    @GetMapping("hello")
    fun hello(@RequestParam("name") name:String, @RequestParam("test") test:String):HelloResponse {
        //@RequestParamの引数nameがクエリパラメーターの変数名 ex: /greeter/hello?name=Naoto
        //helloの引数nameが関数内で使用する変数名nameとnameは一致してなくてももちろんOK
        return HelloResponse("Hello $name&$test")
    }
}