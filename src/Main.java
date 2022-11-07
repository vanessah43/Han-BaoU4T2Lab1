public class Main {
    public static void main(String[] args) {
        // 1 2 3 4 5 6 7 8 9 10
        for (int count = 0; count <= 10; count += 1) {
            System.out.print(count + " ");
        }
        System.out.println();
        for (int count = 0; count < 11; count += 1) {
            System.out.print(count + " ");
        }
        System.out.println();

        // 15 14 13 12 11 10 9 8 7 6  5 4 3 2 1
        for (int count = 15; count >= 0; count -= 1) {
            System.out.print(count + " ");
        }
        System.out.println();

        for (int count = 15; count > -1; count -= 1) {
            System.out.print(count + " ");
        }
        System.out.println();

        // 1 3 5 7 9 11 13 15
        for (int count = 1; count <= 15; count += 2) {
            System.out.print(count + " ");
        }
        System.out.println();

        for (int count = 1; count < 16; count += 2) {
            System.out.print(count + " ");
        }
        System.out.println();


        // 2a
        int i = 5;
        while (i < 10) {
            System.out.print(i + " ");
            i++;
        }

        //2b
        int i = 20;
        while (i >= 0) {
            System.out.print(i + " ");
            i -= 3;
        }

        //2c
        for (int i = -; i <= 100; i += 5) {
            System.out.print(i + " ");
        }

        //2d
        int j = 40;
        for (i = 1-; i <= j + 10; i += 5) {
            System.out.print(i + " ");
        }

        // 5
        for (int i = 4; i <= 11; i++) {
            System.out.println(i + " ");
        }
        for (int i = 4; i < 12; i++) {
            System.out.println(i + " ");
        }

        // 6
        for (int i = 0; i <= 100; i += 6) {
            System.out.println(i + " ");
        }
        for (int i = 0; i < 17; i++) {
            System.out.println(i * 6 + " ");
        }





    }
}
