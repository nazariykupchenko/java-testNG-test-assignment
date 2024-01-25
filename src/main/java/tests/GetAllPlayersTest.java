package tests;

import endpoints.GetAllPlayersEndpoint;
import org.testng.annotations.Test;

public class GetAllPlayersTest {


  private GetAllPlayersEndpoint getAllPlayersEndpoint = new GetAllPlayersEndpoint();

  @Test
  public void getAllPlayersPositiveTest() {
    getAllPlayersEndpoint
        .getAllPlayers();
  }
}
