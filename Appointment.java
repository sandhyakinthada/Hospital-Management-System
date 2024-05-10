package com.hospital;

public class Appointment {
	private int patientId;
    private int doctorId;
    private String appointmentDate;
	public Appointment(int patientId, int doctorId, String appointmentDate) {
		super();
		this.patientId = patientId;
		this.doctorId = doctorId;
		this.appointmentDate = appointmentDate;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {                                
		
		this.patientId = patientId;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Appointment [patientId=" + patientId + ", doctorId=" + doctorId + ", appointmentDate=" + appointmentDate
				+ "]";
	}

}

