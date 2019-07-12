package com.translatify;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestUserDAO {

  UserDAO user;

  @Before
  public void setup() {
	  user = new UserDAO();
  }

  @Test
  public void testUserAdd() {
    String name = "Carlos Eduardo";
    String expected = "User added successfuly";
    String result = user.add(name);

    assertEquals(expected, result);
  }
  
  @Test
  public void testUserAddDuplicate() {
    String name = "Carlos Eduardo";
    String expected = "User already exists";
    String result = user.add(name);

    assertEquals(expected, result);
  }
  
  @Test
  public void testUserAddNull() {
    String name = "";
    String expected = "Name cannot be null";
    String result = user.add(name);

    assertEquals(expected, result);
  }
}
