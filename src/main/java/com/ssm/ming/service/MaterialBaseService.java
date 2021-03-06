package com.ssm.ming.service;

import com.ssm.ming.domain.MaterialBase;
import com.ssm.ming.util.PagedResult;

/**
 * @author Wenming.Huang
 * @date 2018-03-20
 * @version 1.0
 */
public interface MaterialBaseService {
    PagedResult<MaterialBase> selectMaterialBaseInfo(Integer pageNumber, Integer pageSize, String sort, String sortOrder,
            String materialNo) throws Exception;

    Integer saveMaterialBaseInfo(MaterialBase materialBase) throws Exception;
    
    Integer editMaterialBaseInfo(MaterialBase materialBase) throws Exception;
    
    Integer deleteMaterialBaseInfo(Integer[] ids) throws Exception;
}
