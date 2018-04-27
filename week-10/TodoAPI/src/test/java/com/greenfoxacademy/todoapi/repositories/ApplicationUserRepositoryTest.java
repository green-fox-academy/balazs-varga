package com.greenfoxacademy.todoapi.repositories;

import com.greenfoxacademy.todoapi.models.ApplicationUser;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
public class ApplicationUserRepositoryTest {

  @Autowired
  private TestEntityManager entityManager;

  @Autowired
  private ApplicationUserRepository applicationUserRepository;

  private ApplicationUser firstUser;
  private ApplicationUser secondUser;
  private ApplicationUser thirdUser;

  @Before
  public void setUp() {
    firstUser = new ApplicationUser();
    firstUser.setUsername("Balazs");
    firstUser.setPassword("arfsfo322nkf");
    secondUser = new ApplicationUser();
    secondUser.setUsername("admin");
    secondUser.setPassword("password");
    thirdUser = new ApplicationUser();
    thirdUser.setUsername("guest");
    thirdUser.setPassword("kfaskkna");
  }

  @Test
  public void findAllTest() throws Exception {
    //given
    entityManager.persist(firstUser);
    entityManager.persist(secondUser);
    entityManager.persist(thirdUser);
    entityManager.flush();

    //when
    List<ApplicationUser> userList = applicationUserRepository.findAll();

    //then
    assertThat(userList.size()).isEqualTo(3);
    assertThat(userList.get(0)).isEqualTo(firstUser);
    assertThat(userList.get(1)).isEqualTo(secondUser);
    assertThat(userList.get(2)).isEqualTo(thirdUser);
  }
}