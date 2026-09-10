class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (Character c : s.toCharArray()) {
            if (!stack.isEmpty() && c == ')') {
                if (stack.peek() == '(') {
                    stack.pop();
                } else {
                    return false;
                }

            } else if (!stack.isEmpty() && c == ']') {
                if (stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            }
            else if (!stack.isEmpty() && c == '}') {
                if (stack.peek() == '{') {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        if(stack.isEmpty()){
        return true;
        }else{return false;}
    }
}
