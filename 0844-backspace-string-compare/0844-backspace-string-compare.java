class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s_str=new Stack<>();
        Stack<Character> t_str=new Stack<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='#'){
                s_str.push(s.charAt(i));
            }
            if(s.charAt(i)=='#'&&!s_str.isEmpty()){
                s_str.pop();
            }
        }
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)!='#'){
                t_str.push(t.charAt(i));
            }
            if(t.charAt(i)=='#'&&!t_str.isEmpty()){
                t_str.pop();
            }
        }
        return s_str.equals(t_str);
    }
}