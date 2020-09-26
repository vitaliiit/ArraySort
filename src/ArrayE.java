public class ArrayE {

    public void sort(int[] array)
    {
        for (int j = 0; j < array.length; j++)
        {
            runInnerCycle(array);
        }
    }

    private void runInnerCycle(int[] array)
    {
        for (int i = 1; i < array.length; i++)
        {

            boolean leftGreaterThanRight = array[i - 1] > array[i]; // то просто принцип? - array[i - 1] > array[i] - який ніби говорить якщо число поперднього індексу більше за число наступного індексу - вважати за тру!

            if (leftGreaterThanRight)
            {
                int z = array[i]; // то просто - число, яке знаходиться під наступним індексом - присвоюється полю z (буфер обміну)
                array[i] = array[i - 1]; // тут - наступному індексу присвоюється значення попереднього індексу
                array[i - 1] = z; // тут - попердньому індексу присвоюється значення наступного індексу котре було збережене в змінній z (буфері обміну)
            }
        }
    }
}
