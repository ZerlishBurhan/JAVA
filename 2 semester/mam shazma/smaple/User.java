class User{
	
	private String userName;

	public User(){

	}
	public User(String userName){
		this.userName = userName;
	}

	public void setUserName(){
		this.userName = userName; 
	}
	public String getUserName(){
		return userName;
	}

	public String toString(){
		return "User Name : " + userName;
	}
}