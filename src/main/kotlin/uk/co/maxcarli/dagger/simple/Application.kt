package uk.co.maxcarli.dagger.simple

import uk.co.maxcarli.dagger.simple.util.Logger
import javax.inject.Inject

class Application @Inject constructor(
    private val calculator: Calculator,
    private val intReader: IntReader
) {

    private var logger: Logger? = null

    fun execute() {
        val first = intReader.read()
        val second = intReader.read()
        val result = calculator.sum(first, second)
        val resStr = "$first + $second = $result"
        logger?.log(resStr)
        println(resStr)
    }

    @Inject
    fun registerLogger(logger: Logger) {
        this.logger = logger
    }
}