package kr.ac.wku.activity_20231029

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.ac.wku.activity_20231029.databinding.ActivityMainBinding
import kr.ac.wku.activity_20231029.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DateBindingUtil.setContentView(this,R.layout.activity_second)

    }
}