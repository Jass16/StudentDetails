/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentdetailsprint;

/**
 *creating local respitory in laptop
 * initialize version git
 * .getconfig file
 * .gitignore file
 * @author srinivsi
 */
import java.util.Scanner;
public class StudentDetailsPrint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // array of object decalration
         Student[] list = new Student[3];
         // initializing take input from the user
         Scanner input= new Scanner (System.in);
         //use for loop
         for (int i=0; i<list.length;i++){
             System.out.println ("Enter you name ");
             String n = input.nextLine();
               System.out.println ("Enter you age ");
             int a = input.nextInt();
             
             Student s1= new Student(n,a);
             list[i]= s1;
         }
         for (int i=0; i<list.length;i++){
             System.out.println (list[i].getName()+" " + list[i].getAge());
                System.out.println (list[i].getName()+" " + list[i].getAge());
             //fetch and merge
             //this is the branch test code
             //MODIFYING THE BRANCH
         }
         }
    
         
        
    
}
