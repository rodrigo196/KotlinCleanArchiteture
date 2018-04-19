package br.com.bulgasoftwares.kotlincleanarchiteture.internal.di.components

import android.app.Activity

import br.com.bulgasoftwares.kotlincleanarchiteture.internal.di.PerActivity
import br.com.bulgasoftwares.kotlincleanarchiteture.internal.di.modules.ActivityModule
import dagger.Component

/**
 * A base component upon which fragment's components may depend.
 * Activity-level components should extend this component.
 *
 * Subtypes of ActivityComponent should be decorated with annotation:
 * [PerActivity]
 */
@PerActivity
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
internal interface ActivityComponent {
    //Exposed to sub-graphs.
    fun activity(): Activity
}