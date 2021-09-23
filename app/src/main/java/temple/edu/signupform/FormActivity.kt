package temple.edu.signupform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class FormActivity : AppCompatActivity() {
    lateinit var EditName: EditText
    lateinit var EditEmail: EditText
    lateinit var EditPassW: EditText
    lateinit var EditConfPass: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        start()
    }

    fun start() {
        EditName = findViewById(R.id.name_id)
        EditEmail = findViewById(R.id.email_id)
        EditPassW = findViewById(R.id.passW_id)
        EditConfPass = findViewById(R.id.passConf_id)
    }

    fun save(): Boolean {
        if (EditName.text.toString().equals("")) {
            EditName.setError("Enter Name")
            return false
        }
        if (EditEmail.text.toString().equals("")) {
            EditEmail.setError("Enter Email")
            return false
        }
        if (EditPassW.text.toString().equals("")) {
            EditPassW.setError("Enter PassWord")
        }
        if (EditConfPass.text.toString().equals("")) {
            EditConfPass.setError("Re-Enter PassWord")
            return false
        }

        if (!EditConfPass.text.toString().equals(EditPassW.text.toString())) {
            EditPassW.setError("PassWord does not match")
            return false
        }
        return true
    }

    fun performSignUp(view: View) {
        if (save()) {
            val name = EditName.text.toString()
            val email = EditEmail.text.toString()
            val passW = EditPassW.text.toString()
            val confPass = EditConfPass.text.toString()
            if (!name.equals("") && !email.equals("") && !passW.equals("") && confPass.equals(passW)) {
                Toast.makeText(
                    this,
                    "Welcome, " + name + ", to the SignUpForm App",
                    Toast.LENGTH_LONG
                )
                    .show()
            }
        }
    }
}







