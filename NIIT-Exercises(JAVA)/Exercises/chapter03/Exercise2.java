/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter03;

/**
 *
 * @author harsh
 */
public class Exercise2 {
    
    public static void main(String[] args)
    {    
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=6-i;j++)
                System.out.print(j);
            System.out.println();
        }
        
    }    
    
}
