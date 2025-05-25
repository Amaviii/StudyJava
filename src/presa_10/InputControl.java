package presa_10;

import java.util.Scanner;

class InvalidCommandException extends Exception {
    InvalidCommandException(String message) {
        super(message);
    }
}

public class InputControl {
     static void tryInput(String command) throws InvalidCommandException {
        if (!command.equals("ADD") && !command.equals("REMOVE") && !command.equals("EXIT")) {
            throw new InvalidCommandException("Не подходящая команда");
        }
        System.out.println("Корректная команда");
    }

    public static void main(String[] args) {
        System.out.println("Напишите команду из списка: ADD / REMOVE / EXIT");
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        try {
            tryInput(command);
        } catch (InvalidCommandException e) {
            System.out.println("Перехвачено исключение " + e);
        }
    }
}
