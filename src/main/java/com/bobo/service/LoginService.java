package com.bobo.service;

import com.bobo.bean.base.TblUserRecord;
import com.bobo.mapper.TblUserRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author bobo
 * @date 2020-09-09
 */
@Service
public class LoginService {

    @Autowired
    private TblUserRecordMapper tblUserRecordMapper;

    public TblUserRecord login(String username,String password){
        return tblUserRecordMapper.login(username,password);
    }
}
