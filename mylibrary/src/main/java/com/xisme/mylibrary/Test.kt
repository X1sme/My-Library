package com.xisme.mylibrary

import android.content.Context
import android.widget.Toast

class Test {

    fun makeItToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }
}