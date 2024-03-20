package co.edu.udea.compumovil.gr02_20241.lab1


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button

class ContactDataActivity : AppCompatActivity() {
    val country = arrayOf(
        "Argentina",
        "Bolivia",
        "Brasil",
        "Chile",
        "Colombia",
        "Costa Rica",
        "Cuba",
        "Ecuador",
        "El Salvador",
        "Guatemala",
        "Haití",
        "Honduras",
        "México",
        "Nicaragua",
        "Panamá",
        "Paraguay",
        "Perú",
        "República Dominicana",
        "Uruguay",
        "Venezuela"
    )
    val city = arrayOf(
        "Bogotá",
        "Medellín",
        "Cali",
        "Bucaramanga",
        "Cartagena",
        "Soacha",
        "Cúcuta",
        "Soledad",
        "Bucaramanga",
        "Pereira",
        "Montería",
        "Pasto",
        "Bello",
        "Armenia",
        "Villavicencio"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_data)
        setTitle(R.string.Contact_information)
        autoCompleteCountry()
        autoCompleteCity()
        findViewById<Button>(R.id.ButtonContacNext).setOnClickListener(){
            contactValidation()
        }
    }

    private fun autoCompleteCountry(){
        val campoSugerencias = findViewById<View>(R.id.contactCity) as AutoCompleteTextView

        val adaptador: ArrayAdapter<String> =
            ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, city)

        campoSugerencias.setAdapter(adaptador)
    }
    private fun autoCompleteCity(){
        val campoSugerencias = findViewById<View>(R.id.contactCountry) as AutoCompleteTextView

        val adaptador: ArrayAdapter<String> =
            ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,country )

        campoSugerencias.setAdapter(adaptador)
    }
}

