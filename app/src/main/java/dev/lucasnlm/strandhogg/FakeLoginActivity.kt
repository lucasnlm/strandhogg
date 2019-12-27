package dev.lucasnlm.strandhogg

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_troll.*

class FakeLoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_troll)

        startActivityWithoutAnimation(Intent(this, InoffensiveActivity::class.java))

        backToOriginal.setOnClickListener {
            startOtherApp(getString(R.string.target_package))
            finish()
        }
    }
}
