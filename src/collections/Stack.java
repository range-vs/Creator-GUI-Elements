package collections;

import adapter.InterfaceElement;

public class Stack<T> {
    private InterfaceElement[] collection;
    private int count;

    public Stack(){
        collection = new InterfaceElement[10];
        count = 0;
    }

    public Stack(int c){
        collection = new InterfaceElement[c];
        count = 0;
    }

    private boolean isEmpty(){
        return count == 0;
    }

    public void push(InterfaceElement elem){
        if(count == collection.length) {
            int s =  collection.length * 2;
            InterfaceElement[] tmp = new InterfaceElement[s];
            for (int i = 0; i < collection.length; i++) {
                tmp[i] = collection[i];
            }
            collection = tmp;
        }
        collection[count++] = elem;
    }

    public boolean pop(){
        if(isEmpty())
            return false;
        count--;
        if(collection.length == count*2){
            InterfaceElement[] tmp = new InterfaceElement[count];
            for(int i = 0;i<count;i++) {
                tmp[i] = collection[i];
            }
            collection = tmp;
        }
        return true;
    }

    public InterfaceElement peek(){
        if(isEmpty())
            return null;
        return collection[count-1];
    }

    public int size(){
        return count;
    }

}
