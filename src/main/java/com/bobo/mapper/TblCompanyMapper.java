package com.bobo.mapper;

import com.bobo.bean.base.TblCompany;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 * 企业档案 Mapper 接口
 * </p>
 *
 * @author lian
 * @since 2020-09-09
 */
@Component
public interface TblCompanyMapper extends BaseMapper<TblCompany> {
    List<String> selectCompany();
}
