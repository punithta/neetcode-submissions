class Solution {
    public boolean isValid(String s) {
        LinkedList<Character> l = new LinkedList<>();
        char[] c = s.toCharArray();
        for(char a: c){
            if(a == '(' || a == '{' || a =='['){
                l.addLast(a);
            }
            else if(l.size() != 0 && a ==')' && l.peekLast() == '('){
                l.removeLast();
            }
            else if(l.size() != 0 && a =='}' && l.peekLast() == '{'){
                l.removeLast();
            }
            else if(l.size() != 0 && a ==']' && l.peekLast() == '['){
                l.removeLast();
            }
            else{
                return false;
            }
        }
        if(l.size() != 0){
            return false;
        }
        return true;
    }
}
