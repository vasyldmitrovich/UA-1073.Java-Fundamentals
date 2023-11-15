package com.softserve.edu13.hw.Task1;


import com.softserve.edu13.hw.Task1.EncriptDecript;

public class Main {
    public static void main(String[] args) {
  String text = EncriptDecript.promptText();
 String codedText = EncriptDecript.encrypt(text,6);
 EncriptDecript.decrypt(codedText,6);
    }

}
