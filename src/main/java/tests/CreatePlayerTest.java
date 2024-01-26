package tests;

import endpoints.CreatePlayerEndpoint;
import models.CreateRequestDto;
import org.testng.annotations.Test;

public class CreatePlayerTest {

  private CreatePlayerEndpoint createPlayerEndpoint = new CreatePlayerEndpoint();

  @Test
  public void createPlayerPositiveTest() {
    createPlayerEndpoint
        .createPlayer(new CreateRequestDto("1", "1", "1", "1", "1", "1", "1"));
  }
}
