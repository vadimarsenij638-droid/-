package com.assistant.jarvis

import android.app.Service
import android.graphics.PixelFormat
import android.view.Gravity
import android.view.WindowManager
import android.widget.Button
import android.content.Intent

class FloatingButtonService : Service() {
    private lateinit var windowManager: WindowManager
    private lateinit var floatingButton: Button

    override fun onCreate() {
        super.onCreate()
        windowManager = getSystemService(WINDOW_SERVICE) as WindowManager
        floatingButton = Button(this).apply {
            text = "Д"
            textSize = 24f
            setBackgroundResource(android.R.drawable.btn_default) // Тимчасовий дизайн
        }

        val params = WindowManager.LayoutParams(
            WindowManager.LayoutParams.WRAP_CONTENT,
            WindowManager.LayoutParams.WRAP_CONTENT,
            WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY,
            WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE,
            PixelFormat.TRANSLUCENT
        ).apply {
            gravity = Gravity.TOP or Gravity.START
            x = 100
            y = 100
        }

        floatingButton.setOnClickListener {
            // Тут буде виклик функції прослуховування голосу
            startListening()
        }

        windowManager.addView(floatingButton, params)
    }

    private fun startListening() {
        // Логіка активації мікрофона
    }

    override fun onBind(intent: Intent?) = null
}
