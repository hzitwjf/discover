package com.hzit.dao.entity;

/**
 * 
 * @author wjf
 */
public class Check {
	/**
	 *  ID自增长
	 */
	private Integer checkId;
	/**
	 *  评价的班级
	 */
	private String checkClass;
	/**
	 *  评价的老师
	 */
	private String checkTeacher;
	/**
	 *  密码
	 */
	private Integer checkPwd;
	/**
	 *  创建时间
	 */
	private String createTime;
	/**
	 *  考察模块，0代表餐饮 1代表讲师 2 代表班主任
	 */
	private Integer checkModule;
	/**
	 * ID自增长
	 * @param checkId
	 */
	public void setCheckId(Integer checkId){
		this.checkId = checkId;
	}
	
    /**
     * ID自增长
     * @return
     */	
    public Integer getCheckId(){
    	return checkId;
    }
	/**
	 * 评价的班级
	 * @param checkClass
	 */
	public void setCheckClass(String checkClass){
		this.checkClass = checkClass;
	}
	
    /**
     * 评价的班级
     * @return
     */	
    public String getCheckClass(){
    	return checkClass;
    }
	/**
	 * 评价的老师
	 * @param checkTeacher
	 */
	public void setCheckTeacher(String checkTeacher){
		this.checkTeacher = checkTeacher;
	}
	
    /**
     * 评价的老师
     * @return
     */	
    public String getCheckTeacher(){
    	return checkTeacher;
    }
	/**
	 * 密码
	 * @param checkPwd
	 */
	public void setCheckPwd(Integer checkPwd){
		this.checkPwd = checkPwd;
	}
	
    /**
     * 密码
     * @return
     */	
    public Integer getCheckPwd(){
    	return checkPwd;
    }
	/**
	 * 创建时间
	 * @param createTime
	 */
	public void setCreateTime(String createTime){
		this.createTime = createTime;
	}
	
    /**
     * 创建时间
     * @return
     */	
    public String getCreateTime(){
    	return createTime;
    }

	/**
	 * 考察模块，0代表餐饮 1代表讲师 2 代表班主任
	 * @return checkModule
	 */
	public Integer getCheckModule() {
		return checkModule;
	}

	/**
	 * 考察模块，0代表餐饮 1代表讲师 2 代表班主任
	 * @param checkModule
	 */
	public void setCheckModule(Integer checkModule) {
		this.checkModule = checkModule;
	}

	@Override
	public String toString() {
		return "Check{" +
				"checkId=" + checkId +
				", checkClass='" + checkClass + '\'' +
				", checkTeacher='" + checkTeacher + '\'' +
				", checkPwd=" + checkPwd +
				", createTime='" + createTime + '\'' +
				", checkModule=" + checkModule +
				'}';
	}
}