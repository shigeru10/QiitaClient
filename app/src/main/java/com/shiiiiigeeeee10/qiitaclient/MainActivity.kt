package com.shiiiiigeeeee10.qiitaclient

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.shiiiiigeeeee10.qiitaclient.model.Article
import com.shiiiiigeeeee10.qiitaclient.model.User
import com.shiiiiigeeeee10.qiitaclient.view.ArticleView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val  articleView = ArticleView(applicationContext)

        articleView.setArticle(Article(id = "123",
                title = "Kotolin入門",
                url = "http://www.example.com/articles/123",
                user = User(id = "456", name = "太郎", profileImageUrl = "http://#")))
        
        setContentView(articleView)
    }
}
