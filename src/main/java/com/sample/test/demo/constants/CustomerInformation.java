package com.sample.test.demo.constants;

public enum CustomerInformation {
    CUSTOMER1("John", "john@gmail.com", "1111111111"),
    CUSTOMER2("Test", "", ""),
    CUSTOMER3("", "", "1111111111")
    ;
	
	private String name;
	private String email;
    private String phone;

    private CustomerInformation(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPhone() {
        return phone;
    }

}
