{% include navigation.html %}

# Tech Talk Notes

----------------------------------------------------------------------------------------------------------------------------------------------------
## TT2: Calculator Theory/RPN/Shunting-Yard Algorithm Notes 

- Reverse Polish Notation (RPN), format where operand follows operator, ex (3 + 4) becaomes (3 4 +) --> useful since it pushes the calculations into a stack and then pops out the expression. RPN uses Shunting-Yard Algorithm. Shunting-Yard Diagram (courtesy to Wikipedia): 

![image](https://user-images.githubusercontent.com/89210546/159739377-99a198cb-c0e7-4007-be01-4d34859e69ea.png)

- require the different mathemtical operators (ex use HashMap)
- multiplication and division are of higher orders than + and - 
- tokens: numbers, asterisk (multiplication symbol), paranthesis, (ignore spaces)
- use operations to figure out if char is operator or seporator 
- steps: tokenize, RPN using Shunting-Yard algo (operands in stack by precedence, operators in ArrayList), then operators go in stack, operands push two operators out a time, then the operand becomes a number (operator), gets used by next operand, etc, untill calculation is finished)





----------------------------------------------------------------------------------------------------------------------------------------------------
## TT1: Linked Lists Notes

linked lists = connections between objects

Generic T:

is iterable
nil = null (means the same thing, have reached endpoint, both mean 'nothing')

Queue: first in, last out (filo)
Stack: last in, first out (lifo) 

remove packages & related use of packages from main (in #3) to get it to run

implements, similar to extend, but you just get the elements of the other class, gives you methods that you need to define (similar to abstract)

elements between head & tail are connected thru the linked list

Previous node: connecting to the node behind you Next node: connecting to the node in front of you If there is no node in front/behind you, then the previous/next value is "null"

----------------------------------------------------------------------------------------------------------------------------------------------------

## TT0: Data Structures Notes 

### Linear vs Non-Linear Lists
* Linear list ex: for loops, enhanced for-loops
* Non-linear list accessed by keys 

### Imperative vs Procedural vs OOP Programming

Note: Procedural is a type of imperative programming. Use flowchart diagrams bc they're more focused on procedure. Example:
![image](https://user-images.githubusercontent.com/89210546/157569808-2d83674a-d189-460e-b6f1-f148319da472.png)

### Procedural:
- removing repetitive blocks from sequence of code; bunch of functions put together
- enhancing imperative paradigm, improving its quality
- ex reusing code (loops, etc) 

### Imperative:
- keeping sequence of steps of the code 
- ex phone tree bc you're going off a sequence based on choice

### OOP:
- OOP knows some of your key properties and then solves your problem 
- Think like this: I have an object, this is how it interacts w/ the world
- use UML diagrams bc its more focused on properties. Example: 

![image](https://user-images.githubusercontent.com/89210546/157569887-8385823a-751b-4c8f-9e01-6b53f5be97d0.png)

### Arrays vs Hashmaps 
Arrays: 
- store primitive types, each index is an element --> non-linear 
Hashmaps:
- holds values in key-value pairs (the values of the keys could even be array) --> linear, direct access thru key

### Standardize
- means to simplify how things are executed so theres not 1M ways to execute something
