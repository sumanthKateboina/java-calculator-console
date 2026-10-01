# Java Console Calculator

A simple, interactive console-based calculator program built using Java. This application performs basic arithmetic operations with modular methods and input handling.

## Features
- **Addition**: Calculates the sum of two numbers.
- **Subtraction**: Calculates the difference between two numbers.
- **Multiplication**: Calculates the product of two numbers.
- **Division**: Calculates the quotient with built-in **divide-by-zero** validation.
- **Interactive Menu**: Uses a `do-while` loop to support continuous calculations until the user chooses to exit.
- **Robust Input Handling**: Validates user menu and numeric inputs.

## Technologies Used
- **Language**: Java (JDK 17+)
- **IDE**: VS Code
- **Version Control**: Git & GitHub

## Core Java Concepts Used
- **Methods**: Separate static helper functions for each math operation (`calculateSum`, `calculateDifference`, `calculateProduct`, `calculateQuotient`).
- **Scanner Class**: Capturing user input via `java.util.Scanner`.
- **Control Flow**: `switch-case` for menu navigation and `if-else` for conditional checks.
- **Loops**: `do-while` loop for repeated menu execution.

## How to Run

1. **Compile the source code**:
   ```bash
   javac Calculator.java
   ```

2. **Execute the compiled program**:
   ```bash
   java Calculator
   ```

## Example Usage

```text
--- JAVA CONSOLE CALCULATOR ---
1. Addition (+)
2. Subtraction (-)
3. Multiplication (*)
4. Division (/)
0. Exit
Choose an option: 1
Enter first number: 25
Enter second number: 15
Answer = 40.0
```
