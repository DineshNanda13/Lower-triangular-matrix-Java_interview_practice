package com.LTM;

/**
 *
 * @author Dinesh Nanda
 */

public class LowerTriangularMatrix {

    public static void main(String[] args) {
        
        int arr [][] = {{1,2,3}, {8,6,4}, {4,5,6}};
        
        int row = arr.length;
        int col = arr[0].length;
        
        if(row != col){
            
            System.out.println("The given matrix is not a square matrix so can't be a Lower Triangular Matrix");
            
        }else{
            
            for(int i = 0; i < row; i++){
                for(int j = 0; j < col; j++){
                    
                    if(j > i){
                        arr[i][j] = 0;
                    }
                }
            }
            for(int i = 0; i < row; i++){
                for(int j = 0; j < col; j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
    
}
