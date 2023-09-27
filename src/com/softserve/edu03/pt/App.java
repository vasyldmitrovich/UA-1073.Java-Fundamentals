package com.softserve.edu03.pt;

public class App {
    static String s = "Hello";

    public static void main(String[] args) {
        System.out.println(s);
        System.out.println(App.s);
    }
}

class App1 {
    public static void main(String[] args) {
        System.out.println(App.s);
        App.s = "Bye!";
        System.out.println(App.s);
        App s1 = new App();
        System.out.println(s1.s);
        s1.s = "Good evening";
        App s2 = new App();
        System.out.println(s2.s);
    }
}
class App2_1{
    public static void main(String[] args) {
        System.out.println("Start");
        new App2();
        new App2();
        new App2();
        new App2();
    }
}
class App2{
    static {
        System.out.println("A::static_init");
    }
    public App2(){
        System.out.println("A::new");
    }
}