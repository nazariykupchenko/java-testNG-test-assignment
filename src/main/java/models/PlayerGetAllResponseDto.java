package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class PlayerGetAllResponseDto {

  @JsonProperty("players")
  private List<PlayerItem> players;
}
