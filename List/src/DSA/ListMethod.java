package DSA;

import MyStack.StackMethods;
import MyStack.StackUnderFlowException;

public class ListMethod {
    private  int[] data;
    private boolean isEmpty = false;

    int count;

    public ListMethod(int size) {
        data = new int[10];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void add(int element) {
        data[count++] = element;
    }

    public int remove(int element) {
        if(count == 0) throw new listUnderFlowException();
        return data[--count] = element;
    }



}
