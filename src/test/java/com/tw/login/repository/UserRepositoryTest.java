package com.tw.login.repository;

import com.tw.login.entity.User;
import com.tw.login.repositary.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.setAllowComparingPrivateFields;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    void testToCreateNewUser() {
        User user = new User();
        user.setEmail("cool@gmail.com");
        user.setFirstName("jack");
        user.setLastName("david");
        user.setPassword("jake2012");

        User savedUser=userRepository.save(user);

        User existUser=entityManager.find(User.class,savedUser.getId());

        assertThat(existUser.getEmail()).isEqualTo(user.getEmail());
    }

    @Test
    void findUserByEmail() {
        String email="sam@gmail.com";

        User user=userRepository.findByEmail("sam@gmail.com");

       assertThat(user).isNotNull();
    }
}
