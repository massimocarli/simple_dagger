package uk.co.maxcarli.dagger.simple.di

import dagger.Component
import uk.co.maxcarli.dagger.simple.Application
import javax.inject.Singleton

/**
 * This is the Dagger component for our objects
 */
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {

    /**
     * Returns the reference to the Application object
     */
    fun app(): Application
}