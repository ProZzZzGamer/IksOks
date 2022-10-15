import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        char[][] nizPolje = new char[3][3];
        String unosPolje = unos.nextLine();
        int z = 0;
        int x = 0;
        int y = 0;
        int l = 0;
        int m = 0;
        int k = 0;
        int a = 0;
        int s = 0;
        int r = 0;
        int z1 = 0;
        int x1 = 0;
        int y1 = 0;
        int l1 = 0;
        int m1 = 0;
        int k1 = 0;
        int a1 = 0;
        int s1 = 0;
        int r1 = 0;

        int c;
        for (c = 0; unosPolje.length() != 9; unosPolje = unos.nextLine()) {
            System.out.println("Unesi ponovo!");
        }

        int d;
        int e;
        for (d = 0; d < 9; ++d) {
            e = unosPolje.charAt(d);
            if (e != 'X' && e != 'O' && e != '_') {
                System.out.println("Igra nije validna (nisu unešeni validni karakteri 'X' 'O' '_')!");
                unosPolje = unos.nextLine();
                d = 0;
            }
        }

        for (d = 0; d < nizPolje.length; d++) {
            for (e = 0; e < nizPolje.length; e++) {
                nizPolje[d][e] = unosPolje.charAt(c);
                c++;
            }
        }

        for (char[] i : nizPolje) {
            for (char o : i) {
                System.out.print(o + " ");
            }
            System.out.print("\n");
        }

        for (d = 0; d < nizPolje.length; ++d) {
            for (e = 0; e < nizPolje.length; ++e) {
                if (d == e && nizPolje[d][e] == 'X') {
                    x++;
                    if (x == 3) {
                        y++;
                    }
                }

                if (nizPolje.length - 1 - d == e && nizPolje[d][e] == 'X') {
                    z++;
                    if (z == 3) {
                        y++;
                    }
                }

                if (e == 0 && nizPolje[d][e] == 'X') {
                    l++;
                    if (l == 3) {
                        y++;
                    }
                }

                if (e == 1 && nizPolje[d][e] == 'X') {
                    m++;
                    if (m == 3) {
                        y++;
                    }
                }

                if (e == 2 && nizPolje[d][e] == 'X') {
                    k++;
                    if (k == 3) {
                        y++;
                    }
                }

                if (d == 0 && nizPolje[d][e] == 'X') {
                    a++;
                    if (a == 3) {
                        y++;
                    }
                }

                if (d == 1 && nizPolje[d][e] == 'X') {
                    s++;
                    if (s == 3) {
                        y++;
                    }
                }
                if (d == 2 && nizPolje[d][e] == 'X') {
                    r++;
                    if (r == 3) {
                        y++;
                    }
                }

                if (d == e && nizPolje[d][e] == 'O') {
                    x1++;
                    if (x1 == 3) {
                        y1++;
                    }
                }

                if (nizPolje.length - 1 - d == e && nizPolje[d][e] == 'O') {
                    z1++;
                    if (z1 == 3) {
                        y1++;
                    }
                }

                if (e == 0 && nizPolje[d][e] == 'O') {
                    l1++;
                    if (l1 == 3) {
                        y1++;
                    }
                }

                if (e == 1 && nizPolje[d][e] == 'O') {
                    m1++;
                    if (m1 == 3) {
                        y1++;
                    }
                }

                if (e == 2 && nizPolje[d][e] == 'O') {
                    k1++;
                    if (k1 == 3) {
                        y1++;
                    }
                }

                if (d == 0 && nizPolje[d][e] == 'O') {
                    a1++;
                    if (a1 == 3) {
                        y1++;
                    }
                }

                if (d == 1 && nizPolje[d][e] == 'O') {
                    s1++;
                    if (s1 == 3) {
                        y1++;
                    }
                }
                if (d == 2 && nizPolje[d][e] == 'O') {
                    r1++;
                    if (r1 == 3) {
                        y1++;
                    }
                }
            }
        }

        if (y > 1 || y1 > 1) {
            System.out.println("Igra nije dobro postavljena.");
        }
        if (y == 1 && y1 == 1) {
            System.out.println("Igra nije dobro postavljena");
        }
        if (y == 1 && y1 == 0) {
            System.out.println("X je dobio");
        }
        if (y1 == 1 && y == 0) {
            System.out.println("O je dobio");
        }
        if (y == 0 && y1 == 0) {
            System.out.println("Nema pobjednika");
        }
    }
}