package com.learning.core.day1session1;

	class Tablet implements MedicineInfo {
	    @Override
	    public void displayLabel() {
	        System.out.println("Tablet: Store in a cool, dry place.");
	    }
	}

	// Syrup class implementing MedicineInfo interface
	class Syrup implements MedicineInfo {
	    @Override
	    public void displayLabel() {
	        System.out.println("Syrup: Shake well before use.");
	    }
	}

	// Ointment class implementing MedicineInfo interface
	class Ointment implements MedicineInfo {
	    @Override
	    public void displayLabel() {
	        System.out.println("Ointment: For external use only.");
	    }
	}