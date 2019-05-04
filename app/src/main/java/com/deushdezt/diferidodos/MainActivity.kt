package com.deushdezt.diferidodos

import android.annotation.SuppressLint
import android.media.Image
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import android.widget.ImageView

var numero_color: Int = 0
var fondo: ImageView;
var r_color: Int = 0;
var g_color: Int = 0;
var b_color: Int = 0;
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numero_color = 0
        fondo  = findViewById<ImageView>(R.id.rgbback)


    }

    fun prev(){
        if (numero_color == 0)  {

        } else
        {
            numero_color -= 1;
        }

        //separacion
        if(numero_color == 0){
            r_color = 255;
            g_color = 0;
            b_color = 0;
        }
        if(numero_color == 1){
            g_color = 255;
            r_color = 0;
            b_color = 0;
        }
        if(numero_color == 2){
            b_color = 255;
            g_color = 0;
            r_color = 0;
        }

    }

    fun next(){
        if(numero_color == 2){
            ;
        }
        else
        {
            numero_color += 1;
        }


        if(numero_color == 0){
            r_color = 255;
            g_color = 0;
            b_color = 0;
        }
        if(numero_color == 1){
            g_color = 255;
            r_color = 0;
            b_color = 0;
        }
        if(numero_color == 2){
            b_color = 255;
            g_color = 0;
            r_color = 0;
        }
    }

    fun plus(){
        if(numero_color == 0){
            if(r_color== 255){

                }else
            {
                r_color += 1;
            };
            g_color = 0;
            b_color = 0;
        }
        if(numero_color == 1){
            if(g_color == 255){

            }else
            {
                g_color += 1l
            };
            r_color = 0;
            b_color = 0;
        }
        if(numero_color == 2){
            if(b_color == 255){

            }else{
                b_color +=1;
            };
            g_color = 0;
            r_color = 0;
        }
    }

    fun minus(){

    }


}
