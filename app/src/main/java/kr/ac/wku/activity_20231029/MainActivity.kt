package kr.ac.wku.activity_20231029

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import kr.ac.wku.activity_20231029.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        //화면 이동시키기 : Intent클래스 활용
        //1. 어디서 출발해야 어디로 도착할지 정보 명시(티켓)

        binding.btnMoveToSecond.setOnClickListener {
            val myIntent = Intent( this, SecondActivity::class.java)

            //2.myIntent에 적힌대로 실제 화면 이동
            startActivity(myIntent)
        }
    }
}