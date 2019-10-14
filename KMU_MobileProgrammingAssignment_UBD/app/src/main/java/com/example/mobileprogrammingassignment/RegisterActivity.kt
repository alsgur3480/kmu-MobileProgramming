package com.example.mobileprogrammingassignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_register.*
import java.io.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val id = editText_register_id
        val password = editText_register_pw
        val name = editText_register_name
        val address = editText_register_address
        val phone_number = editText_register_phone

        val btn_register = btn_register_register
        val check_box = checkbox_register_term_agree

        val term = text_terms
        term.text = "개인정보를 이용하겠습니다."

        btn_register.setOnClickListener {
            if (id.length() == 0) {
                Toast.makeText(applicationContext, "아이디를 입력하세요", Toast.LENGTH_SHORT).show()
            } else if (password.length() == 0) {
                Toast.makeText(applicationContext, "비밀번호를 입력하세요", Toast.LENGTH_SHORT).show()
            } else if (name.length() == 0) {
                Toast.makeText(applicationContext, "이름을 입력하세요", Toast.LENGTH_SHORT).show()
            } else if (address.length() == 0) {
                Toast.makeText(applicationContext, "주소를 입력하세요", Toast.LENGTH_SHORT).show()
            } else if (phone_number.length() == 0) {
                Toast.makeText(applicationContext, "전화번호를 입력하세요", Toast.LENGTH_SHORT).show()
            } else if (!(check_box.isChecked)) {
                Toast.makeText(applicationContext, "이용약관에 동의해야합니다", Toast.LENGTH_SHORT).show()
            } else if (password.text.toString().matches(Regex("[0-9|a-z|A-Z|ㄱ-ㅎ|ㅏ-ㅣ]*"))) {
                Toast.makeText(applicationContext, "비밀번호는 특수문자를 포함해야 합니다.", Toast.LENGTH_SHORT).show()
            } else if (20 < password.length() || password.length() < 4) {
                Toast.makeText(applicationContext, "비밀번호는 4글자 이상, 20글자 이하입니다.", Toast.LENGTH_SHORT).show()
            } else {
//                fileManager.writeFile(id.text.toString()+" "+pw.text.toString()
//                        +" "+name.text.toString()+" "+address.text.toString()+" "+phone.text.toString()+" ")
                Toast.makeText(
                    applicationContext,
                    "환영합니다, " + id.text.toString() + " 님.",
                    Toast.LENGTH_SHORT
                ).show()
                startActivity(Intent(this, MainActivity::class.java))
            }
        }

    }
}
