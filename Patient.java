package com.hospital;

public class Patient {
	 private int id;
	    private String name;
	    private int age;
	    @Override
		public String toString() {
			return "Patient [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", phoneNo="
					+ phoneNo + "]";
		}
		private String gender;
	    private String phoneNo;
		public Patient() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Patient(int id, String name, int age, String gender, String phoneNo) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
			this.gender = gender;
			this.phoneNo = phoneNo;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}                                          
		public String getName() {
			return name;       
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;                                                         
		}
		

}
                                                                                                                                                                               