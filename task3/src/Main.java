public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int temp;
        temp = array[0];
        array[0]=array[array.length-1];
        array[array.length-1] = temp;
        for (int i=0;i<array.length;i++)
            System.out.println("array["+ i + "] = " + array[i]);
        int sum = array[0]+array[array.length/2];
        System.out.println("sum = "+  sum);
    }
}
