package org.springframework.samples.aop.schema.dao;

import org.springframework.samples.aop.dto.User;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-12-08 22:11
 */
@SuppressWarnings("unused")
public interface UserDao {
    void addUser(User user);

    void delAllUsers();

    int countUser();

    User getUser(int userId);
}
