import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);

        char[][] nizPolje = new char[3][3];

        int brojPraznihPolja = 9;
        for (int i = 0; i < 3; i++) {
            for (int o = 0; o < 3; o++) {
                nizPolje[i][o] = '_';
            }
        }

        System.out.println("XO polje");
        for (char[] i : nizPolje) {
            for (char o : i) {
                System.out.print(o + " ");
            }
            System.out.print("\n");
        }

        int[] brojBodovaZaX = new int[8];
        int[] rezultatPartije = new int[3];

        while (brojPraznihPolja > 0) {

            System.out.println("Neka prvi igrač unese 'X'.");
            while (!unos.hasNextInt()) {
                String input = unos.next();
                System.out.println("\"" + input + "\" nije validan broj.");
            }

            int uspravnoX = unos.nextInt();
            int vodoranvoX = unos.nextInt();

            while (uspravnoX > 3 || vodoranvoX > 3 || nizPolje[uspravnoX - 1][vodoranvoX - 1] == 'X' || nizPolje[uspravnoX - 1][vodoranvoX - 1] == 'O') {
                System.out.println("Potez nije validan, unesi ponovo: ");
                uspravnoX = unos.nextInt();
                vodoranvoX = unos.nextInt();
            }
            nizPolje[uspravnoX - 1][vodoranvoX - 1] = 'X';

            // dijagonala
            if (uspravnoX == vodoranvoX && nizPolje[uspravnoX - 1][vodoranvoX - 1] == 'X') {
                brojBodovaZaX[0]++;
                if (brojBodovaZaX[0] == 3) {
                    rezultatPartije[0]++;
                }
            }
            // obrnuta dijagonala
            if (nizPolje.length - 1 - (uspravnoX - 1) == vodoranvoX - 1 && nizPolje[uspravnoX - 1][vodoranvoX - 1] == 'X') {
                brojBodovaZaX[1]++;
                if (brojBodovaZaX[1] == 3) {
                    rezultatPartije[0]++;
                }
            }
            // vertikalno
            if (vodoranvoX - 1 == 0 && nizPolje[uspravnoX - 1][vodoranvoX - 1] == 'X') {
                brojBodovaZaX[2]++;
                if (brojBodovaZaX[2] == 3) {
                    rezultatPartije[0]++;
                }
            }

            if (vodoranvoX - 1 == 1 && nizPolje[uspravnoX - 1][vodoranvoX - 1] == 'X') {
                brojBodovaZaX[3]++;
                if (brojBodovaZaX[3] == 3) {
                    rezultatPartije[0]++;
                }
            }

            if (vodoranvoX - 1 == 2 && nizPolje[uspravnoX - 1][vodoranvoX - 1] == 'X') {
                brojBodovaZaX[4]++;
                if (brojBodovaZaX[4] == 3) {
                    rezultatPartije[0]++;
                }
            }

            //horizontalno
            if (uspravnoX - 1 == 0 && nizPolje[uspravnoX - 1][vodoranvoX - 1] == 'X') {
                brojBodovaZaX[5]++;
                if (brojBodovaZaX[5] == 3) {
                    rezultatPartije[0]++;
                }
            }

            if (uspravnoX - 1 == 1 && nizPolje[uspravnoX - 1][vodoranvoX - 1] == 'X') {
                brojBodovaZaX[6]++;
                if (brojBodovaZaX[6] == 3) {
                    rezultatPartije[0]++;
                }
            }

            if (uspravnoX - 1 == 2 && nizPolje[uspravnoX - 1][vodoranvoX - 1] == 'X') {
                brojBodovaZaX[7]++;
                if (brojBodovaZaX[7] == 3) {
                    rezultatPartije[0]++;
                }
            }

            if (rezultatPartije[0] == 1 && rezultatPartije[1] == 0) {
                System.out.println("'X' je pobjedio.");
                break;
            }

            System.out.println("XO polje");
            for (char[] i : nizPolje) {
                for (char o : i) {
                    System.out.print(o + " ");
                }
                System.out.print("\n");
            }

            System.out.println("Neka drugi igrač unese 'O'.");

            int uspravnoO = unos.nextInt();
            int vodoranvoO = unos.nextInt();
            while (uspravnoO > 3 || vodoranvoO > 3 || nizPolje[uspravnoO - 1][vodoranvoO - 1] == 'X' || nizPolje[uspravnoO - 1][vodoranvoO - 1] == 'O') {
                System.out.println("Potez nije validan, unesi ponovo: ");
                uspravnoO = unos.nextInt();
                vodoranvoO = unos.nextInt();
            }

            nizPolje[uspravnoO - 1][vodoranvoO - 1] = 'O';

            // dijagonala
            if (uspravnoO == vodoranvoO && nizPolje[uspravnoO - 1][vodoranvoO - 1] == 'X') {
                brojBodovaZaX[0]++;
                if (brojBodovaZaX[0] == 3) {
                    rezultatPartije[1]++;
                }
            }
            // obrnuta dijagonala
            if (nizPolje.length - 1 - (uspravnoO - 1) == vodoranvoO - 1 && nizPolje[uspravnoO - 1][vodoranvoO - 1] == 'X') {
                brojBodovaZaX[1]++;
                if (brojBodovaZaX[2] == 3) {
                    rezultatPartije[1]++;
                }
            }
            // vertikalno
            if (vodoranvoO - 1 == 0 && nizPolje[uspravnoO - 1][vodoranvoO - 1] == 'X') {
                brojBodovaZaX[2]++;
                if (brojBodovaZaX[2] == 3) {
                    rezultatPartije[1]++;
                }
            }

            if (vodoranvoO - 1 == 1 && nizPolje[uspravnoO - 1][vodoranvoO - 1] == 'X') {
                brojBodovaZaX[3]++;
                if (brojBodovaZaX[3] == 3) {
                    rezultatPartije[1]++;
                }
            }

            if (vodoranvoO - 1 == 2 && nizPolje[uspravnoO - 1][vodoranvoO - 1] == 'X') {
                brojBodovaZaX[4]++;
                if (brojBodovaZaX[4] == 3) {
                    rezultatPartije[1]++;
                }
            }

            //horizontalno
            if (uspravnoO - 1 == 0 && nizPolje[uspravnoO - 1][vodoranvoO - 1] == 'X') {
                brojBodovaZaX[5]++;
                if (brojBodovaZaX[5] == 3) {
                    rezultatPartije[1]++;
                }
            }

            if (uspravnoO - 1 == 1 && nizPolje[uspravnoO - 1][vodoranvoO - 1] == 'X') {
                brojBodovaZaX[6]++;
                if (brojBodovaZaX[6] == 3) {
                    rezultatPartije[1]++;
                }
            }

            if (uspravnoO - 1 == 2 && nizPolje[uspravnoO - 1][vodoranvoO - 1] == 'X') {
                brojBodovaZaX[7]++;
                if (brojBodovaZaX[7] == 3) {
                    rezultatPartije[1]++;
                }
            }

            for (char[] i : nizPolje) {
                for (char o : i) {
                    System.out.print(o + " ");
                }
                System.out.print("\n");
            }

            if (rezultatPartije[1] == 1 && rezultatPartije[0] == 0) {
                System.out.println("'O' je pobjedio.");
                break;
            }
            brojPraznihPolja--;
            if (brojPraznihPolja == 0 && rezultatPartije[1] == 0 && rezultatPartije[0] == 0) {
                System.out.println("Nema pobjednika");
                break;
            }
        }
    }
}
