package com.example.testapp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainHandler = Handler(Looper.getMainLooper())
        mainHandler.postDelayed({
            // 在主线程上执行耗时操作
            Thread.sleep(10000) // 模拟耗时操作，这里休眠10秒钟
        }, 0)
    }
}