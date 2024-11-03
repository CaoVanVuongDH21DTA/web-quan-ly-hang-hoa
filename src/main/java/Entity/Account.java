package Entity;

public class Account {
	private int user_id;
	private String userName;
	private String passWord;
	private String email;
	private String fullName;
	private String phongNumber;
	private String address;
	
	public Account(int user_id, String userName, String passWord, String email, String fullName, String phongNumber,
			String address) {
		super();
		this.user_id = user_id;
		this.userName = userName;
		this.passWord = passWord;
		this.email = email;
		this.fullName = fullName;
		this.phongNumber = phongNumber;
		this.address = address;
	}
	
	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhongNumber() {
		return phongNumber;
	}

	public void setPhongNumber(String phongNumber) {
		this.phongNumber = phongNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

	@Override
	public String toString() {
		return "Account [user_id=" + user_id + ", userName=" + userName + ", passWord=" + passWord + ", email=" + email
				+ ", fullName=" + fullName + ", phongNumber=" + phongNumber + ", address=" + address + "]";
	}
}
