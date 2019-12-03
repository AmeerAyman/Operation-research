/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orproject;

/**
 *
 * @author ameer
 */
public class MyMatrix {
    private int row ,column;
    private double [][]arrayMatrix=new double[row][column];
    
    
    public MyMatrix(int row, int column) {
        this.arrayMatrix= new double [row][column];
        this.row = row;
        this.column = column;
       // this.arrayMatrix = arrayMatrix;  
    }

    MyMatrix() {
        
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public double[][] getArrayMatrix() {
        return arrayMatrix;
    }
    
    public void setArrayMatrix(double[][] arrayMatrix) {
        this.arrayMatrix = arrayMatrix;
    }
    public MyMatrix scalarMultiply(double scalar){    

        MyMatrix sm = new MyMatrix(this.row,this.column);
        for (int i = 0; i < sm.row; i++){
		for (int j = 0; j < sm.column; j++){
			sm.arrayMatrix[i][j] = scalar*this.arrayMatrix[i][j];
			}
		}
    return sm;
    }

    public MyMatrix transpose(){
    
        MyMatrix tr=new MyMatrix(this.row,this.column);
        for(int i=0;i<tr.row;i++){
            for(int j=0;j<tr.column;j++){
                tr.arrayMatrix[j][i]=this.arrayMatrix[i][j];
            }
        }
       
        
        return tr;
   }
    public MyMatrix sum(MyMatrix s){
        MyMatrix su=new MyMatrix(this.row,this.column);
        
        for(int i=0;i<su.row;i++){
            for(int j=0;j<su.column;j++){
                su.arrayMatrix[i][j]=this.arrayMatrix[i][j]+s.arrayMatrix[i][j];
            }
        }
        return su;
    }
    public void display (){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(this.arrayMatrix[i][j]+"  ");
            }
            System.out.println();

        }
    }
    public boolean isSymmatric(){
        //MyMatrix mm=this;
        for (int i = 0; i < this.getRow(); i++){
                for (int j = 0; j < this.getColumn(); j++){
                        if(this == this.transpose())
                            return true;
                    }
            }
        return false;
    }
    
    public MyMatrix multiplematrix(MyMatrix x )
    {
    MyMatrix answer = new MyMatrix(this.row, x.column);
        for (int i = 0; i < answer.row; i++) {
            for (int j = 0; j < answer.column; j++) {
                for (int k = 0; k < this.column; k++) {
                   answer.arrayMatrix [i][j]+= this.arrayMatrix[i][k]* x.arrayMatrix[k][j];
                }
            }
        }
         return answer; 
    }
    
   public MyMatrix zeroMatrix(int x , int y ){
   MyMatrix answer = new MyMatrix(this.row, this.column);
   return answer; 
   }
   public MyMatrix identityMatrix (int x){
     MyMatrix answer = new MyMatrix(this.row,this.column);
       for (int i = 0; i < x;i++) {
         answer.arrayMatrix[i][i]=1;
       
       }
  return answer ; 
       }
   boolean equals (MyMatrix m){
       MyMatrix mm=this;
       for (int i = 0; i < this.row; i++) {
           for (int j = 0; j < this.column; j++) {
               if (mm.arrayMatrix[i][j]== m.arrayMatrix[i][j]) { 
           return true ;
       }
           }
       
            
       }
       return false ;
   }
   boolean validForMultiplication (MyMatrix m){
   if (this.column== m.row)
       return true ; 
   else
       return false ;
    
   }
}
    