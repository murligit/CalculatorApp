package com.example.calculatorsimpleapp

sealed class CalculatorOperation(val symbol: String) {
    object Add: CalculatorOperation("+")
    object Sub: CalculatorOperation("-")
    object Multi: CalculatorOperation("*")
    object Div: CalculatorOperation("/")
}
