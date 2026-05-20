## **Day 4 — Input & User Interaction (Part 1)**

**Today’s Agenda**

1. Why input handling matters
2. Scanner class
3. Reading integers, doubles, strings
4. next() vs nextLine()
5. Import statements
6. Input flow inside JVM
7. First interactive program

## 1. why input handling matters

Until now value was hardcoded. ex: `int age = 25;
`

But real applications take input from:

- users
- APIs
- databases
- files
- sensors

So programs must read external data.

**Examples:** ATM machines ask to enter PIN, Food delivery app asks to enter delivery address, etc

This is user input handling.

## 2. Scanner Class

Scanner class is used to take keyboard input.

**Common BEGGINER BUG:**

```java
System.out.print("Enter your age: ");
int age = scanner.nextInt(); 
System.out.println("You entered: " + age);

System.out.print("Enter your name: ");
String name = scanner.nextLine();
System.out.println("Hello, " + name + "!");
```

**When you press Enter after typing 25:
nextInt() reads the number 25 and the ENTER/newline will be present in the input Buffer. So when you have nextLine() after nextInt()/next()/nextDouble() the ENTER/newline will be read by nextLine() so the string name becomes empty.**

## **Day 4 — Part 2: Formatting, Parsing & Real Input Handling**
**Today’s Agenda**
1. Escape sequences
2. Formatted printing (printf)
3. Parsing strings into numbers
4. Runtime input mismatch errors
5. Input validation mindset
6. Mini calculator program
7. Debugging input problems
   
### 1. Escape sequences
Escape characters are called escape character because they escape their literal meaning after applying \ before them and shows a special meaning it.

\ is indicates the compiler that upcoming character will be an escape character. If we have any characters other than escape characters after \ then we will get CTE.


| Character | Literal meaning | Escape character | Special meaning |
| --- | --- | --- | --- |
| n | character n | \n | new line |  
| t | character t | \t | tab space |  
| " | string boundary | \" | double quotes(prints quotes) |  
| \ | start of escape character | \\ | backslash(prints \) |  

Example — New Line
```java
System.out.println("Hello\nJava");
```

Output:

```java
Hello
Java
```

Example — Tab
```java
System.out.println("Name\tAge");
```

Output:

```java
Name    Age
```

Example — Quotes
```java
System.out.println("I love \"Java\"");
```

Output:

```java
I love "Java"
```

### **2. Formatted Printing — printf()**

Until now:

```System.out.println()```

prints normally.

But professional applications often need formatted output.

Example
```java
double price = 99.45678;

System.out.printf("Price = %.2f", price);
```

Output:

```java
Price = 99.46
What is %.2f?
```

Breakdown:

|Part|	Meaning|
|---|---|
|%	|format specifier starts|
|.2	|2 decimal places|
|f	|floating-point value|

**Common Format Specifiers**

|Specifier	|Meaning|
|--- | --- |
|%d	| integer |
|%f	| floating-point |
|%s	| string |
|%c	| char |
|%b	| boolean |

Example
```java
String name = "Sejal";
int age = 25;

System.out.printf("Name: %s Age: %d", name, age);
```

Output:

```java
Name: Sejal Age: 25
```

**Very Important**

printf() does NOT automatically move to next line.

Use: `%n` or: `\n`

Example
```java
System.out.printf("Hello%nJava");
```

### **3. Parsing Strings into Numbers**

Sometimes numbers come as strings.

Example:

`"25"`

This is string, NOT integer.

**Why Parsing Needed?**

Suppose:

- API returns text
- User input comes as string
- File data is textual

Need conversion into actual numeric type.

**Convert String → int**

```java
String num = "25";

int x = Integer.parseInt(num);

System.out.println(x + 5);
```

Output:

```java
30
```

Without Parsing

```java
System.out.println("25" + 5);
```

Output:

```java
255
```

Because string concatenation happens.

**Convert String → double**

```java
String value = "99.5";

double d = Double.parseDouble(value);
```

**Important Wrapper Class Connection**

You learned earlier:

```
Integer
Double
```

These wrapper classes provide utility methods like:

```
parseInt()
parseDouble()
```

Now you’re seeing real usage.

