package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GetPlayerByIdRequestDto {

  @JsonProperty("playerId")
  private int playerId;
}
