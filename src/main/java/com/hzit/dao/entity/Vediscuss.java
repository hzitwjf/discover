package com.hzit.dao.entity;

/**
 * 
 * @author wjf
 */
public class Vediscuss {
	/**
	 *  评论详情Id
	 */
	private Integer vdId;
	/**
	 *  评论的业务id
	 */
	private String vcUuid;
	/**
	 *  评论的菜品id
	 */
	private Integer vcVid;
	/**
	 *  评论结果
	 */
	private String vdResult;
	/**
	 * 评论详情Id
	 * @param vdId
	 */
	public void setVdId(Integer vdId){
		this.vdId = vdId;
	}
	
    /**
     * 评论详情Id
     * @return
     */	
    public Integer getVdId(){
    	return vdId;
    }
	/**
	 * 评论的业务id
	 * @param vcUuid
	 */
	public void setVcUuid(String vcUuid){
		this.vcUuid = vcUuid;
	}
	
    /**
     * 评论的业务id
     * @return
     */	
    public String getVcUuid(){
    	return vcUuid;
    }
	/**
	 * 评论的菜品id
	 * @param vcVid
	 */
	public void setVcVid(Integer vcVid){
		this.vcVid = vcVid;
	}
	
    /**
     * 评论的菜品id
     * @return
     */	
    public Integer getVcVid(){
    	return vcVid;
    }
	/**
	 * 评论结果
	 * @param vdResult
	 */
	public void setVdResult(String vdResult){
		this.vdResult = vdResult;
	}
	
    /**
     * 评论结果
     * @return
     */	
    public String getVdResult(){
    	return vdResult;
    }

	@Override
	public String toString() {
		return "Vediscuss{" +
				"vdId=" + vdId +
				", vcUuid='" + vcUuid + '\'' +
				", vcVid=" + vcVid +
				", vdResult='" + vdResult + '\'' +
				'}';
	}
}