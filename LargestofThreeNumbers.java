import java.util.Scanner;

public class LargestofThreeNumbers {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the three numbers: ");
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();

      int ans1 = Math.max(a,b);
      int ans = Math.max(ans1,c);

      System.out.println(ans);
    }
}
