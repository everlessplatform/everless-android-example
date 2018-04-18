package id.everless.sampleapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import id.everless.sdk.corekit.EverlessSDK


class MainActivity : AppCompatActivity() {

    private val BASE_URL = "<Everless base URL>"
    private val CLIENT_KEY = "<your Client Key>"
    private val CLIENT_SECRET = "<your Client Secret>"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        EverlessSDK.init(BASE_URL, CLIENT_KEY, CLIENT_SECRET)
    }
}
