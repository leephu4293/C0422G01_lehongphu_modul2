package list.bai_tap;

import java.util.Arrays;

public class ArrayList <E> {
        private int size = 0;
        private static final int  DEFAULT_CAPACITY = 4;
        private Object [] elements;

        public ArrayList () {
            elements = new Object[DEFAULT_CAPACITY];
        }
        public ArrayList(int capacity){
        if (capacity >=0 ){
            elements = new Object[capacity];
        }
        else {
            System.out.println( " kiem tra lai capacity ");
        }
    }

        public int size(){
        return  size;
        }
    public  void clear(){
            size= 0 ;
        for (int i = 0; i < elements.length; i++) {
             elements[i]= null;
        }
    }
        public  void  ensureCap(){
            int newSize= elements.length* (1/2);
            elements = Arrays.copyOf(elements,newSize);
        }
        public void add(E e){
            if (size == elements.length){
                ensureCap();
            }
            elements[size++]= e;
        }
        public  void add (E element, int index ){
            if (index > elements.length){
                System.out.println(" kiem tra lai index ");
            }else if (elements.length== size ){
                ensureCap();
            }
            if (elements[index]== null){
                elements[index]= element;
                size++;
            }else {
                for (int i =size+1 ; i >index ; i--) {
                    elements[i]= elements[i-1];
                }
                elements[index]= element;
                        size ++;
            }
            
        }
        public  E get(int i ){
            if (i >= size || i < 0 ){
                throw new IndexOutOfBoundsException ("Index: " + i + ", Size " + i );
            }
            return (E) elements[i];
        }

    @Override
    public String toString() {
        return "ArrayList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
