package BitwiseOperator;

import java.util.HashSet;
import java.util.Scanner;

public class FindUniqueElementInArray {



    public static void main(String[] args) {
        int arr [] = new int[11];
        int N = arr.length;
        System.out.println("Enter array elements having single unique and others are duplicated");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Unique element is: "+ new FindUniqueElementInArray().usingXOR(arr));

        System.out.println("Using hashSet Unique element is: "+ new FindUniqueElementInArray().usingHashSet(arr));

    }

    int usingXOR(int arr[]){
        int N = arr.length;
        int val = arr[0];

        for(int i=1; i<N; i++){
            val = (val ^ arr[i]);
        }

        return val;
    }

    int usingHashSet(int arr[]){
        HashSet<Integer>  hs = new HashSet<>();

        int N = arr.length;
        int ans = -1;

        for(int i = 0; i<N; i++){
           if(hs.contains(arr[i])){
                hs.remove(arr[i]);
            }else{
               hs.add(arr[i]);
           }
        }

        for(int i : hs){
            ans = i;
        }

        return ans;
    }
}
