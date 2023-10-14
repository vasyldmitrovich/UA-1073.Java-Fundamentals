package com.softserve.edu07.additional;

public class God {



    public static Human[] create() {
        return new Human[]{new Man(), new Woman()};
    }
}
class Human {
}

//code
class Man extends Human {
}

class Woman extends Human {
}