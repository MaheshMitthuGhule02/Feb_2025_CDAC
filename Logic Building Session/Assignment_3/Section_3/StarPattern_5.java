/* Write a program to print reverse equilateral triangle the following pattern: */

class StarPattern_5{
    public static void main(String[] args) {
        int n = 5;
        int num = (n * (n + 1)) / 2;

        for (int i = n; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
                num--;
            }

            System.out.println();
        }
    }
}
