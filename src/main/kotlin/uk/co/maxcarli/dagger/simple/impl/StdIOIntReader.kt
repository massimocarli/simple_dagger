package uk.co.maxcarli.dagger.simple.impl

import uk.co.maxcarli.dagger.simple.IntReader
import java.util.*
import javax.inject.Inject

/**
 * Implementation for the IntReader which reads an Int from the Standard Input
 */
open class StdIOIntReader @Inject constructor(val scanner: Scanner) : IntReader {

    override fun read() = scanner.nextInt()
}