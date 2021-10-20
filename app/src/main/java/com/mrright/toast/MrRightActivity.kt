package com.mrright.toast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mrright.mr_toast.Toast

class MrRightActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast("")
    }
}