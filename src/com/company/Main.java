/*
 * Main
 *
 * Version info 1
 *
 * Zviertseva Nataliia,  NTU "KhPI"
 */
package com.company;
public class Main {

    public static void main(String[] args) {
        //String word = "ABBA";
        //String word = "А ты сама сыта?";
        //String word = "Искать такси.";
       // String word ="Не видно, как он дивен";
       String word = "Не женат, а нежен.";
        word = word.toLowerCase();
        word = word.replaceAll(" ","");
        word = word.replaceAll("-","");
        word = word.replaceAll("\\.","");
        word = word.replaceAll("\\?","");
        word = word.replaceAll("\"","");
        word = word.replaceAll(",","");

                String template = "";
        for (int i = 0; i < word.length(); i++) {
            int index = word.length()-i-1;
            template += word.charAt(index);
                    }
        System.out.println(template);
        if (word.equals(template)){
            System.out.println("This word is palindrom");
        } else {
            System.out.println("This word is not palindrom");
        }
    }
}










