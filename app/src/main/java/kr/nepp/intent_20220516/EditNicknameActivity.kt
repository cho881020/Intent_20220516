package kr.nepp.intent_20220516

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nickname.*

class EditNicknameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nickname)

        btnOk.setOnClickListener {

//            1. 입력한 닉네임을 변수에 저장
            val inputNickname = edtNickname.text.toString()

//            2. 변수에 담은 닉네임을 돌아가는 길에 첨부. (Intent 활용)
            val resultIntent = Intent() // 단순 첨부용, 출발/목적지 표시 X.

            resultIntent.putExtra("nick", inputNickname)

//            3. OK를 누른게 맞다고 추가 표시 + resultIntent 포함 시키자.

            setResult(RESULT_OK, resultIntent)

//            4. 현재 화면 종료 (복귀)
            finish()

        }

    }
}