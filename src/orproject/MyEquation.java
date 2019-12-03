/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orproject;
import java.util.Scanner;

/**
 *
 * @author ameer
 */
public class MyEquation extends MyMatrix {
    private int numberOfEquation;
    private double [][] LHS=new double[numberOfEquation][numberOfEquation];
    private int RHS_absolute_value;

    public MyEquation(int numberOfEquation,int RHS_absolute_value) {
        this.numberOfEquation = numberOfEquation;
        this.RHS_absolute_value = RHS_absolute_value;
        this.LHS=new double[numberOfEquation][numberOfEquation];
    }
    public MyEquation(){}
    
    
    void insertNewEquation (MyEquation x) {
        Scanner s=new Scanner(System.in);
        //System.out.println("enter the number of equations ");
        //this.numberOfEquation=s.nextInt();
        for (int i = 0; i < this.numberOfEquation; i++) {
            System.out.println("enter the co-efficient of  of equation" + (i+1));
            for (int j = 0; j < this.numberOfEquation; j++) {
                    
                    this.LHS[i][j]=s.nextDouble();
            }
            
        }
        this.setArrayMatrix(LHS);
        
    }
    
    
    
}
