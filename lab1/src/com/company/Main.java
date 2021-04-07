package com.company;

public class Main {

    public static boolean isPalidrom(String s)
    {
        return s.equals(reverseString(s));
    }
    public static String reverseString(String slovo)
    {
        String str="";
        for(int i = slovo.length()-1; i > -1; i--)
            str=str+slovo.charAt(i);
        return (str);
    }

    public static void main(String[] args) {
        System.out.println("java" + isPalidrom("java"));
        System.out.println("Palidrome" + isPalidrom("Palidrome"));
        System.out.println("madam" + isPalidrom("madam"));
        System.out.println("racecar" + isPalidrom("racecar"));
        System.out.println("apple" + isPalidrom("apple"));
        System.out.println("kayak" + isPalidrom("kayak"));
        System.out.println("song" + isPalidrom("song"));
        System.out.println("noon" + isPalidrom("noon"));
    }
}
