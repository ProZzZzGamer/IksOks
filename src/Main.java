import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        char[][] nizPolje = new char[3][3];
        String unosPolje = unos.nextLine();

        int brojacDijagonalaX = 0;
        int brojacObrnutaDijagonalaX = 0;

        int brojacVertikalnoX1 = 0;
        int brojacVertikalnoX2 = 0;
        int brojacVertikalnoX3 = 0;

        int brojacHorizontalnoX1 = 0;
        int brojacHorizontalnoX2 = 0;
        int brojacHorizontalnoX3 = 0;

        int bodoviX = 0;

        int brojacDijagonalaO = 0;
        int brojacObrnutaDijagonalaO = 0;

        int brojacVertikalnoO1 = 0;
        int brojacVertikalnoO2 = 0;
        int brojacVertikalnoO3 = 0;

        int brojacHorizontalnoO1 = 0;
        int brojacHorizontalnoO2 = 0;
        int brojacHorizontalnoO3 = 0;

        int bodoviO = 0;

        while (unosPolje.length() != 9) {
            System.out.println("Unesi ponovo!");
            unosPolje = unos.nextLine();
        }

        for (int d = 0; d < 9; ++d) {
            char karakter = unosPolje.charAt(d);
            if (karakter != 'X' && karakter != 'O' && karakter != '_') {
                System.out.println("Igra nije validna (nisu unešeni validni karakteri 'X' 'O' '_')!");
                unosPolje = unos.nextLine();
            }
        }

        int index = 0;
        for (int d = 0; d < nizPolje.length; d++) {
            for (int e = 0; e < nizPolje.length; e++) {
                nizPolje[d][e] = unosPolje.charAt(index);
                index++;
            }
        }

        for (char[] i : nizPolje) {
            for (char o : i) {
                System.out.print(o + " ");
            }
            System.out.print("\n");
        }

        for (int d = 0; d < nizPolje.length; ++d) {
            for (int e = 0; e < nizPolje.length; ++e) {
                // dijagonala
                if (d == e && nizPolje[d][e] == 'X') {
                    brojacDijagonalaX++;
                    if (brojacDijagonalaX == 3) {
                        bodoviX++;
                    }
                }

                // obrnuto dijagonala
                if (nizPolje.length - 1 - d == e && nizPolje[d][e] == 'X') {
                    brojacObrnutaDijagonalaX++;
                    if (brojacObrnutaDijagonalaX == 3) {
                        bodoviX++;
                    }
                }

                // vertikalno
                if (e == 0 && nizPolje[d][e] == 'X') {
                    brojacVertikalnoX1++;
                    if (brojacVertikalnoX1 == 3) {
                        bodoviX++;
                    }
                }

                if (e == 1 && nizPolje[d][e] == 'X') {
                    brojacVertikalnoX2++;
                    if (brojacVertikalnoX2 == 3) {
                        bodoviX++;
                    }
                }

                if (e == 2 && nizPolje[d][e] == 'X') {
                    brojacVertikalnoX3++;
                    if (brojacVertikalnoX3 == 3) {
                        bodoviX++;
                    }
                }

                // horizontalno
                if (d == 0 && nizPolje[d][e] == 'X') {
                    brojacHorizontalnoX1++;
                    if (brojacHorizontalnoX1 == 3) {
                        bodoviX++;
                    }
                }

                if (d == 1 && nizPolje[d][e] == 'X') {
                    brojacHorizontalnoX2++;
                    if (brojacHorizontalnoX2 == 3) {
                        bodoviX++;
                    }
                }

                if (d == 2 && nizPolje[d][e] == 'X') {
                    brojacHorizontalnoX3++;
                    if (brojacHorizontalnoX3 == 3) {
                        bodoviX++;
                    }
                }

                // dijagonala
                if (d == e && nizPolje[d][e] == 'O') {
                    brojacDijagonalaO++;
                    if (brojacDijagonalaO == 3) {
                        bodoviO++;
                    }
                }

                // obrnuta dijagonala
                if (nizPolje.length - 1 - d == e && nizPolje[d][e] == 'O') {
                    brojacObrnutaDijagonalaO++;
                    if (brojacObrnutaDijagonalaO == 3) {
                        bodoviO++;
                    }
                }

                // vertikalno
                if (e == 0 && nizPolje[d][e] == 'O') {
                    brojacVertikalnoO1++;
                    if (brojacVertikalnoO1 == 3) {
                        bodoviO++;
                    }
                }

                if (e == 1 && nizPolje[d][e] == 'O') {
                    brojacVertikalnoO2++;
                    if (brojacVertikalnoO2 == 3) {
                        bodoviO++;
                    }
                }

                if (e == 2 && nizPolje[d][e] == 'O') {
                    brojacVertikalnoO3++;
                    if (brojacVertikalnoO3 == 3) {
                        bodoviO++;
                    }
                }

                // horizontalno
                if (d == 0 && nizPolje[d][e] == 'O') {
                    brojacHorizontalnoO1++;
                    if (brojacHorizontalnoO1 == 3) {
                        bodoviO++;
                    }
                }

                if (d == 1 && nizPolje[d][e] == 'O') {
                    brojacHorizontalnoO2++;
                    if (brojacHorizontalnoO2 == 3) {
                        bodoviO++;
                    }
                }

                if (d == 2 && nizPolje[d][e] == 'O') {
                    brojacHorizontalnoO3++;
                    if (brojacHorizontalnoO3 == 3) {
                        bodoviO++;
                    }
                }
            }
        }

        if (bodoviX > 1 || bodoviO > 1) {
            System.out.println("Igra nije dobro postavljena.");
        } else if (bodoviX == 1 && bodoviO == 1) {
            System.out.println("Igra nije dobro postavljena");
        } else if (bodoviX == 1 && bodoviO == 0) {
            System.out.println("X je dobio");
        } else if (bodoviO == 1 && bodoviX == 0) {
            System.out.println("O je dobio");
        } else if (bodoviX == 0 && bodoviO == 0) {
            System.out.println("Nema pobjednika");
        }
    }
}