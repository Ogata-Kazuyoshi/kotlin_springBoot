package com.example.sample3

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

//**********静的ファイルを返す場合の書き方****************************************************

@Controller
//ルーティングするためのアノテーション
@RequestMapping("hello")
//ルーティングを階層構造にできる。この場合/helloが接頭語で必要になる
class HelloController {
    @GetMapping("/world")
    //Getメソッド用。POSTやDeleteそれぞれが存在する
    fun index(model:Model):String { //引数のModelはテンプレートエンジンのHTMLに値を渡すためのもの
        model.addAttribute("message","ドヤさ！！！checkw/docker!!!!これで変更が反映されてるかな？だめ？・・・・・")
        //テンプレートのmessageという属性に渡す値を定義する
        return "index"
        //テンプレートのHTMLファイルのファイル名
    }
}
//***************************************************************************************