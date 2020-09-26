import java.util.Arrays;

public class Central
{
    public static void main(String[] args)
    {
        int[] array = new int[10];

        array[0] = 9;
        array[3] = 6;
        array[1] = 8;
        array[9] = 0;
        array[2] = 7;
        array[5] = 4;
        array[8] = 1;
        array[6] = 3;
        array[4] = 5;
        array[7] = 2;

        ArrayE arrayE = new ArrayE();
        arrayE.sort(array);

            System.out.println(Arrays.toString(array));

    }
}
