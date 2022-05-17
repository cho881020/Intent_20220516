package kr.nepp.intent_20220516

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    닉네임을 받으러 간다고 명시하는 코드값
    val REQ_CODE_NICKNAME = 1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnEditNickname.setOnClickListener {

//            1. Intent 만드는 방법은 동일

            val myIntent = Intent(this, EditNicknameActivity::class.java)

//            2. 편도 X, 왕복으로 간다고 명시.
            startActivityForResult(myIntent, REQ_CODE_NICKNAME)

        }


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