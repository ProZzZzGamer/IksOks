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

        String dzajinaMreza = mreza.substring(0,3);
        String hazimovaMreza = mreza.substring(3, 6);
        String mamarinaMreza = mreza.substring(6, 9);

        System.out.println("-------");
        System.out.println("| " + dzajinaMreza + " |");
        System.out.println("| " + hazimovaMreza + " |");
        System.out.println("| " + mamarinaMreza + " |");
        System.out.println("-------");
    }
}