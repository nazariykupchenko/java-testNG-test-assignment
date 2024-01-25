package endpoints;

import io.restassured.response.ValidatableResponse;
import utils.Properties;

public class DeletePlayer extends Api {

  public ValidatableResponse deletePlayer() {
    return requestSpecification(Properties.BASE_URI)
        .delete(Properties.DELETE_PLAYER)
        .then()
        .statusCode(200)
        .log()
        .all();
  }

}
