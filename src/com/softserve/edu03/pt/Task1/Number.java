package com.softserve.edu03.pt.Task1;

import static com.softserve.edu03.pt.Task1.Main.SCANNER;

public class Number {

  int firstnumber;
  int secondnumber;

    public static void getNumber (Number number){
        System.out.println("Enter the first number: ");
        int firstnumber = SCANNER.nextInt();
        number.setFirstnumber(firstnumber);
        System.out.println("Enter the second number: ");
        int secondnumber = SCANNER.nextInt();
        number.setSecondnumber(secondnumber);
        System.out.println(firstnumber + "+" + secondnumber);
    }
   public int getSum () {
      return(firstnumber + secondnumber);
  }
  public double getAverage () {
       return ((firstnumber+secondnumber)/2.0);
  }
    public int getFirstnumber() {
        return firstnumber;
    }

    public void setFirstnumber(int firstnumber) {
        this.firstnumber = firstnumber;
    }

    public int getSecondnumber() {
        return secondnumber;
    }

    public void setSecondnumber(int secondnumber) {
        this.secondnumber = secondnumber;
    }

    public void Sum (Number number) {
      System.out.println(firstnumber+secondnumber);
  }

}

