package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserCourse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-01T00:52:54.999Z[GMT]")
public class UserCourse   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("user_id")
  private String userId = null;

  @JsonProperty("course_id")
  private String courseId = null;

  public UserCourse id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "11", required = true, value = "")
  @NotNull

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public UserCourse userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(example = "11", required = true, value = "")
  @NotNull

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public UserCourse courseId(String courseId) {
    this.courseId = courseId;
    return this;
  }

  /**
   * Get courseId
   * @return courseId
  **/
  @ApiModelProperty(example = "11", required = true, value = "")
  @NotNull

  public String getCourseId() {
    return courseId;
  }

  public void setCourseId(String courseId) {
    this.courseId = courseId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserCourse userCourse = (UserCourse) o;
    return Objects.equals(this.id, userCourse.id) &&
        Objects.equals(this.userId, userCourse.userId) &&
        Objects.equals(this.courseId, userCourse.courseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, courseId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCourse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    courseId: ").append(toIndentedString(courseId)).append("\n");
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
