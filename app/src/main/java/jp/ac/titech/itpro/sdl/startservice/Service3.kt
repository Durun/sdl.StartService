package jp.ac.titech.itpro.sdl.startservice

import android.app.Service
import android.content.Intent
import android.os.IBinder

class Service3: Service() {
    override fun onBind(intent: Intent): IBinder? = null

    companion object {
        @JvmStatic
        val TAG: String = Service3::class.java.simpleName
        @JvmStatic
        val EXTRA_MYARG: String = "MYARG"
    }
}