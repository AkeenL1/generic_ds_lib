public class ArrayList<T> implements List<T> {

    private T[] array;
    private int dex = 0;

    public ArrayList() {
        array = (T[]) new Object[10];
    }
    public void add(T val) {
        if (dex == array.length) {
            T[] newArray = (T[]) new Object[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[dex] = val;
        dex++;
    }

    public int size() {
        return array.length;
    }

    public boolean isEmpty() {
        return array.length == 0;
    }

    public T get(int index) {
        return array[index];
    }

    public void remove(int index) {
        T[] temp = (T[]) new Object[array.length - 1];
        System.arraycopy(array, 0, temp, 0, index);
        if (index < array.length - 1) {
            System.arraycopy(array, index + 1, temp, index, array.length - index - 1);
        }
        dex--;
        array = temp;
    }
}
