package com.sist.hd.vo;

public class UserVO extends DTO{
	private String name;//유저이름
	private String id;//유저아이디
	private String password;//유저비밀번호
	private String birth;//유저생년월일
	private String address;//유저주소
	private String tel;//유저전화번호
	private String MsgId; //로그인 성공여부를 보여주는 메세지아이디(1: 성공, -1: 아이디오류, -2: 비밀번호오류)
	
	public UserVO() { }
	
	public UserVO(String name, String id, String password, String birth, String address, String tel) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
		this.birth = birth;
		this.address = address;
		this.tel = tel;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((birth == null) ? 0 : birth.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((tel == null) ? 0 : tel.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserVO other = (UserVO) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (birth == null) {
			if (other.birth != null)
				return false;
		} else if (!birth.equals(other.birth))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (tel == null) {
			if (other.tel != null)
				return false;
		} else if (!tel.equals(other.tel))
			return false;
		return true;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * 
	 * @Method Name  : getMsgId
	 * @작성일   : 2019. 2. 25.
	 * @작성자   : SIST 111
	 * @변경이력  : 0.5
	 * @Method 설명 :  1 : 로그인 성공
	 * 				-1 : 아이디 틀림
	 * 				-2 : 비밀번호 틀림
	 * @return
	 */
	public String getMsgId() {
		return MsgId;
	}

	public void setMsgId(String msgId) {
		MsgId = msgId;
	}

	@Override
	public String toString() {
		return "UserVO [name=" + name + ", id=" + id + ", password=" + password + ", birth=" + birth + ", address="
				+ address + ", tel=" + tel + ", MsgId=" + MsgId + "]";
	}

}