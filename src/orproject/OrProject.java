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
public class OrProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
        System.out.println("which operation of these matrcies do you want to find:");
        System.out.println("1- Scalar Multiply"+"\n"+"2- Transpose");
        System.out.println("3- Symmatric Validation"+"\n"+"4- Sum");
        System.out.println("5- Multiplication"+"\n"+"6- Equality Validation");
        System.out.println("7- Zero Matrix"+"\n"+"8- Identity Matrix");
        System.out.println("9- cheak validation for multiply");
        char ch=sc.next().charAt(0);
        switch(ch){
            case'1':
                MyMatrix m;
                System.out.println("enter the number of rows and columns:");
                int ro=sc.nextInt();
                int col=sc.nextInt();
                m = new MyMatrix(ro, col);         
                double arra[][]= new double[ro][col];
                for(int i=0;i<ro;i++){
                for(int j=0;j<col;j++){  
                System.out.println("enter the element for row "+(i+1)+" column "+(j+1));
                arra[i][j]=sc.nextDouble();
                                }
                                      }
                //MyMatrix mm;
                System.out.println("enter the scalar");
                double scal=sc.nextDouble();
                m.setArrayMatrix(arra);
                m=m.scalarMultiply(scal);
                System.out.println("the result for scalar multiplying ");
                m.display();
                
                
            break;
            case'2':
                try{
                
                
                
                System.out.println("enter the number of rows and columns:");
                int ro2=sc.nextInt();
                int col2=sc.nextInt();
                
                MyMatrix m2 = new MyMatrix(ro2, col2);         
                double arra2[][]= new double[ro2][col2];
                for(int i=0;i<ro2;i++){
                for(int j=0;j<col2;j++){  
                System.out.println("enter the element for row "+(i+1)+" column "+(j+1));
                arra2[i][j]=sc.nextDouble();
                                }
                                      }

                m2.setArrayMatrix(arra2);
                
                System.out.println("the result for transpose ");
                m2.transpose().display();
                }
                catch(Exception e){
                
                System.out.println("The size of matrix is notValid !!");
                }    
                    
            break;
            case'3':
                try{
                MyMatrix m3;
                System.out.println("enter the number of rows and columns:");
                int ro3=sc.nextInt();
                int col3=sc.nextInt();
                m3 = new MyMatrix(ro3, col3);         
                double arra3[][]= new double[ro3][col3];
                for(int i=0;i<ro3;i++){
                for(int j=0;j<col3;j++){  
                System.out.println("enter the element for row "+(i+1)+" column "+(j+1));
                arra3[i][j]=sc.nextDouble();
                                }
                                      }

                m3.setArrayMatrix(arra3);
                System.out.println(m3.isSymmatric());
                }
                catch(Exception e){
                    System.out.println("The size of matrix is notValid !!");
                
                }
                break;
                case'4':
                    try{
                MyMatrix m4,m5,m6;
                System.out.println("enter the number of rows and columns for matrix 1:");
                int ro4=sc.nextInt();
                int col4=sc.nextInt();
                m4 = new MyMatrix(ro4, col4);         
                double arra4_1[][]= new double[ro4][col4];
                for(int i=0;i<ro4;i++){
                for(int j=0;j<col4;j++){  
                System.out.println("enter the element for row "+(i+1)+" column "+(j+1));
                arra4_1[i][j]=sc.nextDouble();
                                }
                                      }

                m4.setArrayMatrix(arra4_1);
  
                System.out.println("enter the number of rows and columns for matrix 2:");
                int ro4_2=sc.nextInt();
                int col4_2=sc.nextInt();
                m5 = new MyMatrix(ro4_2, col4_2);         
                double arra4_2[][]= new double[ro4_2][col4_2];
                for(int i=0;i<ro4_2;i++){
                    for(int j=0;j<col4_2;j++){  
                        System.out.println("enter the element for row "+(i+1)+" column "+(j+1));
                        arra4_2[i][j]=sc.nextDouble();
                                        }
                                              }

                m5.setArrayMatrix(arra4_2);
                m6=m4.sum(m5);
                System.out.println("The result of addition :");
                m6.display();
                
                }
                    
                catch(Exception e){
                    System.out.println("The size of matrix is notValid !!");
                
                }
                break;
                case'5':
                       try{
                MyMatrix m7,m8,m9;
                System.out.println("enter the number of rows and columns for matrix 1:");
                int ro7=sc.nextInt();
                int col7=sc.nextInt();
                m7 = new MyMatrix(ro7, col7);
                
                double arra5_1[][]= new double[ro7][col7];
                for(int i=0;i<ro7;i++){
                for(int j=0;j<col7;j++){  
                System.out.println("enter the element for row "+(i+1)+" column "+(j+1));
                arra5_1[i][j]=sc.nextDouble();
                                }
                                      }

                m7.setArrayMatrix(arra5_1);
  
                System.out.println("enter the number of rows and columns for matrix 2:");
                int ro8=sc.nextInt();
                int col8=sc.nextInt();
                m8 = new MyMatrix(ro8, col8);         
                double arra7_2[][]= new double[ro8][col8];
                for(int i=0;i<ro8;i++){
                    for(int j=0;j<col8;j++){  
                        System.out.println("enter the element for row "+(i+1)+" column "+(j+1));
                        arra7_2[i][j]=sc.nextDouble();
                                        }
                                              }
                System.out.println(m7.validForMultiplication(m8));

                m8.setArrayMatrix(arra7_2);
                m9=m7.multiplematrix(m8);
                System.out.println("The result of multiplication :");
                m9.display();
                
                }
                    
                catch(Exception e){
                    System.out.println("The size of matrix is notValid !!");
                
                }
                break;
                case'6':
                     try{
                        MyMatrix m10,m11,m12;
                        System.out.println("enter the number of rows and columns for matrix 1:");
                        int ro10=sc.nextInt();
                        int col10=sc.nextInt();
                        m10 = new MyMatrix(ro10, col10);         
                        double arra10[][]= new double[ro10][col10];
                        for(int i=0;i<ro10;i++){
                        for(int j=0;j<col10;j++){  
                        System.out.println("enter the element for row "+(i+1)+" column "+(j+1));
                        arra10[i][j]=sc.nextDouble();
                                        }
                                              }

                        m10.setArrayMatrix(arra10);

                        System.out.println("enter the number of rows and columns for matrix 2:");
                        int ro11=sc.nextInt();
                        int col11=sc.nextInt();
                        m11 = new MyMatrix(ro11, col11);         
                        double arra11[][]= new double[ro11][col11];
                        for(int i=0;i<ro11;i++){
                            for(int j=0;j<col11;j++){  
                                System.out.println("enter the element for row "+(i+1)+" column "+(j+1));
                                arra11[i][j]=sc.nextDouble();
                                                }
                                                      }

                        m11.setArrayMatrix(arra11);
                        //m12=m10.equals(m11);
                        System.out.println(m10.equals(m11));


                        }

                        catch(Exception e){
                            System.out.println("The size of matrix is notValid !!");

                        }
                break; 
                case'7':
                    MyMatrix m13;
                    System.out.println("enter the number of rows and columns for matrix :");
                    int ro13=sc.nextInt();
                    int col13=sc.nextInt();
                    m13 = new MyMatrix(ro13, col13);          
                    m13.display();
                break;
                case'8':
                    MyMatrix m14;
                    System.out.println("enter matrix size");
                    int ro14=sc.nextInt();
                    
                    m14=new MyMatrix(ro14,ro14);
                    m14.display();
                break;  
                case'9':
                    MyMatrix m15,m16;
                    System.out.println("enter the number of rows and columns for matrix 1");
                    int ro15=sc.nextInt();
                    int col15=sc.nextInt();
                    m15=new MyMatrix(ro15,col15);
                    System.out.println("enter the number of rows and columns for matrix 2");
                    int ro16=sc.nextInt();
                    int col16=sc.nextInt();
                    m16=new MyMatrix(ro16,col16);
                    System.out.println(m15.validForMultiplication(m16));
                break;
                
                
                
       }
    }
}
        

