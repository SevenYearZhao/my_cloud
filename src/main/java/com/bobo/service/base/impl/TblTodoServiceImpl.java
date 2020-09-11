package com.bobo.service.base.impl;

import com.bobo.bean.base.TblTodo;
import com.bobo.mapper.TblTodoMapper;
import com.bobo.service.base.TblTodoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 待办事项 服务实现类
 * </p>
 *
 * @author lian
 * @since 2020-09-09
 */
@Service
public class TblTodoServiceImpl extends ServiceImpl<TblTodoMapper, TblTodo> implements TblTodoService {

}
