import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Droid {
    protected String name;
    protected int health;
    protected int damage;

    public Droid(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public void takeDamage(int damage) {
        if (health > damage) {
            health -= damage;
        } else {
            health = 0;
        }
    }

    @Override
    public String toString() {
        return "Droid{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", damage=" + damage +
                '}';
    }
}

class R2D2 extends Droid {
    public R2D2() {
        super("R2-D2", 100, 20);
    }
}

class C3PO extends Droid {
    public C3PO() {
        super("C-3PO", 50, 10);
    }
}

class Battle {
    public static void oneOnOneBattle(Droid droid1, Droid droid2) {
        while (droid1.getHealth() > 0 && droid2.getHealth() > 0) {
            int damage1 = droid1.getDamage();
            int damage2 = droid2.getDamage();
            droid2.takeDamage(damage1);
            droid1.takeDamage(damage2);

            System.out.println(droid1.getName() + " attacks " + droid2.getName() + " for " + damage1 + " damage.");
            System.out.println(droid2.getName() + " attacks " + droid1.getName() + " for " + damage2 + " damage.");

            System.out.println(droid1.getName() + " health: " + droid1.getHealth());
            System.out.println(droid2.getName() + " health: " + droid2.getHealth());
        }

        if (droid1.getHealth() > 0) {
            System.out.println(droid1.getName() + " wins!");
        } else if (droid2.getHealth() > 0) {
            System.out.println(droid2.getName() + " wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}

public class Main {
    private static List<Droid> droids = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Додаємо R2-D2 та C-3PO до списку доступних дроїдів
        droids.add(new R2D2());
        droids.add(new C3PO());

        boolean exit = false;
        while (!exit) {
            System.out.println("Menu:");
            System.out.println("1. Create a droid");
            System.out.println("2. Show the list of created droids");
            System.out.println("3. Start a 1-on-1 battle");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1 -> createDroid();
                case 2 -> showDroidList();
                case 3 -> startOneOnOneBattle();
                case 4 -> exit = true;
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void createDroid() {
        System.out.print("Enter droid name: ");
        String name = scanner.nextLine();
        System.out.print("Enter droid health: ");
        int health = scanner.nextInt();
        System.out.print("Enter droid damage: ");
        int damage = scanner.nextInt();

        Droid droid = new Droid(name, health, damage);
        droids.add(droid);
        System.out.println("Droid created: " + droid);
    }

    private static void showDroidList() {
        System.out.println("List of available droids:");
        for (int i = 0; i < droids.size(); i++) {
            System.out.println((i + 1) + ". " + droids.get(i).getName());
        }
    }

    private static void startOneOnOneBattle() {
        if (droids.size() < 2) {
            System.out.println("You need at least 2 droids to start a battle.");
            return;
        }

        System.out.println("Select droids for the battle:");

        System.out.println("Available droids:");
        for (int i = 0; i < droids.size(); i++) {
            System.out.println((i + 1) + ". " + droids.get(i).getName());
        }

        System.out.print("Enter the index of the first droid: ");
        int index1 = scanner.nextInt();
        System.out.print("Enter the index of the second droid: ");
        int index2 = scanner.nextInt();

        if (index1 < 1 || index1 > droids.size() || index2 < 1 || index2 > droids.size() || index1 == index2) {
            System.out.println("Invalid droid selection.");
        } else {
            Droid droid1 = droids.get(index1 - 1);
            Droid droid2 = droids.get(index2 - 1);
            Battle.oneOnOneBattle(droid1, droid2);
        }
    }
}
