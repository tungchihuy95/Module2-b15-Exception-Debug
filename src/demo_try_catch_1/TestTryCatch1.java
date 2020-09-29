package demo_try_catch_1;

public class TestTryCatch1 {
    public static void main(String [] args) {

        try {
            int data = 50 / 0; //nem ngoai le o day...
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("rest of the code....");
    }

}
