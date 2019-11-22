public class StringProblems {
    public static String printTheLetters(String s){
        String output = "";
        for (int counter = 0; counter < s.length(); counter ++){
            output += s.substring(counter, counter + 1)+ "\n";
        }
        return output;
    }
    public static String everyOtherLetter(String s){
        String output = "";
        for (int counter = 0; counter < s.length(); counter += 2){
            output += s.substring(counter, counter + 1);
        }
        return output;
    }
    public static int countTheVowels(String s){
        int output = 0;
        s = s.toLowerCase();
        for (int counter = 0; counter < s.length(); counter++) {
            if (s.substring(counter, counter + 1).equals("a"))
                output++;
            if (s.substring(counter, counter + 1).equals("e"))
                output++;
            if (s.substring(counter, counter + 1).equals("i"))
                output++;
            if (s.substring(counter, counter + 1).equals("o"))
                output++;
            if (s.substring(counter, counter + 1).equals("u"))
               output++;
            else
            output += 0;
        }
        return output;
    }
    public static String differentStrings(String s1, String s2){
        String output = "";
        for (int counter = 0; s1.substring(counter,counter+1)!=s2.substring(counter,counter+1); counter ++){
            output += s1.substring(counter,counter+1);
        }
        return output;
    }
    public static void main(String[] args){
        System.out.println(printTheLetters("pizza"));
        System.out.println(everyOtherLetter("computer science"));
        System.out.println(countTheVowels("COMPUTER science"));
        System.out.println(differentStrings("tiger", "turtle"));
    }
}
