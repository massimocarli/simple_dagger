package uk.co.maxcarli.dagger.simple.di

import dagger.Module
import dagger.Provides
import uk.co.maxcarli.dagger.simple.IntReader
import uk.co.maxcarli.dagger.simple.impl.StdIOIntReader
import java.util.*

@Module
class IOModule(val scanner: Scanner) {

    @Provides
    fun provideIntReader(): IntReader {
        return StdIOIntReader(scanner)
    }
}