package mx.edu.itson.practica6

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.boton)

        button.setOnClickListener {
            val intent=Intent(this, Catalogo::class.java)
            startActivity(intent)

        }

    }
}