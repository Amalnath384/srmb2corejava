class RowColoumn {

	public static void main(String[] args) 
	{
		int row, col, sumRow, sumCol;    
        
          
        int ar[][] = {       
                        {1, 2, 3},    
                        {2, 1, 4},    
                        {4, 1, 2}    
                    };    
              
             
          row = ar.length;    
        col = ar[0].length;    
            
           
        for(int i = 0; i < row; i++){    
            sumRow = 0;    
            for(int j = 0; j < col; j++){    
              sumRow = sumRow + ar[i][j];    
            }    
            System.out.println(sumRow);    
        }    
            
        
        for(int i = 0; i < col; i++){    
            sumCol = 0;    
            for(int j = 0; j < row; j++){    
              sumCol = sumCol + ar[j][i];    
            }    
            System.out.println(sumCol);    
		

	}
	}
}