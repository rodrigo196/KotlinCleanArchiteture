package br.com.bulgasoftwares.kotlincleanarchiteture.view.activity

import android.os.Bundle
import br.com.bulgasoftwares.kotlincleanarchiteture.R

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
