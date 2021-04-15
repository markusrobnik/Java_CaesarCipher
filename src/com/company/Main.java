package com.company;

public class Main {

    public static void main(String[] args) {
        CaesarCipher cc = new CaesarCipher();

        System.out.println("Encrypted Text: " + cc.encrypt("markus", 5));
        System.out.println("Decrypted Text: " + cc.decrypt("rfwpzx", 5));
    }
}
