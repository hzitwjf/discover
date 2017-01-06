package com.hzit.dao.vo;

/**
 * 
 * @author wjf
 */
public class DiscussVo {
	/**
	 *  评论详情Id
	 */
	private Integer disId;
	/**
	 *  评论的业务id
	 */
	private String comUuid;
	/**
	 *  评论的题目ID
	 */
	private Integer proId;
	/**
	 *  评论结果
	 */
	private String disResult;
	/**
	 *  得分项
	 */
	private String disScore;
	/**
	 *  被评论人
	 */
	private String codPeople;
	/**
	 *  评论时间
	 */
	private String comTime;
	/**
	 *  问题内容
	 */
	private String proContent;
	/**
	 * 评论详情Id
	 * @param disId
	 */
	public void setDisId(Integer disId){
		this.disId = disId;
	}
	
    /**
     * 评论详情Id
     * @return Integer
     */	
    public Integer getDisId(){
    	return disId;
    }
	/**
	 * 评论的业务id
	 * @param comUuid
	 */
	public void setComUuid(String comUuid){
		this.comUuid = comUuid;
	}
	
    /**
     * 评论的业务id
     * @return String
     */	
    public String getComUuid(){
    	return comUuid;
    }
	/**
	 * 评论的题目ID
	 * @param proId
	 */
	public void setProId(Integer proId){
		this.proId = proId;
	}
	
    /**
     * 评论的题目ID
     * @return Integer
     */	
    public Integer getProId(){
    	return proId;
    }
	/**
	 * 评论结果
	 * @param disResult
	 */
	public void setDisResult(String disResult){
		this.disResult = disResult;
	}
	
    /**
     * 评论结果
     * @return String
     */	
    public String getDisResult(){
    	return disResult;
    }
	/**
	 * 得分项
	 * @param disScore
	 */
	public void setDisScore(String disScore){
		this.disScore = disScore;
	}
	
    /**
     * 得分项
     * @return String
     */	
    public String getDisScore(){
    	return disScore;
    }

	/**
	 * 被评论人
	 * @return codPeople
	 */
	public String getCodPeople() {
		return codPeople;
	}

	/**
	 * 被评论人
	 * @param codPeople
	 */
	public void setCodPeople(String codPeople) {
		this.codPeople = codPeople;
	}

	/**
	 * 评论时间
	 * @return comTime
	 */
	public String getComTime() {
		return comTime;
	}

	/**
	 * 评论时间
	 * @param comTime
	 */
	public void setComTime(String comTime) {
		this.comTime = comTime;
	}

	/**
	 * 问题内容
	 * @return proContent
	 */
	public String getProContent() {
		return proContent;
	}

	/**
	 * 问题内容
	 * @param proContent
	 */
	public void setProContent(String proContent) {
		this.proContent = proContent;
	}

	@Override
	public String toString() {
		return "DiscussVo{" +
				"disId=" + disId +
				", comUuid='" + comUuid + '\'' +
				", proId=" + proId +
				", disResult='" + disResult + '\'' +
				", disScore='" + disScore + '\'' +
				", codPeople='" + codPeople + '\'' +
				", comTime='" + comTime + '\'' +
				", proContent='" + proContent + '\'' +
				'}';
	}
}