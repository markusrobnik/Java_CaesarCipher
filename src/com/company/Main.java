/*
CaesarCipher in Java
Author: Markus Robnik
Date: 14.05.21
 */
package com.company;

public class Main {

    public static void main(String[] args) {
        CaesarCipher cc = new CaesarCipher();
        System.out.println("Encrypted/Decrypted Text: " + cc.caesarCipher("markus", 15,'e'));
    }
}