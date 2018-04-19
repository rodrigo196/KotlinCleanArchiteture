package br.com.bulgasoftwares.kotlincleanarchiteture.internal.di.components

import android.content.Context

import br.com.bulgasoftwares.domain.executor.PostExecutionThread
import br.com.bulgasoftwares.domain.executor.ThreadExecutor
import br.com.bulgasoftwares.kotlincleanarchiteture.internal.di.modules.ApplicationModule
import br.com.bulgasoftwares.kotlincleanarchiteture.view.activity.BaseActivity
import dagger.Component
import javax.inject.Singleton

/**
 * A component whose lifetime is the life of the application.
 */
@Singleton // Constraints this component to one-per-application or unscoped bindings.
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {
    fun inject(baseActivity: BaseActivity)

    //Exposed to sub-graphs.
    fun context(): Context

    fun threadExecutor(): ThreadExecutor
    fun postExecutionThread(): PostExecutionThread
}