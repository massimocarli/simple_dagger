package uk.co.maxcarli.dagger.simple.di

import dagger.Module
import dagger.Provides
import uk.co.maxcarli.dagger.simple.Calculator
import uk.co.maxcarli.dagger.simple.impl.CalculatorImpl

@Module
class MathModule {

    @Provides
    fun provideCalculator(): Calculator = CalculatorImpl()
}