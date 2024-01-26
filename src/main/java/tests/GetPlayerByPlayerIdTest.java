package tests;

import endpoints.GetPlayerByPlayerIdEndpoint;
import org.testng.annotations.Test;

public class GetPlayerByPlayerIdTest {

  private GetPlayerByPlayerIdEndpoint getPlayerByPlayerIdEndpoint = new GetPlayerByPlayerIdEndpoint();

  @Test
  public void getPlayerByPlayerIdPositiveTest() {
    getPlayerByPlayerIdEndpoint
        .getPlayerByPlayerId(1);
  }
}