public class z_pattern1 {
    public static void main(String[] args) {
        int n = 5;
        pattern5(n);
    }
    static void pattern6(int n) {
        for (int rows = 1; rows <= n; rows++) {
            for (int col = 1; col <= rows; col++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }



    static void pattern5(int n) {

        for (int rows = 1; rows <= n; rows++) {
            for (int col = 1; col <= rows; col++) {
                System.out.print("*");
            }
            System.out.println();

        }
        int red=4;
        for (int rows = 1; rows <= n; rows++) {
            for (int col = 1; col <= red; col++) {
                System.out.print("*");
            }
            System.out.println();
            red--;
        }
    }




    static void pattern4(int n) {

        for (int rows = 1; rows <= n; rows++) {
            for (int col = 1; col <= rows; col++) {
                System.out.print(col);
            }
            System.out.println();

        }
    }

    static void pattern3(int n) {
        int red = 5;
        for (int rows = 1; rows <= n; rows++) {

            for (int col = 1; col <= red; col++) {
                System.out.print("*");
            }
            System.out.println();
            red--;

        }
    }

//    static void pattern2(int n ){
//        for (int rows =1 ; rows <=n ; rows++) {
//            for (int col=1; col<=4;col++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

//   static void pattern1(int n) {
//       for (int rows =1;rows <=n ; rows++) {
//            for (int col = 1; col <= rows ; col++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}
}