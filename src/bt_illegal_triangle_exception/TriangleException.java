package bt_illegal_triangle_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleException {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap a: ");
            double a = scanner.nextDouble();
            System.out.println("Nhap b: ");
            double b = scanner.nextDouble();
            System.out.println("Nhap c: ");
            double c = scanner.nextDouble();
            if ((a < 0) || (b < 0) || (c < 0) || ((a + b) <= c) || ((a + c) <= b) || ((c + b) <= a)) {
                throw new ArithmeticException();
            } else
                System.out.println("La tam giac");
        } catch (InputMismatchException e) {
            System.out.println("Khong dung kieu du lieu!");
        } catch (ArithmeticException e) {
            System.out.println("Khong phai la tam giac!");
        }


    }



}
