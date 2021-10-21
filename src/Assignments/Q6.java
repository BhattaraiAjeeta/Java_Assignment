package Assignments;

public class Q6 {
    public static void main(String[] args) {
        {
            System.out.println("The even Numbers are:");
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 1)
                continue;
            System.out.println(i);
        }

        }

        {
            System.out.println("The odd Numbers are:");
            for (int i = 0; i <= 100; i++) {
                if (i % 2 == 0)
                    continue;
                System.out.println(i);
            }

        }
    }
}
