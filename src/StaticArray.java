import java.sql.Array;

public class StaticArray {
    private int count;
    private int[] array = new int[count];


    public StaticArray(int... array) {
        this.array = array;
        count = array.length;
    }

    public StaticArray(StaticArray arr){
        count = arr.array.length;
        System.arraycopy(arr.array, 0, this.array, 0, arr.array.length);
    }

    public int getArray(int i) {
        return array[i];
    }

    public void changeValue(int ind, int value){
        if(ind > count-1){
            throw new IndexOutOfBoundsException();
        }
        array[ind] = value;
    }


    public String toStrng() {
        String str = "[";
        for (int x: array){
            str += x +" ";
        }
        str += "]";
        return str;
    }

    public int[] getArray(){
        int[] x = new int[count];
        System.arraycopy(array, 0, x, 0, count);
        return x;
    }
}
