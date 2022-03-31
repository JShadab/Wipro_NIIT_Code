public class Customer {

	private int customerId;
	private String name;
	private String email;

	public Customer() {
		// default Constructor

	}

	public Customer(int customerId, String name, String email) {
		this.customerId = customerId;
		this.name = name;
		this.email = email;

	}

	@Override
	public boolean equals(Object obj) {

		Customer c2 = (Customer) obj;
		Customer c1 = this;

		String name1 = c1.getName();
		String name2 = c2.getName();

		boolean isNameSame = name1.equals(name2);

		String email1 = c1.getEmail();
		String email2 = c2.getEmail();

		boolean isEmailSame = email1.equals(email2);

		return isNameSame && isEmailSame;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
