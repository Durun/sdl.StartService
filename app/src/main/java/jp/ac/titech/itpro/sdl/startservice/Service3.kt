package jp.ac.titech.itpro.sdl.startservice

import android.app.IntentService
import android.content.Intent
import android.util.Log

class Service3 : IntentService(TAG) {
    override fun onHandleIntent(intent: Intent?) {
        Log.d(TAG, "onHandleIntent in " + Thread.currentThread())
        Log.d(TAG, "myarg = " + intent?.getStringExtra(EXTRA_MYARG))
        val intent = Intent("android.intent.category.DEFAULT")
        intent.putExtra(EXTRA_MYARG, "This is broadcast\nfrom " + Thread.currentThread())
        sendBroadcast(intent)
        Log.d(TAG, "sent broadcast in " + Thread.currentThread())
    }

    override fun onCreate() {
        super.onCreate()
        Log.d(TAG, "onCreate in " + Thread.currentThread())
    }

    override fun onDestroy() {
        Log.d(TAG, "onDestroy in " + Thread.currentThread())
        super.onDestroy()
    }

    companion object {
        @JvmStatic
        val TAG: String = Service3::class.java.simpleName

        @JvmStatic
        val EXTRA_MYARG: String = "MYARG"
    }
}