public class Central {
    public static void main(String[] args) {
        int[] array = new int[10];
        array[0] = 9;
        array[1] = 8;
        array[2] = 7;
        array[3] = 6;
        array[4] = 5;
        array[5] = 4;
        array[6] = 3;
        array[7] = 2;
        array[8] = 1;
        array[9] = 0;

        ArrayE arrayE = new ArrayE();
        arrayE.sort(array);

        for ( int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
