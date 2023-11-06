package org.example;

import java.util.Locale;

public class JavaPractiseForAutomation {

    public static void main(String[] args) {
//        stringReverse();
//       String returnTexts = vowelsCheck();
//       uniqueLetters(returnTexts);
//       terenaryOperatorPractise();
       largestElementInArray();
       palindromeCheck();
       factorialCalculations();
    }

    public static void stringReverse() {      //To reverse given string
        String s = "Ayush Ranjan", temp = "";
        int stringLength = s.length();


        for (int i = stringLength - 1; i >= 0; i--) {
            temp = temp + s.charAt(i);
        }

        System.out.println(temp);
    }

    public static String vowelsCheck() {
        String v = "Let's check how many vowels we can have in this sentence. We can also update our code to count numbers also.";
        String vowelsCount = "";

        for (int i = 0; i < v.length(); i++) {
            char currentChar = v.charAt(i);
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u' ||
                    currentChar == 'A' || currentChar == 'E' || currentChar == 'I' || currentChar == 'O' || currentChar == 'U') {
                vowelsCount += currentChar;

            }
        }
        System.out.println(vowelsCount);
        System.out.println("Count of the vowels founded are: "+vowelsCount.length());

        return vowelsCount;
    }

    public static void uniqueLetters(String text) {
        String uniqueLettersInText = "";
// loop through each character in the string
//        for(int i = 0; i < text.length(); i++) {
//            char c = text.charAt(i);
//
//            // check if the character is not already in the unique string
//            if(uniqueLettersInText.indexOf(c) == -1) {
//                uniqueLettersInText += c;
//            }
//        }

        for(int i= 0;i<text.length();i++){
            char c= text.charAt(i);

            if(uniqueLettersInText.indexOf(c)==-1) {
                uniqueLettersInText += c;
            }
        }

        System.out.println("The unique characters in " + text + " are: " + uniqueLettersInText);
    }

    public static void terenaryOperatorPractise() {
        int a=10,b=20;

        int c = (a>b)? a:b;
        System.out.println(c);
    }

    public static void largestElementInArray() {
        int [] elementArray = {10, 15, 16, 59, 6, 100, 456, 3321, 5678, 893, 556, 6748, 43098, 78347, 89265, 77562, 98762, 92759};
        int highestNumber = 0;

        for(int i = 0; i < elementArray.length; i++) {
            if (elementArray[i] > highestNumber) {
                highestNumber=elementArray[i];
            }

        }
        System.out.println(highestNumber);
    }

    public static void palindromeCheck() {
        String checkString = "Eye";
        checkString.toLowerCase();
        String tempString ="";
        for (int i = checkString.length()-1; i>= 0; i--) {
            tempString+=checkString.charAt(i);
        }
        System.out.println("Given string is "+(tempString.equals(checkString))+ " palindrome");
    }

    public static void factorialCalculations() {
        int givenNumber = 49;
        long tempNumber = givenNumber;

        for(int i = givenNumber-1; i>0; i--) {
            tempNumber*=i;
        }
        System.out.println(tempNumber);
    }
}

