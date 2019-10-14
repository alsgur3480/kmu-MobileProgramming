package com.example.mobileprogrammingassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.text.isDigitsOnly
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = text_howmany
        val input = editText_input_money
        val result = text_result
        val btn = btn_calc

        btn.setOnClickListener {
            if (input.length() > 0 && input.text.toString().isDigitsOnly()) {
                result.text = (input.text.toString().toFloat()/170000).toString()+"UBD 입니다"
                result.visibility = View.VISIBLE
                text.visibility = View.VISIBLE
            }
        }

    }
}
