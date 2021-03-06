/*
 *  Write a program to add Customer and find customer by id  to a table
	field of customer table :id, name,address, phone number, dob.
	While coding consider following factors:
	1. Implement DAO, DTO pattern
	2. Using exception wrapping and rethrowing
	3. Create connection factory, read connection details from a property file, in order to
	have loose coupling
 */

package com.customer.controller;

import java.sql.Date;
import com.customer.model.persistence.*;

public class CustomerApplication {

	public static void main(String[] args) {
		CustomerDao customerService=new CustomerDaoImpl(); 


		System.out.println("Adding Customers");
		customerService.addCustomer(new Customer(123, "Chesta", "Delhi", "9473652874", Date.valueOf("2001-01-04")));
		customerService.addCustomer(new Customer(456, "Shruti", "Punjab", "9376485848", Date.valueOf("1998-09-25")));


		Customer customer=customerService.getById(1);
		System.out.println("Accessing Customer by id");
		System.out.println(customer);

	}

}
