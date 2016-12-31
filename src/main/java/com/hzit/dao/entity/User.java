package com.hzit.dao.entity;

/**
 * 
 * @author wjf
 */
public class User {
	/**
	 *  用户ID
	 */
	private Integer userId;
	/**
	 *  用户名字
	 */
	private String userName;
	/**
	 *  用户密码
	 */
	private String userPwd;
	/**
	 *  负责模块 0代表管理员 1代表教务
	 */
	private Integer userRole;
	/**
	 * 用户ID
	 * @param userId
	 */
	public void setUserId(Integer userId){
		this.userId = userId;
	}
	
    /**
     * 用户ID
     * @return
     */	
    public Integer getUserId(){
    	return userId;
    }
	/**
	 * 用户名字
	 * @param userName
	 */
	public void setUserName(String userName){
		this.userName = userName;
	}
	
    /**
     * 用户名字
     * @return
     */	
    public String getUserName(){
    	return userName;
    }
	/**
	 * 用户密码
	 * @param userPwd
	 */
	public void setUserPwd(String userPwd){
		this.userPwd = userPwd;
	}
	
    /**
     * 用户密码
     * @return
     */	
    public String getUserPwd(){
    	return userPwd;
    }
	/**
	 * 负责模块 0代表管理员 1代表教务
	 * @param userRole
	 */
	public void setUserRole(Integer userRole){
		this.userRole = userRole;
	}
	
    /**
     * 负责模块 0代表管理员 1代表教务
     * @return
     */	
    public Integer getUserRole(){
    	return userRole;
    }

	@Override
	public String toString() {
		return "User{" +
				"userId=" + userId +
				", userName='" + userName + '\'' +
				", userPwd='" + userPwd + '\'' +
				", userRole=" + userRole +
				'}';
	}
}