package org.example;

public class JavaPractiseForAutomation {

    public static void main(String[] args) {
        stringReverse();
       String returnTexts = vowelsCheck();
       uniqueLetters(returnTexts);
       terenaryOperatorPractise();
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
}

