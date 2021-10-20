package com.mrright.mr_toast

import android.annotation.SuppressLint
import android.app.Activity
import android.widget.Toast

const val SHORT = 0


@SuppressLint("WrongConstant")
fun Activity.Toast(text:String?, length:Int=SHORT){
    Toast.makeText(this, text,length).show()
}