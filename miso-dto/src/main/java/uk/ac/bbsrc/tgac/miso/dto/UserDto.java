package uk.ac.bbsrc.tgac.miso.dto;

public class UserDto {
  private boolean active;
  private boolean admin;
  private String email;
  private String fullName;
  private long id;
  private boolean internal;
  private boolean loggedIn;
  private String loginName;
  private String password;

  public String getEmail() {
    return email;
  }

  public String getFullName() {
    return fullName;
  }

  public long getId() {
    return id;
  }

  public String getLoginName() {
    return loginName;
  }

  public boolean isActive() {
    return active;
  }

  public boolean isAdmin() {
    return admin;
  }

  public boolean isInternal() {
    return internal;
  }

  public boolean isLoggedIn() {
    return loggedIn;
  }

  public void setActive(boolean active) {
    this.active = active;
  }

  public void setAdmin(boolean admin) {
    this.admin = admin;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public void setId(long id) {
    this.id = id;
  }

  public void setInternal(boolean internal) {
    this.internal = internal;
  }

  public void setLoggedIn(boolean loggedIn) {
    this.loggedIn = loggedIn;
  }

  public void setLoginName(String loginName) {
    this.loginName = loginName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
