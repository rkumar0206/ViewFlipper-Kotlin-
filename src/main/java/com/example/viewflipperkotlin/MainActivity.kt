package com.example.viewflipperkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inAnimation = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left)
        val outAnimation = AnimationUtils.loadAnimation(this, android.R.anim.slide_out_right)

        /* simpleViewFlipper.inAnimation = inAnimation
         simpleViewFlipper.outAnimation = outAnimation

         buttonNext.setOnClickListener{

             simpleViewFlipper.showNext()
         }

         */

        val images = arrayOf(R.drawable.ic_android_black_24dp,R.drawable.ic_announcement_black_24dp,
        R.drawable.ic_attach_money_black_24dp,R.drawable.ic_beach_access_black_24dp)

        for (i in images ){

            val imageview=ImageView(this)

            imageview.setImageResource(i)
            viewFlipper.addView(imageview)
        }
        viewFlipper.inAnimation=inAnimation
        viewFlipper.outAnimation=outAnimation

        viewFlipper.flipInterval=3000
        viewFlipper.isAutoStart=true
    }
}
