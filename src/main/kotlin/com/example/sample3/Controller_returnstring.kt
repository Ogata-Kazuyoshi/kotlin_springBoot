package com.example.sample3


import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

//**********静的ファイルを返す場合の書き方****************************************************

@RestController
//RESTAPIのルーティングするためのアノテーション。文字をそのまま返却できる
@RequestMapping("return")
//ルーティングを階層構造にできる。この場合/helloが接頭語で必要になる
class ReturnStringController {
    @ResponseStatus(code = HttpStatus.OK)
    //ステータスコードの定義。HttpStatus.CREATEDなどプロパティで指示できる
    @GetMapping("/string")
    //Getメソッド用。POSTやDeleteそれぞれが存在する
    fun index():String {
        return "returningString"

    }
}
//***************************************************************************************