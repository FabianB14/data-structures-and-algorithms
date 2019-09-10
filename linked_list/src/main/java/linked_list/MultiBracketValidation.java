package linked_list;

public class MultiBracketValidation{
    public static boolean multiBracketValidation(String input){
        Stack<Character> stack = new Stack<>();
        Character checker;
        for(int i = 0; i < input.length(); i++){
            if (input.charAt(i) == '(' || input.charAt(i) == '{' || input.charAt(i) == '[') {
               stack.push(input.charAt(i));
            }
            switch (input.charAt(i)) {
                case')':
                     checker = stack.pop();
                    if( checker != '('){
                        return false;
                    }
                    break;
                case ']':
                     checker = stack.pop();
                    if( checker != '['){
                        return false;
                    }
                    break;
                case '}':
                    checker = stack.pop();
                    if( checker != '{'){
                        return false;
                    }
                    break;

            }
        }
        if(stack.top != null){
            return false;
        }
        System.out.println(stack.peek());
        return true;
    }
}
