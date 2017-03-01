/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skillcalculator;

/**
 *
 * @author phili
 */
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NewMain extends JFrame {

    public static void main(String[] args) {

        String string1 = "CO2";
        char[] charArray = string1.toCharArray();
        char a;
        String[] stringArray = new String[charArray.length];
        String string2;
        StringBuilder build = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            a = charArray[i];
            if (a == '0') {
                stringArray[i] = "\u2080";
            } else if (a == '1') {
                stringArray[i] = "\u2081";
            } else if (a == '2') {
                stringArray[i] = "\u2082";
            } else if (a == '3') {
                stringArray[i] = "\u2083";
            } else if (a == '4') {
                stringArray[i] = "\u2084";
            } else if (a == '5') {
                stringArray[i] = "\u2085";
            } else if (a == '6') {
                stringArray[i] = "\u2086";
            } else if (a == '7') {
                stringArray[i] = "\u2087";
            } else if (a == '8') {
                stringArray[i] = "\u2088";
            } else if (a == '9') {
                stringArray[i] = "\u2089";
            } else {
                stringArray[i] = Character.toString(a);
            }
        }

        string2 = String.join("", stringArray);
        System.out.println(string2);
    }

}

