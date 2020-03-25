package com.example.mtgcounterversie2

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {




    private var id = 40
    var hit1 = 0
    var hit2 = 0
    var hit3 = 0
    var hit4 = 0
    var hit5 = 0
    var hit6 = 0
    var hit7 = 0
    var hit8 = 0
    var hit9 = 0
    var hit10 = 0
    var hit11 = 0
    var hit12 = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN) ;

        setContentView(R.layout.activity_main)







        tel1.setText("" + id)

        plus1.setOnClickListener {
            tel1.setText("" + ++id)
        }

        min1.setOnClickListener {
            tel1.setText("" + --id)
        }

        tel2.setText("" + id)

        plus2.setOnClickListener {
            tel2.setText("" + ++id)
        }

        min2.setOnClickListener {
            tel2.setText("" + --id)
        }


        tel3.setText("" + id)

        plus3.setOnClickListener {
            tel3.setText("" + ++id)
        }

        min3.setOnClickListener {
            tel3.setText("" + --id)
        }

        tel4.setText("" + id)

        plus4.setOnClickListener {
            tel4.setText("" + ++id)
        }

        min4.setOnClickListener {
            tel4.setText("" + --id)
        }

        btngr2.setText("" + hit1)

        btngr2.setOnClickListener {
            ctelgr2.setText("" + ++hit1)
        }

        btnb2.setText("" + hit2)

        btnb2.setOnClickListener {
            ctelb2.setText("" + ++hit2)
        }
        btnr2.setText("" + hit3)


        btnr2.setOnClickListener {
            ctelr2.setText("" + ++hit3)
        }


        btngr1.setText("" + hit4)

        btngr1.setOnClickListener {
            ctelgr1.setText("" + ++hit4)
        }

        btng3.setText("" + hit5)

        btng1.setOnClickListener {
            ctelg1.setText("" + ++hit5)
        }
        btnb1.setText("" + hit6)


        btnb1.setOnClickListener {
            ctelb1.setText("" + ++hit6)
        }
        btngr3.setText("" + hit7)

        btngr3.setOnClickListener {
            ctelgr3.setText("" + ++hit7)
        }

        btng3.setText("" + hit8)

        btng3.setOnClickListener {
            ctelg3.setText("" + ++hit8)
        }
        btnr3.setText("" + hit9)


        btnr3.setOnClickListener {
            ctelr3.setText("" + ++hit9)
        }

        btng4.setText("" + hit10)

        btng4.setOnClickListener {
            ctelg4.setText("" + ++hit10)
        }

        btnr4.setText("" + hit11)

        btnr4.setOnClickListener {
            ctelr4.setText("" + ++hit11)
        }
        btnr4.setText("" + hit12)


        btnb4.setOnClickListener {
            ctelb4.setText("" + ++hit12)
        }

    }
}