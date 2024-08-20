package com.sahoo.playground

import android.util.Log


const val isDebugEnabled = true


fun <T> logDebug(tag:String, value:T){
    if(!isDebugEnabled) return
    Log.d("DEBUG=> $tag", value.toString())
}

fun <T> logInfo(tag:String, value:T){
    if(!isDebugEnabled) return
    Log.i("INFO=> $tag", value.toString())
}

fun <T> logError(tag:String, value:T){
    if(!isDebugEnabled) return
    Log.e("ERROR=> $tag", value.toString())
}

fun <T> logView(tag:String, value:T){
    if(!isDebugEnabled) return
    Log.v("VIEW=> $tag", value.toString())
}

fun <T> logWarn(tag:String, value:T){
    if(!isDebugEnabled) return
    Log.v("WARN=> $tag", value.toString())
}