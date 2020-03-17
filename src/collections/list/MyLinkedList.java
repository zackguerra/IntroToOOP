package collections.list;

import java.util.*;

// "generic" type <E> : Element
public class MyArrayList<E> implements List<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elementData;
    private int size;

    public MyArrayList() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int initialCapacity) {
        if (initialCapacity >= 0) {
            elementData = new Object[initialCapacity];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
        }
    }

    // <? extends E> -> any type that extends E
    public MyArrayList(Collection<? extends E> c) {
        elementData = c.toArray();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(elementData, size);
    }

    @Override
    public <T> T[] toArray(T[] a) {
        // TODO
        return null;
    }

    @Override
    public boolean add(E e) {
        if (size == elementData.length) {
            // grow (increases by 50%)
            elementData = grow(size + 1);
        }
        elementData[size] = e;
        size++;
        return true;
    }

    private Object[] grow(int minCapacity) {
        return elementData = Arrays.copyOf(elementData, newCapacity(minCapacity));
    }

    /*
    The maximum size of array to allocate.
    Attempts to allocate larger arrays "may" result in OutOfMemoryOrder
     */
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    /**
     * @param minCapacity the desired minimum capacity
     * @return
     */
    private int newCapacity(int minCapacity) {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        if (newCapacity <= minCapacity) {
            if (minCapacity < 0 || minCapacity > MAX_ARRAY_SIZE) {
                throw new OutOfMemoryError("integer overflow");
            }
            return minCapacity;
        }
        return (newCapacity <= MAX_ARRAY_SIZE) ? newCapacity : Integer.MAX_VALUE;
    }
    public void test(){

    }
    @Override
    public boolean remove(Object o) {
        for(int i = 0; i<this.elementData.length;i++){
            if (this.elementData[i] == o){
                this.elementData[i]=null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        boolean find = false;
        for (Object obj : c){
            for (int i = 0; i < this.elementData.length;i++){
                if (this.elementData[i]==obj){
                    find = true;
                }else{
                    find = false;
                }
            }
            if (!find)
                return false;
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        for(Object o : c){
            add((E) o);
        }
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        for(Object o : c){
            add(index,(E)o);
        }
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        for (int i = 0 ; i < this.elementData.length; i++){
            if (this.elementData[i] == c)
                this.elementData[i] = null;
            if (this.elementData[i] == null)
                break;
        }
        this.size = 0;
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        // TODO
        return false;
    }

    @Override
    public void clear() {
        Object[] obj = this.elementData;
        int numer = this.size;
        this.size = 0;
        for(int i = this.size; i < numer; ++i) {
            obj[i] = null;
        }
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + ", size: " + size);
        }
        return (E) elementData[index];
    }

    @Override
    public E set(int index, E element) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + ", size: " + size);
        }
        E oldValue = (E) elementData[index];
        elementData[index] = element;
        return oldValue;
    }

    @Override
    public void add(int index, E element) {
        // TODO
    }

    @Override
    public E remove(int index) {
        this.elementData[index]= null;
        for (int i= index;i < this.elementData.length;i++){
            if (!(i+1 < this.elementData.length) && (this.elementData[i+1] != null)){
                this.elementData[i] = this.elementData[i+1];
            }else{
                break;
            }
        }
        return null;
    }

    @Override
    public int indexOf(Object o) {
        for(int i = 0; i < this.elementData.length;i++){
            if (this.elementData[i]== o)
                return i;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        for(int i = this.elementData.length; i >= 0;i--){
            if (this.elementData[i]== o)
                return i;
        }
        return -1;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        List<E> newReturn = new ArrayList<>();
        int j = 0;
        for (int i = fromIndex ; i< toIndex; i++){
            newReturn.add((E) this.elementData[i]);
        }
        return newReturn;
    }
}
