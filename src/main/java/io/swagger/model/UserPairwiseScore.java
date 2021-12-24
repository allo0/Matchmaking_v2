package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * UserPairwiseScore
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-12-24T07:41:24.008Z[GMT]")


public class UserPairwiseScore   {
  @JsonProperty("gradingUser")
  private String gradingUser = null;

  @JsonProperty("scoresGiven")
  @Valid
  private List<UserScore> scoresGiven = null;

  public UserPairwiseScore gradingUser(String gradingUser) {
    this.gradingUser = gradingUser;
    return this;
  }

  /**
   * Get gradingUser
   * @return gradingUser
   **/
  @Schema(description = "")
  
    public String getGradingUser() {
    return gradingUser;
  }

  public void setGradingUser(String gradingUser) {
    this.gradingUser = gradingUser;
  }

  public UserPairwiseScore scoresGiven(List<UserScore> scoresGiven) {
    this.scoresGiven = scoresGiven;
    return this;
  }

  public UserPairwiseScore addScoresGivenItem(UserScore scoresGivenItem) {
    if (this.scoresGiven == null) {
      this.scoresGiven = new ArrayList<UserScore>();
    }
    this.scoresGiven.add(scoresGivenItem);
    return this;
  }

  /**
   * Get scoresGiven
   * @return scoresGiven
   **/
  @Schema(description = "")
      @Valid
    public List<UserScore> getScoresGiven() {
    return scoresGiven;
  }

  public void setScoresGiven(List<UserScore> scoresGiven) {
    this.scoresGiven = scoresGiven;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserPairwiseScore userPairwiseScore = (UserPairwiseScore) o;
    return Objects.equals(this.gradingUser, userPairwiseScore.gradingUser) &&
        Objects.equals(this.scoresGiven, userPairwiseScore.scoresGiven);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gradingUser, scoresGiven);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPairwiseScore {\n");
    
    sb.append("    gradingUser: ").append(toIndentedString(gradingUser)).append("\n");
    sb.append("    scoresGiven: ").append(toIndentedString(scoresGiven)).append("\n");
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
