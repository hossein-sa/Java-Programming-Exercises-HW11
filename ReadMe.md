# Java Programming Exercises

This repository contains a collection of Java programs that demonstrate various programming concepts, including string permutations, set operations, list processing, and custom HashMap implementation. Each program is designed to solve a specific problem and showcase best practices in Java programming.

---

## Table of Contents
1. [Program Descriptions](#program-descriptions)
2. [How to Use](#how-to-use)
3. [Examples](#examples)
4. [Technologies Used](#technologies-used)
5. [Contributing](#contributing)
6. [License](#license)

---

## Program Descriptions

### 1. **String Permutations (`PermutationGenerator`)**
- **Purpose**: Generates all possible permutations of a given string and allows the user to verify if a specific permutation exists.
- **Example**:
    - Input: `"CAT"`
    - Output: `[ACT, TCA, TAC, CTA, CAT, ATC]`
    - Verification: If the user inputs `"ACT"`, the program outputs `"Pass!"`.

### 2. **Set Operations (`SetOperationsDemo`)**
- **Purpose**: Demonstrates union and intersection operations on two randomly generated sets of characters.
- **Example**:
    - Set 1: `[a, b, c, d, e]`
    - Set 2: `[c, d, e, f, g]`
    - Union: `[a, b, c, d, e, f, g]`
    - Intersection: `[c, d, e]`

### 3. **List Processing (`ListCleanup`)**
- **Purpose**: Processes a list of integers by removing pairs of elements where the second element is smaller than the first.
- **Example**:
    - Input: `[3, 7, 9, 2, 5, 5, 8, 5, 6, 3, 4, 7, 3, 1]`
    - Output: `[3, 7, 5, 5, 4, 7]`

### 4. **Custom HashMap (`HashMapCustom`)**
- **Purpose**: Implements a custom HashMap with basic operations like `put`, `replace`, `containsKey`, and `printAll`.
- **Example**:
    - Add entries: `put(1, "Aref")`, `put(2, "Ali")`
    - Replace value: `replace(1, "Mohsen")`
    - Check existence: `containsKey(2)` returns `true`.

---

## How to Use

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/hossein-sa/Java-Programming-Exercises-HW11.git
   cd Java-Programming-Exercises-HW11
   ```

2. **Compile and Run**:
    - Compile all Java files:
      ```bash
      javac ir/hsadeghi/*.java ir/hsadeghi/*/*.java
      ```
    - Run the `Main` class:
      ```bash
      java ir.hsadeghi.Main
      ```

3. **Follow the Menu**:
    - The program will display a menu with options for each exercise. Enter the corresponding number to run a specific program.

---

## Examples

### Example 1: String Permutations
```
==== Main Menu ====
 1. String Permutations
 2. Set Operations Demo
 3. List Processing
 4. Custom Map Demo
 5. Exit
Enter your choice (1-5): 1
Enter word to permute: CAT
Generated permutations (6):
[ACT, TCA, TAC, CTA, CAT, ATC]
Enter permutation to verify (press Enter to skip): ACT
Validation PASSED: Permutation exists
```

### Example 2: Set Operations
```
==== Main Menu ====
 1. String Permutations
 2. Set Operations Demo
 3. List Processing
 4. Custom Map Demo
 5. Exit
Enter your choice (1-5): 2
Set 1: [a, b, c, d, e]
Set 2: [c, d, e, f, g]
Union: [a, b, c, d, e, f, g]
Intersection: [c, d, e]
```

---

## Technologies Used
- **Java**: Core programming language used for all implementations.
- **Data Structures**: `ArrayList`, `TreeSet`, `HashMap`, and custom implementations.
- **Tools**: IntelliJ IDEA, Git, and Maven (optional for dependency management).

---

## Contributing
Contributions are welcome! If you'd like to improve this project, please follow these steps:
1. Fork the repository.
2. Create a new branch (`git checkout -b feature/YourFeatureName`).
3. Commit your changes (`git commit -m 'Add some feature'`).
4. Push to the branch (`git push origin feature/YourFeatureName`).
5. Open a pull request.

---

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

## Acknowledgments
- Inspired by Java programming exercises and algorithms.
- Special thanks to the Java community for providing excellent resources and tutorials.