package com.ln.web.dao;

import com.ln.web.model.User;
import com.ln.web.model.UserTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int countByExample(UserTableExample example);

    int deleteByExample(UserTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserTableExample example);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserTableExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserTableExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

	List<User> getList();

}