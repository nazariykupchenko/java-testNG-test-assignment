package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeleteRequestDto {
  @JsonProperty("playerId")
  private int playerId;

}
