package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class GetAllResponseDto {

  @JsonProperty("players")
  private List<PlayerItemDto> players;
}
