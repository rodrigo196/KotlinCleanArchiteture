package br.com.bulgasoftwares.kotlincleanarchiteture.view.activity

import android.app.Fragment
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

import br.com.bulgasoftwares.kotlincleanarchiteture.AndroidApplication
import br.com.bulgasoftwares.kotlincleanarchiteture.internal.di.components.ApplicationComponent
import br.com.bulgasoftwares.kotlincleanarchiteture.internal.di.modules.ActivityModule

/**
 * Base [AppCompatActivity] class for every Activity in this application.
 */
abstract class BaseActivity : AppCompatActivity() {

    /**
     * Get the Main Application component for dependency injection.
     *
     * @return [ApplicationComponent]
     */
    protected val applicationComponent: ApplicationComponent?
        get() = (application as AndroidApplication).applicationComponent

    /**
     * Get an Activity module for dependency injection.
     *
     * @return [ActivityModule]
     */
    protected val activityModule: ActivityModule
        get() = ActivityModule(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.applicationComponent!!.inject(this)
    }

    /**
     * Adds a [Fragment] to this activity's layout.
     *
     * @param containerViewId The container view to where add the fragment.
     * @param fragment The fragment to be added.
     */
    protected fun addFragment(containerViewId: Int, fragment: Fragment) {
        val fragmentTransaction = this.fragmentManager.beginTransaction()
        fragmentTransaction.add(containerViewId, fragment)
        fragmentTransaction.commit()
    }
}