package cn.elvea.service.impl;

import cn.elvea.commons.service.jpa.BaseJpaEntityService;
import cn.elvea.domain.User;
import cn.elvea.repository.UserRepository;
import cn.elvea.security.SecurityUtils;
import cn.elvea.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

@Service
@Transactional
public class UserServiceImpl extends BaseJpaEntityService<User, Long, UserRepository> implements UserService {
    @Override
    public User findByUsername(String username) {
        return repository.findByUsername(username);
    }

    @Override
    public String encryptPassword(String plainPassword, String salt) {
        Assert.notNull(plainPassword, "plainPassword can not be null.");
        Assert.notNull(salt, "salt can not be null.");

        return SecurityUtils.entryptPassword(plainPassword, salt);
    }

    @Override
    public String encryptPassword(User user) {
        Assert.notNull(user, "User can not be null.");
        return encryptPassword("", "");
    }
}
