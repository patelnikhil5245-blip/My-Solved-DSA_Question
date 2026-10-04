class Solution {
    public boolean checkValidString(String s) {

        Stack<Integer> open = new Stack<>();
        Stack<Integer> star = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '(') {
                open.push(i);
            }

            else if (ch == '*') {
                star.push(i);
            }

            else { // ')'

                if (!open.isEmpty()) {
                    open.pop();
                }
                else if (!star.isEmpty()) {
                    star.pop();   // * ko '(' maan lo
                }
                else {
                    return false;
                }
            }
        }

        // Ab bache hue '(' ko * se match karo
        while (!open.isEmpty() && !star.isEmpty()) {

            if (open.peek() < star.peek()) {
                open.pop();
                star.pop();
            }
            else {
                // * '(' se pehle hai, to ')' ki tarah use nahi kar sakte
                return false;
            }
        }

        return open.isEmpty();
    }
}