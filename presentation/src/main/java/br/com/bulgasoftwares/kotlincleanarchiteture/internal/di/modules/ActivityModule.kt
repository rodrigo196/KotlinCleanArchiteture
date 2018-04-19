package br.com.bulgasoftwares.kotlincleanarchiteture.internal.di.modules

import android.app.Activity

import br.com.bulgasoftwares.kotlincleanarchiteture.internal.di.PerActivity
import dagger.Module
import dagger.Provides

/**
 * A module to wrap the Activity state and expose it to the graph.
 */
@Module
class ActivityModule(private val activity: Activity) {

    /**
     * Expose the activity to dependents in the graph.
     */
    @Provides
    @PerActivity
    internal fun activity(): Activity {
        return this.activity
    }
}