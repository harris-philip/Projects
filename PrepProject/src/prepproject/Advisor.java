/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepproject;

import java.util.ArrayList;

/**
 *
 * @author phili
 */
public class Advisor 
{
    private String name;
    private String username;
    private String password;
    private ArrayList<Student> studentList;
    
    public Advisor(String name2, String username2, String password2, ArrayList<Student> studentList2)
    {
        name2 = this.getName();
        username2 = this.getUsername();
        password2 = this.getPassword();
        studentList2 = this.getStudentList();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the studentList
     */
    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    /**
     * @param studentList the studentList to set
     */
    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
    
    public void addStudent(String name, String id, String year)
    {
        Student student = new Student(name, id, year);
        
        studentList.add(student);
    }
    
    public void deleteStudentId(String id)
    {
        int arrayIndex = 0;
        while(!id.equals(studentList.get(arrayIndex).getStudentId()))
        {
            arrayIndex++;
        }
        
        studentList.remove(arrayIndex);
    }
    
    public void deleteStudentName(String name)
    {
        int arrayIndex = 0;
        while(!name.equals(studentList.get(arrayIndex).getName()))
        {
            arrayIndex++;
        }
        
        studentList.remove(arrayIndex);
        
    }
    
}
