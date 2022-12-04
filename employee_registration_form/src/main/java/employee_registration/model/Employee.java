package employee_registration.model;

public class Employee {
	 private String firstName;
	    private String lastName;
	    private String username;
	    private String password;
	    private String address;
	    private String contact;
		public String getFirstName() {
			return firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public String getUsername() {
			return username;
		}
		public String getPassword() {
			return password;
		}
		public String getAddress() {
			return address;
		}
		public String getContact() {
			return contact;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public void setContact(String contact) {
			this.contact = contact;
		}
	    
}
