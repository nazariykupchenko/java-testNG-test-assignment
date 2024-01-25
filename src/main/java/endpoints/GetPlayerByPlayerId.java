package endpoints;

import io.restassured.response.ValidatableResponse;
import utils.Properties;

public class GetPlayerByPlayerId extends Api {

  public ValidatableResponse getPlayerByPlayerId() {
    return requestSpecification(Properties.BASE_URI)
        .get(Properties.GET_PLAYER_BY_PLAYER_ID)
        .then()
        .statusCode(200)
        .log()
        .all();
  }

}
