package demo_khoi_finally;

public class TestFinallyBlock {
    public static void main(String[] args) {
        try {
            int data2 = 30;
            if (data2 % 2 == 0) {
                System.out.println(data2);

            }
            return;
        } catch (NullPointerException e) {
            System.out.println(e);
        }  finally {
            System.out.println("Finally block is always executed");
        }
        System.out.println("rest of the code...");
    }
}
