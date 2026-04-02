# StriverA2ZSheet - DSA Learning Repository

A comprehensive Java project for practicing Data Structures & Algorithms following the **Striver A2Z DSA Sheet** curriculum.

## 📁 Folder Structure

```
src/main/java/
├── arrays/                           # Array-based problems
│   └── Find_Unique_Element.java      # Find the unique element using XOR
├── patterns/                         # 19 Pattern printing problems
│   ├── Pattern_1_Rectangular_Star_Pattern.java
│   ├── Pattern_2_Right_Angled_Triangle_Pattern.java
│   ├── Pattern_3_Right_Angled_Number_Pyramid.java
│   ├── Pattern_4_Right_Angled_Number_Pyramid_II.java
│   ├── Pattern_5_Inverted_Right_Pyramid.java
│   ├── Pattern_6_Inverted_Numbered_Right_Pyramid.java
│   ├── Pattern_7_Star_Pyramid.java
│   ├── Pattern_8_Inverted_Star_Pyramid.java
│   ├── Pattern_9_Diamond_Star_Pattern.java
│   ├── Pattern_10_Half_Diamond_Star_Pattern.java
│   ├── Pattern_11_Binary_Number_Triangle_Pattern.java
│   ├── Pattern_12_Number_Crown_Pattern.java
│   ├── Pattern_13_Increasing_Number_Triangle_Pattern.java
│   ├── Pattern_14_Increasing_Letter_Triangle_Pattern.java
│   ├── Pattern_15_Reverse_Letter_Triangle_Pattern.java
│   ├── Pattern_16_Alpha_Ramp_Pattern.java
│   ├── Pattern_17_Alpha_Hill_Pattern.java
│   ├── Pattern_18_Alpha_Triangle_Pattern.java
│   └── Pattern_19_Symmetric_Void_Pattern.java
└── utils/                            # Utility classes and entry points
    └── Main.java                     # Main entry point
```

## 📚 Module Descriptions

### 1. **arrays/** - Array Problems
- `Find_Unique_Element.java` - Finds a unique element in an array where all other elements appear twice using XOR bit manipulation

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

### 2. **patterns/** - Logical Thinking & Pattern Printing
19 progressive pattern problems covering:

- **Star Patterns:** Rectangle, Triangle, Pyramid, Diamond, Half-Diamond
- **Number Patterns:** Pyramids, Crowns, Increasing Triangles
- **Alphabet Patterns:** Ramps, Hills, Reverse triangles
- **Special Patterns:** Binary triangles, Symmetric voids

These problems are excellent for:
- Understanding nested loops
- Logical thinking development
- Loop optimization techniques

### 3. **utils/** - Utilities
- `Main.java` - Main entry point and documentation

## 🚀 How to Run

### Compile the Project
```bash
mvn clean compile
```

### Run Specific Classes
```bash
# Run a pattern problem
java -cp target/classes patterns.Pattern_1_Rectangular_Star_Pattern

# Run array problem
java -cp target/classes arrays.Find_Unique_Element

# Run main entry point
java -cp target/classes utils.Main
```

### Build JAR
```bash
mvn package
java -jar target/StriverA2ZSheet-1.0-SNAPSHOT.jar
```

## 🛠️ Technical Details

- **Language:** Java 25
- **Build Tool:** Maven
- **Package Structure:** Topic-based organization
- **No External Dependencies:** Pure Java implementation

## 📝 Contributing

To add new problems:

1. Create a new `.java` file in the appropriate folder
2. Add the correct package declaration
3. Implement the `main` method
4. Update this README if adding a new category

## 📖 Problem-Solving Approach

Each class follows a standard structure:
```java
package <module_name>;

public class ProblemName {
    public static void main(String[] args) {
        // Problem implementation
    }
    
    public static <return_type> <method_name>(<parameters>) {
        // Solution logic
    }
}
```

## 💡 Learning Path

1. **Start with:** Pattern problems (P1-P19) for foundational understanding
2. **Progress to:** Array manipulation techniques
3. **Expand to:** Additional DSA topics as added

---

**Last Updated:** April 2026

