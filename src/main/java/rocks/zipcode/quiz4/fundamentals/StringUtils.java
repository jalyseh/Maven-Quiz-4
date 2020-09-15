package rocks.zipcode.quiz4.fundamentals;


/**
 * @author leon on 21/12/2018.
 */
public class StringUtils<answer> {
    public static Character getMiddleCharacter(String string) {

        char atIndex = string.charAt(string.length() / 2);
        return atIndex;
    }

    public static String capitalizeMiddleCharacter(String str)
    {

        String answer = "";
        char middleChar = str.charAt(str.length() / 2);

         for(int x = 0; x < str.length(); x++)
         {
             if(x != str.length() / 2)
             {
                 answer += str.charAt(x);
             }
             else
                 { answer += String.valueOf(middleChar).toUpperCase();
                 }
             }
        return answer;
    }
    public static String lowerCaseMiddleCharacter(String str) {

        String answer = "";
        char middleChar = str.charAt(str.length() / 2);

        for(int x = 0; x < str.length(); x++)
        {
            if(x != str.length() / 2)
            {
                answer += str.charAt                                                                                                                             (x);
            }
            else
            { answer += String.valueOf(middleChar).toLowerCase();
            }
        }
        return answer;

    }

    public static Boolean isIsogram(String str) {

        Boolean answer = true;
        for (int index = 0; index < str.length(); index++)
        {
            for(int index2 = index + 1; index2 < str.length(); index2++)
            {
                if(String.valueOf(str.charAt(index)).equals(String.valueOf(str.charAt(index2)))) {
                    answer = false;
                }
            }
        }
        return answer;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {

        Boolean consec = false;
        for(int index = 0; index < str.length()-1; index++){
            if(str.charAt(index) == str.charAt(index + 1)){
                consec = true;
            }
        }

        return consec;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {

        for(int index = 0; index < str.length(); index++) {
            char char1 = str.charAt(index);
            char char2 = ' ';

            if(index + 1 < str.length()) {
            char2 = str.charAt(index + 1);

            }
            if(char1 == char2){
                String stringVal = String.valueOf(char1);
                str = str.replace(stringVal, "");
            }
        }
        return str;
    }

    public static String invertCasing(String str) {

        char[] chars = str.toCharArray();

        for(int index = 0; index < str.length(); index++){
            char char1 = str.charAt(index);

            if (Character.isLowerCase(char1)){
                String newChar = String.valueOf(Character.toUpperCase(char1));
                chars[index] = newChar.charAt(0);
            }
            else if (Character.isUpperCase(char1)){
                String newChar = String.valueOf(Character.toLowerCase(char1));
                chars[index] = newChar.charAt(0);
            }
        }
        return new String(chars);
    }
}