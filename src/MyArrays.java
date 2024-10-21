public class MyArrays {
    public static int[] array = new int[100];
    public static int size;

    public static void add(int num, int index) {
        if(index > size){
            throw new IndexOutOfBoundsException(index);
        }
        int newArraySize = size+1;
        int[] newArray = new int[newArraySize];
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        newArray[index] = num;
        for (int i = index + 1; i < newArraySize; i++) {
            newArray[i] = array[i - 1];
        }
        size++;
        array = newArray;
    }


    public static void add(int num) {
        add(num, size);
    }

}
