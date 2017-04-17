package kosii.test.crud.comtnauthorgroupinfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kosii.test.crud.comtnauthorgroupinfo.service.ComtnauthorgroupinfoService;
import kosii.test.crud.comtnauthorgroupinfo.service.ComtnauthorgroupinfoDefaultVO;
import kosii.test.crud.comtnauthorgroupinfo.service.ComtnauthorgroupinfoVO;
import kosii.test.crud.comtnauthorgroupinfo.service.impl.ComtnauthorgroupinfoDAO;

/**
 * @Class Name : ComtnauthorgroupinfoServiceImpl.java
 * @Description : Comtnauthorgroupinfo Business Implement class
 * @Modification Information
 *
 * @author 성용규&lt;cystine13@naver.com&gt;
 * @since 2017-04-17
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnauthorgroupinfoService")
public class ComtnauthorgroupinfoServiceImpl extends EgovAbstractServiceImpl implements
        ComtnauthorgroupinfoService {
        
    private static final Logger LOGGER = LoggerFactory.getLogger(ComtnauthorgroupinfoServiceImpl.class);

    @Resource(name="comtnauthorgroupinfoDAO")
    private ComtnauthorgroupinfoDAO comtnauthorgroupinfoDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnauthorgroupinfoIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTNAUTHORGROUPINFO을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnauthorgroupinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnauthorgroupinfo(ComtnauthorgroupinfoVO vo) throws Exception {
    	LOGGER.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	LOGGER.debug(vo.toString());
    	
    	comtnauthorgroupinfoDAO.insertComtnauthorgroupinfo(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTNAUTHORGROUPINFO을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnauthorgroupinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnauthorgroupinfo(ComtnauthorgroupinfoVO vo) throws Exception {
        comtnauthorgroupinfoDAO.updateComtnauthorgroupinfo(vo);
    }

    /**
	 * COMTNAUTHORGROUPINFO을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnauthorgroupinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnauthorgroupinfo(ComtnauthorgroupinfoVO vo) throws Exception {
        comtnauthorgroupinfoDAO.deleteComtnauthorgroupinfo(vo);
    }

    /**
	 * COMTNAUTHORGROUPINFO을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnauthorgroupinfoVO
	 * @return 조회한 COMTNAUTHORGROUPINFO
	 * @exception Exception
	 */
    public ComtnauthorgroupinfoVO selectComtnauthorgroupinfo(ComtnauthorgroupinfoVO vo) throws Exception {
        ComtnauthorgroupinfoVO resultVO = comtnauthorgroupinfoDAO.selectComtnauthorgroupinfo(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNAUTHORGROUPINFO 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNAUTHORGROUPINFO 목록
	 * @exception Exception
	 */
    public List<?> selectComtnauthorgroupinfoList(ComtnauthorgroupinfoDefaultVO searchVO) throws Exception {
        return comtnauthorgroupinfoDAO.selectComtnauthorgroupinfoList(searchVO);
    }

    /**
	 * COMTNAUTHORGROUPINFO 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNAUTHORGROUPINFO 총 갯수
	 * @exception
	 */
    public int selectComtnauthorgroupinfoListTotCnt(ComtnauthorgroupinfoDefaultVO searchVO) {
		return comtnauthorgroupinfoDAO.selectComtnauthorgroupinfoListTotCnt(searchVO);
	}
    
}
