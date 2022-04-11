package com.example.domashka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.domashka.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
setContentView(bindingClass.root)
        bindingClass.b1.setOnClickListener {
 val result = bindingClass.tpn1.text.toString()
            Log.d("MyLog", "ideror = ${R.drawable.eror}")
            bindingClass.t2.visibility = View.VISIBLE
            bindingClass.image1.visibility = View.VISIBLE
            val ideror = 2131165285
            bindingClass.image1.setImageResource(ideror)

            when(result){
                 Constance.SLESAR1 -> {


                    val tempText = "Получите ваши ${Constance.SLESAR1_ZP} руб."
                     if (bindingClass.tpn2.text.toString() == Constance.SLESAR1_PASWORD) {
                         bindingClass.t2.text = tempText
                         bindingClass.image1.setImageResource(R.drawable.lupa)

                     }else {
                         bindingClass.t2.text = "Неверный пароль"

                     }

                }
                 Constance.SLESAR2 -> {
                    bindingClass.t2.visibility = View.VISIBLE
                     val temp_text = "Получите зa ${Constance.SLESAR1} ${Constance.SLESAR2_ZP} руб."
                     if (bindingClass.tpn2.text.toString() == Constance.SLESAR2_PASWORD) {
                         bindingClass.t2.text = temp_text
                         bindingClass.image1.setImageResource(R.drawable.pupa)
                     }else{
                         bindingClass.t2.text = "Неверный пароль"

                     }
                }
                Constance.PROGRAMMER -> {
                    bindingClass.t2.visibility = View.VISIBLE
                    val tempText = "Получите ваши ${Constance.PROGRAMMER_ZP} руб. в наносек."
                 if (bindingClass.tpn2.text.toString() == Constance.PROGRAMMER_PASWORD) {
                     bindingClass.t2.text = tempText
                     bindingClass.image1.setImageResource(R.drawable.programmer)
                 }else {
                     bindingClass.t2.text ="Неверный пароль"

                    }
                }
                else -> {

                    bindingClass.t2.text = "Имя введено неверно"

                }
            }
        }
    }

}