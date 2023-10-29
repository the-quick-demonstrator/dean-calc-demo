package com.zipcodewilmington.scientificcalculator;

import com.zipcodewilmington.scientificcalculator.operations.*;

public enum MathOperationType {
    ADDITION(2, (operands) -> {
        // Calculate the product of 'operand1' and 'operand2' and store it in the 'answer' variable.
        double operand1 = operands[0];
        double operand2 = operands[1];
        double answer = operand1 + operand2;
        // Return the calculated result, which represents the result of the multiplication operation.
        return answer;
    }),
    SUBTRACTION(2, (operands) -> {
        // Calculate the product of 'operand1' and 'operand2' and store it in the 'answer' variable.
        double operand1 = operands[0];
        double operand2 = operands[1];
        double answer = operand1 - operand2;
        // Return the calculated result, which represents the result of the multiplication operation.
        return answer;
    }),
    MULTIPLICATION(2, (operands) -> {
        // Calculate the product of 'operand1' and 'operand2' and store it in the 'answer' variable.
        double operand1 = operands[0];
        double operand2 = operands[1];
        double answer = operand1 * operand2;
        // Return the calculated result, which represents the result of the multiplication operation.
        return answer;
    }),
    DIVISION(2, (operands) -> {
        // Calculate the product of 'operand1' and 'operand2' and store it in the 'answer' variable.
        double operand1 = operands[0];
        double operand2 = operands[1];
        double answer = operand1 * operand2;
        // Return the calculated result, which represents the result of the multiplication operation.
        return answer;
    }),


    SQUARE_ROOT(1, (operands) -> {
        // Calculate the product of 'operand1' and 'operand2' and store it in the 'answer' variable.
        double operand1 = operands[0];
        double answer = Math.sqrt(operand1);
        // Return the calculated result, which represents the result of the multiplication operation.
        return answer;
    }),
    SQUARE(1, (operands) -> {
        // Calculate the square of an operand
        double operand1 = operands[0];
        double answer = operand1 * operand1;
        // Return the calculated result, which represents the result of the multiplication operation.
        return answer;
    }),
    EXPONENTIATION(2, (operands) -> {
        // Calculate the product of 'operand1' and 'operand2' and store it in the 'answer' variable.
        double operand1 = operands[0];
        double operand2 = operands[1];
        double answer = Math.pow(operand1, operand2);
        // Return the calculated result, which represents the result of the multiplication operation.
        return answer;
    }),
    CLEAR(0, (operands) -> {
        // Perform the clear display operation.
        // This operation is not intended to perform any mathematical calculation.
        // It's used to indicate that the display should be cleared.
        // Since it doesn't perform a calculation, we return a default value (0.0).
        return 0.0; // Return a default value (0.0) to indicate clearing the display.
    });

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
