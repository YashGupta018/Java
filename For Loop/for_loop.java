public class for_loop {
    public static void main (String[]args) {

        System.out.println("For Loop in Java");
        System.out.println();
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }

        System.out.println();
        for (int k = 0; k < 5; k++) {
            for (int l = 5 - k; l > 1; l--) {
                System.out.print(" ");
            }
            for (int m = 0; m <= k; m++ ) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println();
        for (int a = 0; a < 5; a++) {
            for (int b = 2 * (5 - a); b >= 0; b--) {
                System.out.print(" ");
            }
            for (int c = 0; c <= a; c++ ) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        for (int d = 5 - 1; d >= 0 ; d--) {
            for (int e = 0; e <= d; e++) {
                System.out.print("*" + " ");
            }
            System.out.println();

        }

        System.out.println();
        for (int f = 0; f <= 5 - 1; f++) {
            for (int g = 0; g <= f; g++) {
                System.out.print(" ");
            }
            for (int h = 0; h <= 5 - 1 - f; h++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        System.out.println();
        for (int n = 0; n <= 5 - 1; n++) {
            for (int o = 0; o <= n; o++) {
                System.out.print("*"+ " ");
            }
            System.out.println("");
        }
        for (int n = 5 - 1; n >= 0; n--) {
            for(int o = 0; o <= n - 1; o++) {
                System.out.print("*"+ " ");
            }
            System.out.println("");
        }

        System.out.println();
        for (int p = 1; p <= 5 ; p++) {
            for (int q = p; q < 5 ; q++) {
                System.out.print(" ");
            }
            for (int r = 1; r <= (2 * p - 1); r++) {
                if(r == 1 || p == 5 || r == (2 * p - 1)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

        System.out.println();
        for (int s = 5; s >= 1 ; s--) {
            for (int t = s; t < 5 ; t++) {
                System.out.print(" ");
            }
            for (int u = 1; u <= (2 * s - 1) ; u++) {
                if( u == 1 || s == 5 || u == (2 * s - 1)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
