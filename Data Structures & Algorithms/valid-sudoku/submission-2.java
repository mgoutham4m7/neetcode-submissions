class Solution {
    public boolean isValidSudoku(char[][] board) 
    {
        if (checkHori(board) == false)
        {
            System.out.println("f1");
            return false;
        }
        
        if (checkVerti(board) == false)
        {
            System.out.println("f2");

            return false;
        }

        if (check1stBox(board,0)==false || check1stBox(board,3)==false || check1stBox(board,6)==false )
        {
            return false;
        }
        if (check2ndBox(board,0)==false || check2ndBox(board,3)==false || check2ndBox(board,6)==false)
        {
            return false;
        }
        if (check3rdBox(board,0)==false || check2ndBox(board,3)==false || check2ndBox(board,6)==false)
        {
            return false;
        }
            
        
        return true;
        
    }
    boolean checkHori(char[][] board)
    {
        for(int i=0;i<9;i++)
        {
            Set<Character> m = new HashSet<>();
            for(int j=0;j<9;j++)
            {
                if(board[i][j]!='.'){
                if(!m.contains(board[i][j]))
                {
                    m.add(board[i][j]);
                }
                else
                {
                    System.out.println(m+" "+i+ " "+j);

                    return false;
                }}
            }
            
        
        }
        return true;
    }
    boolean checkVerti(char[][] board)
    {
        for(int i=0;i<9;i++)
        {
            Set<Character> m = new HashSet<>();
            for(int j=0;j<9;j++)
            {
                if(board[j][i]!='.'){
                if(!m.contains(board[j][i]))
                {
                    m.add(board[j][i]);
                }
                else
                {
                    System.out.println(m+" "+i+ " "+j);
                    return false;
                }}
            }
        
        }
        return true;
    }
    boolean check1stBox(char[][] board, int i)
    {
        Set<Character> m = new HashSet<>();
        for(int row =0; row<3; row++)
        {
            for(int col =i; col<3+i; col++)
            {
                if(board[row][col]!='.'){
                if(!m.contains(board[row][col]))
                {
                    m.add(board[row][col]);
                }
                else
                {
                    return false;
                }}
            }
            System.out.println("board 1 "+m);

        }
        return true;

    }
    boolean check2ndBox(char[][] board, int i)
    {
        Set<Character> m = new HashSet<>();
        for(int row =3; row<6; row++)
        {
            for(int col =i; col<3+i; col++)
            {
                if(board[row][col]!='.'){
                if(!m.contains(board[row][col]))
                {
                    m.add(board[row][col]);
                }
                else
                {
                    return false;
                }}
            }
            //System.out.println("board 2 "+m);

        }
        return true;

    }
    boolean check3rdBox(char[][] board, int i)
    {
        Set<Character> m = new HashSet<>();
        for(int row =6; row<9; row++)
        {
            for(int col =i; col<3+i; col++)
            {
                if(board[row][col]!='.'){
                if(!m.contains(board[row][col]))
                {
                    m.add(board[row][col]);
                }
                else
                {
                    return false;
                }}
            }
            //System.out.println("board 3 "+m);

        }
        return true;

    }
}
