package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlayerDeleteRequestDto {
  @JsonProperty("playerId")
  private int playerId;

}
