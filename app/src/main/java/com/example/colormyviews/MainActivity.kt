package com.example.colormyviews
//Dayanna
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }


    private fun setListeners(){
        val clickableViews: List<View> =
            listOf(box_one_text,
                box_two_text, box_thre_text,
                box_four_text, box_five_text, red_button, yellow_button,
            green_button)

        for (item in clickableViews){
            item.setOnClickListener{ makeColored(it)}
        }

    }
        private
        fun makeColored(view: View){
            when (view.id){

                R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
                R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

                R.id.box_thre_text->view.setBackgroundResource(android.R.color.holo_green_light)
                R.id.box_four_text->view.setBackgroundResource(android.R.color.holo_green_dark)
                R.id.box_five_text->view.setBackgroundResource(android.R.color.holo_green_light)


                R.id.red_button -> box_thre_text.setBackgroundResource(R.color.my_red)
                R.id.yellow_button -> box_thre_text.setBackgroundResource(R.color.my_yellow)
                R.id.green_button -> box_thre_text.setBackgroundResource(R.color.my_green)

                else -> view.setBackgroundColor(Color.LTGRAY)
            }
        }
}