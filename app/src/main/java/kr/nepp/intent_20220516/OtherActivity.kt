package kr.nepp.intent_20220516

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_other.*

class OtherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        btnReturnToMain.setOnClickListener {

//            val myIntent = Intent(this, MainActivity::class.java)
//            startActivity(myIntent)

//            현재 화면 종료 > 이전 화면이 다시 나타남

            finish()

        }


    }
}