package com.example.mobileprogrammingassignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btn_register = btn_to_register
        val btnLogin = btn_to_login
        val id = editText_login_id
        val password = editText_login_pw

        btn_register.setOnClickListener {
            startActivity(Intent(applicationContext,RegisterActivity::class.java))
        }

        btnLogin.setOnClickListener {
            if (id.length() == 0) {
                Toast.makeText(applicationContext, "아이디를 입력하세요", Toast.LENGTH_SHORT).show()
            } else if (password.length() == 0) {
                Toast.makeText(applicationContext, "비밀번호를 입력하세요", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "환영합니다 "+id.text+" 님", Toast.LENGTH_SHORT).show()
                startActivity(Intent(applicationContext,MainActivity::class.java))
            }
        }
    }
}
