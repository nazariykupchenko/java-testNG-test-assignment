package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlayerUpdateResponseDto {

  @JsonProperty("age")
  private int age;
  @JsonProperty("gender")
  private String gender;
  @JsonProperty("id")
  private Integer id;
  @JsonProperty("login")
  private String login;
  @JsonProperty("role")
  private String role;
  @JsonProperty("screenName")
  private String screenName;
}
