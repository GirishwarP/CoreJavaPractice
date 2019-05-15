package com.practice;
public class DigonalMatrix {
       private Integer matrix[][] = 					{{1,2,3,4},
                                                         {5,6,7,8},
                                                         {9,10,11,12},
                                                         {13,14,15,16},
                                                         };
       
       public static void main(String args[]){
              DigonalMatrix digonalMatrix = new DigonalMatrix();
              digonalMatrix.displayDigonalMatrix();
                           
       }
       
       public void displayDigonalMatrix(){
              int line = matrix.length * 2 - 1;
              int row = matrix.length;
              int col = matrix[0].length;
              int rowCounter = 0;
              int colCounter = 0;
              
              for (int i = 0; i <= line; i++) {
                     
            	  if(i < row ) {
            		  rowCounter =  i;
                      colCounter = 0; 
            	  }else {
            		  rowCounter =  row-1;
                      colCounter =  colCounter + 1;
            	  }
                     
                     
                     for (int j = colCounter; j <= i; j++) {
                           if(j>=col){
                                  continue;
                           }
                           System.out.print(matrix[rowCounter--][j]+ " ");
                     }
                     System.out.println();
              }
       }
       
}
