package tests;

import endpoints.DeletePlayerEndpoint;
import org.testng.annotations.Test;

public class DeletePlayerTest {

  private DeletePlayerEndpoint deletePlayerEndpoint = new DeletePlayerEndpoint();

  @Test
  public void deletePlayerPositiveTest() {
    deletePlayerEndpoint
        .deletePlayer( 1);
  }

}
