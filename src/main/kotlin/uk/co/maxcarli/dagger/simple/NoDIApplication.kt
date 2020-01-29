package uk.co.maxcarli.dagger.simple

import uk.co.maxcarli.dagger.simple.impl.CalculatorImpl
import uk.co.maxcarli.dagger.simple.impl.StdIOIntReader
import java.util.*

/**
 * Version without DI
 */
fun main() {
    val calculator: Calculator = CalculatorImpl()
    val scanner = Scanner(System.`in`)
    val reader: IntReader = StdIOIntReader(scanner)
    val app = Application(calculator, reader)
    app.execute()
}