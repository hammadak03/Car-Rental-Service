/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author Hammad Ahmed
 */
public class EmployeeSession {
    
        private static int employeeId;
        private static String employeeJob;

    public static int getEmployeeId() {
        return employeeId;
    }
    
    public static String getEmployeeJob(){
        return employeeJob;
    }
    
    public static void setEmployeeJob(String job) {
        employeeJob = job;
    }

    public static void setEmployeeId(int id) {
        employeeId = id;
    }

    
}
