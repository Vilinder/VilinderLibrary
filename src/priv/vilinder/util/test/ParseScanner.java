package priv.vilinder.util.test;

import java.util.ArrayList;
import java.util.Scanner;

public class ParseScanner {
    private static Scanner sc = new Scanner(System.in);

    public static int[] getInts() {
        ArrayList<Integer> al = new ArrayList<Integer>();
        while (sc.hasNext()) {
            al.add(sc.nextInt());
        }
        int[] arr = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            arr[i] = al.get(i);
        }
        return arr;
    }

    public static void main(String[] args){

        System.out.print(getInts());
    }
}
