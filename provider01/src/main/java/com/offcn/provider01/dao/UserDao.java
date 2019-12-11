package com.offcn.provider01.dao;

import com.offcn.provider01.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Long> {

}

