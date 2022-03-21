# Rini-Tri-3-Individual

Tri 3 Team Repository: [RedTailedHawks](https://github.com/mistylavender/RedTailedHawks)
Link to Repl.It code: [Link](https://replit.com/@Rini/tri3code#Main.java)

--------------------------------------------------------------------------------------------------------------------------------------------------------------

This GitHub.io Page contains my Tech Talk notes, code for challenges, and my preparation plans for the AP Exam.

Notes can be found by clicking on "Tech Talk Notes." They can also be viewed on these wiki pages: 

AP Test Prep plans can be found by clicking on "AP Test Prep." 

# TT0 Data Structures Key Learnings
Review Ticket: [Link](https://github.com/rkwreck/rinik/issues/1)
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


# TT1 Linked Lists Key Learnings
Generic T: is iterable

Example from Challenge 3:

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


nil = null (means the same thing, have reached endpoint, both mean 'nothing')

Stack: last in, first out Queue: first in, last out

remove packages & related use of packages from main (in #3) to get it to run

implements, similar to extend, but you just get the elements of the other class, gives you methods that you need to define (similar to abstract)

elements between head & tail are connected thru the linked list

Previous node: connecting to the node behind you Next node: connecting to the node in front of you If there is no node in front/behind you, then the previous/next value is "null"
