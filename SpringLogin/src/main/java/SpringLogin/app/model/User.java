package SpringLogin.app.model;

import lombok.Data;

//@Data //lombokを使用しているのでアノテーション一つでGetter,Setterを作成できる。
public class User {
	
	private int userId;
	
	private String password;
    
	private String userName;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}


