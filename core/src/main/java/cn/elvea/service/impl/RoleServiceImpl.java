package cn.elvea.service.impl;

import cn.elvea.commons.persistence.repository.BaseEntityRepository;
import cn.elvea.commons.service.jpa.BaseJpaEntityService;
import cn.elvea.domain.Role;
import cn.elvea.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RoleServiceImpl extends BaseJpaEntityService<Role, Long> {
    @Autowired
    private RoleRepository roleRepository;

    @Override
    protected BaseEntityRepository<Role, Long> getEntityRepository() {
        return roleRepository;
    }
}