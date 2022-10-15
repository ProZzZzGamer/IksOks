import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        char[][] nizPolje = new char[3][3];
        String unosPolje = unos.nextLine();

        int[] brojBodovaZaX = new int[8];
        int[] brojBodovaZaO = new int[8];
        int[] rezultatPartije = new int[2];

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
                    brojBodovaZaX[0]++;
                    if (brojBodovaZaX[0] == 3) {
                        rezultatPartije[0]++;
                    }
                }

                // obrnuto dijagonala
                if (nizPolje.length - 1 - d == e && nizPolje[d][e] == 'X') {
                    brojBodovaZaX[1]++;
                    if (brojBodovaZaX[1] == 3) {
                        rezultatPartije[0]++;
                    }
                }

                // vertikalno
                if (e == 0 && nizPolje[d][e] == 'X') {
                    brojBodovaZaX[2]++;
                    if (brojBodovaZaX[2] == 3) {
                        rezultatPartije[0]++;
                    }
                }

                if (e == 1 && nizPolje[d][e] == 'X') {
                    brojBodovaZaX[3]++;
                    if (brojBodovaZaX[3] == 3) {
                        rezultatPartije[0]++;
                    }
                }

                if (e == 2 && nizPolje[d][e] == 'X') {
                    brojBodovaZaX[4]++;
                    if (brojBodovaZaX[4] == 3) {
                        rezultatPartije[1]++;
                    }
                }

                // horizontalno
                if (d == 0 && nizPolje[d][e] == 'X') {
                   brojBodovaZaX[5]++;
                    if (brojBodovaZaX[5] == 3) {
                        rezultatPartije[0]++;
                    }
                }

                if (d == 1 && nizPolje[d][e] == 'X') {
                    brojBodovaZaX[6]++;
                    if (brojBodovaZaX[6] == 3) {
                        rezultatPartije[0]++;
                    }
                }

                if (d == 2 && nizPolje[d][e] == 'X') {
                    brojBodovaZaX[7]++;
                    if (brojBodovaZaX[7] == 3) {
                        rezultatPartije[0]++;
                    }
                }

                // dijagonala
                if (d == e && nizPolje[d][e] == 'O') {
                    brojBodovaZaO[0]++;
                    if (brojBodovaZaO[0] == 3) {
                        rezultatPartije[1]++;
                    }
                }

                // obrnuta dijagonala
                if (nizPolje.length - 1 - d == e && nizPolje[d][e] == 'O') {
                    brojBodovaZaO[1]++;
                    if (brojBodovaZaO[1] == 3) {
                        rezultatPartije[1]++;
                    }
                }

                // vertikalno
                if (e == 0 && nizPolje[d][e] == 'O') {
                    brojBodovaZaO[2]++;
                    if (brojBodovaZaO[2] == 3) {
                        rezultatPartije[1]++;
                    }
                }

                if (e == 1 && nizPolje[d][e] == 'O') {
                    brojBodovaZaO[3]++;
                    if (brojBodovaZaO[3] == 3) {
                        rezultatPartije[1]++;
                    }
                }

                if (e == 2 && nizPolje[d][e] == 'O') {
                    brojBodovaZaO[4]++;
                    if (brojBodovaZaO[4] == 3) {
                        rezultatPartije[1]++;
                    }
                }

                // horizontalno
                if (d == 0 && nizPolje[d][e] == 'O') {
                    brojBodovaZaO[5]++;
                    if (brojBodovaZaO[5] == 3) {
                        rezultatPartije[1]++;
                    }
                }

                if (d == 1 && nizPolje[d][e] == 'O') {
                    brojBodovaZaO[6]++;
                    if (brojBodovaZaO[6] == 3) {
                        rezultatPartije[1]++;
                    }
                }

                if (d == 2 && nizPolje[d][e] == 'O') {
                    brojBodovaZaO[7]++;
                    if (brojBodovaZaO[7] == 3) {
                        rezultatPartije[1]++;
                    }
                }
            }
        }

        if (rezultatPartije[0] > 1 || rezultatPartije[1] > 1) {
            System.out.println("Igra nije dobro postavljena.");
        } else if (rezultatPartije[0] == 1 && rezultatPartije[1] == 1) {
            System.out.println("Igra nije dobro postavljena");
        } else if (rezultatPartije[0] == 1 && rezultatPartije[1] == 0) {
            System.out.println("X je dobio");
        } else if (rezultatPartije[1] == 1 && rezultatPartije[0] == 0) {
            System.out.println("O je dobio");
        } else if (rezultatPartije[0] == 0 && rezultatPartije[1] == 0) {
            System.out.println("Nema pobjednika");
        }
    }
}