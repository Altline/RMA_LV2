package hr.ferit.dominikzivko.inspiringpeople

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import hr.ferit.dominikzivko.inspiringpeople.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}