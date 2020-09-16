public class ArrayE {



    public int[] sort(int[] array) {
        for (int j = 0; j < array.length; j++) {
            for (int i = 1; i < array.length; i++) {


                boolean leftGreaterThanRight = array[i - 1] > array[i];
//            System.out.println( array[i - 1] + " > " + array[i] + ", it is " + leftGreaterThanRight);

                if (leftGreaterThanRight == true) { // чому тут можна без '== true'

                    int z;
                    z = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = z;
                }
            }
        }
        return null;
    }

}
