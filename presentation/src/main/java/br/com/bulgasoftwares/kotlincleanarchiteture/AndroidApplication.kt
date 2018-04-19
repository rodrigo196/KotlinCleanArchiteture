package br.com.bulgasoftwares.kotlincleanarchiteture

import android.app.Application
import br.com.bulgasoftwares.kotlincleanarchiteture.internal.di.components.ApplicationComponent
import br.com.bulgasoftwares.kotlincleanarchiteture.internal.di.components.DaggerApplicationComponent
import br.com.bulgasoftwares.kotlincleanarchiteture.internal.di.modules.ApplicationModule
import com.squareup.leakcanary.LeakCanary

/**
 * Android Main Application
 */
class AndroidApplication : Application() {

    var applicationComponent: ApplicationComponent? = null
        private set

    override fun onCreate() {
        super.onCreate()
        this.initializeInjector()
        this.initializeLeakDetection()
    }

    private fun initializeInjector() {
        this.applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()
    }

    private fun initializeLeakDetection() {
        if (BuildConfig.DEBUG) {
            LeakCanary.install(this)
        }
    }
}