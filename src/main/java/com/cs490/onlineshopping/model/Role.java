package com.cs490.onlineshopping.model;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
  ADMIN, SHOPPER, VENDOR;

  public String getAuthority() {
    return name();
  }

}
