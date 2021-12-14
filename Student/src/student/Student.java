/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package student;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Danie
 */
public class Student {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner (System.in);
         StudentClass newstudent = new StudentClass(); 
       int choice = 0;
       String Institution = "";
       int sID = 0;
       String firstName = "";
       String lastName = "";
       int numofClasses = 0;
       
       
        while (choice != 9)   {
        System.out.println("Choose an option ");
        System.out.println("Option 1: Create a Student ");
      System.out.println("Option 2: Display all Students Information ");
       System.out.println("Option 3: Edit a Students Information ");
       System.out.println("Option 4: Display Students Classes");
       System.out.println("Option 5: Enroll Student in class");
           System.out.println("Option 6: Drop Student from class");
            System.out.println("Option 9: Exit");
           
         
          choice = keyboard.nextInt();
         
         
          
          if (choice == 1)
          {
              //StudentClass newstudent = new StudentClass();   
              
              System.out.print("Enter Students Instituion: ");
               Institution = keyboard.next();
              newstudent.setInstitution(Institution);
             
              System.out.print("Enter StudentID: ");
               sID = keyboard.nextInt();
              newstudent.setStudentID(sID);
              
              System.out.print("Enter Students First Name: ");
               firstName = keyboard.next();
              newstudent.setFirstName(firstName);
              
              System.out.print("Enter Students Last Name: ");
               lastName = keyboard.next();
              newstudent.setLastName(lastName);
              
              
              
             // System.out.println("Enter Students First Name");
              
          
          }
          
           if (choice == 2)
          {
              //StudentClass display = new StudentClass(); 
              System.out.println("Intitution: "+newstudent.getInstitution());
               System.out.println("StudentID: "+newstudent.getStudentID());
                System.out.println("FirstName: "+ newstudent.getFirstName());
                 System.out.println("LastName: " +newstudent.getLastName());
                System.out.println("ClassID: " + Arrays.toString(newstudent.getClassesByID()));
                System.out.println("ClassName: " + Arrays.toString(newstudent.getClassesByName()));
                System.out.println("Tuition: $" + newstudent.getTuition());
                 
          
          }
           
           
           
           
            if (choice == 3)
          {
               int choice2 = 0;
               System.out.println("Option 1: Edit Insitution ");
               System.out.println("Option 2: Edit StudentID ");
               System.out.println("Option 3: Edit FirstName ");
                System.out.println("Option 4: Edit LastName");
                
                choice2 = keyboard.nextInt();
                while (choice2 != 9)
                {
                    if (choice2 == 1)
                {
                      System.out.print("Enter Students Instituion: ");
               Institution = keyboard.next();
              newstudent.setInstitution(Institution);
              break;
            

                }
                    if (choice2 == 2)
                {
                    System.out.print("Enter StudentID: ");
               sID = keyboard.nextInt();
              newstudent.setStudentID(sID);
              break;
              
                
                }
                    if (choice2 == 3)
                {
                 System.out.print("Enter Students First Name: ");
               firstName = keyboard.next();
              newstudent.setFirstName(firstName);
              break;
                }
                    if (choice2 == 4)
                {
                System.out.print("Enter Students Last Name: ");
               lastName = keyboard.next();
              newstudent.setLastName(lastName);
              break;
                }
                    
                    
                    
                }
               
          
          }
            
             if (choice == 4)
          {
               System.out.println("ClassID: " + Arrays.toString(newstudent.getClassesByID()));
                System.out.println("ClassName: " + Arrays.toString(newstudent.getClassesByName()));
          }
             
              if (choice == 5)
          {     
              if(numofClasses < 0)
              {
                  numofClasses = 0;
              
              }
              if(numofClasses < 5){
                  
                  
          System.out.print("Enter ClassID to enroll Student: ");
          int classID = keyboard.nextInt();

          System.out.print("Enter ClassName to enroll Student: ");
          String className = keyboard.next();

          newstudent.enroll(numofClasses, classID, className);

              numofClasses++;
              
              System.out.println("Enrolled, You can enroll in : " + (5 - numofClasses) + " more classes ");
              
              }
              
              else 
              {
                  System.out.println("You must drop a class in order to add a new one");
              
              }
                     
          
             }
             
             
    
              
               if (choice == 6)
          {
              System.out.println("ClassID: " + Arrays.toString(newstudent.getClassesByID()));
                System.out.println("ClassName: " + Arrays.toString(newstudent.getClassesByName()));
                
                  System.out.println("Enter ClassID of the class you want the student to be dropped from ");
                  int dropID = keyboard.nextInt();
                  
                  
                  
                  System.out.println("Enter Class Name of the class you want the student to be dropped from ");
                  String dropName = keyboard.next();
                
                  
                 if (Arrays.toString(newstudent.getClassesByID()).indexOf(String.valueOf(dropID)) == -1 || Arrays.toString(newstudent.getClassesByName()).toLowerCase().indexOf(dropName.toLowerCase()) == -1 ) 
                 {
                     System.out.println("Student is not enrolled for this class");
                    
                 
                 }
                  
                 else{
                  newstudent.tobeDropped(dropID, dropName);
                 
                  if (numofClasses > 0) 
                 {
                     numofClasses--;
                 
                 }
                 
                  //System.out.println(numofClasses);
              
              System.out.println("Dropped, You can enroll in : " + (5 - numofClasses) + " more classes ");
                
                  System.out.println("ClassID: " + Arrays.toString(newstudent.getClassesByID()));
                System.out.println("ClassName: " + Arrays.toString(newstudent.getClassesByName()));
          
          }
                 
          }
    }
   

}
}
