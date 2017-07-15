package com.curiouspandasdev.sup95.kotlinhumour

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    fun initViews() {
        starter_image.setImageDrawable(resources.getDrawable(R.mipmap.ic_launcher_round))

        starter_image.setOnClickListener {
            val intent = Intent(this, WelcomeUserActivity::class.java)
            startActivity(intent)
        }
    }
}
