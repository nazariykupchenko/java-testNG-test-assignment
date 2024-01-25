package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlayerUpdateRequestDto {

  @JsonProperty("age")
  private int age;
  @JsonProperty("gender")
  private String gender;
  @JsonProperty("login")
  private String login;
  @JsonProperty("password")
  private String password;
  @JsonProperty("role")
  private String role;
  @JsonProperty("screenName")
  private String screenName;
}
