package com.company;

public class SkyView {
    public double[][]view;
    public SkyView(int numRows,int numCols,double[]scan){
        int scanindex = 0;
        boolean reverse = false;
        view = new double[numRows][numCols];
        for(int x = 0;x<numRows;x++){
            if(reverse == true){
                for(int y = numCols-1;y>0;y--){
                    view[x][y]=scan[scanindex];
                    scanindex++;
                }
            }
            if(reverse==false) {
                for (int y = 0; y < numCols ; y++) {
                    view[x][y] = scan[scanindex];
                    scanindex++;
                }
            }
            if (reverse == false){
                reverse=true;
            }
            else{
                reverse=false;
            }
        }
    }
    public double getAverage(int startRow,int endRow,int startCol, int endCol){
        double sum=0;
        int totalnumbers=0;
        for(int x = startRow;x<endRow;x++){
            for(int y = startCol;y<endCol;y++){
                sum=sum+view[x][y];
                totalnumbers++;
            }
        }
        return sum/totalnumbers;
    }
}