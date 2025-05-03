public class overload {
    public static void main(String[] args) {
        int num = 2;
        for (int i = 1; i <= 10; ++i) {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
        int num2 = 10;
        if (num2 % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
        int marks = 50;
        if (marks >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
    
}
