package client;

import client.entity.Role;
import client.entity.Student;

import java.util.Scanner;

public class Main {
    private static final Presenter presenter = new Presenter();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" 1 - Connect\n 2 - ");
        System.out.println("Please enter of operation: ");
        switch (in.nextInt()) {
            case 1:
                presenter.connect("damidav", "225");
                break;
            case 2:
                presenter.create(new Student("Damiano", "David", "08/01/1999", 151211, 223, Role.USER));
                break;
            case 3:
                presenter.read(1445);
                break;
            case 4:
                presenter.update(new Student("Damiano", "David", "08/01/1999", 151211, 223, Role.USER));
                break;
            default:
                System.out.println("Incorrect input");
                break;
        }
    }
}
