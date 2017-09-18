package com.shiiiiigeeeee10.qiitaclient

/**
 * Created by shigeru on 2017/09/15.
 */

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.shiiiiigeeeee10.qiitaclient.model.Article
import com.shiiiiigeeeee10.qiitaclient.view.ArticleView

class ArticleListAdapter(private val context: Context) : BaseAdapter() {
    var articles: List<Article> = emptyList()
    override fun getCount(): Int = articles.size

    override fun getItem(position: Int): Any = articles[position]

    override fun getItemId(p0: Int): Long = 0
    
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View =
            ((convertView as? ArticleView) ?: ArticleView(context)).apply {
                setArticle(articles[position])
            }
}