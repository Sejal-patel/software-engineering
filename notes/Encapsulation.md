OOP pillar - Encapsulation
----------------------------------------
Part 1 — Why Encapsulation Exists
What is Encapsulation?
Why public fields are dangerous
Data Hiding
Class Invariants
Real-world intuition
Bank Account example

Part 2 — Access Control
Access Modifiers (private, public, protected, package-private)
Getters
Setters
Validation inside setters
Read-only objects
Immutable fields (final intro)

Part 3 — Designing Good Classes
Tell, Don't Ask (intro)
Encapsulation vs Information Hiding
Good vs Bad encapsulation
Real-world class design
Common interview questions
Mini project

Why Encpasulation?
1. if every feild is public then anyone can break your object. 
any body can write this code anywhere. Ex: acc.balance = -5000, acc.accountNumber = null, acc.holderName = "". The bank account object becomes invalid as 
2. class will have no control on the state of the object.
 any user can just set Ex: acc.balance = 100, even if the balance of the account is actually 0.
3. A class cannot enforce any business rules. 
Any user setting acc.balance -=1000 after withdrawing 1000 is not correct design because there a sequence of business rules that needs to applied before withdrawal. Such as checking for valid balance, checking accountNumber validity, checking for enough balance, log transaction if completed, etc. all this cannot or should not be done from anywhere.

The Wrong Design:
---------------------------
class BankAccount {

    public double balance;

}

Every other class becomes responsible for maintaining correctness.

That's impossible in large systems.

The Better Design:
------------------------
class BankAccount {

    private double balance;

    void deposit(double amount) {

    }

    void withdraw(double amount) {

    }

}

Notice something.

We are not saying:

"Nobody can change balance."

We are saying:

Nobody can change balance directly.

There is a huge difference.


Day 10 — Part 1 Summary Notes
-----------------------------------

What is Encapsulation?
-----------------------------

Encapsulation is the practice of keeping an object's state under the it's own control by exposing behavior instead of allowing direct state modification so that the business rules remians true always.

Why Encapsulation Exists?
--------------------------------

Without encapsulation:

Any code can modify object state.
Business rules cannot be enforced.
Objects can become invalid.
The object cannot protect itself.

First Principle of Encapsulation:
------------------------------------

The object itself should protect its own state by enforcing business rules and class invariants.
Not the programmer.
Not the UI.
Not another class.

The object.

The object decides:

Is the amount valid?
Is there enough balance?
Should a fee be charged?
Should the transaction be logged?

The caller doesn't know. The caller shouldn't care.

Encapsulation is a broader design principle:
	Protect the object's validity by controlling how its state changes.

State vs Behavior
------------------------

❌ Expose state

account.balance -= 1000;

✅ Expose behavior

account.withdraw(1000);

Misconception: Data Hiding
-------------------

private fields prevent direct modification.

But Encapsulation is not just Data hiding because making feilds private and letting the public method to modify it without any checking for valid states is same as making feilds public and modifying the variables directly.

This is a tool used to achieve encapsulation, not the definition of encapsulation itself.

Other tools include:

Access modifiers
data validation(class invariants)
Methods(business rules)
Immutable objects
Read only objects
carefully designed APIs.

Class Invariant
-------------------------

A class invariant is a condition that must always remain true for every valid object.

Encapsulation exists to preserve these invariants.

Relationship
Business Rules
        │
        ├── Class Invariants (object validity)
        └── Operational Business Rules (workflow/policies)
		
a business rule that is class invariant:
 0 <= marks <= 100
 accBalance >= 0
 availableSeats > 0
 accountNumber != null
 
a business rule that is not class invariant:
 a user can book only 5 seats in one transaction. Voilating this rule will not make availableSeats < 0, so its not class invariant.

Rule of thumb:

If violating the rule makes the object invalid → it's a class invariant.

Good Object Design

Instead of exposing data:

flight.availableSeats--;

Expose meaningful behavior:
------------------------------

flight.bookSeat();

flight.cancelBooking();

flight.hasAvailableSeats();

Part 1 - Key Takeaways:
--------------------
Encapsulation protects object validity.
Expose behavior, not state.
Business rules belong inside the object.
private supports encapsulation but is not its definition.
Think in terms of operations the object performs, not fields other classes modify.

------------------------------------------------------------------------------------------------------------------------------------

Day 10 – Part 2 Summary Notes 
----------------------------------
Tools to achieve Encapsulation:
--------------------------------------

1. Access Modifiers

Purpose: Control who can access an object's members.

For Encapsulation, the most important modifier is:

private

It prevents external code from directly modifying the object's state.
private protects object's control, not data. Its real purpose is to allow the object to decide how its state changes.

2. Getters & Setters

Getters

Use getters when other objects need to read information.

Example:

double getBalance()

A getter does not weaken encapsulation if exposing the value is appropriate.

Setters

Don't automatically create setters for every field.

Ask:

Does it make sense for someone to directly set this value?

If the answer is No, don't write a setter.

Replacing:

student.marks = 150;

with

student.setMarks(150);

adds little value unless the setter enforces business rules & class invariants.


3. Data Validation

Whenever state changes, validate before updating.

Request
   ↓
Validation
   ↓
State Change

Never do:

Request
   ↓
Direct State Change

4. Design APIs Around Business Behavior, i.e add business actions

❌ Poor API

setBalance()

setAvailableSeats()

setSalary()

✅ Better API

deposit()

withdraw()

bookSeat()

cancelBooking()

applyAnnualIncrement()

Design methods around what the business does, not around what fields exist.
Expose behavior, not implementation details.
The object's public API should describe business actions, not internal data manipulation.

Responsibilities:
-------------------

Keep responsibilities separate.

Object's Responsibility:

Protect its own state
Maintain class invariants
Validate state changes
Perform domain behavior or business actions

Service/Application Responsibility:

Authorization (e.g., "Is user HR?")
business Workflow
Coordination between multiple objects
External policies
Example:

"Only HR can revise salary."

This is usually not the Employee object's responsibility.

It belongs to a higher-level service.

The Employee object should focus on maintaining its own valid state.

Part 2 - Key Takeaways:
---------------------
private protects controlled access.
Getters are fine when reading is required.
Setters should exist only when they make sense in the business domain.
Design APIs using business language.
Separate object responsibilities from application responsibilities.

------------------------------------------------------------------------------------------------------------------------------------

Day 10 – Part 3: Designing Good Classes
-----------------------------------------
Topics
Tell, Don't Ask (Introduction)
Rich vs Anemic Objects
Good vs Bad Encapsulation
Identifying Behavior from Requirements
Designing Object APIs

Instead of "Should I generate getters and setters?"

and start thinking:

"What responsibilities should this object own?"

1. Tell, Don't Ask
---------------------
Instead of asking an object for its data and making decisions outside it:

❌

if(account.getBalance() > 1000)

Tell the object what you want:

✅

account.withdraw(1000);

Hence the name:

Tell, Don't Ask

Example

Bad:

if(employee.getYearsOfService() > 5) {
    employee.setBonus(...);
}

Better:

employee.applyAnnualBonus();

Now the Employee object decides:

Is the employee eligible?
How much bonus?
Update salary.
Maintain invariants.

The caller doesn't need to know the rules.

Why is This Better?

Imagine tomorrow the policy changes.

Old:

5 years

New:

7 years

If 25 different classes are checking:

getYearsOfService()

you must update 25 places.

If only the Employee object knows the rule:

You update one method.

2. Rich vs Anemic Objects:
----------------------------

Anemic Object Contains mostly:

fields
getters
setters

Business logic lives somewhere else.

Rich Object Contains:

state
behavior
validation
business rules

3. Designing from Requirements:
-----------------------------
Nouns → Classes
Properties → Fields
Verbs → Methods

When reading a Requirements Document:

Look for verbs.
-------------------

Example:

Customer places order.

Customer cancels order.

Bank transfers money.

Flight books seat.

These verbs usually become methods.

Look for nouns.
--------------------

Customer

Order

Account

Flight

These often become classes.

Look for properties.
--------------------

Balance

Order Status

Seat Number

Customer Name

These become fields.

4. Mini Design Exercise:
----------------------

Imagine you're given this requirement:

"A library allows members to borrow books. A member cannot borrow more than 5 books at a time. A borrowed book can be returned."

Without writing code, answer these questions.

Q1. What are the main classes?
A1. main classes

Library
Book
Member
Loan/BorrowRecord
Librarian

Q2. What are the important fields for the Member class?
A2. Member Fields

memberId
memberName
numberOfBooks
listOfBooks

Instead of:

numberOfBooks

I'd derive it from:

borrowedBooks

because

borrowedBooks.size()

already tells us the count.

This avoids storing duplicate information that can become inconsistent.

This introduces an important design principle:

Don't store data that can be derived from other data unless there's a compelling reason (such as performance).


Q3. What methods should the Member class expose?
A3. Methods

Your answer:

validateMember()
borrow()
return()
listOfBooksBorrowed()
listOfBooksReturned()
booksAvailable()


The important thing is that almost all of them are business verbs.

I'd make two observations.

Observation 1:

Should booksAvailable() belong to Member?

Probably not.

Who knows how many books are available?

The Library.

So:

Library
    booksAvailable()

Member
    borrowBook()
    returnBook()

This is another important OO principle:

A method belongs to the object that has the necessary information to perform it.

Observation 2:

Should validateMember() be public?

Usually no.

Validation is often part of another operation.

Example:

borrowBook()

↓

check membership

↓

check limit

↓

borrow

The caller shouldn't need to remember to call validateMember() first. 

Q4. Should the class expose:

setBorrowedBooksCount(int count)

Why or why not?

A4.

Your answer:

No, borrow and return will update the number of books.

⭐⭐⭐⭐⭐ Perfect.

You answered exactly what I wanted.

The count should be a consequence of the behavior.

Not something callers modify.

This is exactly the same reasoning as:

Don't setBalance()
Don't setAvailableSeats()
Don't setBorrowedBooksCount()

Instead expose meaningful operations.
--------------------------------------------------------------------------------------------------------------------------------------------------
One Last Design Insight (Very Important)

I want to introduce one principle that ties together everything you've learned in OOP so far.

Who should own a method?

Ask this question:

"Which object has enough information to do this correctly?"

For example:

withdraw()

Who owns it?

↓

BankAccount

because it knows:

balance
minimum balance
account type

borrowBook()

Who owns it?

↓

Member

because it knows:

how many books are already borrowed
borrowing limit
borrowed books

booksAvailable()

Who owns it?

↓

Library

because it knows:

all books
borrowed books
inventory

This simple question—

Who has the information?

—is one of the best heuristics for deciding where a method belongs. You'll find it useful throughout OOP, SOLID, and Low-Level Design.

Part 3 - Key Takeaways:
-------------------------------
Design APIs around business behavior, not fields.
Avoid exposing setters just because a field exists.
Keep responsibilities with the object that owns the relevant data.
Good class models the business domain, not just the database.

🎉 Day 10 Complete

You've now completed the first OOP pillar: Encapsulation.

The biggest shift I'd like you to remember is this:

A class is not a container of data. It is a model of a real-world entity with both state and responsibilities.

That mindset will make the next pillar—Inheritance—much more intuitive, because you'll start thinking in terms of shared responsibilities and behavior, not just code reuse.


Kunal Jindal - 9518207293