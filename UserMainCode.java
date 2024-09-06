import java.io.*;
import java.util.*;

class UserMainCode {

    public String userIdGeneration(String input1, String input2, int input3, int input4) {

        String smallerName, longerName;

        if (input1.length() < input2.length()) {
            smallerName = input1;
            longerName = input2;
        } else if (input1.length() > input2.length()) {
            smallerName = input2;
            longerName = input1;
        }
        else {
            if(((int)input1.charAt(0)) < ((int)input1.charAt(0)) ){
                smallerName=input1;
                longerName=input2;
            }
            else{
                smallerName=input2;
                longerName=input1;
            }
        }

        System.out.println(smallerName);
        System.out.println(longerName);

        String input33=Integer.toString(input3);

        char firstCharOfLongerName = longerName.charAt(0);
        char digitAtPositionNFromLeft = input33.charAt(input4 - 1);
        char digitAtPositionNFromRight = input33.charAt(input33.length() - input4);
        String userId = firstCharOfLongerName
                + smallerName
                + digitAtPositionNFromLeft
                + digitAtPositionNFromRight;


        return toggleCase(userId);
    }

    private String toggleCase(String input) {
        StringBuilder toggled = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                toggled.append(Character.toLowerCase(c));
            } else {
                toggled.append(Character.toUpperCase(c));
            }
        }
        return toggled.toString();
    }

    public static void main(String[] args) {
        UserMainCode code = new UserMainCode();
        String firstName = "Manoj";
        String lastName = "Kumar";
        int pin = 560037;
        int position = 2;
        String userId = code.userIdGeneration(firstName, lastName, pin, position);
        System.out.println("Generated User-ID: " + userId);

    }
}