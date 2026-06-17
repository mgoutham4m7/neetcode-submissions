class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<tokens.length;i++)
        {
            if(tokens[i].equals("+")) //|| tokens[i]== "-" || tokens[i]== "*" || tokens[i]== "/")
            {
                s.add(s.pop()+s.pop());
            }
            else if(tokens[i].equals("-")) //|| tokens[i]== "-" || tokens[i]== "*" || tokens[i]== "/")
            {
                int f = s.pop();
                int se = s.pop();
                s.add(se - f);
            }
            else if(tokens[i].equals("*")) //|| tokens[i]== "-" || tokens[i]== "*" || tokens[i]== "/")
            {
                s.add(s.pop()*s.pop());
            }
            else if(tokens[i].equals("/")) //|| tokens[i]== "-" || tokens[i]== "*" || tokens[i]== "/")
            {
                int f = s.pop();
                int se = s.pop();
                s.add(se/f);
            }
            else
            {
                s.add(Integer.parseInt(tokens[i]));
            }
            
        }
        return s.peek();
    }
}
