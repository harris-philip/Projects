/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepproject;


import java.util.ArrayList;

import java.util.*;


/**
 *
 * @author phili
 */
public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static Scanner scan2 = new Scanner(System.in);
    private static Scanner scan3 = new Scanner(System.in);
    private static String scanned = new String();
    private static String scanned2 = new String();
    private static String scanned3 = new String();
    

    /**
     * @param args the command line arguments
     */
        
    public static void main(String[] args) 
    {
        ArrayList<Student> studentList1;
        ArrayList<Student> studentList2;
        Advisor advisor1 = new Advisor("Dr. Bagert", "bagertd", "bagertd", studentList1);
        Advisor advisor2 = new Advisor("Dr. West", "weste", "weste", studentList2);
        TextReader reader = new TextReader("CS.txt");
        Major csMajor = reader.buildMajor(reader.ReadFile());
                

        System.out.println("1: Student");
        System.out.println("2: Advisor");
        System.out.println("3: Exit");
        System.out.print("Enter the number corresponding to what you would like to do: ");

        while (scan.hasNext()) 
        {
            scanned = scan.next();

            if (scanned.equals("1")) 
            {
                System.out.print("Please enter your student ID: ");
                scanned2 = scan.next();
                
                if (!scanned2.equals("person"))
                {
                    System.out.println("Invalid Student ID.");
                    System.out.println("1: Student");
                    System.out.println("2: Advisor");
                    System.out.println("3: Exit");
                    System.out.print("Enter the number corresponding to what you would like to do: ");
                    continue;
                }    
                else
                {
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    
                }
            } 
            else if (scanned.equals("2")) 
            {
                System.out.println("Please enter 3 if you wish to exit.");
                System.out.print("Please enter your username: ");
                scanned2 = scan.next().toLowerCase();
                if (scanned2.equals("3")) 
                {
                    break;
                }
                else if (scanned2.equals(advisor1.getUsername().toLowerCase()) || scanned2.equals(advisor2.getUsername().toLowerCase()))
                {
                    System.out.print("Please enter your password: ");
                    scanned3 = scan.next().toLowerCase();

                    if (scanned2.equals(advisor1.getUsername().toLowerCase()) && scanned3.equals(advisor1.getPassword().toLowerCase())) 
                    {
                        
                        System.out.println("1: Add a course");
                        System.out.println("2: Remove a course");
                        System.out.println("3: Build a schedule for a student");
                        System.out.println("4: Add a Student");
                        System.out.println("5: Delete a Student");
                        System.out.println("6: Log Out");
                        System.out.print("Enter the number corresponding to what you would like to do: ");
                    
                        while (scan2.hasNext())
                        {
                            scanned2 = scan2.next();
                            String courseName;
                            String courseId;
                            String preReqName;
                            int creditAmt;
                            boolean preReq;
                            
                            if (scanned2.equals("1")) 
                            {
                                System.out.print("Please enter the Course Name: ");
                                courseName = scan3.next();
                                System.out.print("Please enter the Course ID: ");
                                courseId = scan3.next();
                                System.out.print("Please enter the name of the Prerequiste course(Enter null if there is none): ");
                                if (scan3.equals("null"))
                                {
                                    
                                }
                                
                               
                                
                                
                        
                            } 
                            else if (scanned2.equals("2")) 
                            {
                        
                            } 
                            else if (scanned2.equals("3")) 
                            {
                        
                            } 
                            else if (scanned2.equals("4")) 
                            {
                        
                            } 
                            else if (scanned2.equals("5")) 
                            {
                        
                            } 
                            else if (scanned2.equals("6")) 
                            {
                                break;  
                            }
                        }
                    }
                    else if (scanned2.equals(advisor2.getUsername().toLowerCase()) && scanned3.equals(advisor2.getPassword().toLowerCase()))
                    {
                        
                        System.out.println("1: Add a course");
                        System.out.println("2: Remove a course");
                        System.out.println("3: Build a schedule for a student");
                        System.out.println("4: Add a Student");
                        System.out.println("5: Delete a Student");
                        System.out.println("6: Log Out");
                        System.out.print("Enter the number corresponding to what you would like to do: ");
                    
                        while (scan2.hasNext())
                        {
                            scanned2 = scan2.next();
                            if (scanned2.equals("1")) 
                            {
                        
                            } 
                            else if (scanned2.equals("2")) 
                            {
                        
                            } 
                            else if (scanned2.equals("3")) 
                            {
                        
                            } 
                            else if (scanned2.equals("4")) 
                            {
                        
                            } 
                            else if (scanned2.equals("5")) 
                            {
                        
                            } 
                            else if (scanned2.equals("6")) 
                            {
                                break;  
                            }
                        }  
                    }
                    
                    else
                    {
                        System.out.println("Password was invalid.");
                        System.out.println("1: Student");
                        System.out.println("2: Advisor");
                        System.out.println("3: Exit");
                        System.out.print("Enter the number corresponding to what you would like to do: ");
                        continue;
                    }
                }
                else 
                {
                    System.out.println("Username was invalid.");
                    System.out.println("1: Student");
                    System.out.println("2: Advisor");
                    System.out.println("3: Exit");
                    System.out.print("Enter the number corresponding to what you would like to do: ");
                    continue;
                }
            }
            else if (scanned.equals("3")) 
            {
                break;
            } 
            else 
            {
                System.out.println("1: Student");
                System.out.println("2: Advisor");
                System.out.println("3: Exit");
                System.out.print("Enter the number corresponding to what you would like to do: ");
                continue;
            }
        }

    }
}

