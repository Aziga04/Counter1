package com.example.counter1

import android.content.Context
import android.util.Log
import android.widget.Toast

class Presenter {
     private var model = Model()
    lateinit var view: View

    fun increment() {
        model.increment()
        view.changeCount(model.count)
    }
    fun decrement(){
        model.decrement()
        view.changeCount(model.count)
    }
    fun examination(){
        if (model.count == 10) {
            view.showToast("Поздраляем")
        }
        if (model.count == 15) {
            view.setColor(R.color.green)
        }
    }
    fun attachView(view: MainActivity) {
        this.view = view
    }
}