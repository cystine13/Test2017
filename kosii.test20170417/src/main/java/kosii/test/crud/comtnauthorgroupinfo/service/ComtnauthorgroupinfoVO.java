package kosii.test.crud.comtnauthorgroupinfo.service;

/**
 * @Class Name : ComtnauthorgroupinfoVO.java
 * @Description : Comtnauthorgroupinfo VO class
 * @Modification Information
 *
 * @author 성용규&lt;cystine13@naver.com&gt;
 * @since 2017-04-17
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnauthorgroupinfoVO extends ComtnauthorgroupinfoDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /** GROUP_ID */
    private java.lang.String groupId;
    
    /** GROUP_NM */
    private java.lang.String groupNm;
    
    /** GROUP_CREAT_DE */
    private java.lang.String groupCreatDe;
    
    /** GROUP_DC */
    private java.lang.String groupDc;
    
    public java.lang.String getGroupId() {
        return this.groupId;
    }
    
    public void setGroupId(java.lang.String groupId) {
        this.groupId = groupId;
    }
    
    public java.lang.String getGroupNm() {
        return this.groupNm;
    }
    
    public void setGroupNm(java.lang.String groupNm) {
        this.groupNm = groupNm;
    }
    
    public java.lang.String getGroupCreatDe() {
        return this.groupCreatDe;
    }
    
    public void setGroupCreatDe(java.lang.String groupCreatDe) {
        this.groupCreatDe = groupCreatDe;
    }
    
    public java.lang.String getGroupDc() {
        return this.groupDc;
    }
    
    public void setGroupDc(java.lang.String groupDc) {
        this.groupDc = groupDc;
    }
    
}
