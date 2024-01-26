package endpoints;

import io.restassured.response.ValidatableResponse;
import models.PlayerUpdateRequestDto;
import utils.Properties;

public class UpdatePlayerEndpoint extends Api {

  public ValidatableResponse updatePlayer( PlayerUpdateRequestDto body) {
    return requestSpecification(Properties.BASE_URI)
        .patch(Properties.UPDATE_PLAYER)
        .then()
        .statusCode(200)
        .log()
        .all();
  }

}
