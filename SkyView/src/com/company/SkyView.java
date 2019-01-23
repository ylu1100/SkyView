package com.company;

public class SkyView {
    private double[][]view;
    public SkyView(int numRows,int numCols,double[]scan){
        int scanindex = 0;
        boolean reverse = false;
        view = new double[numRows][numCols];
        for(int row = 0;row<numRows;row++){
            if(reverse == true){
                for(int col = numCols-1;col>-1;col--){
                    view[row][col]=scan[scanindex];
                    scanindex++;
                }
            }
            if(reverse==false) {
                for (int col = 0; col < numCols ;col++) {
                    view[row][col] = scan[scanindex];
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
    public String sv(){
        String sv = "";
        for (int row = 0; row < view.length; row++)
        {
            for (int column = 0; column < view[row].length; column++)
            {
                sv = sv+ view[row][column]+" ";
            }
            sv=sv+"\n";
        }
        return sv;
    }
}
