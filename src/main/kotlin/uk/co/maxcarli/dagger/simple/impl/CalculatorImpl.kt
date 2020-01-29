package uk.co.maxcarli.dagger.simple.impl

import uk.co.maxcarli.dagger.simple.Calculator
import javax.inject.Inject

/**
 * Simple implementation for uk.co.maxcarli.dagger.simple.Calculator
 */
open class CalculatorImpl @Inject constructor() : Calculator {
    override fun sum(a: Int, b: Int) = a + b
}