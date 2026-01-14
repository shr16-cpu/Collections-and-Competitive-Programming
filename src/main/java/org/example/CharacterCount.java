package org.example;

public class CharacterCount {
    public static void main(String[] args) {
       String s = "harry";
       int[] hash = new int[26];

       for(int i=0;i<s.length();i++){
           hash[s.charAt(i)-'a']++;
       }
       for(int i:hash){
           System.out.println(i);
       }

    }
}
