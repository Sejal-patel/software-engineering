## **Day 3 — Operators & Expressions**
**Today’s Agenda**
**Topics Covered**
* Arithmetic operators (+ - * / %)
* Unary operators
* Assignment operators
* Relational operators
* Logical operators
* Increment/decrement confusion
* Pre vs Post increment
* Short-circuit evaluation
* Ternary operator
* Operator precedence
* Expression evaluation order
* Common interview traps

### **1. Arithmetic Operators**

|   Operator    | Meaning |
|---|---|
| `+` | Addition |
| `-` | Subtraction |
| `*` | Multiplication |
| `/` | Division |
| `%` | Modulus (Remainder) |

### **2. Unary Operators**
Unary means operator works on single operand.

| Operator | Meaning |
|---|---|
| `+x` | |
| `-x` | |
| `++` | Increament operator |
| `--` | Decrement operator |

**Pre-increment**
* increment first
* use later

```java
int x = 5;

System.out.println(++x);
```
Output:
```java
6
```

**Post-increment**
* use first
* increment later

```java
int x = 5;

System.out.println(x++);
System.out.println(x);
```
Output:
```java
5
6
```

**Golden rule**  
```
x++ -> use then increment  
++x -> increment then use
```

### **4. Assignment Operators**

Basic:
```java
x = 5;
```

Shortcuts:

```java
x += 2;
x -= 2;
x *= 2;
x /= 2;
```

### **5. Relational Operators**

Used for comparisons.

| Operator | 	Meaning |
| --- | --- |
| ==	| Equal |
| !=	| Not equal |
| >	| Greater |
| <	| Less |
| >=	| Greater/equal |
| <=	| Less/equal |


### **6. Logical Operators**
| Operator	| Meaning |
|---|---|
| && | AND |
| 11 | OR |
| ! | NOT |

**AND Operator**  
Example:

```java
int age = 25;
boolean hasID = true;

System.out.println(age >= 18 && hasID);
```

Output:  
`true`

**OR Operator**  
Example:

### **7. Short-Circuit Evaluation (Very Important)**

Java sometimes stops evaluating early.

```java
false && something
```

Result is already false so no need to check `something`

Example:

```java
int x = 5;

System.out.println(x > 10 && ++x > 0);
```

Output:
```java
false
```

JVM checks `x > 10`, it results in `false`, hence JVM doesn't check `++x > 0`. Thus x remains 5 only.

### **8. Ternary Operator**

Short form of if-else.

Syntax:

```java
condition ? value1 : value2
```

```java
int age = 20;

String result = age >= 18 ? "Adult" : "Minor";

System.out.println(result);
```

Output:
```java
Adult
```

### **9. Operator precedence**

Operator precedence uses math BODMAS rule to evaluate an expression.

```java
int x = 5 + 4 * 8;
```

Output:  ```37```  

According to BODMAS rule:  
4 * 8 = 32  
32 + 5 = 37

Without knowledge of BODMAS rule or in general the evaluation of above expression can be confusing.

***Recommended: Use brackets in the expressions***

```java
(5 + 3) * 2
```
 Output:
 `16`

**Logical Operator Precedence**

```
!   highest
&&  middle
||  lowest
```

Just like math: 
- '*' happens before '+'
- similarly, && happens before ||

## **Day 3, Part - 2**
**Topics covered**
- Bitwise operators (important but easier)
- Compound expressions
- Evaluation order traps
- == with primitives vs objects
- Common interview puzzles
- Expression tracing practice


**Golden Rule:**

```
== for primitive values
.equals() for object content comparison
```

