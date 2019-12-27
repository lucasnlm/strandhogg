package dev.lucasnlm.strandhogg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

fun AppCompatActivity.startActivityWithoutAnimation(intent: Intent) {
    overridePendingTransition(0, 0)
    startActivity(intent.apply {
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_NO_ANIMATION
    })
}

fun AppCompatActivity.startOtherApp(targetAppPackage: String) {
    packageManager.getLaunchIntentForPackage(targetAppPackage)?.let {
        startActivityWithoutAnimation(it)
    }
}
