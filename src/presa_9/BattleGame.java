package presa_9;

import java.util.Random;
import java.util.Scanner;

abstract class Character {
    protected String name;
    protected String className;
    protected int health;
    protected Weapon weapon;
    protected Armor armor;


    // Конструктор класса
    public Character(String name) {
        this.name = name;
    }

    // Геттер для получения имени
    public String getName() {
        return name;
    }

    // Геттер для получения класса
    public String getClassName() {
        return className;
    }


    // Метод для преверки жив ли
    public boolean isAlive() {
        return health > 0;
    }

    // Метод для нанесения урона
    public int attack() {
        return weapon.getAttack();
    }

    // Метод для рассчета полученного урона
    public void takeDamage(int damage) {
        int blocked = armor.blockedDamage(damage);
        int actualDamage = damage - blocked;
        health -= actualDamage;

        System.out.println(name + " Получает " + damage + " урона");
        System.out.println("Броня блокирует " + blocked + " урона");
        System.out.println("Нанесенный урон " + actualDamage);
        System.out.println("Осталось здоровья " + Math.max(health, 0));
        System.out.println("Прочность брони " + armor.getDurability());
    }
}

class Armor {
    private final int defence;
    private int durability;

    // Конструктор класса Armor
    public Armor(int defence, int durability) {
        this.defence = defence;
        this.durability = durability;
    }

    // Метод возвращающий количество заблокированного урона
    public int blockedDamage(int damage) {
        int blocked = Math.min(damage, defence);
        if (durability > 0) {
            durability -= blocked;
            return blocked;
        }
        return 0;
    }

    // Метод возвращающий значение прочности
    public int getDurability() {
        return Math.max(durability, 0);
    }
}

class Weapon {
    private final int attack;

    // Конструктор класса Weapon
    public Weapon(int attack) {
        this.attack = attack;
    }

    // Метод возращающий наносимый урон
    public int getAttack() {
        return attack;
    }
}

class Paladin extends Character {

    // Конструктор класса Paladin
    public Paladin(String name) {
        super(name);
        this.className = "Паладин";
        this.health = 150; // Много здоровья
        this.weapon = new Weapon(15); // Слабая атака
        this.armor = new Armor(40, 50); // Тяжелая броня

    }
}

class Rogue extends Character {

    // Конструктор класса Rogue
    public Rogue(String name) {
        super(name);
        this.className = "Разбойник";
        this.health = 100; // Среднее количество здоровья
        this.weapon = new Weapon(25); // Сильная атака
        this.armor = new Armor(25, 30); // Средняя защита, средняя прочность
    }
}

class Archer extends Character {

    // Конструктор класса Archer
    public Archer(String name) {
        super(name);
        this.className = "Лучник";
        this.health = 70; // Мало здоровья
        this.weapon = new Weapon(35); // Очень сильная атака
        this.armor = new Armor(15, 20); // Слабая защита, низкая прочнсть
    }
}

class Dice {
    protected static Random random = new Random();

    public static int roll() {
        return random.nextInt(6) + 1; // Кубик от 1 до 6
    }
}



public class BattleGame {
    private static final Scanner scanner = new Scanner(System.in);


    private static Character createCharacter(String name, int playerNumber) {
        System.out.println();
        System.out.println("╔═════════════════════════════════════════════════════════════════╗");
        System.out.println("║ Игрок " + playerNumber + ", выберите класс:                                        ║");
        System.out.println("║ 1. Паладин - много здоровья, слабая атака, тяжелая броня        ║");
        System.out.println("║ 2. Разбойник - сильная атака, среднее здоровье, средняя броня   ║");
        System.out.println("║ 3. Лучник - очень сильная атака, мало здоровья, легкая броня    ║");
        System.out.println("╚═════════════════════════════════════════════════════════════════╝");


        System.out.print("\nВаш выбор (1-3): ");
        int choice = scanner.nextInt();


        return switch (choice) {
            case 1 -> new Paladin(name);
            case 2 -> new Rogue(name);
            case 3 -> new Archer(name);
            default -> throw new IllegalStateException("Unexpected value: " + choice);
        };
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║         ДУЭЛЬ ГЕРОЕВ         ║");
        System.out.println("╚══════════════════════════════╝");


        System.out.print("\nИгрок 1 введите имя персонажа: ");
        String name1 = scanner.nextLine();
        Character player1 = createCharacter(name1, 1);

        scanner.nextLine();

        System.out.print("\nИгрок 2 введите имя персонажа: ");
        String name2 = scanner.nextLine();
        Character player2 = createCharacter(name2, 2);

        System.out.println("═════════════════════════════════════════════════════════════════");
        System.out.println("                         БИТВА НАЧИНАЕТСЯ                           ");
        System.out.println("                                                                ");
        System.out.printf("             %s (%s)   VS   %s (%s)                 \n", player1.getName(), player1.getClassName(), player2.getName(), player2.getClassName());
        System.out.println("                                                                ");
        System.out.println("════════════════════════════════════════════════════════════════");



        int roundNumber = 1;
        while (player1.isAlive() && player2.isAlive()) {

            int tryToHit = Dice.roll();

            System.out.println("\n══════════════ Раунд " + roundNumber + " ═══════════════");

            System.out.println("\nИгрок " + player1.getName() + " Бросает кубик...");
            if (tryToHit > 3) {
                System.out.println("\nВыпало " + tryToHit + " -> " + player1.getName() + " атакует " + player2.getName());
                int damage = player1.attack();
                player2.takeDamage(damage);
            }
            else {
                System.out.println("Выпало " + tryToHit + " -> " + player1.getName() + " промахивается");
            }
            if (!player2.isAlive()) {
                System.out.println("----------------------------------------");
                System.out.println(player2.getName() + " пал в бою!");
                System.out.println(player1.getName() + " побеждает!");
                System.out.println("----------------------------------------");
                break;
            }

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            tryToHit = Dice.roll();
            System.out.println("\nИгрок " + player2.getName() + " Бросает кубик...");
            if (tryToHit > 3) {
                System.out.println("\nВыпало " + tryToHit + " -> " + player2.getName() + " атакует " + player1.getName());
                int damage = player2.attack();
                player1.takeDamage(damage);
            } else {
                System.out.println("Выпало " + tryToHit + " -> " + player2.getName() + " промахивается");
            }
            if (!player1.isAlive()) {
                System.out.println("----------------------------------------");
                System.out.println(player1.getName() + " пал в бою!");
                System.out.println(player2.getName() + " побеждает!");
                System.out.println("----------------------------------------");
                break;
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            roundNumber++;
        }
    }
}













