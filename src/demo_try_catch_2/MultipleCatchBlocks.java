package demo_try_catch_2;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[5] = 30/0;

        }
         catch (ArithmeticException e) {
            System.out.println("Task 1 is completed!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Task 2 is completed!");
        }catch (Exception e) {
            System.out.println("Common tasks completed!");
        }
        System.out.println("rest of the code...");
    }

}
