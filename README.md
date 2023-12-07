# JAVA Concepts

<small>
    The following repository has been made by Aditya Tripathi
</small>

## Variables in JAVA (Variables.java)

```
<datatype> <identifier>;
<datatype> <identifier> = <value>;
```

-   In Java, variables are fundamental building blocks that store data for manipulation throughout a program's execution. They act like containers, holding values and allowing the program to access and modify them. Understanding variables is crucial for writing efficient and effective Java programs.
-   Variables are scoped in two different ways:
    1. Instance Variables: Belong to individual objects and are declared within a class but outside any method.
    2. Local Variables: Declared within a method and accessible only within that method.
-   Modifiers of variables include:
    1. static: Creates a class variable, shared by all instances of the class.
    2. final: Makes the variable's value constant and cannot be changed after initialization.
    3. public: Makes the variable accessible from anywhere in the program.
    4. private: Makes the variable accessible only within the class where it's declared.
-   Rules to make variables:
    1. Choose meaningful and descriptive names.
    2. Use appropriate data types to avoid memory waste and potential errors.
    3. Declare variables close to their first use.
    4. Initialize variables when they are declared to avoid potential null pointer exceptions.
    5. Use modifiers effectively to control access and prevent unwanted modifications.

## DataTypes in JAVA (DataTypes.java)

-   Data types play a vital role in defining the type of data a variable can hold in Java. They determine the size, range, and operations allowed for the data. Choosing the correct data type is crucial for writing efficient and accurate programs.
-   They are of two types: - They are of two types:
    1. Primitive: Built-in data types like int, char, double, etc. They have predefined sizes and operations.
    2. Reference: Represents objects and arrays. They store the memory location of the actual data instead of the data itself.

| Data Type | Size (bits) | Range                                                  | Description                                                                      |
| --------- | ----------- | ------------------------------------------------------ | -------------------------------------------------------------------------------- |
| byte      | 8           | 128 to 127                                             | Smallest signed integer, suitable for storing small whole numbers.               |
| short     | 16          | 32,768 to 32,767                                       | Larger signed integer than byte, suitable for storing mediumsized whole numbers. |
| int       | 32          | 2,147,483,648 to 2,147,483,647                         | Default integer type, suitable for storing most common whole numbers.            |
| long      | 64          | 9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 | Largest signed integer, suitable for storing very large whole numbers.           |
| float     | 32          | Approximately ±3.40282E38F                             | Single-precision floating-point type, suitable for storing decimal values.       |
| double    | 64          | Approximately ±1.79769E308D                            | Double-precision floating-point type, more precise than float.                   |
| char      | 16          | '\u0000' to '\uffff'                                   | Single Unicode character.                                                        |
| bool      | 1           | true or false                                          | Represents true or false values.                                                 |

## ControlStructures in JAVA (ControlStructures.java)

-   Control structures are fundamental building blocks of any programming language, including Java. They enable programs to make decisions, repeat tasks, and control the flow of execution based on specific conditions. Mastering these structures is essential for writing effective and efficient Java programs.
-   They are of 3 types:

    1. Conditional Statements:

        - if-else: Evaluates a condition and executes different code blocks based on the result.
            - ```
                if (<condition>) {
                    // do something
                } else {
                    // do something else
                }
              ```
        - else-if: Allows for checking multiple conditions sequentially.
            - ```
                if (<condition>) {
                    // do something
                } else if (<condition>) {
                    // do something else
                } else {
                    // do the last thing
                }
              ```
        - switch: Evaluates a variable against multiple values and executes code based on the match.

            - ```
                switch (<condition>) {
                    case 1:
                        // something one
                        break;
                    case 2:
                        // something two
                        break;
                    case 3:
                        // something three
                        break;
                    default:
                        // when no other case works
                        break;
                }

                // if <condition> returns an int, then case 1 is applicable.
                // if <condition> returns a char, then case 'A' is applicable.
              ```

        - ?: (ternary operator) provides a concise way to write simple if-else statements.
            - ```
              <condition> ? doIfTrue() : doIfFalse();
              ```

2. Looping Statements:

    - while: Repeatedly executes a block of code as long as a condition is true.
        - ```
            while (<condition>) {
                // loop until <condition> is false
            }
          ```
    - do-while: Similar to while but guarantees the code block executes at least once.

        - ```
            do {
                // do this until condition is false
                // this is done at least once, irrespective of the <condition>
            } while (<condition>);
          ```

    - for: Repeats a block of code a specific number of times or iterates through a collection.

        - ```
            for (<initializer>; <condition>; <increment/decrement>) {
                // do something
            }
          ```

3. Jump Statements:

    - break: Exits a loop prematurely.

        - ```
            for (int i = 1; i <= 5; i++) {
                if (i == 3) {break;}
                System.Out.println(i);
            }
          ```
        - Output: `12`

    - continue: Skips the remaining code in the current iteration of a loop and moves to the next iteration.

        - ```
            for (int i = 1; i <= 5; i++) {
                if (i == 3) {break;}
                System.Out.println(i);
            }
          ```

        - Output: `1245`

-   Benefits of Using Control Structures
    1. Improved program logic: Control structures help structure your program's logic by allowing you to control the flow of execution and make decisions based on specific conditions.
    2. Increased code reusability: You can write and encapsulate common logic within control structures and reuse them throughout your program.
    3. Enhanced program efficiency: Control structures enable you to optimize your program by avoiding unnecessary repetitions and executing code only when required.

## Functions in JAVA (Functions.java)

-   In Java, functions, also commonly known as methods, are essential components for code modularity, reusability, and organization. They encapsulate blocks of code responsible for performing specific tasks, promoting cleaner and more maintainable programs.
-   Key characteristics:
    1. Name: Uniquely identifies the function within the program.
    2. Return type: Defines the data type the function returns after execution (void for no return value).
    3. Parameters: Optional arguments passed to the function for processing.
    4. Body: The code block containing the actual logic and instructions to be executed.
    5. Scope: The region of code where the function is accessible.
    6. Modifiers of variables include:
        - static: Creates a class variable, shared by all instances of the class.
        - final: Makes the variable's value constant and cannot be changed after initialization.
        - public: Makes the variable accessible from anywhere in the program.
        - private: Makes the variable accessible only within the class where it's declared.
-   Types of functions:

    1. Instance Methods:
        - Defined within classes and belong to object instances.
        - Accessed through the object reference using the dot operator.
        - Can access and modify object state.
    2. Static Methods:
        - Defined within classes but not associated with any specific object instance.
        - Accessed directly using the class name.
        - Cannot access or modify object state unless provided as a parameter.

-   ```
    <acces modifier> <return type> <identifier> (<argument(s)>) {
        <body>
    }

    public void printHello(void) {
        System.Out.println("Hello")
    }
    ```

-   Benefits of Using Functions
    1. Improved code organization: Functions group related code together, making the program more structured and easier to understand.
    2. Increased code reusability: You can define a function once and call it multiple times from different parts of your program.
    3. Reduced code duplication: Functions eliminate the need to write the same code repeatedly, leading to a cleaner and more concise program.
    4. Enhanced program maintainability: Functions make it easier to modify specific parts of your program without affecting other parts.

## OOPS in JAVA (OopsBasic.java and OopsAdvanced.java)

-   OOP is a programming paradigm that focuses on organizing code around objects representing real-world entities. These objects encapsulate data (attributes) and behavior (methods) to create reusable and maintainable code.
-   Key concepts:

    1. Objects and classes
        - Object: An instance of a class that represents a real-world entity with its specific state and behavior.
        - Class: A blueprint for creating objects with defined attributes (variables) and methods (functions).
    2. Encapsulation:
        - Bundles data and methods within a class, hiding internal implementation details and restricting direct access to data.
        - Promotes data integrity and protection by controlling access through defined methods.
    3. Inheritance:
        - Allows new classes to inherit properties and behavior from existing classes (superclasses).
        - Enables code reuse and promotes specialization by extending existing functionality.
    4. Polymorphism:
        - Allows objects to exhibit different behavior in response to the same message or method call.
        - Achieved through method overriding and overloading, enabling flexibility and dynamic behavior.
    5. Abstraction:
        - Focuses on the essential characteristics and behavior of an object, hiding unnecessary details.
        - Achieved through interfaces, abstract classes, and data hiding to simplify complex functionalities.
    6. Association:
        - Represents relationships between different classes.
        - Can be implemented through references (object pointers), aggregation (has-a relationship), and composition (part-of relationship).
    7. Aggregation:
        - An object (aggregate) has another object (component) as part of its state.
        - The aggregate object has control over the life cycle of the component object.
    8. Composition:
        - A strong aggregation where the component object cannot exist independently of the aggregate object.
        - The aggregate object is responsible for creating and destroying the component object.

-   Benefits of using OOP in Java:
    1. Modular and reusable code: Enables breaking down problems into smaller, manageable units.
    2. Improved maintainability: Encapsulation and data hiding make code easier to understand and modify.
    3. Flexibility and extensibility: Inheritance and polymorphism enable flexible code structures and dynamic behavior.
    4. Real-world representation: Objects map directly to real-world entities, making the code more intuitive and understandable.

```

```

```

```

```

```
