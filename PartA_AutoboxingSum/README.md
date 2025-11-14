# Part A: Autoboxing and Integer Sum Calculator

## Overview
This module demonstrates **Autoboxing** and **Unboxing** in Java by creating an integer sum calculator.

## Concepts Covered
- **Autoboxing**: Automatic conversion of primitive types (`int`) to wrapper classes (`Integer`)
- **Unboxing**: Automatic conversion of wrapper classes (`Integer`) to primitive types (`int`)
- `Integer.parseInt()` for string-to-integer conversion
- `ArrayList<Integer>` to store Integer objects
- Enhanced for-loop for iteration

## How to Run

### Compilation
```bash
javac src/com/example/autoboxing/SumCalculator.java
```

### Execution
```bash
java -cp src com.example.autoboxing.SumCalculator
```

## Sample Output
```
=== Integer Sum Calculator with Autoboxing ===
Enter integers (type 'done' to finish):

Enter a number: 10
Added: 10
Enter a number: 20
Added: 20
Enter a number: 30
Added: 30
Enter a number: done

=== Results ===
Total numbers entered: 3
Numbers: [10, 20, 30]
Sum of all numbers: 60
Average: 20.0

Program completed successfully!
```

## Key Features
- ✅ Input validation
- ✅ Exception handling for invalid inputs
- ✅ Demonstrates autoboxing when adding to ArrayList
- ✅ Demonstrates unboxing during summation
- ✅ Calculates both sum and average

## Author
Ranjeet-Sahu07
