class Solution {
    int c=0,r=0;
    public boolean isValidSudoku(char[][] board) {
        int flag=0;
        boolean row,col,box;
        char num;
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    row=checkRow(board,i,j);
                    col=checkCol(board,i,j);
                    box=checkBox(board,i,j);
                    System.out.println(row +" " +col +" " +box +"\n");
                    if(row==false || col==false || box==false){
                        flag=0;
                        break;
                    }
                    flag=1;
                }
                else 
                    flag=1;
                
            }
            if(flag==0)
                break;
        }
        if(flag==1){
            return true;
        }
        return false;
        
    }
    public boolean checkRow(char b[][],int i,int j){
       char num=b[i][j];
        for(int k=0;k<9;k++){
            if(b[i][k]==num && k!=j){
                
                return false;
            }
        }
         return true;
    }
      public boolean checkCol(char b[][],int i,int j){
        char num=b[i][j];
        for(int k=0;k<9;k++){
            if(b[k][j]==num && k!=i){
                return false;
        }}
         return true;
        
    }
    public boolean checkBox(char b[][],int p,int q){
        char num=b[p][q];
        r = p-p%3;
        c = q-q%3;
        for(int i=r;i<r+3;i++){
            for(int j=c;j<c+3;j++){
                if(b[i][j]==num && i!=p && j!=q )
                    return false;
            }}
            return true;
            }
    }
