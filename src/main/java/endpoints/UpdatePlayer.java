package endpoints;

import io.restassured.response.ValidatableResponse;
import utils.Properties;

public class UpdatePlayer extends Api {

  public ValidatableResponse updatePlayer() {
    return requestSpecification(Properties.BASE_URI)
        .put(Properties.UPDATE_PLAYER)
        .then()
        .statusCode(200)
        .log()
        .all();
  }

}
