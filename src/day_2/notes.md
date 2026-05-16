# Day 2: Java Variables & Data Types

## Agenda
* What is a variable?
* Why variables are needed
* Declaring variables in Java
* Primitive data types overview
* Memory concept (basic)
* Naming rules
* Code examples
* Practice + GitHub notes

---

## 1. What is a Variable?
A variable is a **named container** that stores data in a program's memory.

### Example:
```java
int age = 25;
```

**Breakdown:**
* `int`: Type of data (Integer)
* `age`: Variable name (Identifier)
* `25`: Stored value

> **Analogy:** Think of a variable as a **labeled box**. The label tells you what's inside, and the box holds the actual content.


## 2. Why Variables Are Needed?
Variables make code **maintainable** and **readable**.

### ❌ Without Variables (Hard to update)
If the age changes, you have to find and replace every single number.
```java
System.out.println(25);
System.out.println(25 + 5);
System.out.println(25 * 2);
```

### ✅ With Variables (Easy to update)
You only change the value in **one place**.
```java
int age = 25;

System.out.println(age);
System.out.println(age + 5);
System.out.println(age * 2);
```

---

## 3. Naming Rules (Best Practices)
* **Camel Case:** ex.: `myAge`, `maxSpeed`.
* **No Reserved Words:** You cannot name a variable `int` or `class`.
* **Descriptive:** Use `price` instead of `p`.

## 4. Declaring variables in Java
* datatype variableName = value

Examples:

```java
int a = 30;
char c = 'A';
long l = 30L;
float f = 3.4f;
double d = 45.6785;
```

## 5. Primitive DataTypes

Java has built-in basic types.

**Whole numbers**
```java
byte
short
int
long
```
we usually use ```int```

**Decimal Numbers**
```
float
double
```

**Single Character**
```
char
```
use single qoutes for char type value

**True/False**
```
boolean b = true;
```



# **Day 2 — Part 2: Primitive Types Deep Dive**
**Today’s Agenda**
1. Exact sizes of primitive types
2. Why sizes matter
3. Range and overflow
4. Type casting
5. Automatic conversion
6. Common interview traps
7. GitHub notes + practice  



**1. Primitive DataTypes Sizes**


| Category | Type | Size | Range Capacity | Example |
| :--- | :--- | :--- | :--- | :--- |
| **Integers** | `byte` | 1B | 🟢 Small (up to 127) | `100` |
| | `short` | 2B | 🟡 Medium (up to 32k) | `20000` |
| | `int` | 4B | 🟠 Large (up to 2.1B) | `500000` |
| | `long` | 8B | 🔴 Massive (Quintillions) | `999...L` |
| **Decimals** | `float` | 4B | 💧 6-7 decimal digits | `12.5f` |
| | `double` | 8B | 🌊 15-16 decimal digits | `12.5` |
| **Others** | `char` | 2B | 🔠 Single character/Unicode | `'A'` |
| | `boolean` | — | ⚖️ Logical (True/False) | `true` |


**Most Commonly Used Types in Industry**

```java
int
long
double
boolean
String
```

**2. Why Does long Need L and float need f?**

Valid:

```java
long population = 9000000000L;
```

Invalid:  
Without L, ***CTE***

```java
long population = 9000000000;
```

Valid:

```java
float price = 10.5f;
```

Invalid:  
Without ```f``` ***CTE***

```java
float price = 10.5;
```

* Because Java treats large whole numbers as int by default first when looking from right to left and since int cannot store large numbers compiler throws CTE.
* Similarly, by default the java treats the decimal numbers as double first and since it does not allow casting double to float, it throws CTE.
* So ```L``` tells the compiler to treat it as ***long*** and ```f``` tells the compiler to treat it as ***double***

**3. Overflow**

**4. Type Casting:** Converting one type to another.

**A. Automatic Conversion (Widening)**

Small -> Bigger
* Automatic Widening is allowed by Compiler.
```java
byte -> short -> int -> long -> float -> double
```

Example:

```java
int a = 10;
double d = a;
```
Output:

```java
10.0
```

**B. Manual Conversion (Narrowing)**

Bigger -> Small
* Automatic Narrowing is not allowed by compiler.
* Compiler forces you to do manual conversion as it wants you to acknowledge the precision loss.

```java
double price = 99.99;
int x = (int) price;
```
Output:

```java
99
```
Decimal places will be dropped or chopped off. It won't even get rounded.

Interview Examples:

Example 1:

```java
int x = 10;
int y = 3;

System.out.println(x / y);
System.out.println((double)x / y);
```
Output:

```java
3
3.333333333
```

Example 2:

```java
char ch = 'A';
System.out.println(ch + 1);
```
Output:
```java
66
```
Java promotes char to int during arithematic operations.


**Day 2 — Part 3 (Final): Scope, Constants & Primitive vs Object Thinking**  
**Today’s Agenda**
1. Variable scope
2. Local variables
3. Instance variables (preview)
4. ```final``` keyword
5. Constants in Java
6. Primitive vs Object thinking
7. Wrapper classes intro
8. GitHub notes + practice

 