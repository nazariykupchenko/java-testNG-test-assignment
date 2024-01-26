package endpoints;

import io.restassured.response.ValidatableResponse;
import models.CreateRequestDto;
import models.DeleteRequestDto;
import models.GetPlayerByIdRequestDto;
import models.PlayerUpdateRequestDto;
import utils.Properties;

public class PlayerEndpoints extends Api {

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
        .statusCode(201)
        .log()
        .all();
  }

  public ValidatableResponse deletePlayer(DeleteRequestDto body, String editor) {
    return requestSpecification(Properties.BASE_URI)
        .body(body)
        .delete(Properties.DELETE_PLAYER + editor)
        .then()
        .statusCode(200)
        .log()
        .all();
  }

  public ValidatableResponse getAllPlayers() {
    return requestSpecification(Properties.BASE_URI)
        .get(Properties.GET_ALL_PLAYERS)
        .then()
        .statusCode(200)
        .log()
        .all();
  }

  public ValidatableResponse getPlayerByPlayerId(GetPlayerByIdRequestDto playerId) {
    return requestSpecification(Properties.BASE_URI)
        .get(Properties.GET_PLAYER_BY_PLAYER_ID)
        .then()
        .statusCode(200)
        .log()
        .all();
  }

  public ValidatableResponse updatePlayer( PlayerUpdateRequestDto body) {
    return requestSpecification(Properties.BASE_URI)
        .patch(Properties.UPDATE_PLAYER)
        .then()
        .statusCode(200)
        .log()
        .all();
  }
}
