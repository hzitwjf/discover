package com.hzit.dao.vo;

/**
 * 
 * @author wjf
 */
public class AnswerVo {
	/**
	 *  答案ID
	 */
	private Integer ansId;
	/**
	 *  答案内容
	 */
	private String ansContent;
	/**
	 *  答案分数
	 */
	private Integer ansSc;
	/**
	 *  所属题目
	 */
	private Integer proId;
	/**
	 * 答案ID
	 * @param ansId
	 */
	public void setAnsId(Integer ansId){
		this.ansId = ansId;
	}
	
    /**
     * 答案ID
     * @return Integer
     */	
    public Integer getAnsId(){
    	return ansId;
    }
	/**
	 * 答案内容
	 * @param ansContent
	 */
	public void setAnsContent(String ansContent){
		this.ansContent = ansContent;
	}
	
    /**
     * 答案内容
     * @return String
     */	
    public String getAnsContent(){
    	return ansContent;
    }
	/**
	 * 答案分数
	 * @param ansSc
	 */
	public void setAnsSc(Integer ansSc){
		this.ansSc = ansSc;
	}
	
    /**
     * 答案分数
     * @return Integer
     */	
    public Integer getAnsSc(){
    	return ansSc;
    }
	/**
	 * 所属题目
	 * @param proId
	 */
	public void setProId(Integer proId){
		this.proId = proId;
	}
	
    /**
     * 所属题目
     * @return Integer
     */	
    public Integer getProId(){
    	return proId;
    }

	@Override
	public String toString() {
		return "AnswerVo{" +
				"ansId=" + ansId +
				", ansContent='" + ansContent + '\'' +
				", ansSc=" + ansSc +
				", proId=" + proId +
				'}';
	}
}