package arrayPrograms;

public class SumOfAllSequentialNumbers {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;

        /*for(int i = 0; i<arr.length; i++){
            sum = sum + arr[i];
        }*/

        int arraySize = arr.length;

        sum = (arraySize*(arraySize+1))/2;

        System.out.println("The Sum is: "+sum);
    }
}
