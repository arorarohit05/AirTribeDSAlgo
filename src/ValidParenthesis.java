import java.util.Stack;

public class ValidParenthesis {

    // { ( [ ) } ]

    // ]

    public static boolean isValidParenthesis(String s){
        Stack<Character> stack = new Stack<>();

        for(char c:s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            else{  // currently at a closing brackert

                if(stack.empty()){ // corner scenario = closing bracket for which there is no opening bracket
                    return false;
                }

                char top = stack.peek();  // any opening brackerts

                if((c==')' && top!='(') ||   (c==']' && top!='[')    ||  (c=='}' && top!='{')  ){ // matching
                    return false;
                }
                stack.pop();
            }
        }

        return stack.empty(); // opening bracket for which there is no closing bracket

    }


    public static void main(String[] args) {
        String str  = "}{[()[]{}]}";
        System.out.println(isValidParenthesis(str));
    }
}


// next grater element - VIQ
// prev smaller element

// 2 1 3 4
// 3 3 4 -1
