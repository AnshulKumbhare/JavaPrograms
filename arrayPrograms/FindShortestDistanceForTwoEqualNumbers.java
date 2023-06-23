package arrayPrograms;

import java.util.ArrayList;
import java.util.HashMap;
/**
 * Problem Statement: We have an integer array, where numbers are repeating,
 * we need to find a such a pair of number, whose difference between index is minimum
 * if we found such pairs then return a that value of a pair which has minimum distance
 * else if we don't found any pair return -1
 *  Ex:
 *  1. arr = [1,2,3,4,1,5,2,3,4,4]
 *
 *  Ans here is : 1, as one 4 is at index 8 and another is at 9, hence 9-8 = 1
 *
 *  2: arr = [1,2,3,4]
 *
 *  Ans: -1, as no pair exist
 * */
public class FindShortestDistanceForTwoEqualNumbers {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(1);arr.add(5);arr.add(2);arr.add(3);arr.add(4);arr.add(4);
        arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(1);arr.add(5);arr.add(2);arr.add(3);arr.add(4);arr.add(4);
        arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(1);arr.add(5);arr.add(2);arr.add(3);arr.add(4);arr.add(4);
        arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(1);arr.add(5);arr.add(2);arr.add(3);arr.add(4);arr.add(4);
        arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(1);arr.add(5);arr.add(2);arr.add(3);arr.add(4);arr.add(4);arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(1);arr.add(5);arr.add(2);arr.add(3);arr.add(4);arr.add(4);
        arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(1);arr.add(5);arr.add(2);arr.add(3);arr.add(4);arr.add(4);
        arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(1);arr.add(5);arr.add(2);arr.add(3);arr.add(4);arr.add(4);
        arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(1);arr.add(5);arr.add(2);arr.add(3);arr.add(4);arr.add(4);
        arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(1);arr.add(5);arr.add(2);arr.add(3);arr.add(4);arr.add(4);
        arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(1);arr.add(5);arr.add(2);arr.add(3);arr.add(4);arr.add(4);arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(1);arr.add(5);arr.add(2);arr.add(3);arr.add(4);arr.add(4);
        arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(1);arr.add(5);arr.add(2);arr.add(3);arr.add(4);arr.add(4);
        arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(1);arr.add(5);arr.add(2);arr.add(3);arr.add(4);arr.add(4);
        arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(1);arr.add(5);arr.add(2);arr.add(3);arr.add(4);arr.add(4);arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(1);arr.add(5);arr.add(2);arr.add(3);arr.add(4);arr.add(4);arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(1);arr.add(5);arr.add(2);arr.add(3);arr.add(4);arr.add(4);arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(1);arr.add(5);arr.add(2);arr.add(3);arr.add(4);arr.add(4);
        arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(1);arr.add(5);arr.add(2);arr.add(3);arr.add(4);arr.add(4);
        arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(1);arr.add(5);arr.add(2);arr.add(3);arr.add(4);arr.add(4);
        arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(1);arr.add(5);arr.add(2);arr.add(3);arr.add(4);arr.add(4);
        arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(1);arr.add(5);arr.add(2);arr.add(3);arr.add(4);arr.add(4);
        arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(1);arr.add(5);arr.add(2);arr.add(3);arr.add(4);arr.add(4);
        arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(1);arr.add(5);arr.add(2);arr.add(3);arr.add(4);arr.add(4);
        arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(1);arr.add(5);arr.add(2);arr.add(3);arr.add(4);arr.add(4);
        arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(1);arr.add(5);arr.add(2);arr.add(3);arr.add(4);arr.add(4);arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(1);arr.add(5);arr.add(2);arr.add(3);arr.add(4);arr.add(4);
        arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(1);arr.add(5);arr.add(2);arr.add(3);arr.add(4);arr.add(4);
        arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(1);arr.add(5);arr.add(2);arr.add(3);arr.add(4);arr.add(4);
        arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(1);arr.add(5);arr.add(2);arr.add(3);arr.add(4);arr.add(4);
        arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(1);arr.add(5);arr.add(2);arr.add(3);arr.add(4);arr.add(4);
        arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(1);arr.add(5);arr.add(2);arr.add(3);arr.add(4);arr.add(4);arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(1);arr.add(5);arr.add(2);arr.add(3);arr.add(4);arr.add(4);
        arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(1);arr.add(5);arr.add(2);arr.add(3);arr.add(4);arr.add(4);
        arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(1);arr.add(5);arr.add(2);arr.add(3);arr.add(4);arr.add(4);
        arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(1);arr.add(5);arr.add(2);arr.add(3);arr.add(4);arr.add(4);arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(1);arr.add(5);arr.add(2);arr.add(3);arr.add(4);arr.add(4);arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(1);arr.add(5);arr.add(2);arr.add(3);arr.add(4);arr.add(4);arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(1);arr.add(5);arr.add(2);arr.add(3);arr.add(4);arr.add(4);
        arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(1);arr.add(5);arr.add(2);arr.add(3);arr.add(4);arr.add(4);
        arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(1);arr.add(5);arr.add(2);arr.add(3);arr.add(4);arr.add(4);
        arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(1);arr.add(5);arr.add(2);arr.add(3);arr.add(4);arr.add(4);


        long start1 = System.nanoTime();
        System.out.println(new FindShortestDistanceForTwoEqualNumbers().bestSolution(arr));
        long end1 = System.nanoTime();
        System.out.println("Meg used="+(Runtime.getRuntime().totalMemory()-
                Runtime.getRuntime().freeMemory()));
        System.gc();
        System.out.println("Time Taken: "+(end1-start1));
        long start2 = System.nanoTime();
        System.out.println(new FindShortestDistanceForTwoEqualNumbers().basicApproach(arr));
        long end2 = System.nanoTime();
        System.out.println("Meg used="+(Runtime.getRuntime().totalMemory()-
                Runtime.getRuntime().freeMemory()));
        System.out.println("Time Taken: "+(end2-start2));

    }

    /**
     * TC:  O(N)  and SC: O(N)
     * */
    int bestSolution(ArrayList<Integer> A){
        HashMap<Integer, Integer> hm = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int N = A.size();
        boolean flag = false;

        for(int i = 0; i<N; i++){
            if(hm.containsKey(A.get(i))){
                int val = hm.get(A.get(i));
                flag = true;
                min = Math.min(min, i - val);
            }
            hm.put(A.get(i), i);

        }

        if(flag){
            return min;
        }

        return -1;
    }

    /**
     * TC:  O(N^2)  and SC: arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr O(1)
     *
     * ArrayList<Integer> A = new ArrayList<>();
     *
     * int arr[] = {1,2,3,4}
     * */
    int basicApproach(ArrayList<Integer> A){
        int N = A.size();
        int min = Integer.MAX_VALUE;
        boolean flag = false;

        for(int i=0; i<N-1; i++){
            for(int j = i+1; j<N; j++){
                if(A.get(i) == A.get(j)){
                    flag = true;
                    min = Math.min(min, (j-i));
                }
            }
        }

        if(flag){
            return min;
        }

        return -1;
    }
}
