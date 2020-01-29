package uk.co.maxcarli.dagger.simple.di

import dagger.Module
import dagger.Provides
import uk.co.maxcarli.dagger.simple.Calculator
import uk.co.maxcarli.dagger.simple.IntReader
import uk.co.maxcarli.dagger.simple.impl.CalculatorImpl
import uk.co.maxcarli.dagger.simple.impl.StdIOIntReader
import java.util.*
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    fun provideCalculator(): Calculator = CalculatorImpl()

    @Provides
    fun provideIntReader(): IntReader {
        val scanner = Scanner(System.`in`)
        return StdIOIntReader(scanner)
    }
}