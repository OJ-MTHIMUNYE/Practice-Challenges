/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.entelectquestin2;

/**
 *
 * @author O'JAY MTHIMUNYE
 */


    
    
    
    
public class EntelectQuestin2 {

    
    //static String varOcg = "";

    public static String RebelEncoding(String str) {
        // Remove punctuation marks
        String cleanStr = str.replaceAll("[^a-zA-Z0-9 ]", "");

        StringBuilder encodedStr = new StringBuilder();
        char prevChar = '\0';
        int count = 0;

        for (char c : cleanStr.toCharArray()) {
            if (c == prevChar) {
                count++;
            } else {
                if (count > 0) {
                    encodedStr.append(count).append(prevChar);
                }
                prevChar = c;
                count = 1;
            }
        }

        // Append the count and character for the last sequence
        if (count > 0) {
            encodedStr.append(count).append(prevChar);
        }

        return encodedStr.toString();
        
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
         // Test cases
        System.out.println(RebelEncoding("Squad Beta-111 attack!"));  // Output: 1S1q1u1a1d 1B1e1t1a31 1a2t1a1c1k
        System.out.println(RebelEncoding("Wookiees seen at Kashyyyk."));  // Output: 1W2o1k1i2e1s 1s2e1n 1a1t 1K1a1s1h3y1k
        
        
        
        
    }
}
