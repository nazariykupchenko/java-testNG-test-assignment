package endpoints;

import io.restassured.response.ValidatableResponse;
import models.CreateRequestDto;
import utils.Properties;

public class CreatePlayerEndpoint extends Api {

  public ValidatableResponse createPlayer(CreateRequestDto body) {
    return requestSpecification(Properties.BASE_URI)
        .given()
        .queryParam("age", body.getAge())
        .queryParam("editor", body.getEditor())
        .queryParam("gender", body.getGender())
        .queryParam("login", body.getLogin())
        .queryParam("password", body.getPassword())
        .queryParam("role", body.getRole())
        .queryParam("screenName", body.getScreenName())
        .get(Properties.CREATE_PLAYER + body.getEditor())
        .then()
        .statusCode(200)
        .log()
        .all();
  }

}
