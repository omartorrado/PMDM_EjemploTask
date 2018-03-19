package org.danielcastelao.otorradomiguez.pmdm_tasks

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.constraint.ConstraintSet
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.experimental.*
import kotlinx.coroutines.experimental.android.UI
import org.jetbrains.anko.activityManager
import org.jetbrains.anko.contentView
import kotlin.coroutines.experimental.CoroutineContext

class MainActivity : AppCompatActivity() {

    private val uiContext: CoroutineContext = UI

    private val bgContext: CoroutineContext = CommonPool


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button_abajo.setOnClickListener {
            cuenta()
        }
    }

    var job2 : Job? = null

    private fun cuenta(){
        val task2 =launch(uiContext) {
            for(i in 0 until 100) {
                println("puta ostia")
                texto.setText("Cuenta \n $i")
                delay(1000)
                println("joder")
            }

        }

        job2 = task2
        job2?.start()

    }
}
