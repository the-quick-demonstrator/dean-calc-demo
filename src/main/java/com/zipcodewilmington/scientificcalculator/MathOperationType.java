package com.zipcodewilmington.scientificcalculator;

import com.zipcodewilmington.scientificcalculator.operations.*;

public enum MathOperationType {
    ADDITION(2, new Addition()),
    SUBTRACTION(2, new Subtraction()),
    MULTIPLICATION(2, new Multiplication()),
    DIVISION(2, new Division()),
    SQUARE_ROOT(1, new SquareRoot()),
    SQUARE(1, new Square()),
    EXPONENTIATION(2, new Exponentiation()),
    CLEAR(0, new ClearDisplay());

    private final int numOperands;
    private final MathOperation mathOperation;

    MathOperationType(int numOperands, MathOperation mathOperation) {
        this.numOperands = numOperands;
        this.mathOperation = mathOperation;
    }

    public int getNumOperands() {
        return numOperands;
    }

    public MathOperation getMathOperation() {
        return mathOperation;
    }
}
