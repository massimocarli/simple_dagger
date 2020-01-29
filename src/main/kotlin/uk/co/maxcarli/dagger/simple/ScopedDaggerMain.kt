package uk.co.maxcarli.dagger.simple

import uk.co.maxcarli.dagger.simple.di.DaggerAppComponent

/**
 * We want to check the scope of objects in a dependency graph
 */
fun main() {
    val comp = DaggerAppComponent.builder().build()
    val app1 = comp.app()
    val app2 = comp.app()
    if (app1 === app2) {
        println("Same object!")
    } else {
        println("Different objects!")
    }
}