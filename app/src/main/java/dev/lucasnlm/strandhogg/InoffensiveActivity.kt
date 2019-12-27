package dev.lucasnlm.strandhogg

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class InoffensiveActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle(R.string.inoffensive_title)

        startActivityWithoutAnimation(Intent(this, FakeLoginActivity::class.java))

        // Random stuff on Inoffensive screen

        emoji.setOnClickListener {
            emoji.text = listOf(
                "\uD83D\uDE0A",
                "\uD83E\uDD70",
                "\uD83E\uDD73",
                "\uD83D\uDE09",
                "\uD83E\uDD84",
                "\uD83D\uDE39",
                "\uD83D\uDC36"
            ).filter { it != emoji.text.toString() }.shuffled().first()
        }
    }

    override fun onBackPressed() {
        //finish()

        // Disable to avoid back to Fake activity
        // It may also start the target app
    }
}
