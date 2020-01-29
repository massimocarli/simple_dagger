package uk.co.maxcarli.dagger.simple.util

import javax.inject.Inject

/**
 * Simple Logger
 */
class Logger @Inject constructor() {
    fun log(str: String) = println("${System.currentTimeMillis()}: $str")
}