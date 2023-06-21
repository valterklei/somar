package br.com.avmobile.somar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class RESULTADO : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)


        val tot = findViewById(R.id.editTextTextPersonName5) as EditText
        bt1.setOnClickListener {
            val val1 = num1.text.toString().toFloat();
            val val2 = num2.text.toString().toFloat();


            val result = val1 + val2

            to.setText(result.toString()

    }
}

