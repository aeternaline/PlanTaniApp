package id.plantaniteam.plantaniapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.plantaniteam.plantaniapp.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private var binding: ActivityRegisterBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding?.root)
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}