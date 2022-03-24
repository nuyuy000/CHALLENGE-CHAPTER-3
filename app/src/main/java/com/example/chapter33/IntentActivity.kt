package com.example.chapter33

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class IntentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tvViewIntent = findViewById<TextView>(R.id.textViewIntent)
        val parcelableMahasiswa = intent.getParcelableExtra<DataRumus>("dataMahasiswa")
        val massa = parcelableMahasiswa?.massa
        val percepatan = parcelableMahasiswa?.percepatan
        val tinggi = parcelableMahasiswa?.tinggi

        tvViewIntent.text  = "$massa \n $percepatan \n $tinggi"




    }
}