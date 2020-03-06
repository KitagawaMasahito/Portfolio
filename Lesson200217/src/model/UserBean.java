package model;

public class UserBean {
	private String userName;
	private String nickName;

	public UserBean() {
		super();
	}

	public UserBean(String userName, String nickName) {
		super();
		this.userName = userName;
		this.nickName = nickName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}


}
