package kr.nepp.intent_20220516

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMoveToOther.setOnClickListener {

//            다른 화면으로 이동.

            val myIntent = Intent(this, OtherActivity::class.java)
            startActivity(myIntent)


        }
        
        btnSendMessage.setOnClickListener { 
            
//            1. 입력한 내용을 변수에 저장

            val inputMessage = edtMessage.text.toString()
            
//            2. 메세지 보여주는 화면으로 (1의 변수를 들고) 이동

            val myIntent = Intent(this, ViewMessageActivity::class.java)

//            출발 전에, 데이터를 첨부하자.
            myIntent.putExtra( "message",  inputMessage )

            startActivity(myIntent)
            
        }

    }
}