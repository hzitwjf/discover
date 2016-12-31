package com.hzit.dao.vo;

/**
 * 
 * @author wjf
 */
public class VegetableVo {
	/**
	 *  菜品ID
	 */
	private Integer veId;
	/**
	 *  菜品类型
	 */
	private String veType;
	/**
	 *  菜品名称
	 */
	private String veName;
	/**
	 *  菜品父模块
	 */
	private Integer veParent;
	/**
	 *  菜品等级
	 */
	private Integer veLevel;
	/**
	 * 菜品ID
	 * @param veId
	 */
	public void setVeId(Integer veId){
		this.veId = veId;
	}
	
    /**
     * 菜品ID
     * @return Integer
     */	
    public Integer getVeId(){
    	return veId;
    }
	/**
	 * 菜品类型
	 * @param veType
	 */
	public void setVeType(String veType){
		this.veType = veType;
	}
	
    /**
     * 菜品类型
     * @return String
     */	
    public String getVeType(){
    	return veType;
    }
	/**
	 * 菜品名称
	 * @param veName
	 */
	public void setVeName(String veName){
		this.veName = veName;
	}
	
    /**
     * 菜品名称
     * @return String
     */	
    public String getVeName(){
    	return veName;
    }
	/**
	 * 菜品父模块
	 * @param veParent
	 */
	public void setVeParent(Integer veParent){
		this.veParent = veParent;
	}
	
    /**
     * 菜品父模块
     * @return Integer
     */	
    public Integer getVeParent(){
    	return veParent;
    }
	/**
	 * 菜品等级
	 * @param veLevel
	 */
	public void setVeLevel(Integer veLevel){
		this.veLevel = veLevel;
	}
	
    /**
     * 菜品等级
     * @return Integer
     */	
    public Integer getVeLevel(){
    	return veLevel;
    }

	@Override
	public String toString() {
		return "VegetableVo{" +
				"veId=" + veId +
				", veType='" + veType + '\'' +
				", veName='" + veName + '\'' +
				", veParent=" + veParent +
				", veLevel=" + veLevel +
				'}';
	}
}