## **Day 6 — Loops & Iteration (Part 1)**
**Today's Topics**
1. Why loops exist
2. What iteration means
3. while loop
4. for loop
5. Anatomy of a loop
6. Loop variables (counter variables)
7. Common beginner mistakes
8. Execution tracing

### **1. Why loops?**

Imagine Life Without Loops

Suppose you want:

```java
Hello
Hello
Hello
Hello
Hello
```

Without loops:

```java
System.out.println("Hello");
System.out.println("Hello");
System.out.println("Hello");
System.out.println("Hello");
System.out.println("Hello");
```

Works.

But what if you need:

```
10 times?
100 times?
10,000 times?
```

Impossible to write manually.

The Real Purpose of Loops

A loop tells the computer:

Repeat this block of code until a condition changes.

This is called: `Iteration`

### **2. What is Iteration?**

Iteration simply means:

Repeating a process multiple times.

Example:

- Counting 1 to 10
- Processing 100 employees
- Reading 1000 rows from database
- Checking every file in a folder

All are iterations.

### **3. First Loop: while**

Syntax:

```java
// counter initialization
while(condition) {
    //while block
    //statements
    
    // counter update
}
```

while the condition is true, keep executing the block.

Example:

```java
count = 1;
while(count <= 5) {
    System.out.println("count:" + count);
    count++;
}
```

Output:

```java
count: 1
count: 2
count: 3
count: 4
count: 5
```

### **4. For loops:**

Syntax:

```java
for(initialization; condition; update) {
    // code
}
```

Example:

```java
for(i = 1; i<=5; i++) {
    System.out.println(i);
}
```

Output:

```
1
2
3
4
5
```

### **5. Anatomy of a loop**

Every loop must have these 3 things:

1. Counter initial value
   ```java
   int count = 0;
   ```

2. Condition check on the counter
   ```java
   count <= 5;
   ```

3. Update the counter
   ```java
   count++;
   ```
**Note:** we need to update the counter so that the condition changes. If counter never changes then we will not progress towards termination and end up with infinite loop.

Without one of these in loops will create a problem.

### **6. When To Use While vs For?**

Use **`for`**

When iterations are known.

Example:

```
Print 1 to 100
Process 50 records
Run 10 times
```

Use **`while`**

When iterations are unknown.

Example:

```
Keep asking user until valid input
Keep reading file until EOF
Keep retrying until success
```

Example:

```java
while(!loggedIn) {
    // ask credentials
}
```

We don't know how many attempts user needs.

So while makes more sense.

### **7. do-while loop**

do while loop is used where we require to execute a block of code atleast once before checking the condition. It is called Post-execution loop.

while loop is called Pre-execution loop. because it first checks the condition and then executes the code block if condition is matched.

Syntax:

```java
do {
    // code
}
while(condition) {
    //code
}
```

Example: In ATM we want to show the user the menu first and then after completing any transaction if user wants more transactions then we show the menu again.

'''java
do {
    // ATM menu
    // do transaction
}
while(userWantsMore) {
    ATM menu
    // do transaction
}
'''

### **8. break and continue**

**`break`** just terminates the loop.

**`continue`** skips the current iteration.