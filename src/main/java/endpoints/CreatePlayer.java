package endpoints;

import io.restassured.response.ValidatableResponse;
import utils.Properties;

public class CreatePlayer extends Api {

  public ValidatableResponse createPlayer() {
    return requestSpecification(Properties.BASE_URI)
        .post(Properties.CREATE_PLAYER)
        .then()
        .statusCode(200)
        .log()
        .all();
  }

}
