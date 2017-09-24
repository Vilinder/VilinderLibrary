package priv.vilinder.util.test;

import java.math.BigDecimal;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] str = in.nextLine().split(" ");
        BigDecimal R = new BigDecimal(str[0]);
        BigDecimal n = new BigDecimal(str[1]);

        BigDecimal result = new BigDecimal("1");

        for (int i = 0; i < n.intValue(); i++) {
            result = result.multiply(R);
        }
        System.out.println(result.doubleValue());
    }
}