{% include navigation.html %}

# My TT Code Solutions

## TT3: Sorts
```java



import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;

public class Sorts { 
    private final ArrayList<Integer> data = new ArrayList<>();
    private final Duration timeElapsed;
    
    static int[] convertIntegers(ArrayList<Integer> integers)
    {
     int[] ret = new int[integers.size()];
     for (int i=0; i < ret.length; i++)
     {
        ret[i] = integers.get(i).intValue();
     }
     return ret;
    }
   
   
     public Sorts(int size,sorter sort) {
        
        // build an array
        for (int i = 0; i < size; i++) {
            data.add((int)(Math.random() * (size+1)));
        }
        
        int[] arr = convertIntegers(data);
        Instant start = Instant.now(); //time capture -- start 
        sort.sort(arr);
        Instant end = Instant.now();    // time capture -- end
        this.timeElapsed = Duration.between(start, end);
    }
    
    ArrayList<Integer> getData() {
        return data;
    }

    int getTimeElapsed() {
        return timeElapsed.getNano();
    }


    static void selectionSortTest() {
        int sum=0, time=0, TIMES=12, SIZE=5000;
        int sumComparisons = 0;
        int sumSwaps = 0;
        for(int i=0; i< TIMES; i++) {
            
            sorter sortObject = new selectionSort();
            Sorts s = new Sorts(SIZE,sortObject);
            for(int j = 0; j<s.getData().size(); j++) {
                // To see data, uncomment next line
                // System.out.println(s.getData());
                sum += s.getData().get(j);
            }
            //System.out.println("Average random: " + sum / ((i+1)*SIZE));
            //System.out.println("Nanoseconds: " + s.getTimeElapsed());
            time += s.getTimeElapsed();
            sumComparisons += sortObject.getComparisons();
            sumSwaps += sortObject.getSwaps();
            //resetCounters();
        }
        //System.out.println("Average random: " + sum / (TIMES*SIZE));
        System.out.println("Average Comparisons: " + sumComparisons/TIMES);
        System.out.println("Average Swaps: " + sumSwaps/TIMES);
        System.out.println("Total Nanoseconds: " + time );
        System.out.println("Total Seconds: " + time /1000000000.0);
    }

    static void insertionSortTest() {
        int sum=0, time=0, TIMES=12, SIZE=5000;
        int sumComparisons = 0;
        int sumSwaps = 0;
        for(int i=0; i< TIMES; i++) {
            
            sorter sortObject = new insertionSort();
            Sorts s = new Sorts(SIZE,sortObject);
            for(int j = 0; j<s.getData().size(); j++) {
                // To see data, uncomment next line
                // System.out.println(s.getData());
                sum += s.getData().get(j);
            }
            //System.out.println("Average random: " + sum / ((i+1)*SIZE));
            //System.out.println("Nanoseconds: " + s.getTimeElapsed());
            time += s.getTimeElapsed();
            
            sumComparisons += sortObject.getComparisons();
            sumSwaps += sortObject.getSwaps();
            //resetCounters();
        }
        //System.out.println("Average random: " + sum / (TIMES*SIZE));
        System.out.println("Average Comparisons: " + sumComparisons/TIMES);
        System.out.println("Average Swaps: " + sumSwaps/TIMES);
        System.out.println("Total Nanoseconds: " + time );
        System.out.println("Total Seconds: " + time /1000000000.0);
    }
    
    static void bubbleSortTest() {
        int sum=0, time=0, TIMES=12, SIZE=5000;
        int sumComparisons = 0;
        int sumSwaps = 0;
        for(int i=0; i< TIMES; i++) {
            
            sorter sortObject = new bubbleSort();
            Sorts s = new Sorts(SIZE,sortObject);
            
            for(int j = 0; j<s.getData().size(); j++) {
                // To see data, uncomment next line
                // System.out.println(s.getData());
                sum += s.getData().get(j);
            }
            //System.out.println("Average random: " + sum / ((i+1)*SIZE));
            //System.out.println("Nanoseconds: " + s.getTimeElapsed());
            time += s.getTimeElapsed();
            
            sumComparisons += sortObject.getComparisons();
            sumSwaps += sortObject.getSwaps();
            //resetCounters();
        }
        //System.out.println("Average random: " + sum / (TIMES*SIZE));
        System.out.println("Average Comparisons: " + sumComparisons/TIMES);
        System.out.println("Average Swaps: " + sumSwaps/TIMES);
        System.out.println("Total Nanoseconds: " + time );
        System.out.println("Total Seconds: " + time /1000000000.0);
    }
    
    static void mergeSortTest() {
        int sum=0, time=0, TIMES=12, SIZE=5000;
         int sumComparisons = 0;
        int sumSwaps = 0;
        for(int i=0; i< TIMES; i++) {
            
            sorter sortObject = new mergeSort();
            Sorts s = new Sorts(SIZE,sortObject);
          
            for(int j = 0; j<s.getData().size(); j++) {
                // To see data, uncomment next line
                // System.out.println(s.getData());
                sum += s.getData().get(j);
            }
            //System.out.println("Average random: " + sum / ((i+1)*SIZE));
            //System.out.println("Nanoseconds: " + s.getTimeElapsed());
            time += s.getTimeElapsed();
            
            sumComparisons += sortObject.getComparisons();
            sumSwaps += sortObject.getSwaps();
            //resetCounters();
        }
        //System.out.println("Average random: " + sum / (TIMES*SIZE));
        System.out.println("Average Comparisons: " + sumComparisons/TIMES);
        System.out.println("Average Swaps: " + sumSwaps/TIMES);
        System.out.println("Total Nanoseconds: " + time );
        System.out.println("Total Seconds: " + time /1000000000.0);
    }
    
    public static void main(String[] args) {
        System.out.println("=======================================================");
        System.out.println("Selection Sort Analysis");
        System.out.println("=======================================================");
        selectionSortTest();
        System.out.println("Selection Sort Analysis Completed");
        System.out.println("=======================================================");
        
        System.out.println("=======================================================");
        System.out.println("Insertion Sort Analysis");
        System.out.println("=======================================================");
        insertionSortTest();
        System.out.println("Insertion Sort Analysis Completed");
        System.out.println("=======================================================");
        
        System.out.println("=======================================================");
        System.out.println("Bubble Sort Analysis");
        System.out.println("=======================================================");
        bubbleSortTest();
        System.out.println("Bubble Sort Analysis Completed");
        System.out.println("=======================================================");
        
        System.out.println("=======================================================");
        System.out.println("Merge Sort Analysis");
        System.out.println("=======================================================");
        mergeSortTest();
        System.out.println("Merge Sort Analysis Completed");
        System.out.println("=======================================================");
    }
   
}

/* basic sort class w/ all methods that each sort will use for analytics */
class sorter{
    public int comparisons;
    public int swaps;
    public sorter()
    {
        comparisons = 0;
        swaps = 0;
    }
    public void sort(int[] arr)
    {
    }
    
    public int getComparisons()
    {
        return comparisons;
    }
    
    public int getSwaps()
    {
        return swaps;
    }
    public void reset()
    {
        comparisons = 0;
        swaps = 0;
    }
}

class selectionSort extends sorter{
    public selectionSort()
    {
        super();
    }
    public void sort(int[] elements)
    {
      comparisons = 0;
      swaps = 0;
      for (int j = 0; j < elements.length - 1; j++)
      {
         int minIndex = j;
         for (int k = j + 1; k < elements.length; k++)
         {
            comparisons++; 
            if (elements[k] < elements[minIndex])
            {
               minIndex = k;
            }
         }
         int temp = elements[j];
         elements[j] = elements[minIndex];
         elements[minIndex] = temp;
         swaps++;
       }
    }
}

class insertionSort extends sorter{
    public insertionSort()
    {
        super();
    }
    
    public void sort(int[] elements)
    {
      comparisons = 0;
      swaps = 0;
      for (int j = 1; j < elements.length; j++)
      {
         int temp = elements[j];
         int possibleIndex = j;
         while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
         {
             comparisons++;
            elements[possibleIndex] = elements[possibleIndex - 1];
            possibleIndex--;
         }
         elements[possibleIndex] = temp;
         swaps++;
      }
   }   
}

class bubbleSort extends sorter{
    public bubbleSort()
    {
        super();
    }
    
    public void sort(int[] arr)
    {
      int n = arr.length;  
      int temp = 0; 
      
      comparisons = 0;
      swaps = 0;
      for(int i=0; i < n; i++){  
        for(int j=1; j < (n-i); j++){  
          comparisons++;
          if(arr[j-1] > arr[j]){  
            //swap elements  
            temp = arr[j-1];  
            arr[j-1] = arr[j];  
            arr[j] = temp;  
            swaps++;
          }               
        }  
      } 
      
    }   
}

class mergeSort extends sorter{
    public mergeSort()
    {
        super();
    }
    
    public void sort(int[] elements)
    {
      int n = elements.length;
      int[] temp = new int[n];
      comparisons = 0;
      swaps = 0;
      mergeSortHelper(elements, 0, n - 1, temp);
    }
    
    private  void mergeSortHelper(int[] elements,
                                       int from, int to, int[] temp)
   {
       if (from < to)
       {
          int middle = (from + to) / 2;
          mergeSortHelper(elements, from, middle, temp);
          mergeSortHelper(elements, middle + 1, to, temp);
          merge(elements, from, middle, to, temp);
       }
   }
   
   private void merge(int[] elements, int from,
                             int mid, int to, int[] temp)
   {
      int i = from;
      int j = mid + 1;
      int k = from;

      while (i <= mid && j <= to)
      {
         comparisons++;
         swaps++;
         if (elements[i] < elements[j])
         {
            temp[k] = elements[i];
            i++;
         }
         else
         {
            temp[k] = elements[j];
            j++;
         }
         k++;
      }

      while (i <= mid)
      {
         temp[k] = elements[i];
         i++;
         k++;
      }

      while (j <= to)
      {
         temp[k] = elements[j];
         j++;
         k++;
      }

      for (k = from; k <= to; k++)
      {
         elements[k] = temp[k];
      }
   }

}

```


## TT2: Calculator Theory

### Runtime Video: [Link](https://youtu.be/K7eIfpWqYLo?t=27)

### Calculator Code (builds off of my queue/stack code from TT1):
```java 

import java.util.*;
import java.util.Iterator; 
import java.lang.*;
/**
 * Queue: custom implementation
 * @author     Rini Khandelwal
 *
 * 1. Uses custom LinkedList of Generic type T
 * 2. Implements Iterable
 * 3. "has a" LinkedList for head and tail
 */
class Queue<T> implements Iterable<T> {
    LinkedList<T> head, tail;
    /**
     *  Add a new object at the end of the Queue,
     *
     * @param  data,  is the data to be inserted in the Queue.
     */
    public void add(T data) {
        // add new object to end of Queue
        LinkedList<T> tail = new LinkedList<>(data, null);

        if (head == null)  // initial condition
            this.head = this.tail = tail;
        else {  // nodes in queue
            this.tail.setNextNode(tail); // current tail points to new tail
            this.tail = tail;  // update tail
        }
    }
    public void dequeue()
    {
        head = head.getNext();
    }
    /**
     *  Returns the head object.
     *
     * @return  this.head, the head object in Queue.
     */
    public LinkedList<T> getHead() {
        return this.head;
    }
    /**
     *  Returns the tail object.
     *
     * @return  this.tail, the last object in Queue
     */
    public LinkedList<T> getTail() {
        return this.tail;
    }
    /**
     *  Returns the iterator object.
     *
     * @return  this, instance of object
     */
    public Iterator<T> iterator() {
        return new QueueIterator<>(this);
    }
}

/**
 * Queue Iterator
 *
 * 1. "has a" current reference in Queue
 * 2. supports iterable required methods for next that returns a data object
 */
class QueueIterator<T> implements Iterator<T> {
    LinkedList<T> current;  // current element in iteration
    // QueueIterator is intended to the head of the list for iteration
    public QueueIterator(Queue<T> q) {
        current = q.getHead();
    }
    // hasNext informs if next element exists
    public boolean hasNext() {
        return current != null;
    }
    // next returns data object and advances to next position in queue
    public T next() {
        T data = current.getData();
        current = current.getNext();
        return data;
    }
}

class Stack<T> {
    LinkedList<T> head,tail;
    /**
     *  Add a new object at the front of the Stack,
     *
     * @param  data,  is the data to be inserted in the Stack.
     */
    public void push(T data) {
        // add new object to front of Stack
        LinkedList<T> head = new LinkedList<>(data, null);

        if (tail == null)  // initial condition
            this.tail = this.head = head;
        else {  // nodes in queue
            head.setNextNode(this.head);
            this.head = head;
        }
    }
    public void pop()
    {
        head = head.getNext();
    }
    /**
     *  Returns the head object.
     *
     * @return  this.head, the head object in Stack.
     */
    public T peek() {
        if (head != null)
        {
            return this.head.getData();
        }
        return null; 
    }
    /**
     *  Returns the tail object.
     *
     * @return  this.tail, the last object in Queue
     */
    public LinkedList<T> getTail() {
        return this.tail;
    }
}

/**
 * Queue Manager
 * 1. "has a" Queue
 * 2. support management of Queue tasks (aka: titling, adding a list, printing)
 */
class QueueManager<T> {
    // queue data
    private final String name; // name of queue
    private int count = 0; // number of objects in queue
    public final Queue<T> queue = new Queue<>(); // queue object
    /**
     *  Queue constructor
     *  Title with empty queue
     */
    public QueueManager(String name) {
        this.name = name;
    }
    /**
     *  Queue constructor
     *  Title with series of Arrays of Objects
     */
    public QueueManager(String name, T[]... seriesOfObjects) {
        this.name = name;
        this.addList(seriesOfObjects);
    }
    /**
     * Add a list of objects to queue
     */
    public void addList(T[]... seriesOfObjects) {
        for (T[] objects: seriesOfObjects)
            for (T data : objects) {
                this.queue.add(data);
                this.count++;
                //printQueue();
            }
    }
    /**
     * Print any array objects from queue
     */
    public void printQueue() {
        System.out.print(this.name + " count: " + count + ", ");
        //System.out.print(this.name + " data: ");
        System.out.print(" data: ");
        for (T data : queue)
            System.out.print(data + " ");
        System.out.println();
    }
    public void remove()
    {
        QueueIterator<T> itr = (QueueIterator<T>)queue.iterator();
        while(itr.hasNext()) {
         T data = itr.next();
         System.out.println("Dequeued Data:" + data );
         queue.dequeue();
         count--;
         printQueue();
      }
    }
    public Stack<T> convertToStack()
    {
      Stack<T> s = new Stack<>();
      QueueIterator<T> itr = (QueueIterator<T>)queue.iterator();
        while(itr.hasNext()) {
         s.push(itr.next());
      }
      return s; 
    }
}

class LinkedList<T>
{
    private T data;
    private LinkedList<T> prevNode, nextNode;
    /**
     *  Constructs a new element
     *
     * @param  data, data of object
     * @param  node, previous node
     */
    public LinkedList(T data, LinkedList<T> node)
    {
        this.setData(data);
        this.setPrevNode(node);
        this.setNextNode(null);
    }
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
    /**
     *  Returns T data for this element
     *
     * @return  data associated with object
     */
    public T getData()
    {
        return this.data;
    }
    /**
     *  Setter for prevNode in DoubleLinkedNode object
     *
     * @param node, prevNode to current Object
     */
    public void setPrevNode(LinkedList<T> node)
    {
        this.prevNode = node;
    }
    /**
     *  Setter for nextNode in DoubleLinkedNode object
     *
     * @param node, nextNode to current Object
     */
    public void setNextNode(LinkedList<T> node)
    {
        this.nextNode = node;
    }
    /**
     *  Returns reference to previous object in list
     *
     * @return  the previous object in the list
     */
    public LinkedList<T> getPrevious()
    {
        return this.prevNode;
    }
    /**
     *  Returns reference to next object in list
     *
     * @return  the next object in the list
     */
    public LinkedList<T> getNext()
    {
        return this.nextNode;
    }
}


/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculator
{
    // instance variables - replace the example below with your own
    private final String expression;
    private ArrayList<String> tokens;
    private ArrayList<String> reverse_polish;
    private Double result;
    
    // Helper definition for supported operators
    private final Map<String, Integer> OPERATORS = new HashMap<>();
    {
        // Map<"token", precedence>
        OPERATORS.put("^", 2);
        OPERATORS.put("*", 3);
        OPERATORS.put("/", 3);
        OPERATORS.put("%", 3);
        OPERATORS.put("+", 4);
        OPERATORS.put("-", 4);
    }
    
    // Helper definition for supported operators
    private final Map<String, Integer> SEPARATORS = new HashMap<>();
    {
        // Map<"separator", not_used>
        SEPARATORS.put(" ", 0);
        SEPARATORS.put("(", 0);
        SEPARATORS.put(")", 0);
    }

    /**
     * Constructor for objects of class Calculator
     */
    public Calculator(String expression) {
        // original input
        this.expression = expression;

        // parse expression into terms
        this.termTokenizer();

        // place terms into reverse polish notation
        this.tokensToReversePolishNotation();

        // calculate reverse polish notation
        this.rpnToResult();
    }
    
    // Test if token is an operator
    private boolean isOperator(String token) {
        // find the token in the hash map
        return OPERATORS.containsKey(token);
    }

    // Test if token is an separator
    private boolean isSeperator(String token) {
        // find the token in the hash map
        return SEPARATORS.containsKey(token);
    }

    // Compare precedence of operators.
    private Boolean isPrecedent(String token1, String token2) {
        // token 1 is precedent if it is greater than token 2
        return (OPERATORS.get(token1) - OPERATORS.get(token2) >= 0) ;
    }
    
        // Term Tokenizer takes original expression and converts it to ArrayList of tokens
    private void termTokenizer() {
        // contains final list of tokens
        this.tokens = new ArrayList<>();

        int start = 0;  // term split starting index
        StringBuilder multiCharTerm = new StringBuilder();    // term holder
        for (int i = 0; i < this.expression.length(); i++) {
            Character c = this.expression.charAt(i);
            if ( isOperator(c.toString() ) || isSeperator(c.toString())  ) {
                // 1st check for working term and add if it exists
                if (multiCharTerm.length() > 0) {
                    tokens.add(this.expression.substring(start, i));
                }
                // Add operator or parenthesis term to list
                if (c != ' ') {
                    tokens.add(c.toString());
                }
                // Get ready for next term
                start = i + 1;
                multiCharTerm = new StringBuilder();
            } else {
                // multi character terms: numbers, functions, perhaps non-supported elements
                // Add next character to working term
                multiCharTerm.append(c);
            }

        }
        // Add last term
        if (multiCharTerm.length() > 0) {
            tokens.add(this.expression.substring(start));
        }
    }
    
    // Takes tokens and converts to Reverse Polish Notation (RPN), this is one where the operator follows its operands.
    private void tokensToReversePolishNotation () {
        // contains final list of tokens in RPN
        this.reverse_polish = new ArrayList<>();

        // stack is used to reorder for appropriate grouping and precedence
        Stack tokenStack = new Stack();
        for (String token : tokens) {
            switch (token) {
                // If left bracket push token on to stack
                case "(":
                    tokenStack.push(token);
                    break;
                case ")":
                    while (tokenStack.peek() != null && !tokenStack.peek().equals("("))
                    {
                        reverse_polish.add( (String)tokenStack.peek() );
                        tokenStack.pop();
                    }
                    tokenStack.pop();
                    break;
                case "^":
                case "+":
                case "-":
                case "*":
                case "/":
                case "%":
                    // While stack
                    // not empty AND stack top element
                    // and is an operator
                    while (tokenStack.peek() != null && isOperator((String) tokenStack.peek()))
                    {
                        if ( isPrecedent(token, (String) tokenStack.peek() )) {
                            reverse_polish.add((String)tokenStack.peek());
                            tokenStack.pop(); 
                            continue;
                        }
                        break;
                    }
                    // Push the new operator on the stack
                    tokenStack.push(token);
                    break;
                default:    // Default should be a number, there could be test here
                    this.reverse_polish.add(token);
            }
        }
        // Empty remaining tokens
        while (tokenStack.peek() != null) {
            reverse_polish.add((String)tokenStack.peek());
            tokenStack.pop(); 
        }

    }
    public static boolean isNumber(String string) {
        double doubleValue;   		
        if(string == null || string.equals("")) {
            return false;
        }
        
        try { 
            doubleValue = Double.parseDouble(string); //check if it's a number/operand
            return true;
        } catch (NumberFormatException e) {   //check if it's an operator 
            return false;
        }
    }
        // Takes RPN and produces a final result
    private void rpnToResult() //implemented function
    {
        // Stack used to hold calculation while process RPN
        Stack<Double> calculation = new Stack();
        double intermediate = 0; 

        // for loop to process RPN
        for (String element:reverse_polish)
        {
            // If the token is a number
            if (isNumber(element))
            {
                // Push number to stack
                double doubleValue = Double.parseDouble(element);
                calculation.push(doubleValue);
            }
            else
            {
                // Pop the two top entries
                double top = calculation.peek().doubleValue();
                calculation.pop();
                double bottom = calculation.peek().doubleValue();
                calculation.pop();

                // Based off of Token operator calculate result
                switch (element) {
                   case "^":
                    intermediate = Math.pow(bottom, top);
                    break;
                   case "*":
                    intermediate = bottom * top;
                    break;
                   case "/":
                    intermediate = bottom/top;
                    break;
                   case "%":
                    intermediate = bottom % top;
                    break;
                   case "+":
                    intermediate = bottom + top;
                    break;
                   case "-":
                    intermediate = bottom - top;
                    break;
                   default:
                    break;
                }

                // Push result back onto the stack
                calculation.push(intermediate); 
            }
        }
        // Pop final result and set as final result for expression
        result = calculation.peek().doubleValue();
        calculation.pop(); 
    }
    
    // Print the expression, terms, and result
    public String toString() {
        return ("Original expression: " + this.expression + "\n" +
                "Tokenized expression: " + this.tokens.toString() + "\n" +
                "Reverse Polish Notation: " +this.reverse_polish.toString() + "\n" +
                "Final result: " + String.format("%.2f", this.result));
    }
}

```

### Calculator Test Driver (Many Possible Test Cases for Calculator)
``` java

/* Test Cases, tests different possible situations */

public class CalculatorTester
{
    public static void main(String[] args)
    {
        Calculator simpleMath = new Calculator("100 + 200  * 3");
        System.out.println("Simple Math\n" + simpleMath);

        Calculator parenthesisMath = new Calculator("(100 + 200)  * 3");
        System.out.println("Parenthesis Math\n" + parenthesisMath);

        Calculator allMath = new Calculator("200 % 300 + 5 + 300 / 200 + 1 * 100");
        System.out.println("All Math\n" + allMath);

        Calculator allMath2 = new Calculator("200 % (300 + 5 + 300) / 200 + 1 * 100");
        System.out.println("All Math2\n" + allMath2);
        
        Calculator allMath3 = new Calculator("2^3");
        System.out.println("All Math3\n" + allMath3);
    
    }
}

```


### TT1: Linked Lists

### Challenge 1: Queue
``` java


//import com.nighthawk.csa.mvc.DataOps.genericDataModel.Alphabet;
//import com.nighthawk.csa.mvc.DataOps.genericDataModel.Animal;
//import com.nighthawk.csa.mvc.DataOps.genericDataModel.Cupcakes;
import java.util.*;


/**
 * Queue: custom implementation
 * @author     Rini Khandelwal
 *
 * 1. Uses custom LinkedList of Generic type T
 * 2. Implements Iterable
 * 3. "has a" LinkedList for head and tail
 */
class Queue<T> implements Iterable<T> {
    LinkedList<T> head, tail;

    /**
     *  Add a new object at the end of the Queue,
     *
     * @param  data,  is the data to be inserted in the Queue.
     */
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

    /**
     *  Remove an object from the head of the queue.
     *
     * @param 
     */
    public void dequeue()
    {
        head = head.getNext(); //remove head by setting it to the next head 
    }
    /**
     *  Returns the head object.
     *
     * @return  this.head, the head object in Queue.
     */
    public LinkedList<T> getHead() {
        return this.head;
    }

    /**
     *  Returns the tail object.
     *
     * @return  this.tail, the last object in Queue
     */
    public LinkedList<T> getTail() {
        return this.tail;
    }

    /**
     *  Returns the iterator object.
     *
     * @return  this, instance of object
     */
    public Iterator<T> iterator() {
        return new QueueIterator<>(this);
    }
}

/**
 * Queue Iterator
 *
 * 1. "has a" current reference in Queue
 * 2. supports iterable required methods for next that returns a data object
 */
class QueueIterator<T> implements Iterator<T> {
    LinkedList<T> current;  // current element in iteration

    // QueueIterator is intended to the head of the list for iteration
    public QueueIterator(Queue<T> q) {
        current = q.getHead();
    }

    // hasNext informs if next element exists
    public boolean hasNext() {
        return current != null;
    }

    // next returns data object and advances to next position in queue
    public T next() {
        T data = current.getData();
        current = current.getNext();
        return data;
    }
}

/**
 * Queue Manager
 * 1. "has a" Queue
 * 2. support management of Queue tasks (aka: titling, adding a list, printing)
 */
class QueueManager<T> {
    // queue data
    private final String name; // name of queue
    private int count = 0; // number of objects in queue
    public final Queue<T> queue = new Queue<>(); // queue object

    /**
     *  Queue constructor
     *  Title with empty queue
     */
    public QueueManager(String name) {
        this.name = name;
    }

    /**
     *  Queue constructor
     *  Title with series of Arrays of Objects
     */
    public QueueManager(String name, T[]... seriesOfObjects) {
        this.name = name;
        this.addList(seriesOfObjects);
    }

    /**
     * Add a list of objects to queue
     */
    public void addList(T[]... seriesOfObjects) {
        for (T[] objects: seriesOfObjects)
            for (T data : objects) {
                this.queue.add(data);
                this.count++;
                printQueue();
            }
    }

    /**
     * Print any array objects from queue
     */
    public void printQueue() {
        System.out.print(this.name + " count: " + count + ", ");
        //System.out.print(this.name + " data: ");
        System.out.print(" data: ");
        for (T data : queue)
            System.out.print(data + " ");
        System.out.println();
    }
    
    /**
     * Remove one Queue element at a time till Queue is empty.
     */
    public void remove()
    {
        QueueIterator<T> itr = (QueueIterator<T>)queue.iterator();
        while(itr.hasNext()) {
         T data = itr.next();
         System.out.println("Dequeued Data:" + data );
         queue.dequeue();
         count--;
         printQueue();
      }
    }
}

/**
 * Driver Class
 * Tests queue with string, integers, and mixes of Classes and types
 */
public class QueueTester {
    public static void main(String[] args)
    {
        // Create iterable Queue of Words
        Object[] words = new String[] { "seven", "slimy", "snakes", "sallying", "slowly", "slithered", "southward"};
        QueueManager qWords = new QueueManager("Words", words );
        //qWords.printQueue();
        qWords.remove();
        
      
       
    }
    
} 
class LinkedList<T>
{
    private T data;
    private LinkedList<T> prevNode, nextNode;

    /**
     *  Constructs a new element
     *
     * @param  data, data of object
     * @param  node, previous node
     */
    public LinkedList(T data, LinkedList<T> node)
    {
        this.setData(data);
        this.setPrevNode(node);
        this.setNextNode(null);
    }

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

    /**
     *  Returns T data for this element
     *
     * @return  data associated with object
     */
    public T getData()
    {
        return this.data;
    }

    /**
     *  Setter for prevNode in DoubleLinkedNode object
     *
     * @param node, prevNode to current Object
     */
    public void setPrevNode(LinkedList<T> node)
    {
        this.prevNode = node;
    }

    /**
     *  Setter for nextNode in DoubleLinkedNode object
     *
     * @param node, nextNode to current Object
     */
    public void setNextNode(LinkedList<T> node)
    {
        this.nextNode = node;
    }


    /**
     *  Returns reference to previous object in list
     *
     * @return  the previous object in the list
     */
    public LinkedList<T> getPrevious()
    {
        return this.prevNode;
    }

    /**
     *  Returns reference to next object in list
     *
     * @return  the next object in the list
     */
    public LinkedList<T> getNext()
    {
        return this.nextNode;
    }
}


```

### Challenge 2: Merge Sort
```java


//import com.nighthawk.csa.mvc.DataOps.genericDataModel.Alphabet;
//import com.nighthawk.csa.mvc.DataOps.genericDataModel.Animal;
//import com.nighthawk.csa.mvc.DataOps.genericDataModel.Cupcakes;
import java.util.*;
//import java.util.LinkedList;
import java.util.Iterator;


/**
* Queue: custom implementation
* @author     Rini Khandelwal
*
* 1. Uses custom LinkedList of Generic type T
* 2. Implements Iterable
* 3. "has a" LinkedList for head and tail
*/
class Queue<T> implements Iterable<T> {
   LinkedList<T> head, tail;

   /**
    *  Add a new object at the end of the Queue,
    *
    * @param  data,  is the data to be inserted in the Queue.
    */
   public void add(T data) {
       // add new object to end of Queue
       LinkedList<T> tail = new LinkedList<>(data, null);

       if (head == null)  // initial condition
           this.head = this.tail = tail;
       else {  // nodes in queue
           this.tail.setNextNode(tail); // current tail points to new tail
           this.tail = tail;  // update tail
       }
       //System.out.println("Enqueued Data:" + data );
   }

   public void dequeue()
   {
       head = head.getNext();
   }
   /**
    *  Returns the head object.
    *
    * @return  this.head, the head object in Queue.
    */
   public LinkedList<T> getHead() {
       return this.head;
   }

   /**
    *  Returns the tail object.
    *
    * @return  this.tail, the last object in Queue
    */
   public LinkedList<T> getTail() {
       return this.tail;
   }

   /**
    *  Returns the iterator object.
    *
    * @return  this, instance of object
    */
   public Iterator<T> iterator() {
       return new QueueIterator<>(this);
   }
}

/**
* Queue Iterator
*
* 1. "has a" current reference in Queue
* 2. supports iterable required methods for next that returns a data object
*/
class QueueIterator<T> implements Iterator<T> {
   LinkedList<T> current;  // current element in iteration

   // QueueIterator is intended to the head of the list for iteration
   public QueueIterator(Queue<T> q) {
       current = q.getHead();
   }

   // hasNext informs if next element exists
   public boolean hasNext() {
       return current != null;
   }

   public T getCurrent() {
       if (current != null)
       {
           return current.getData();
       }
       return null; 
   }
   // next returns data object and advances to next position in queue
   public T next() {
       T data = current.getData();
       current = current.getNext();
       return data;
   }
}

/**
* Queue Manager
* 1. "has a" Queue
* 2. support management of Queue tasks (aka: titling, adding a list, printing)
*/
class QueueManager<T> {
   // queue data
   private final String name; // name of queue
   private int count = 0; // number of objects in queue
   public final Queue<T> queue = new Queue<>(); // queue object

   /**
    *  Queue constructor
    *  Title with empty queue
    */
   public QueueManager(String name) {
       this.name = name;
   }

   /**
    *  Queue constructor
    *  Title with series of Arrays of Objects
    */
   public QueueManager(String name, T[]... seriesOfObjects) {
       this.name = name;
       this.addList(seriesOfObjects);
   }

   /**
    * Add a list of objects to queue
    */
   public void addList(T[]... seriesOfObjects) {
       for (T[] objects: seriesOfObjects)
           for (T data : objects) {
               this.queue.add(data);
               this.count++;
               //printQueue();
           }
   }

   /**
    * Print any array objects from queue
    */
   public void printQueue() {
       //System.out.print(this.name + " count: " + count + ", ");
       //System.out.print(this.name + " data: ");
       System.out.print(" data: ");
       for (T data : queue)
           System.out.print(data + " ");
       System.out.println();
   }
   
   public void remove()
   {
       QueueIterator<T> itr = (QueueIterator<T>)queue.iterator();
       while(itr.hasNext()) {
        T data = itr.next();
        //System.out.println("Dequeued Data:" + data );
        queue.dequeue();
        count--;
        printQueue();
     }
   }
   
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
}
/**
* Driver Class
* Tests queue with string, integers, and mixes of Classes and types
*/
public class Merge<T> {
   
   public static void main(String[] args)
   {

       // Create iterable Queue of Integers
       Object[] numbers1 = new Integer[] { 1,  4, 5, 8};
       QueueManager q1 = new QueueManager("Integers", numbers1 );
       
       Object[] numbers2 = new Integer[] { 2,  3, 6, 7};
       QueueManager q2 = new QueueManager("Integers", numbers2 );
       
       QueueManager merged = new QueueManager("Merged");
       merged.merge(q1.queue,q2.queue);
   }
   
} 
class LinkedList<T>
{
   private T data;
   private LinkedList<T> prevNode, nextNode;

   /**
    *  Constructs a new element
    *
    * @param  data, data of object
    * @param  node, previous node
    */
   public LinkedList(T data, LinkedList<T> node)
   {
       this.setData(data);
       this.setPrevNode(node);
       this.setNextNode(null);
   }

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

   /**
    *  Returns T data for this element
    *
    * @return  data associated with object
    */
   public T getData()
   {
       return this.data;
   }

   /**
    *  Setter for prevNode in DoubleLinkedNode object
    *
    * @param node, prevNode to current Object
    */
   public void setPrevNode(LinkedList<T> node)
   {
       this.prevNode = node;
   }

   /**
    *  Setter for nextNode in DoubleLinkedNode object
    *
    * @param node, nextNode to current Object
    */
   public void setNextNode(LinkedList<T> node)
   {
       this.nextNode = node;
   }


   /**
    *  Returns reference to previous object in list
    *
    * @return  the previous object in the list
    */
   public LinkedList<T> getPrevious()
   {
       return this.prevNode;
   }

   /**
    *  Returns reference to next object in list
    *
    * @return  the next object in the list
    */
   public LinkedList<T> getNext()
   {
       return this.nextNode;
   }
}

```

### Challenge 3: Generic T
```java

import java.util.*;


/**
 * Queue: custom implementation
 * @author     Rini Khandelwal
 *
 * 1. Uses custom LinkedList of Generic type T
 * 2. Implements Iterable
 * 3. "has a" LinkedList for head and tail
 */
class Queue<T> implements Iterable<T> {
    LinkedList<T> head, tail;

    /**
     *  Add a new object at the end of the Queue,
     *
     * @param  data,  is the data to be inserted in the Queue.
     */
    public void add(T data) {
        // add new object to end of Queue
        LinkedList<T> tail = new LinkedList<>(data, null);

        if (head == null)  // initial condition
            this.head = this.tail = tail;
        else {  // nodes in queue
            this.tail.setNextNode(tail); // current tail points to new tail
            this.tail = tail;  // update tail
        }
    }

    public void dequeue()
    {
        head = head.getNext();
    }
    /**
     *  Returns the head object.
     *
     * @return  this.head, the head object in Queue.
     */
    public LinkedList<T> getHead() {
        return this.head;
    }

    /**
     *  Returns the tail object.
     *
     * @return  this.tail, the last object in Queue
     */
    public LinkedList<T> getTail() {
        return this.tail;
    }

    /**
     *  Returns the iterator object.
     *
     * @return  this, instance of object
     */
    public Iterator<T> iterator() {
        return new QueueIterator<>(this);
    }
}

/**
 * Queue Iterator
 *
 * 1. "has a" current reference in Queue
 * 2. supports iterable required methods for next that returns a data object
 */
class QueueIterator<T> implements Iterator<T> {
    LinkedList<T> current;  // current element in iteration

    // QueueIterator is intended to the head of the list for iteration
    public QueueIterator(Queue<T> q) {
        current = q.getHead();
    }

    // hasNext informs if next element exists
    public boolean hasNext() {
        return current != null;
    }

    // next returns data object and advances to next position in queue
    public T next() {
        T data = current.getData();
        current = current.getNext();
        return data;
    }
}

class Stack<T> {
    LinkedList<T> head,tail;

    /**
     *  Add a new object at the front of the Stack,
     *
     * @param  data,  is the data to be inserted in the Stack.
     */
    public void push(T data) {
        // add new object to front of Stack
        LinkedList<T> head = new LinkedList<>(data, null);

        if (tail == null)  // initial condition
            this.tail = this.head = head;
        else {  // nodes in queue
            head.setNextNode(this.head);
            this.head = head;
        }
    }

    public void pop()
    {
        head = head.getNext();
    }
    /**
     *  Returns the head object.
     *
     * @return  this.head, the head object in Stack.
     */
    public T peek() {
        if (head != null)
        {
            return this.head.getData();
        }
        return null; 
    }

    /**
     *  Returns the tail object.
     *
     * @return  this.tail, the last object in Queue
     */
    public LinkedList<T> getTail() {
        return this.tail;
    }
}


/**
 * Queue Manager
 * 1. "has a" Queue
 * 2. support management of Queue tasks (aka: titling, adding a list, printing)
 */
class QueueManager<T> {
    // queue data
    private final String name; // name of queue
    private int count = 0; // number of objects in queue
    public final Queue<T> queue = new Queue<>(); // queue object

    /**
     *  Queue constructor
     *  Title with empty queue
     */
    public QueueManager(String name) {
        this.name = name;
    }

    /**
     *  Queue constructor
     *  Title with series of Arrays of Objects
     */
    public QueueManager(String name, T[]... seriesOfObjects) {
        this.name = name;
        this.addList(seriesOfObjects);
    }

    /**
     * Add a list of objects to queue
     */
    public void addList(T[]... seriesOfObjects) {
        for (T[] objects: seriesOfObjects)
            for (T data : objects) {
                this.queue.add(data);
                this.count++;
                //printQueue();
            }
    }

    /**
     * Print any array objects from queue
     */
    public void printQueue() {
        System.out.print(this.name + " count: " + count + ", ");
        //System.out.print(this.name + " data: ");
        System.out.print(" data: ");
        for (T data : queue)
            System.out.print(data + " ");
        System.out.println();
    }
    
    public void remove()
    {
        QueueIterator<T> itr = (QueueIterator<T>)queue.iterator();
        while(itr.hasNext()) {
         T data = itr.next();
         System.out.println("Dequeued Data:" + data );
         queue.dequeue();
         count--;
         printQueue();
      }
    }
    
    public Stack<T> convertToStack()
    {
      Stack<T> s = new Stack<>();
      QueueIterator<T> itr = (QueueIterator<T>)queue.iterator();
        while(itr.hasNext()) {
         s.push(itr.next());
      }
      return s; 
    }
}

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
class LinkedList<T>
{
    private T data;
    private LinkedList<T> prevNode, nextNode;

    /**
     *  Constructs a new element
     *
     * @param  data, data of object
     * @param  node, previous node
     */
    public LinkedList(T data, LinkedList<T> node)
    {
        this.setData(data);
        this.setPrevNode(node);
        this.setNextNode(null);
    }

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

    /**
     *  Returns T data for this element
     *
     * @return  data associated with object
     */
    public T getData()
    {
        return this.data;
    }

    /**
     *  Setter for prevNode in DoubleLinkedNode object
     *
     * @param node, prevNode to current Object
     */
    public void setPrevNode(LinkedList<T> node)
    {
        this.prevNode = node;
    }

    /**
     *  Setter for nextNode in DoubleLinkedNode object
     *
     * @param node, nextNode to current Object
     */
    public void setNextNode(LinkedList<T> node)
    {
        this.nextNode = node;
    }


    /**
     *  Returns reference to previous object in list
     *
     * @return  the previous object in the list
     */
    public LinkedList<T> getPrevious()
    {
        return this.prevNode;
    }

    /**
     *  Returns reference to next object in list
     *
     * @return  the next object in the list
     */
    public LinkedList<T> getNext()
    {
        return this.nextNode;
    }
}

```

## TT0: Data Strucutres

### Challenge 1: Menu
```java


import java.util.Scanner; //java library for user input
import java.util.*;
//hashmap;
//import java.util; 

/** Main - entry point class for this project
1.'C' and Java have a main function/method that is the ENTRY into code execution. Both languages need a file to contain that ENTRY method/function.  Common convention for 'C': main.c.  Convention for Java: Main.java.
2. Replit requires a "Main.java" file and a main class ("public Class Main").  Inside the class it expects a method named "public static void main(String[] args)"."
3. Conventions and structures are part of a programming language and the tools you use.  Python people like to pick on these Java conventions, saying they are difficult.  What do you think? 
*/
public class Main {   //Everything in Java is inside a class, Squigs, Squigalies, or Curly brackets denote a code block in Java.  This is the beginning of class code block.

    /** main - entry point method for this project
    main is the entry or pri·mor·di·al code block for Java
    */
   
   public static MyMethod[] methods() {
    return new MyMethod[]{
            new MyMethod_0(),
            new MyMethod_1(),
            new MyMethod_2(),
        new MyMethod_3(),
        new MyMethod_4(),
        new MyMethod_5(),
        new MyMethod_6(),
        new MyMethod_7(),

    };
    }
    
   
    static public void main(String[] args)  {  // open squig begins the method
        methods();
        menu(); // 'coder' defined method/function call to a different code block
    } // close squig ends the method.  What did this method do?

    /**
     * menu - method that is activated by main, this will perform Java code
     */
    public static void menu() {
        //Primitive types: AP CSA Unit 1 
        int selection;  //user selection variable of type Inteteger

        //Using a Class: AP CSA Unit 2
        //Scanner is well know Java class for text based input
        Scanner scan = new Scanner(System.in);  //defining an object to scan/get input from user, notice the use of "new", this means you are making an object of type Scanner.

        //System.out.println -  A Class or Static method call that is used to output a message to the terminal.  
        //The block of outputs below is used to present a menu to the user. 
        System.out.println("-------------------------\n");
        System.out.println("Choose from these choices");
        System.out.println("-------------------------\n");
        System.out.println("1 - Hello");
        System.out.println("2 - Printy");
        System.out.println("3 - Loopy");
        System.out.println("4 - Classy Print");
        System.out.println("5 - Classy Poem");
        System.out.println("6 - Binary");
        System.out.println("7 - Termy");
        System.out.println("0 - Quit");

        //Using Scanner Class to get integer as input
        selection = scan.nextInt();  //Using nextInt() method to get an integer value
        MyMethod[selection].run();

        //Control Statements: AP CSA Unit 3
        //Switch or Switch/Case is used to evaluate the input and execute the case that matches the selection.
        /*
        switch (selection) {
            case 0:
                return;
            case 1:
                //Prints message to console/terminal
                System.out.println("Hello, World of Monkeys!");
                break;
            case 2:
                //Using a Class: AP CSA Unit 2
                //Run Printy main method with null parameter
                Printy.main(null);
                break;
            case 3:
                //Using a Class: AP CSA Unit 2
                //Run MonkeyLoop() constructor and run a method from temporary object, defined in class
                new MonkeyLoop().printPoem();
                break;
            case 4:
                //Using a Class: AP CSA Unit 2
                //Run MonkeyList() constructor and run a method from temporary object, defined in class
                new MonkeyList().print();
                break;
            case 5:
                //Using a Class: AP CSA Unit 2
                //Create object to run methods from Classy.java
                MonkeyList ml = new MonkeyList();
                ml.print();
                ml.printPoem();
                break;

            case 6:
                //Using a Class: AP CSA Unit 2
                //Run Biny main method with null parameter
                Biny.main(null);
                break;

            case 7:
                //Run Termy main method with null parameter
                Termy.main(null);
                break;
                    
            default:
                //Prints error message from console
                System.out.println("Unexpected choice, try again.");
        }
        */

        //Recursion: AP CSA requirement 10 
        //Calling the menu() method inside of the menu() code block is called recursion.
        //Using recursion we provide the ability to stay in program and select and additional option.
        //Repeating an operation is often called iteration.  Recursion is a special form of iteration.
        menu();
    }

}

class MyMethod{
    public void run()
    { 
        return;
    }
}

class MyMethod_0 extends MyMethod
{
    public void run()
    {
        return;
    }
}

class MyMethod_1 extends MyMethod
{
    public void run()
    {
        System.out.println("Hello, World of Monkeys!");
    }
}

class MyMethod_2 extends MyMethod
{
    public void run()
    {
        Printy.main(null);
    }
}

class MyMethod_3 extends MyMethod
{
    public void run()
    {
        new MonkeyLoop().printPoem();
}


class MyMethod_4 extends MyMethod
{
    public void run()
    {
        new MonkeyList().print();
    }
}


class MyMethod_5 extends MyMethod
{
    public void run()
    {
        MonkeyList ml = new MonkeyList();
        ml.print();
        ml.printPoem();    
}


class MyMethod_6 extends MyMethod
{
    public void run()
    {
        Biny.main(null);

    }
}


class MyMethod_7 extends MyMethod
{
    public void run()
    {
        Termy.main(null);
    }
}


```

### Challenge 2: Pass-By-Value & Int-By-Value
``` java


public class IntByReference {
    private int value;

    // Hack: create IntByReference, swapToLowHighOrder and toString methods
    public IntByReference(int num) {
        value = num; 
    }
    
    public String toString() {
        return ("" + value); 
    }
    
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

    // static method that enables me to see numbers swapped by reference (before, after)
    public static void swapper(int n0, int n1) {
        IntByReference a = new IntByReference(n0);
        IntByReference b = new IntByReference(n1);
        
        System.out.println("Before: " + a + " " + b);
        
        a.swapToLowHighOrder(b);  // conditionally build swap method to change values of a, b
        System.out.println("After: " + a + " " + b);
        System.out.println();
    }

    // static main method that provides some simple test cases
    public static void main(String[] ags) {
        IntByReference.swapper(21, 16);
        IntByReference.swapper(16, 21);
        IntByReference.swapper(16, -1);
    }
}

```

### Challenge 3: Print Matrix (Keypad and Number Systems)

``` java

public class Matrix {
    private final int[][] matrix;

    // store matrix
    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    // Hack: create toString method using nested for loops to format output of a matrix
    //use hexadecimal so the output has letters in place of numbers greater than 9 

    public String toString() {
        String[] hexArray = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9",   
                            "a","b", "c","d", "e", "f",};
        String string = ""; 
        for (int[] innerMatrix : matrix)  //loop for keypad
        {
            for (int val : innerMatrix) 
            {
                //check if number falls within the hexadecimal array to assign it the corresponding number or letter 
                if (val >= 0 && val < 16) {
                    string += hexArray[val] + " "; 
                }
                
                else  //negative numbers are replaced with spaces  
                {
                    string += "  "; 
                }
            }
            string += "\n"; 
            //System.out.println(" ");
        }
        
        string += "\n"; 
        
        for (int i = matrix.length-1; i >= 0; i--)  //loop for number systems
        {
            for (int j = matrix[i].length-1; j >= 0; j--) 
            {
                if ((matrix[i][j] >= 0) && (matrix[i][j] < 16) ){
                    string += hexArray[matrix[i][j]] + " ";
                }
                
                else
                {
                    string += "  "; 
                }
            }
            string += "\n"; 
        }
        
        return string; 
    }

    // declare and initialize a matrix for a keypad
    static int[][] keypad() {
        return new int[][]{ { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, {-1, 0, -1} };
    }

    // declare and initialize a random length arrays
    static int[][] numbers() {
        return new int[][]{ { 0, 1 },
                { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 },
                { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 } };
    }

    // tester method for matrix formatting
    public static void main(String[] args) {
        Matrix m0 = new Matrix(keypad());
        System.out.println("Keypad:");
        //System.out.println(m0);
        System.out.println(m0.toString());

        Matrix m1 = new Matrix(numbers());
        System.out.println("Numbers Systems:");
        System.out.println(m1);
    }

}

```

