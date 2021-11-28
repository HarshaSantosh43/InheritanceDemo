/**
 * 
 */
package com.sgk.learning.oops.main;

import com.sgk.learning.oops.departments.AdminDepartment;
import com.sgk.learning.oops.departments.HrDepartment;
import com.sgk.learning.oops.departments.TechDepartment;

/**
 * @author Santosh Katral
 *
 */
public class MainApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AdminDepartment adminDepartment = new AdminDepartment();
		System.out.println("Welcome to " + adminDepartment.departmentName());
		System.out.println(adminDepartment.getTodaysWork() + "\n"
				+ adminDepartment.getWorkDeadline() + "\n"
				+ adminDepartment.isTodayAHoliday());
		
		System.out.println("---------------------*****-----------------------");

		HrDepartment hrDepartment = new HrDepartment();
		System.out.println("Welcome to " + hrDepartment.departmentName());
		System.out.println(hrDepartment.doActivity() + "\n"
				+ hrDepartment.getTodaysWork() + "\n"
				+ hrDepartment.getWorkDeadline() + "\n"
				+ hrDepartment.isTodayAHoliday());

		System.out.println("---------------------*****-----------------------");
		
		TechDepartment techDepartment = new TechDepartment();
		System.out.println("Welcome to " + techDepartment.departmentName());
		System.out.println(techDepartment.getTechStackInformation() + "\n"
				+ techDepartment.getTodaysWork() + "\n"
				+ techDepartment.getWorkDeadline() + "\n"
				+ techDepartment.isTodayAHoliday());
		
	}

}
