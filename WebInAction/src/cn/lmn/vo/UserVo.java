package cn.lmn.vo;

import java.util.List;

import cn.lmn.entity.User;

/**
 * ҳ����ҵ�����ݽ�������
 * @author Administrator
 *
 */
public class UserVo {
	private Long id;
	private String name;
	private String phone;
	private String email;
	private String address;
	
	private List<User> userList;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<User> getUserList() {
		return userList;
	}
	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	
}
