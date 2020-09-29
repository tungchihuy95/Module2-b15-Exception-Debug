package demo_throw_1;

public class TestThrow {
    static void validate(int age) {
        try {
            if (age < 18) {
                throw new ArithmeticException("Not validate");
            }else
                System.out.println("welcome!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        validate(15);
        System.out.println("rest of the code...");
    }
}
