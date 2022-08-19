package com.techelevator;
import java.util.Stack;
import java.util.*;

public class Brackets {
    public static void main(String[] args) {
        Brackets b = new Brackets();
        System.out.println(b.isBalanced("({[)}]"));
    }
    public boolean isBalanced(String input) {
        Stack<Character> brackets = new Stack<>();
        Map<Character,Character>  bracketMap = new HashMap<>();
        bracketMap.put( ')' , '(');
        bracketMap.put( ']' , '[');
        bracketMap.put( '}' , '{');

        for(int i = 0; i < input.length(); i++) {
            Character theCharacter = input.charAt(i);

            if(brackets.isEmpty()) {
                brackets.push(theCharacter);
            }
            else if((theCharacter == ')' && brackets.peek() == '(')
            || (theCharacter == '}' && brackets.peek() == '{')
            || (theCharacter == ']' && brackets.peek() == '[')
            ) {
                brackets.pop();
            } else {
                brackets.push(theCharacter);
            }
        } return brackets.isEmpty();
    }
}
