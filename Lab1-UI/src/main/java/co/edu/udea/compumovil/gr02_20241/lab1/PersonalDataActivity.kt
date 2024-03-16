package co.edu.udea.compumovil.gr02_20241.lab1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity

class PersonalDataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personal_data)
        setTitle(R.string.personal_information)

        findViewById<EditText>(R.id.etDate).setOnClickListener() {
            showDatePikerDialog()
        }
        findViewById<RadioButton>(R.id.radioButtonM).setOnClickListener() {
            findViewById<RadioButton>(R.id.radioButtonF).isChecked = false
        }
        findViewById<RadioButton>(R.id.radioButtonF).setOnClickListener() {
            findViewById<RadioButton>(R.id.radioButtonM).isChecked = false
        }
        findViewById<Button>(R.id.ButtonContacNext).setOnClickListener() {
            personValidation()
        }

    }
}