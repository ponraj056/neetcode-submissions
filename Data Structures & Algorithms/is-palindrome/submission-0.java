class Solution {
    public boolean isPalindrome(String s) {
        Stack<Character> stack = new Stack<>();
        s=s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i)))
                stack.push(s.charAt(i));
            
        }
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                if (stack.peek() == s.charAt(i)) {
                    stack.pop();
                } else
                    return false;
            }
        }
 System.out.println(stack);
        return stack.isEmpty();
    }
}
