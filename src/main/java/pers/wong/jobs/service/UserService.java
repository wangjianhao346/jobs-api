package pers.wong.jobs.service;

import org.springframework.stereotype.Service;
import pers.wong.jobs.constant.IsDeleted;
import pers.wong.jobs.dao.UserMapper;
import pers.wong.jobs.entity.User;
import pers.wong.jobs.entity.UserExample;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    /**
     * 根据用户名查询用户
     *
     * @param username 用户名
     * @return 用户类
     */
    public User getUserByName(String username) {
        UserExample example = new UserExample();
        example.createCriteria().andUsernameEqualTo(username).andIsDeletedEqualTo(IsDeleted.N);
        List<User> userList = userMapper.selectByExample(example);
        return userList.isEmpty() ? null : userList.get(0);
    }


}
