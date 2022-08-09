package iksoks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        String mreza = unos.next();
        int index = 0;
        char mreza2;

        while (index < 9) {
            mreza2 = mreza.charAt(index);
            if (!(mreza2 == 'X' || mreza2 == 'O' || mreza2 == '_') || mreza.length() != 9) {
                System.out.println("Hazim kae ponovo");
                mreza = unos.next();
                index = 0;
            }
            index++;
        }

        System.out.println("---------");
        System.out.println("| " + mreza.charAt(0) + " " + mreza.charAt(1) + " " + mreza.charAt(2) + " |");
        System.out.println("| " + mreza.charAt(3) + " " + mreza.charAt(4) + " " + mreza.charAt(5) + " |");
        System.out.println("| " + mreza.charAt(6) + " " + mreza.charAt(7) + " " + mreza.charAt(8) + " |");
        System.out.println("---------");
    }
}
