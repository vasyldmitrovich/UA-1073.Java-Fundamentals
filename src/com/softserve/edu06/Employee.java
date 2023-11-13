/*package com.softserve.edu06;

public abstract class Employee {
    private boolean name;
    private boolean age ;
    private boolean position;
    private boolean salary;

    public Employee(boolean name,boolean age, boolean position, boolean salary) {
        this.name= name;
        this.age= age;
        this.position = position;
        this.salary = salary;

    }

    public boolean name() {
        return name;

    } public boolean age() {
        return age;
    }

    public boolean position() {
        return position;
    }

    public boolean salary() {
        return salary;
    }


    public abstract void fee1();

    @Override
    public String toString() {
        return "Employee{" +
                "name=" + name+
                "age=" + age +
                ", salary=" + salary +
                '}';
    }
}

class Developer extends Employee {

    public Developer(boolean name, boolean age, boolean position, boolean salary) {
        super(name, age, position, salary);
    }

    @Override
    public void Developer1() {
        System.out.println("The " + getClass().getSimpleName() + " flies.");
    }

    @Override
    public void fee1() {

    }
}

class Taras extends Employee {
    public Taras(boolean feathers, boolean layEggs, boolean canFly) {
        super(feathers, layEggs, canFly);
    }

    @Override
    public void fly() {
        System.out.println("The bird cannot fly.");
    }

    @Override
    public void fee1() {

    }
}

class Kiwi extends NonFlyingBird {

    public Kiwi(boolean feathers, boolean layEggs, boolean canFly) {
        super(true, true, false);
    }
}

class Penguin extends NonFlyingBird {

    public Penguin(boolean feathers, boolean layEggs, boolean canFly) {
        super(false, true, false);
    }
}

class Swallow extends FlyingBird {

    public Swallow(boolean feathers, boolean layEggs, boolean canFly) {
        super(true, true, true);
    }
}

class Eagle extends NonFlyingBird {
    public Eagle(boolean feathers, boolean layEggs, boolean canFly) {
        super(true, true, true);
    }
}

class Main {
    public static void main(String[] args) {
        Bird[] birds = new Bird[]{
                new FlyingBird(true, true, true),
                new NonFlyingBird(true, true, false),
                new Kiwi(true, true, false),
                new Swallow(true, true, true),
                new Eagle(true, true, true),
                new Penguin(true, true, false)

        };
        for (Bird bird : birds) {
            System.out.println(bird.getClass().getSimpleName() + ": ");
            System.out.println("  Can fly: " + bird.canFly());
            System.out.println("  Has feathers: " + bird.hasFeathers());
            System.out.println("  Lays eggs: " + bird.laysEggs());
        }
    }
}*/

