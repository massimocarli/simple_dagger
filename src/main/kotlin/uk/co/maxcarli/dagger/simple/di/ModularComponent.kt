package uk.co.maxcarli.dagger.simple.di

import dagger.Component
import uk.co.maxcarli.dagger.simple.Application

/**
 * This is the Dagger component for our objects
 */
@Component(modules = arrayOf(IOModule::class, MathModule::class))
interface ModularComponent {

    /**
     * Returns the reference to the Application object
     */
    fun app(): Application
}