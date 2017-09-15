package com.shiiiiigeeeee10.qiitaclient

/**
 * Created by shigeru on 2017/09/15.
 */

import android.support.annotation.IdRes
import android.view.View

fun <T : View> View.bindView(@IdRes id: Int): Lazy<T> = lazy {
    findViewById<T>(id) as T
}