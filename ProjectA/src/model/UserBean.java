package model;

import java.io.Serializable;

//ユーザー情報を格納するためのBean
public class UserBean implements Serializable {
	private String id; //ログインID
	private String name; //ネーム（登録時に入力）

	//引数なしのコンストラクタ
	public UserBean() {
	}

	//コンストラクタ
	public UserBean(String id, String name) {
		this.id = id;
		this.name = name;
	}

	//GetterとSetter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
