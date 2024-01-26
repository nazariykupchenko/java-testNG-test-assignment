package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DeleteRequestDto {
  @JsonProperty("playerId")
  private int playerId;

}
