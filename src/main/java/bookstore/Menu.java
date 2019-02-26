package bookstore;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        int option;
        do {
            showMenu();
            option = chooseOption();
            menu(option);
        }
        while (option != 2);

    }

    public static void menu(int option) {
        switch (option) {
            case 1:
                System.out.println("E-Mail: kontakt@kięgarnia.com");
                break;
            case 2:
                System.out.println("Goodbye");
                break;
            case 3:
                System.out.println("Złe polecenie");
                break;
        }
    }


    public static int chooseOption() {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        return input;
    }

    public static void showMenu() {
        System.out.println("Wciśnij 1 aby pokazać kontakt do księgarni");
        System.out.println("Wciśnij 2 aby wyjść z programu");
    }
}
