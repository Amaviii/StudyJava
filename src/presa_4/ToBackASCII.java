//package presa_4;
//
//import java.util.Scanner;
//
//public class ToBackASCII {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("1. Текст → presa_4.ASCII коды");
//        System.out.println("2. presa_4.ASCII коды → Текст");
//        System.out.print("Выберите режим: ");
//        int mode = scanner.nextInt();
//        scanner.nextLine(); // Очистка буфера
//
//        if (mode == 1) {
//            System.out.print("Введите текст: ");
//            String text = scanner.nextLine();
//            String asciiCodes = textToAscii(text);
//            System.out.println("presa_4.ASCII коды: " + asciiCodes);
//        } else if (mode == 2) {
//            System.out.print("Введите presa_4.ASCII коды (через пробелы): ");
//            String codes = scanner.nextLine();
//            String text = asciiToText(codes);
//            System.out.println("Текст: " + text);
//        } else {
//            System.out.println("Неверный режим");
//        }
//
//        scanner.close();
//    }
//
//    // Метод для преобразования текста в presa_4.ASCII-коды
//    public static String textToAscii(String text) {
//        StringBuilder result = new StringBuilder();
//        for (int i = 0; i < text.length(); i++) {
//            int code = (int) text.charAt(i);
//            result.append(code);
//            if (i < text.length() - 1) {
//                result.append(" ");
//            }
//        }
//        return result.toString();
//    }
//
//    // Метод для преобразования presa_4.ASCII-кодов в текст
//    public static String asciiToText(String codes) {
//        StringBuilder result = new StringBuilder();
//        String[] codeArray = codes.split(" ");
//
//        for (String codeStr : codeArray) {
//            try {
//                int code = Integer.parseInt(codeStr);
//                result.append((char) code);
//            } catch (NumberFormatException e) {
//                System.out.println("Ошибка: неверный код - " + codeStr);
//            }
//        }
//
//        return result.toString();
//    }
//}
