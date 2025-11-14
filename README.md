# JavaDataProcessingApps

## Overview
Complete Java repository demonstrating **Autoboxing**, **Serialization**, and **File Handling** with 3 practical applications.

## Repository Structure
```
JavaDataProcessingApps/
├── PartA_AutoboxingSum/
│   ├── src/com/example/autoboxing/SumCalculator.java
│   └── README.md
├── PartB_StudentSerialization/
│   ├── src/com/example/serialization/
│   │   ├── Student.java
│   │   ├── SerializeStudent.java
│   │   └── DeserializeStudent.java
│   └── README.md
├── PartC_EmployeeFileHandling/
│   ├── src/com/example/employee/
│   │   ├── Employee.java
│   │   ├── EmployeeManager.java
│   │   └── MainMenu.java
│   └── README.md
└── README.md
```

## Part A: Autoboxing & Integer Sum
### Concepts
- Autoboxing: Automatic primitive → wrapper conversion
- Unboxing: Automatic wrapper → primitive conversion
- Integer.parseInt() for string conversion
- ArrayList<Integer> usage

### Run
```bash
cd PartA_AutoboxingSum
javac src/com/example/autoboxing/SumCalculator.java
java -cp src com.example.autoboxing.SumCalculator
```

## Part B: Student Serialization
### Concepts
- Serialization: Object → byte stream
- Deserialization: Byte stream → object
- Serializable interface
- ObjectOutputStream & ObjectInputStream

### Run
```bash
cd PartB_StudentSerialization
javac src/com/example/serialization/*.java
java -cp src com.example.serialization.SerializeStudent
java -cp src com.example.serialization.DeserializeStudent
```

## Part C: Employee File Handling
### Concepts
- Menu-driven application
- BufferedWriter & BufferedReader
- CSV-style storage
- CRUD operations

### Run
```bash
cd PartC_EmployeeFileHandling
javac src/com/example/employee/*.java
java -cp src com.example.employee.MainMenu
```

## Prerequisites
- JDK 8 or higher
- Terminal/Command Prompt

## Quick Setup
```bash
git clone https://github.com/Ranjeet-Sahu07/JavaDataProcessingApps.git
cd JavaDataProcessingApps
```

## Complete Code Listings

See individual README files in each part's directory for full code examples and detailed instructions.

## Author
Ranjeet Sahu ([@Ranjeet-Sahu07](https://github.com/Ranjeet-Sahu07))

---

## Repository Link
https://github.com/Ranjeet-Sahu07/JavaDataProcessingApps
