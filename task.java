import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total no. of students: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int total = 0;
        System.out.println("Enter marks of the students: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int lowest = Integer.MAX_VALUE, highest = Integer.MIN_VALUE;
        double average;
        // min
        for (int i = 1; i < n; i++) {
            if (lowest > a[i]) {
                lowest = a[i];

            }
        }
        System.out.println("lowest" + lowest);
        for (int i = 0; i < n; i++) {
            if (highest < a[i]) {
                highest = a[i];
            }
        }
        System.out.println("highest" + highest);
        // average
        for (int i = 0; i < n; i++) {
            total += a[i];

        }
        average = (total * 1.0) / n;
        System.out.println("average" + average);
    }
}