package test.test

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

//test
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val expenselist = arrayListOf("")
        button.setOnClickListener {
            expenses_display.text=""
            val new_expense =add_expense.text.toString()
            expenselist.add(new_expense)
            add_expense.text.clear()
            for (element in expenselist){
                expenses_display.text = expenses_display.text.toString() + element + "\n "
            }



        }
        }

    }


