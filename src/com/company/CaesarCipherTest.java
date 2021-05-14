/*
CaesarCipher in Java
Author: Markus Robnik
Date: 14.05.21
 */
package com.company;
import org.junit.*;
import static org.junit.Assert.*;

public class CaesarCipherTest {
    CaesarCipher ccTest = new CaesarCipher();

    @Test
    public void TestKey1Encrypt() {
        String expected = "nbslvt";
        String actual = ccTest.caesarCipher("markus", 1,'e');
        assertEquals(expected, actual);
    }
    @Test
    public void TestKey15Encrypt() {
        String expected = "bpgzjh";
        String actual = ccTest.caesarCipher("markus", 15,'e');
        assertEquals(expected, actual);
    }
    @Test
    public void TestKey25Encrypt() {
        String expected = "lzqjtr";
        String actual = ccTest.caesarCipher("markus", 25,'e');
        assertEquals(expected, actual);
    }
    @Test
    public void TestKey20Decrypt() {
        String expected = "robnik";
        String actual = ccTest.caesarCipher("livhce", 20,'d');
        assertEquals(expected, actual);
    }
    @Test
    public void TestKey16Decrypt() {
        String expected = "robnik";
        String actual = ccTest.caesarCipher("ifsezb", 17,'d');
        assertEquals(expected, actual);
    }
    @Test
    public void TestKey24Decrypt() {
        String expected = "robnik";
        String actual = ccTest.caesarCipher("pmzlgi", 24,'d');
        assertEquals(expected, actual);
    }
}