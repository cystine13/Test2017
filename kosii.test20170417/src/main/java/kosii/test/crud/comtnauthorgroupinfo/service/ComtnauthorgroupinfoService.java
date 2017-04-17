package kosii.test.crud.comtnauthorgroupinfo.service;

import java.util.List;
import kosii.test.crud.comtnauthorgroupinfo.service.ComtnauthorgroupinfoDefaultVO;
import kosii.test.crud.comtnauthorgroupinfo.service.ComtnauthorgroupinfoVO;

/**
 * @Class Name : ComtnauthorgroupinfoService.java
 * @Description : Comtnauthorgroupinfo Business class
 * @Modification Information
 *
 * @author 성용규&lt;cystine13@naver.com&gt;
 * @since 2017-04-17
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnauthorgroupinfoService {
	
	/**
	 * COMTNAUTHORGROUPINFO을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnauthorgroupinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnauthorgroupinfo(ComtnauthorgroupinfoVO vo) throws Exception;
    
    /**
	 * COMTNAUTHORGROUPINFO을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnauthorgroupinfoVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnauthorgroupinfo(ComtnauthorgroupinfoVO vo) throws Exception;
    
    /**
	 * COMTNAUTHORGROUPINFO을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnauthorgroupinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnauthorgroupinfo(ComtnauthorgroupinfoVO vo) throws Exception;
    
    /**
	 * COMTNAUTHORGROUPINFO을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnauthorgroupinfoVO
	 * @return 조회한 COMTNAUTHORGROUPINFO
	 * @exception Exception
	 */
    ComtnauthorgroupinfoVO selectComtnauthorgroupinfo(ComtnauthorgroupinfoVO vo) throws Exception;
    
    /**
	 * COMTNAUTHORGROUPINFO 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNAUTHORGROUPINFO 목록
	 * @exception Exception
	 */
    List selectComtnauthorgroupinfoList(ComtnauthorgroupinfoDefaultVO searchVO) throws Exception;
    
    /**
	 * COMTNAUTHORGROUPINFO 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNAUTHORGROUPINFO 총 갯수
	 * @exception
	 */
    int selectComtnauthorgroupinfoListTotCnt(ComtnauthorgroupinfoDefaultVO searchVO);
    
}
