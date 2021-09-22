package temple.edu.signupform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class FormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = findViewById(R.id.name_id)as EditText
        val email = findViewById(R.id.email_id)as EditText
        val passW = findViewById(R.id.passW_id)as EditText
        val confPass = findViewById(R.id.passConf_id)as EditText
        val btn = findViewById(R.id.button)as Button
    }
}