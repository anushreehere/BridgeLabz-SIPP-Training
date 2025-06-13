package day2;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String from = sc.nextLine();
        String via = sc.nextLine();
        String to = sc.nextLine();
        int fromToVia = sc.nextInt();
        int viaToFinal = sc.nextInt();
        int time1 = sc.nextInt();
        int time2 = sc.nextInt();
        int totalDistance = fromToVia + viaToFinal;
        int totalTime = time1 + time2;
        System.out.println("The Total Distance travelled by " + name + " from " + from + " to " + to + " via " + via + " is " + totalDistance + " km and the Total Time taken is " + totalTime + " minutes");
    }
}
