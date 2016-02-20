package org.mybatis.example.dao;

import org.mybatis.example.entity.User;

public interface UserMapper {
	User getUser(int id);
}
