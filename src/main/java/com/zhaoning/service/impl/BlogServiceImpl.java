package com.zhaoning.service.impl;

import com.zhaoning.entity.Blog;
import com.zhaoning.mapper.BlogMapper;
import com.zhaoning.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author anonymous
 * @since 2020-07-20
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
