package br.com.bulgasoftwares.kotlincleanarchiteture.internal.di.modules

import android.content.Context

import br.com.bulgasoftwares.domain.executor.PostExecutionThread
import br.com.bulgasoftwares.domain.executor.ThreadExecutor
import br.com.bulgasoftwares.kotlincleanarchiteture.AndroidApplication
import br.com.bulgasoftwares.kotlincleanarchiteture.UIThread
import br.com.bulgasoftwares.kotlincleanarchiteture.data.executor.JobExecutor
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Dagger module that provides objects which will live during the application lifecycle.
 */
@Module
class ApplicationModule(private val application: AndroidApplication) {

    @Provides
    @Singleton
    internal fun provideApplicationContext(): Context {
        return this.application
    }

    @Provides
    @Singleton
    internal fun provideThreadExecutor(jobExecutor: JobExecutor): ThreadExecutor {
        return jobExecutor
    }

    @Provides
    @Singleton
    internal fun providePostExecutionThread(uiThread: UIThread): PostExecutionThread {
        return uiThread
    }
}