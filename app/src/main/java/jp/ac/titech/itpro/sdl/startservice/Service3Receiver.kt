package jp.ac.titech.itpro.sdl.startservice

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class Service3Receiver(
        private val action: (Intent) -> Unit
) : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        Log.d(TAG, "onReceive in " + Thread.currentThread())
        action(intent)
    }

    companion object {
        val TAG = Service3Receiver::class.java.simpleName
    }
}