package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlayerItemDto {

  @JsonProperty("age")
  private int age;
  @JsonProperty("gender")
  private String gender;
  @JsonProperty("id")
  private int id;
  @JsonProperty("role")
  private String role;
  @JsonProperty("screenName")
  private String screenName;
}
