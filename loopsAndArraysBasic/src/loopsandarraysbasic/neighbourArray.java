/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopsandarraysbasic;

/**
 *
 * @author simra
 */
public class neighbourArray {
    
    
    public static double neighborAverage(int[][] values, int row, int column) {

        int[][] neighborAverage = {{3, 2, 4}, {7, 4, 1}, {3, 6, 8}, {2, 9, 3}};

        int total = 0;
        row = 4;
        column = 3;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if(i>0){ total = total + neighborAverage[i-1][j];
                    
                }
            }
            System.out.println("");
        }
        return 0;
    }
    
}
