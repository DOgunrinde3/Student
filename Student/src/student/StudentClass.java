/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

import java.util.Scanner;

/**
 *
 * @author Danie
 */
public class StudentClass {
    private int studentID;
    private String Institution;
     private String firstName; 
     private String lastName;
     private double tuition = 0;
     private int [] classesByID = {9999,9999,9999,9999,9999};
     private String [] classesByName = {"NoClass","NoClass","NoClass","NoClass","NoClass"};
    
     private int numberofClass = 0;
     
    
    public StudentClass (String Institution, int studentID, String firstName, String lastName, double tuition){
    this.Institution = Institution;
    this.studentID = studentID;
    this.firstName = firstName;
    this.lastName = lastName; 
    this.tuition = tuition;
    
  
    }
    
    public StudentClass()
    {
        //NumberOfStudents++;
    }

    /**
     * @return the studentID
     */
    public int getStudentID() {
        return studentID;
    }

    /**
     * @param studentID the studentID to set
     */
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    /**
     * @return the Institution
     */
    public String getInstitution() {
        return Institution;
    }

    /**
     * @param Institution the Institution to set
     */
    public void setInstitution(String Institution) {
        this.Institution = Institution;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the tuition
     */
    public double getTuition() {
        return tuition;
    }

    /**
     * @return the classesByID
     */
    public int[] getClassesByID() {
        return classesByID;
    }

    /**
     * @param classesByID the classesByID to set
     */
    public void setClassIDByIndex(int index, int newClassID) {
        this.classesByID = classesByID;
         classesByID[index] = newClassID;
    }

    /**
     * @return the classesByName
     */
    public String[] getClassesByName() {
        return classesByName;
    }

    /**
     * @param classesByName the classesByName to set
     */
    public void setClassNameByIndex(int index, String newClassName) {
        this.classesByName = classesByName;
        classesByName[index] = newClassName;
        
    }
    
    public String studentName()
    {
        return firstName + lastName;
    
    }
    
     public String studentClass()
    {
        return "ClassID: " + getClassesByID() + "ClassName : " + getClassesByName();
    }
     
     public void tobeDropped(int idToBeDropped, String nametobeDropped)
     {
         
         for (int i = 0; i < classesByID.length; i++) {
          
             if (classesByID[i] == idToBeDropped && classesByName[i].toLowerCase().equals(nametobeDropped.toLowerCase()) )
             {

                 setClassIDByIndex(i, 9999);
                 setClassNameByIndex(i, "No Class");
                 
            
               if (numberofClass > 0) 
                 {
                     numberofClass--;
                 
                 }
            
              updatetuition(numberofClass);
             }
             
          
         }
         
       
             
     
     }
     
      public void enroll(int index, int classID, String className)
      {
          if (classesByID[index]== 9999 ){
              
          setClassIDByIndex(index, classID);
          setClassNameByIndex(index, className);
          
          
          
          }
          
          else if (classesByID[index]!= 9999 )
          {
               int newindex = 0; 
              
              for (int i = 0; i < classesByID.length; i++) {
             
             if (classesByID[i] == 9999)
             {
               newindex = i;
               
                break;
             }
             
             

              }
             setClassIDByIndex(newindex, classID);
              setClassNameByIndex(newindex, className);
                
      
         
          
          }
       
           numberofClass++;
          updatetuition(numberofClass);
         
          
      
      }
      
       private void updatetuition(int number)
      {
          tuition = Double.valueOf(numberofClass) * 499.99;
      
      }
       
     
    
}
