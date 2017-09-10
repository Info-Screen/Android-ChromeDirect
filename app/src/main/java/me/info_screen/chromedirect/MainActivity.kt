package me.info_screen.chromedirect

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (intent.data != null) {
            intent = Intent(Intent.ACTION_VIEW, intent.data)
            intent.`package` = "com.android.chrome"
            startActivity(intent)
        }

        finish();
    }
}
