public class SimpleSet<E> {

    private Object[] elements;
    private int size;

    public SimpleSet(){
        this.size = 0;
        elements = new Object[8];
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean contains(E value){
        for(Object element : elements) {
            if (value.equals(element)) {
                return true;
            }
        }
        return false;
    }

    public boolean add(E value){
        if(contains(value)){
            return false;
        }

        if (size+1<=elements.length){
            elements[size+1] = value;
        }else{
            int newElementsSize = elements.length*2;
            Object[] newElements = new Object[newElementsSize];
            System.arraycopy(elements, 0, newElements, 0, elements.length);

            elements = newElements;
            elements[size] = value;
        }

        size++;
        return true;
    }

    public boolean remove(E value) {
        if(!contains(value)){
            return false;
        }else{
            int whereAtIndex = -1;
            for (int i = 0; i < elements.length; i++) {
                if (elements[i] == value) {
                    whereAtIndex = i;
                }
            }
            for (int i = whereAtIndex + 1; i < elements.length; i++) {
                elements[i -1] = elements[i];
            }
            elements[elements.length - 1] = null;
        }
        size--;
        return true;
    }

    public void clear(){
        elements = new Object[8];
        size = 0;
    }
}
