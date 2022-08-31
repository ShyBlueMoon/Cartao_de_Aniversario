package com.example.cartaodeaniversario

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG,"$ACTIVITY onCreate")

        configurarListeners()
    }

    companion object {
        private const val TAG = "IGTILog"
        private const val ACTIVITY = "Main Activity::"
    }

    private fun configurarListeners() {
        configurarListenerBtnNovaTela()

    }

    private fun configurarListenerBtnNovaTela() {
        val button = findViewById<Button>(R.id.cliqueAqui)
        button.setOnClickListener {
            val intent = Intent(this, TelaSurpresa::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG,"Main Activity::onResume")

    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "$ACTIVITY onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "$ACTIVITY onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "$ACTIVITY onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG,"$ACTIVITY onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG,"$ACTIVITY onDestroy")
    }
}