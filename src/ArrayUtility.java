public class ArrayUtility {

    public static void print(int[] array) {
        System.out.println(array);

    }

    public static int sum(int[] array) {
        int total = 0;
        for (int num : array) {
            total += num;
        }
        return total;
    }

    public static double average(int[] array) {
        double sum = sum(array);
        double average = (double) sum / array.length;
        average = average*100; 
        int placeholder = (int) average;
        average = (double) placeholder / 100;
        return average;
    }

    public static int minimum(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) min = num;
        }
        return min;
    }

    public static int maximum(int[] array) {
        if (array.length == 0) return Integer.MIN_VALUE;
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int evenCount(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int[] reverseOne(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }

    public static void reverseTwo(int[] array) {
        for (int i = 0; i < array.length/2 ; i++) {
            int temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }

    }

    public static boolean linearSearchInt(int[] array, int num) {
        for (int i = 0; i < array.length; i++){
            if (array[i] == num ){
                return true;
            }
        }return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for (int i = 0 ; i< array.length; i++){
            if (array[i].equals(str)){
                return true;
            }
        }return false;
    }

    public static void multiplyByTwo(int[] array) {
        for (int i = 0; i<array.length; i++){
            int temp = array[i]*2;
            array[i]=temp;
        }

    }

    public static void multiplyByN(int[] array, int n) {

        for (int i = 0 ; i < array.length; i++){
            int temp = array[i] * n;
            array[i] = temp;
        }
    }

    public static String toString(int[] array) {
        String holder = new String("");
        for ( int i = 0 ; i < array.length - 1 ; i++){
            holder += array[i] + ", ";
        }
        holder += array[array.length -1 ];
        return holder;
    }

    public static boolean twoSum(int[] array, int num) {
        for (int i = 0; i < array.length; i++){
            for (int j = i+1; j < array.length ; j++){
                int temp = array[i] + array [j];
                if (temp == num){
                    return true;
                }
            }
        }return false;
    }

    public static void shiftRight(int[] array) {
        int temp = array[array.length-1];
        for (int i = array.length - 1; i > 0 ; i--){
            array[i] = array[i-1];
        

        }array[0] = temp;

    }

    public static void shiftLeft(int[] array) {
        int temp = array[0];
        for (int i = 0; i < array.length-1; i++){
            array[i] = array[i+1];
        }array[array.length-1]= temp;

    }

    public static void shiftRightNTimes(int[] array, int n) {
        for ( int i = 0; i < n ; i++){
            shiftRight(array);
        }

    }

    public static void shiftLeftNTimes(int[] array, int n) {
        for ( int i = 0; i < n ; i++){
            shiftLeft(array);
        }
    }


}
