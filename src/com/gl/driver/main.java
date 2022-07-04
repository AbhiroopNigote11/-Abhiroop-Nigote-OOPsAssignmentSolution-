package com.gl.driver;
import com.gl.service.AdminDepartment;
import com.gl.service.HrDepartment;
import com.gl.service.TechDepartment;

public class main {
	 public static void main(String args [])
	    {

	        HrDepartment hr = new HrDepartment();
	        TechDepartment td = new TechDepartment();
	        AdminDepartment ad = new AdminDepartment();
	        ((AdminDepartment) ad).departmentName();
	        ad.getTodaysWork();
	        ad.getWorkDeadline();
	        ad.isTodayAHoliday();
	        System.out.println("\n");
	        hr.departmentName();
	        hr.doActivity();
	        hr.getTodaysWork();
	        hr.getWorkDeadline();
	        hr.isTodayAHoliday();
	        System.out.println("\n");
	        td.departmentName();
	        td.getTodaysWork();
	        td.getWorkDeadline();
	        td.getTechStackinformation();
	        td.isTodayAHoliday();
	    }
}

