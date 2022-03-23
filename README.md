# Rini-Tri-3-Individual

Tri 3 Team Repository: [RedTailedHawks](https://github.com/mistylavender/RedTailedHawks)

Link to Repl.It code: [Link](https://replit.com/@Rini/tri3code#Main.java)

--------------------------------------------------------------------------------------------------------------------------------------------------------------

This GitHub.io Page contains my Tech Talk notes, code for challenges, and my preparation plans for the AP Exam.

Notes can be found by clicking on "Tech Talk Notes." They can also be viewed on these wiki pages: 

AP Test Prep plans can be found by clicking on "AP Test Prep."

-----------------------------------------------------------------------------------------------------------------------------------------------------
# TT2 Calculator Theory (Stacks/Arrays) 
- Reverse Polish Notation (RPN), format where operand follows operator, ex (3 + 4) becaomes (3 4 +) --> useful since it pushes the calculations into a stack and then pops out the expression 
- require the different mathemtical operators (ex use HashMap)
- multiplication and division are of higher orders than + and - 
- tokens: numbers, asterisk (multiplication symbol), paranthesis, (ignore spaces)
- use operations to figure out if char is operator or seporator 
- steps: tokenize, RPN using Shunting-Yard algo (operands in stack by precedence, operators in ArrayList), then operators go in stack, operands push two operators out a time, then the operand becomes a number (operator), gets used by next operand, etc, untill calculation is finished)
- 

-----------------------------------------------------------------------------------------------------------------------------------------------------
# TT1 Linked Lists Key Learnings

**Review Ticket:** [Link](https://github.com/rkwreck/Rini-Tri-3-Individual/issues/1)

**Code:** [Link](https://github.com/rkwreck/Rini-Tri-3-Individual/wiki/TT1-Linked-Lists-Code-(My-Solutions))

Generic T is iterable. Example from Challenge 3:

```java

/**
     *  Clone an object,
     *
     * @param  node  object to clone
     */
    public LinkedList(LinkedList<T> node)
    {
        this.setData(node.data);
        this.setPrevNode(node.prevNode);
        this.setNextNode(node.nextNode);
    }

    /**
     *  Setter for T data in DoubleLinkedNode object
     *
     * @param  data, update data of object
     */
    public void setData(T data)
    {
        this.data = data;
    }

```

Queue Add: 
```java 

    public void add(T data) {
        // add new object to end of Queue
        LinkedList<T> tail = new LinkedList<>(data, null);

        if (head == null)  // initial condition
            this.head = this.tail = tail;
        else {  // nodes in queue
            this.tail.setNextNode(tail); // current tail points to new tail
            this.tail = tail;  // update tail
        }
        System.out.println("Enqueued Data:" + data );
    }

```

Queue delete:

``` java

    public void dequeue()
    {
        head = head.getNext(); //remove head by setting it to the next head 
    }

```

Merge:
```java 

public void merge (Queue<T> q1, Queue<T> q2)
   {
       QueueIterator<T> itr1 = (QueueIterator<T>)q1.iterator();
       QueueIterator<T> itr2 = (QueueIterator<T>)q2.iterator();
       Integer data1 = (Integer)itr1.getCurrent();
       Integer data2 = (Integer)itr2.getCurrent();
       
       while(itr1.hasNext() && itr2.hasNext())
       {
           if (data1 < data2)
           {
               queue.add((T)data1);
               itr1.next();
               data1 = (Integer)itr1.getCurrent(); 
           }
           else
           {
               queue.add((T)data2);
               itr2.next();
               data2 = (Integer)itr2.getCurrent();
           }
       }
       
       while(itr1.hasNext())  //add the last terms of Queue1
       {
           queue.add(itr1.getCurrent());
           itr1.next();
       }
       while(itr2.hasNext())  //add the last terms of Queue2
       {
           queue.add(itr2.getCurrent());
           itr2.next();
       }
       
       printQueue(); 
   }

```

Stack: last in, first out Queue: first in, last out
``` java

/**
 * Driver Class
 * Tests queue with string, integers, and mixes of Classes and types
 */
public class StackTester {
    public static void main(String[] args)
    {
        // Create iterable Queue of Integers
        Object[] numbers = new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        QueueManager qNums = new QueueManager("Integers", numbers );
        System.out.println("This is Queue");
        qNums.printQueue();
        
        System.out.println("Placing elements from Queue to Stack");
        
        System.out.println("This is Stack");
        Stack s = qNums.convertToStack();
        Integer data;
        while((data = (Integer)s.peek()) != null)
        {
            System.out.print(data + " ");
            s.pop(); 
        }
    }
} 

```

**Key learnings:**

nil = null (means the same thing, have reached endpoint, both mean 'nothing')

remove packages & related use of packages from main (in #3) to get it to run

implements, similar to extend, but you just get the elements of the other class, gives you methods that you need to define (similar to abstract)

elements between head & tail are connected thru the linked list

Previous node: connecting to the node behind you Next node: connecting to the node in front of you If there is no node in front/behind you, then the previous/next value is "null"

-----------------------------------------------------------------------------------------------------------------------------------------------------

# TT0 Data Structures Key Learnings

**Review Ticket:** [Link](https://github.com/rkwreck/rinik/issues/1)

**Code:** [Link](https://github.com/rkwreck/Rini-Tri-3-Individual/wiki/TT0:-Data-Structures-Code-(My-Solutions))

**Key Learnings: **
- Linear list ex: for loops, enhanced for-loops
- Non-linear list accessed by keys
- Procedural is a type of imperative programming. Use flowchart diagrams bc they're more focused on procedure.
- OOP knows some of your key properties and then solves your problem
- Arrays: store primitive types, each index is an element (non-linear Hashmaps) + holds values in key-value pairs (the values of the keys could even be array) (linear, direct access thru key)
- Standardize: means to simplify how things are executed so theres not 1M ways to execute something

IntByReference (from Challenge 2): 

```java

public int getValue() { //value is a private variable, have to use get method 
        return value; 
    }
    
    //b is of type IntByReferece but value is of type int and is a private variable, so we can't directly assign b to value.
    //so...create a setValue method 
    public void setValue(int num) {  
        value = num;
    }
    
    public void swapToLowHighOrder(IntByReference b){
        int preserve = b.getValue(); //save the original value of b 
        if (value > b.getValue()) {  //check for greater value
            b.setValue(value);    
            value = preserve;    //swap values
        }
    }

```



