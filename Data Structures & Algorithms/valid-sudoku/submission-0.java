class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++)
        {
            Set<Character> rowSet=new HashSet<>();
            Set<Character> colSet=new HashSet<>();
            Set<Character> boxSet=new HashSet<>();
            for(int j=0;j<9;j++)
            {
                if(board[i][j]!='.' && !rowSet.add(board[i][j]))
                {
                    return false;
                }

                if(board[j][i]!='.' && !colSet.add(board[j][i]))
                {
                    return false;
                }

                char ch=board[3*(i/3)+j/3][3*(i%3)+j%3];
                if(ch!='.' && !boxSet.add(ch))
                {
                    return false;
                }
            }
        }
        return true;
    }
}
