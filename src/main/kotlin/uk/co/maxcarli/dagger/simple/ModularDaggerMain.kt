package uk.co.maxcarli.dagger.simple

import uk.co.maxcarli.dagger.simple.di.DaggerModularComponent
import uk.co.maxcarli.dagger.simple.di.IOModule
import java.util.*

/**
 * Usage of Component with multiple Modules
 */
fun main() {
    val scanner = Scanner(System.`in`)
    val comp = DaggerModularComponent.builder()
        .iOModule(IOModule(scanner))
        .build()
    val app = comp.app()
    app.execute()
}