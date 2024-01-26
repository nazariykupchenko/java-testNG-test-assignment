package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetByPlayerIdRequestDto {

  @JsonProperty("playerId")
  private int playerId;
}
