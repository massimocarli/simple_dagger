package uk.co.maxcarli.dagger.simple

import uk.co.maxcarli.dagger.simple.di.DaggerAppComponent

/**
 * Simple version with Dagger
 */
fun main() {
    val comp = DaggerAppComponent.builder().build()
    val app = comp.app()
    app.execute()
}