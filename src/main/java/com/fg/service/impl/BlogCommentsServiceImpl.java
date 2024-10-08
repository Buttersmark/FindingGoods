package com.fg.service.impl;

import com.fg.entity.BlogComments;
import com.fg.mapper.BlogCommentsMapper;
import com.fg.service.IBlogCommentsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class BlogCommentsServiceImpl extends ServiceImpl<BlogCommentsMapper, BlogComments> implements IBlogCommentsService {

}
