public class ArrayE {

    public void sort(int[] array) {
        for (int j = 0; j < array.length; j++) {
            runInnerCycle(array);
        }
    }

    private void runInnerCycle(int[] array) {

        for (int i = 1; i < array.length; i++) {

            boolean leftGreaterThanRight = array[i - 1] > array[i];

            if (leftGreaterThanRight == true) { // чому тут можна без '== true'

                int z = array[i];
                array[i] = array[i - 1];
                array[i - 1] = z;
            }
        }
    }
}
