package com.example.counter1

interface View {
    fun changeCount(count : Int)
    fun showToast(msg: String)
    fun setColor(color:Int)
}