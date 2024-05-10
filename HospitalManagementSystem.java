package com.hospital;

import java.util.ArrayList;
import java.util.List;

public class HospitalManagementSystem {
	    List<Patient> patients;
	    private List<Doctor> doctors;
	    private List<Appointment> appointments;
	    private List<Feedback> feedbackForms;

	    public HospitalManagementSystem() {
	        this.patients = new ArrayList<>();
	        this.doctors = new ArrayList<>();
	        this.appointments = new ArrayList<>();
	        this.feedbackForms = new ArrayList<>();
	    }

	    public void addPatient(Patient patient) {
	        patients.add(patient);
	    }

	    public void viewPatients() {
	        for (Patient patient : patients) {
	            System.out.println(patient.getName());
	            System.out.println(patient.getAge());
	            System.out.println(patient.getGender());
	        }
	    }
        
	    public void addDoctor(Doctor doctor) {
	    	doctors.add(doctor);
	    }
	    
	    public void viewDoctors() {
	        for (Doctor doctor : doctors) {
	            System.out.println(doctor.getName());
	            System.out.println(doctor.getSpecialization());
	            
	        }
	    }
	    
	    public void addAppointment(Appointment appointment) {
	    	appointments.addAll(appointments);
	        
	    }

	    public void addFeedbackForm(Feedback feedbackForm) {
	        feedbackForms.add(feedbackForm);
	    }

}
