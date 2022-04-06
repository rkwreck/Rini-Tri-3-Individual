package src;

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
class Merge<T> implements Iterable<T> {
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