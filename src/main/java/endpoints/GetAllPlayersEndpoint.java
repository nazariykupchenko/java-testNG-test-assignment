package endpoints;

import io.restassured.response.ValidatableResponse;
import utils.Properties;

public class GetAllPlayersEndpoint extends Api{

  public ValidatableResponse getAllPlayers() {
    return requestSpecification(Properties.BASE_URI)
        .get(Properties.GET_ALL_PLAYERS)
        .then()
        .statusCode(200)
        .log()
        .all();
  }

}
