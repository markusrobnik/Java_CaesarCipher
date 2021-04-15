/*
CaesarCipher in Java
Author: Markus Robnik
Date: 14.04.21
 */
package com.company;

public class CaesarCipher {

    private final char[] latin = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private final char[] latinRev = {'z', 'y', 'x', 'w', 'v', 'u', 't', 's', 'r', 'q', 'p', 'o', 'n', 'm', 'l', 'k', 'j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a'};

    StringBuilder encryptedText = new StringBuilder();
    StringBuilder decryptedText = new StringBuilder();

    public StringBuilder encrypt(String text, int key) {
        for (int i = 0; i < text.length(); i++) {
            for (int n = 0; n < latin.length; n++) {
                if (text.charAt(i) == latin[n]) {
                    if ((n + key) < latin.length) {
                        encryptedText.append(latin[n + key]);
                    } else if ((n + key) >= latin.length) {
                        encryptedText.append(latin[(n + key) % latin.length]);
                    }
                }
            }
        }
        return encryptedText;
    }

    public StringBuilder decrypt(String text, int key) {
        for (int i = 0; i < text.length(); i++) {
            for (int n = 0; n < latinRev.length; n++) {
                if (text.charAt(i) == latinRev[n]) {
                    if ((n + key) < latinRev.length) {
                        decryptedText.append(latinRev[n + key]);
                    } else if ((n + key) >= latinRev.length) {
                        decryptedText.append(latinRev[(n + key) % latinRev.length]);
                    }
                }
            }
        }
        return decryptedText;
    }
}