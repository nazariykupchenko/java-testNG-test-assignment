package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlayerGetByPlayerIdRequestDto {

  @JsonProperty("playerId")
  private int playerId;
}
