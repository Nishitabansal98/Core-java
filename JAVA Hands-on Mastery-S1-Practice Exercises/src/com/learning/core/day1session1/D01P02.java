package com.learning.core.day1session1;

public class D01P02 {

	public static void main(String[] args) {
		        // Declare medicine instances
		        MedicineInfo tablet = new Tablet();
		        MedicineInfo syrup = new Syrup();
		        MedicineInfo ointment = new Ointment();
		        
		        // Check polymorphic behavior of displayLabel method
		        System.out.println("Display label for Tablet:");
		        tablet.displayLabel();
		        
		        System.out.println("Display label for Syrup:");
		        syrup.displayLabel();
		        
		        System.out.println("Display label for Ointment:");
		        ointment.displayLabel();
		    }
}
