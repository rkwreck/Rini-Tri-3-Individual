
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
