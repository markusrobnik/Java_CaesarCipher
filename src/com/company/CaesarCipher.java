/*
CaesarCipher in Java
Author: Markus Robnik
Date: 14.05.21
 */
package com.company;

public class CaesarCipher {

    private char[] latin = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    StringBuilder Text = new StringBuilder();

    public String caesarCipher(String text, int key, char operation) {
        switch (operation) {
            case 'e':
                for (int i = 0; i < text.length(); i++) {
                    for (int n = 0; n < latin.length; n++) {
                        if (text.charAt(i) == latin[n]) {
                            if ((n + key) < latin.length) {
                                Text.append(latin[n + key]);
                            } else if ((n + key) >= latin.length) {
                                Text.append(latin[(n + key) % latin.length]);
                            }
                        }
                    }
                }
                return Text.toString();

            case 'd':
                char[] latinRev = new char[latin.length];
                int m = 0;
                for (int u = latin.length - 1; u >= 0; u--) {
                    latinRev[m] = latin[u];
                    m++;
                }
                for (int i = 0; i < text.length(); i++) {
                    for (int n = 0; n < latinRev.length; n++) {
                        if (text.charAt(i) == latinRev[n]) {
                            if ((n + key) < latinRev.length) {
                                Text.append(latinRev[n + key]);
                            } else if ((n + key) >= latinRev.length) {
                                Text.append(latinRev[(n + key) % latinRev.length]);
                            }
                        }
                    }

                }
        }
        return Text.toString();
    }
}