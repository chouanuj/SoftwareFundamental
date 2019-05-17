/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;
import java.util.Scanner;
/**
 *
 * @author sidhu376
 */
public class StudentList {
    
    public static void main(String[] args) {
        String name;
        int id;
        Scanner in=new Scanner(System.in);
        Student [] sList= new Student[5];
        
        for (int i=0;i<sList.length;i++)
        {
            sList[i]=new Student();
            
        }
        
        for(int i=0;i<sList.length;i++)
        {
            System.out.println("Enter name");
            name=in.next();
            sList[i].setName("Student" +(name));
            System.out.println("Enter id");
            id=in.nextInt();
            sList[i].setId(id);
        }
        
    }
    
}
