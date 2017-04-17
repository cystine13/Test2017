package kosii.test.crud.comtnauthorgroupinfo.service.impl;

import java.util.List;

import kosii.test.crud.comtnauthorgroupinfo.service.ComtnauthorgroupinfoDefaultVO;
import kosii.test.crud.comtnauthorgroupinfo.service.ComtnauthorgroupinfoVO;

import org.springframework.stereotype.Repository;

import egovframework.com.cmm.service.impl.EgovComAbstractDAO;

/**
 * @Class Name : ComtnauthorgroupinfoDAO.java
 * @Description : Comtnauthorgroupinfo DAO Class
 * @Modification Information
 *
 * @author 성용규&lt;cystine13@naver.com&gt;
 * @since 2017-04-17
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnauthorgroupinfoDAO")
public class ComtnauthorgroupinfoDAO extends EgovComAbstractDAO {

	/**
	 * COMTNAUTHORGROUPINFO을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnauthorgroupinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnauthorgroupinfo(ComtnauthorgroupinfoVO vo) throws Exception {
        return (String)insert("comtnauthorgroupinfoDAO.insertComtnauthorgroupinfo_S", vo);
    }

    /**
	 * COMTNAUTHORGROUPINFO을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnauthorgroupinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnauthorgroupinfo(ComtnauthorgroupinfoVO vo) throws Exception {
        update("comtnauthorgroupinfoDAO.updateComtnauthorgroupinfo_S", vo);
    }

    /**
	 * COMTNAUTHORGROUPINFO을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnauthorgroupinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnauthorgroupinfo(ComtnauthorgroupinfoVO vo) throws Exception {
        delete("comtnauthorgroupinfoDAO.deleteComtnauthorgroupinfo_S", vo);
    }

    /**
	 * COMTNAUTHORGROUPINFO을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnauthorgroupinfoVO
	 * @return 조회한 COMTNAUTHORGROUPINFO
	 * @exception Exception
	 */
    public ComtnauthorgroupinfoVO selectComtnauthorgroupinfo(ComtnauthorgroupinfoVO vo) throws Exception {
        return (ComtnauthorgroupinfoVO) select("comtnauthorgroupinfoDAO.selectComtnauthorgroupinfo_S", vo);
    }

    /**
	 * COMTNAUTHORGROUPINFO 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNAUTHORGROUPINFO 목록
	 * @exception Exception
	 */
    public List<?> selectComtnauthorgroupinfoList(ComtnauthorgroupinfoDefaultVO searchVO) throws Exception {
        return list("comtnauthorgroupinfoDAO.selectComtnauthorgroupinfoList_D", searchVO);
    }

    /**
	 * COMTNAUTHORGROUPINFO 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNAUTHORGROUPINFO 총 갯수
	 * @exception
	 */
    public int selectComtnauthorgroupinfoListTotCnt(ComtnauthorgroupinfoDefaultVO searchVO) {
        return (Integer)select("comtnauthorgroupinfoDAO.selectComtnauthorgroupinfoListTotCnt_S", searchVO);
    }

}
