package org.launchcode.spaday.models;

public class User
{
  private String username_ = null;
  private String email_ = null;
  private String password_ = null;

  public void setUsername( String username )
  {
    username_ = username;
  }
  public String getUsername()
  {
    return username_;
  }

  public void setEmail( String email )
  {
    email_ = email;
  }
  public String getEmail()
  {
    return email_;
  }

  public void setPassword( String password )
  {
    password_ = password;
  }
  public String getPassword()
  {
    return password_;
  }
}
