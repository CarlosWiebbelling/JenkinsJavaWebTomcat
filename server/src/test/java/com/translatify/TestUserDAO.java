package com.translatify;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestUserDAO {

  UserDAO user;

  @Before
  public void setup() {
  }

  @Test
  public void testUserAdd() {
    String name = "Carlos Eduardo";
    String expected = "User added successfuly";
    String result = user.add(name);
    
    assertEquals(expected, result);
  }
}
