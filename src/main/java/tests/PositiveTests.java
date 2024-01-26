package tests;

import endpoints.PlayerEndpoints;
import models.CreateRequestDto;
import models.DeleteRequestDto;
import models.GetPlayerByIdRequestDto;
import org.testng.annotations.Test;

public class PositiveTests {

  private PlayerEndpoints playerEndpoints = new PlayerEndpoints();

  @Test
  public void createPlayerPositiveTest() {
    playerEndpoints
        .createPlayer(new CreateRequestDto(
            "1",
            "1",
            "1",
            "1",
            "1",
            "1",
            "1"));
  }

  @Test
  public void deletePlayerPositiveTest() {
    playerEndpoints
        .deletePlayer( new DeleteRequestDto(1), "editor");
  }

  @Test
  public void getAllPlayersPositiveTest() {
    playerEndpoints
        .getAllPlayers();
  }

  @Test
  public void getPlayerByPlayerIdPositiveTest() {
    playerEndpoints
        .getPlayerByPlayerId(new GetPlayerByIdRequestDto(1));
  }
}
