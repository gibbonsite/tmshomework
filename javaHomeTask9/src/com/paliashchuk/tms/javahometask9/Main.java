package com.paliashchuk.tms.javahometask9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        runTaskOne("I like Java!!!");
        findPalindromes("Lorem ipppi dolod sis amet, consececsnoc adida elit. Vivav nen ul n.");
        findWordsWithLengthBetween3And5("Lorem ipsum dolor sit amet, consececsnoc adipiscing elit. Vivamus nec"
                + " ultrices tortor. Nullam sit amet hendrerit urna. Suspendisse id egestas dolor. Fusce iaculis diam"
                + "at justo rhoncus interdum. Suspendisse dictum, leoet sodales euismod, nulla tellus ullamcorper "
                + "elit, id interdum elit est eu augue.");
        System.out.println(findShortestWord("Lorem ipsum dolor sit amet, consececsnoc adipiscing elit. Vivamus nec"
                + " ultrices tortor. Nullam sit amet hendrerit urna. Suspendisse id egestas dolor. Fusce iaculis diam"
                + "at justo rhoncus interdum. Suspendisse dictum, leoet sodales euismod, nulla tellus ullamcorper "
                + "elit, id interdum elit est eu augue."));
        System.out.println(findLongestWord("Lorem ipsum dolor sit amet, consececsnoc adipiscing elit. Vivamus nec"
                + " ultrices tortor. Nullam sit amet hendrerit urna. Suspendisse id egestas dolor. Fusce iaculis diam"
                + "at justo rhoncus interdum. Suspendisse dictum, leoet sodales euismod, nulla tellus ullamcorper "
                + "elit, id interdum elit est eu augue."));
        composeExpressions();
        composeWordFromPartOfOtherWords();
    }

    public static void runTaskOne(String str) {
        System.out.println(str.charAt(str.length() - 1));
        System.out.println(str.endsWith("!!!"));
        System.out.println(str.startsWith("I like"));
        System.out.println(str.contains("Java"));
        System.out.println(str.indexOf("Java"));
        System.out.println(str.replace('a', 'o'));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(7, 11));
    }

    public static void findPalindromes(String str) {
        String[] words = str.split(" ");
        for (String word : words) {
            word = word.replace(".", "").
                    replace(",", "");
            if (word.length() > 0) {
                boolean palindrome = true;
                for (int i = 0; i < word.length() / 2; i++) {
                    if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                        palindrome = false;
                        break;
                    }
                }
                if (palindrome) {
                    System.out.println(word);
                }
            }
        }
    }

    public static void findWordsWithLengthBetween3And5(String str) {
        String[] words = str.split(" ");
        for (String word : words) {
            word = word.replace(".", "").
                    replace(",", "");
            if (word.length() >= 3 && word.length() <= 5) {
                System.out.println(word);
            }
        }
    }

    public static String findShortestWord(String str) {
        String[] words = str.split(" ");
        int shortestWordLength = Integer.MAX_VALUE;
        String shortestWord = "";
        for (String word : words) {
            word = word.replace(".", "").
                    replace(",", "");
            if (word.length() > 0 && word.length() < shortestWordLength) {
                shortestWordLength = word.length();
                shortestWord = word;
            }
        }
        return shortestWord;
    }

    public static String findLongestWord(String str) {
        String[] words = str.split(" ");
        int longestWordLength = 0;
        String longestWord = "";
        for (String word : words) {
            word = word.replace(".", "").
                    replace(",", "");
            if (word.length() > 0 && word.length() > longestWordLength) {
                longestWordLength = word.length();
                longestWord = word;
            }
        }
        return longestWord;
    }

    public static void composeExpressions() {
        StringBuilder builder = new StringBuilder();
        builder.append(3).
                append(" + ").
                append(56).
                append(" = ").
                append(3 + 56);
        System.out.println(builder.toString());
        builder = new StringBuilder();
        builder.append(3).
                append(" - ").
                append(56).
                append(" = ").
                append(3 - 56);
        System.out.println(builder.toString());
        builder = new StringBuilder();
        builder.append(3).
                append(" * ").
                append(56).
                append(" = ").
                append(3 * 56);
        System.out.println(builder.toString());
    }

    public static void composeWordFromPartOfOtherWords() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first word with even length:");
        String firstWord = scanner.nextLine();
        System.out.println("Enter second word with even length:");
        String secondWord = scanner.nextLine();
        System.out.println(firstWord.substring(0, firstWord.length() / 2) +
                secondWord.substring(secondWord.length() / 2));
    }
}
