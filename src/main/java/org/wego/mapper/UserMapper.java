package org.wego.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.wego.domain.User;

/**
* @author 67099
* @description 针对表【user】的数据库操作Mapper
* @createDate 2023-05-12 11:24:42
* @Entity wego.domain.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




