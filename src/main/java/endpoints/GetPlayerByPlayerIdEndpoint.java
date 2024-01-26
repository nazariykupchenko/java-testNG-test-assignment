package endpoints;

import io.restassured.response.ValidatableResponse;
import utils.Properties;

public class GetPlayerByPlayerIdEndpoint extends Api {

  public ValidatableResponse getPlayerByPlayerId(int playerId) {
    return requestSpecification(Properties.BASE_URI)
        .pathParam("playerId", playerId)
        .get(Properties.GET_PLAYER_BY_PLAYER_ID)
        .then()
        .statusCode(200)
        .log()
        .all();
  }

}
