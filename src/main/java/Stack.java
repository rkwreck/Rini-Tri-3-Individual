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