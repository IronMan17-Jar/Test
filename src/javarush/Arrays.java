
public class Arrays {

    public static void main(String[] args) {

        //int[] array = {2, 3, 6, 9, 24, 18, 4, 8, 10, 29};

        int[] array = new int[20];
        for (int x = 0; x < array.length; x++) {
            array[x] = (int) (Math.random() * 30);
            System.out.println(array[x]);
        }

        System.out.println();

           for (int x = array.length-1; x > 1; x--) {
                for (int v = 0; v < x; v++) {
                    if (array[v] > array[v + 1]) {
                        int max = array[v];
                        array[v] = array[v + 1];
                        array[v + 1] = max;

                    }
                }
            }

        System.out.println(array[0]);
        System.out.println();
        System.out.println(array[19]);
            
    }

}


