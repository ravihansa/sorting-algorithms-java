public class Bubble_Sort {

    public static void main(String[] args) {
        int arr[] = new int[8];

        arr[0] = 556;
        arr[1] = 356;
        arr[2] = 6868;
        arr[3] = -112;
        arr[4] = 75;
        arr[5] = 998;
        arr[6] = -13;
        arr[7] = 534;

        for (int i = 0; i < arr.length - 1; i++) {

            for (int x = 0; x < (arr.length - 1 - i); x++) {

                if (arr[x] > arr[x + 1]) {

                    int temp = arr[x];
                    arr[x] = arr[x + 1];
                    arr[x + 1] = temp;

                }
            }
        }

        for (int j = 0; j < arr.length; j++) {

            System.out.println(arr[j]);

        }
    }
}
