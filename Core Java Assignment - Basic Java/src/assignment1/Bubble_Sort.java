package assignment1;

public class Bubble_Sort {
	public static class BubbleSortDemo {
        static void bubbleAscending(int[] my_array) {
            int n = my_array.length;
            int temp = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < (n - i); j++) {
                    if (my_array[j - 1] > my_array[j]) {
                        //Code to swap the elements
                        temp = my_array[j - 1];
                        my_array[j - 1] = my_array[j];
                        my_array[j] = temp;
                    }
                }
            }
        }

        public static void main(String[] args) {

            int my_array[] = {5,12,14,6,78,19,1,23,26,35,7,37,52,86,47};

            bubbleAscending(my_array);
            System.out.println("Array after applying Bubble Sort: ");
            for (int i = 0; i < my_array.length; i++) {
                System.out.print(my_array[i] + " ");
            }
        }

    }
}
