package com.hzit.dao.entity;

/**
 * 
 * @author wjf
 */
public class Problem {
	/**
	 *  题目ID
	 */
	private Integer proId;
	/**
	 *  问题内容
	 */
	private String proContent;
	/**
	 *  所属模块0代表餐饮 1代表讲师 2代表班主任
	 */
	private Integer proModule;
	/**
	 * 题目ID
	 * @param proId
	 */
	public void setProId(Integer proId){
		this.proId = proId;
	}
	
    /**
     * 题目ID
     * @return
     */	
    public Integer getProId(){
    	return proId;
    }
	/**
	 * 问题内容
	 * @param proContent
	 */
	public void setProContent(String proContent){
		this.proContent = proContent;
	}
	
    /**
     * 问题内容
     * @return
     */	
    public String getProContent(){
    	return proContent;
    }
	/**
	 * 所属模块0代表餐饮 1代表讲师 2代表班主任
	 * @param proModule
	 */
	public void setProModule(Integer proModule){
		this.proModule = proModule;
	}
	
    /**
     * 所属模块0代表餐饮 1代表讲师 2代表班主任
     * @return
     */	
    public Integer getProModule(){
    	return proModule;
    }

	@Override
	public String toString() {
		return "Problem{" +
				"proId=" + proId +
				", proContent='" + proContent + '\'' +
				", proModule=" + proModule +
				'}';
	}
}