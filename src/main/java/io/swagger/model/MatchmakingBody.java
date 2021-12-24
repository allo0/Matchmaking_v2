package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.UserCollaborationIntentions;
import io.swagger.model.UserPairwiseScore;
import io.swagger.model.UserScore;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MatchmakingBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-12-24T10:37:04.670Z[GMT]")


public class MatchmakingBody   {
  @JsonProperty("userGlobalScores")
  @Valid
  private List<UserScore> userGlobalScores = null;

  @JsonProperty("userPairwiseScore")
  @Valid
  private List<UserPairwiseScore> userPairwiseScore = null;

  @JsonProperty("userCollaborationIntentions")
  @Valid
  private List<UserCollaborationIntentions> userCollaborationIntentions = null;

  public MatchmakingBody userGlobalScores(List<UserScore> userGlobalScores) {
    this.userGlobalScores = userGlobalScores;
    return this;
  }

  public MatchmakingBody addUserGlobalScoresItem(UserScore userGlobalScoresItem) {
    if (this.userGlobalScores == null) {
      this.userGlobalScores = new ArrayList<UserScore>();
    }
    this.userGlobalScores.add(userGlobalScoresItem);
    return this;
  }

  /**
   * Get userGlobalScores
   * @return userGlobalScores
   **/
  @Schema(description = "")
  @Valid
  public List<UserScore> getUserGlobalScores() {
    return userGlobalScores;
  }

  public void setUserGlobalScores(List<UserScore> userGlobalScores) {
    this.userGlobalScores = userGlobalScores;
  }

  public MatchmakingBody userPairwiseScore(List<UserPairwiseScore> userPairwiseScore) {
    this.userPairwiseScore = userPairwiseScore;
    return this;
  }

  public MatchmakingBody addUserPairwiseScoreItem(UserPairwiseScore userPairwiseScoreItem) {
    if (this.userPairwiseScore == null) {
      this.userPairwiseScore = new ArrayList<UserPairwiseScore>();
    }
    this.userPairwiseScore.add(userPairwiseScoreItem);
    return this;
  }

  /**
   * Get userPairwiseScore
   * @return userPairwiseScore
   **/
  @Schema(description = "")
  @Valid
  public List<UserPairwiseScore> getUserPairwiseScore() {
    return userPairwiseScore;
  }

  public void setUserPairwiseScore(List<UserPairwiseScore> userPairwiseScore) {
    this.userPairwiseScore = userPairwiseScore;
  }

  public MatchmakingBody userCollaborationIntentions(List<UserCollaborationIntentions> userCollaborationIntentions) {
    this.userCollaborationIntentions = userCollaborationIntentions;
    return this;
  }

  public MatchmakingBody addUserCollaborationIntentionsItem(UserCollaborationIntentions userCollaborationIntentionsItem) {
    if (this.userCollaborationIntentions == null) {
      this.userCollaborationIntentions = new ArrayList<UserCollaborationIntentions>();
    }
    this.userCollaborationIntentions.add(userCollaborationIntentionsItem);
    return this;
  }

  /**
   * Get userCollaborationIntentions
   * @return userCollaborationIntentions
   **/
  @Schema(description = "")
  @Valid
  public List<UserCollaborationIntentions> getUserCollaborationIntentions() {
    return userCollaborationIntentions;
  }

  public void setUserCollaborationIntentions(List<UserCollaborationIntentions> userCollaborationIntentions) {
    this.userCollaborationIntentions = userCollaborationIntentions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchmakingBody matchmakingBody = (MatchmakingBody) o;
    return Objects.equals(this.userGlobalScores, matchmakingBody.userGlobalScores) &&
            Objects.equals(this.userPairwiseScore, matchmakingBody.userPairwiseScore) &&
            Objects.equals(this.userCollaborationIntentions, matchmakingBody.userCollaborationIntentions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userGlobalScores, userPairwiseScore, userCollaborationIntentions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchmakingBody {\n");

    sb.append("    userGlobalScores: ").append(toIndentedString(userGlobalScores)).append("\n");
    sb.append("    userPairwiseScore: ").append(toIndentedString(userPairwiseScore)).append("\n");
    sb.append("    userCollaborationIntentions: ").append(toIndentedString(userCollaborationIntentions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}