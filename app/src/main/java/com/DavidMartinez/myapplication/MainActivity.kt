package com.DavidMartinez.myapplication

import android.icu.text.DecimalFormat
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Oncreate", "ok")


        // formato de dos decimales
        val formato = DecimalFormat()
        formato.maximumFractionDigits = 2 //Numero maximo de decimales a mostrar


        bt_convertir.setOnClickListener {
            val Divisa1 = sp_Divisa1.selectedItemPosition
            var Divisa2 = sp_Divisa2.selectedItemPosition
            val moneda1 = et_divisa1.text.toString()
            val moneda2 = sp_Divisa2.selectedItem.toString()
            var resultado: Float
            var Moneda1: Float
            if (moneda1.trim().isNotEmpty()) {
                var Divisa3 = sp_Divisa1.selectedItem.toString()
                Moneda1 = moneda1.toFloat()

                if (Divisa1 == 1 && Divisa2 == 2) {
                    resultado = (Moneda1 / 3748)
                    tv_resultado.text = "valor:   ${formato.format(resultado)}  $moneda2"
                    animation_view.playAnimation()

                }
                if (Divisa1 == 1 && Divisa2 == 3) {
                    resultado = ((Moneda1 / 4192.15).toFloat())
                    tv_resultado.text = "valor: ${formato.format(resultado)} $moneda2"
                    animation_view.playAnimation()
                }
                if (Divisa1 == 1 && Divisa2 == 4) {
                    resultado = ((Moneda1 / 2553.55).toFloat())
                    tv_resultado.text = "valor: ${formato.format(resultado)} $moneda2"
                    animation_view.playAnimation()
                }
                if (Divisa1 == 2 && Divisa2 == 1) {
                    resultado = (Moneda1 * 3748)
                    tv_resultado.text = "valor:   ${formato.format(resultado)}  $moneda2"
                    animation_view.playAnimation()
                }
                if (Divisa1 == 2 && Divisa2 == 3) {
                    resultado = (Moneda1 * 0.89).toFloat()
                    tv_resultado.text = "valor:   ${formato.format(resultado)}  $moneda2"
                    animation_view.playAnimation()

                }
                if (Divisa1 == 2 && Divisa2 == 4) {
                    resultado = (Moneda1 * 1.47).toFloat()
                    tv_resultado.text = "valor:   ${formato.format(resultado)}  $moneda2"
                    animation_view.playAnimation()
                }
                if (Divisa1 == 3 && Divisa2 == 1) {
                    resultado = (Moneda1 * 4192.15).toFloat()
                    tv_resultado.text = "valor:   ${formato.format(resultado)}  $moneda2"
                    animation_view.playAnimation()
                }
                if (Divisa1 == 3 && Divisa2 == 2) {
                    resultado = (Moneda1 / 0.89).toFloat()
                    tv_resultado.text = "valor:   ${formato.format(resultado)}  $moneda2"
                    animation_view.playAnimation()
                }
                if (Divisa1 == 3 && Divisa2 == 4) {
                    resultado = (Moneda1 * 1.64).toFloat()
                    tv_resultado.text = "valor:   ${formato.format(resultado)}  $moneda2"
                    animation_view.playAnimation()
                }
                if (Divisa1 == 4 && Divisa2 == 1) {
                    resultado = (Moneda1 * 2553.55).toFloat()
                    tv_resultado.text = "valor:   ${formato.format(resultado)}  $moneda2"
                    animation_view.playAnimation()
                }
                if (Divisa1 == 4 && Divisa2 == 2) {
                    resultado = (Moneda1 / 1.47).toFloat()
                    tv_resultado.text = "valor:   ${formato.format(resultado)}  $moneda2"
                    animation_view.playAnimation()
                }
                if (Divisa1 == 4 && Divisa2 == 3) {
                    resultado = (Moneda1 / 1.64).toFloat()
                    tv_resultado.text = "valor:   ${formato.format(resultado)}  $moneda2"
                    animation_view.playAnimation()
                }
            }


        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("OnStart", "ok")
    }

    override fun onResume() {
        super.onResume()
        Log.d("OnResume", "ok")
    }

    override fun onPause() {
        super.onPause()
        Log.d("OnPause", "ok")
    }

    override fun onStop() {
        super.onStop()
        Log.d("OnStop", "ok")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("OnRestart", "ok")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("OnDestroy", "ok")
    }
}