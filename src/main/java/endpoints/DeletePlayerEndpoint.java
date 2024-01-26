package endpoints;

import io.restassured.response.ValidatableResponse;
import utils.Properties;

public class DeletePlayerEndpoint extends Api {

  public ValidatableResponse deletePlayer(int playerId) {
    return requestSpecification(Properties.BASE_URI)
        .pathParam("playerId", playerId)
        .delete(Properties.DELETE_PLAYER)
        .then()
        .statusCode(200)
        .log()
        .all();
  }

}