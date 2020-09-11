package com.bobo.service;

import com.bobo.mapper.TblCompanyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author bobo
 * @date 2020-09-10
 */
@Service
public class EstateService {
    @Autowired
    private TblCompanyMapper tblCompanyMapper;

    public List<String> selectCompany(){
        return tblCompanyMapper.selectCompany();
    }
}
