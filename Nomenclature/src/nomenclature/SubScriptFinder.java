/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomenclature;

/**
 *
 * @author tayl1776
 */

import java.util.ArrayList;

public class SubScriptFinder 
{
    private static final String SUBSCRIPT1 = "\u2081";
    private static final String SUBSCRIPT2 = "\u2082";
    private static final String SUBSCRIPT3 = "\u2083";
    private static final String SUBSCRIPT4 = "\u2084";
    private static final String SUBSCRIPT5 = "\u2085";
    private static final String SUBSCRIPT6 = "\u2086";
    private static final String SUBSCRIPT7 = "\u2087";
    private static final String SUBSCRIPT8 = "\u2088";
    private static final String SUBSCRIPT9 = "\u2089";
    
    
    public SubScriptFinder()
    {
    }
   
    public static String changer2(String input)
    {
        char[] charArray = input.toCharArray();
                char a;
                String[] stringArray = new String[charArray.length];
                String string2;
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
                return string2;
    }
}
