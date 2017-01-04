package com.hzit.dao.vo;

import com.hzit.dao.entity.Discuss;

import java.util.List;

/**
 * 
 * @author wjf
 */
public class CommentVo {
	/**
	 *  评论ID
	 */
	private Integer comId;
	/**
	 *  评论业务ID
	 */
	private String comuuId;
	/**
	 *  评论时间
	 */
	private String comTime;
	/**
	 *  评论人
	 */
	private String comPeople;
	/**
	 *  评论的模块
	 */
	private String comModule;
	/**
	 *  当前模块的总得分
	 */
	private Integer comScore;
	/**
	 *  被评论人
	 */
	private String codPeople;
	/**
	 *  评论来自的班级
	 */
	private String comClass;
	/**
	 * 评论详情
	 */
	private List<Discuss> discusses;
	/**
	 * 评论ID
	 * @param comId
	 */
	public void setComId(Integer comId){
		this.comId = comId;
	}
	
    /**
     * 评论ID
     * @return Integer
     */	
    public Integer getComId(){
    	return comId;
    }
	/**
	 * 评论业务ID
	 * @param comuuId
	 */
	public void setComuuId(String comuuId){
		this.comuuId = comuuId;
	}
	
    /**
     * 评论业务ID
     * @return String
     */	
    public String getComuuId(){
    	return comuuId;
    }
	/**
	 * 评论时间
	 * @param comTime
	 */
	public void setComTime(String comTime){
		this.comTime = comTime;
	}
	
    /**
     * 评论时间
     * @return java.util.Date
     */	
    public String getComTime(){
    	return comTime;
    }
	/**
	 * 评论人
	 * @param comPeople
	 */
	public void setComPeople(String comPeople){
		this.comPeople = comPeople;
	}
	
    /**
     * 评论人
     * @return String
     */	
    public String getComPeople(){
    	return comPeople;
    }
	/**
	 * 评论的模块
	 * @param comModule
	 */
	public void setComModule(String comModule){
		this.comModule = comModule;
	}
	
    /**
     * 评论的模块
     * @return String
     */	
    public String getComModule(){
    	return comModule;
    }
	/**
	 * 当前模块的总得分
	 * @param comScore
	 */
	public void setComScore(Integer comScore){
		this.comScore = comScore;
	}
	
    /**
     * 当前模块的总得分
     * @return Integer
     */	
    public Integer getComScore(){
    	return comScore;
    }
	/**
	 * 被评论人
	 * @param codPeople
	 */
	public void setCodPeople(String codPeople){
		this.codPeople = codPeople;
	}
	
    /**
     * 被评论人
     * @return String
     */	
    public String getCodPeople(){
    	return codPeople;
    }
	/**
	 * 评论来自的班级
	 * @param comClass
	 */
	public void setComClass(String comClass){
		this.comClass = comClass;
	}
	
    /**
     * 评论来自的班级
     * @return String
     */	
    public String getComClass(){
    	return comClass;
    }

	/**
	 * 评论详情
	 * @return
	 */
	public List<Discuss> getDiscusses() {
		return discusses;
	}

	/**
	 * 评论详情
	 * @param discusses
	 */
	public void setDiscusses(List<Discuss> discusses) {
		this.discusses = discusses;
	}

	@Override
	public String toString() {
		return "CommentVo{" +
				"comId=" + comId +
				", comuuId='" + comuuId + '\'' +
				", comTime='" + comTime + '\'' +
				", comPeople='" + comPeople + '\'' +
				", comModule='" + comModule + '\'' +
				", comScore=" + comScore +
				", codPeople='" + codPeople + '\'' +
				", comClass='" + comClass + '\'' +
				", discusses=" + discusses +
				'}';
	}
}