package org.wego.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.wego.domain.User;
import org.wego.mapper.UserMapper;
import org.wego.service.UserService;

/**
* @author 67099
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-05-12 11:24:42
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService {

}




