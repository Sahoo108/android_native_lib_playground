package com.sahoo.playground
import android.util.Log

fun <T> logDebug(tag:String, value:T){
    if(BuildConfig.DEBUG) return
    Log.d("DEBUG=> $tag", value.toString())
}

fun <T> logInfo(tag:String, value:T){
    if(BuildConfig.DEBUG) return
    Log.i("INFO=> $tag", value.toString())
}

fun <T> logError(tag:String, value:T){
    if(BuildConfig.DEBUG) return
    Log.e("ERROR=> $tag", value.toString())
}

fun <T> logView(tag:String, value:T){
    if(BuildConfig.DEBUG) return
    Log.v("VIEW=> $tag", value.toString())
}

fun <T> logWarn(tag:String, value:T){
    if(BuildConfig.DEBUG) return
    Log.w("WARN=> $tag", value.toString())
}