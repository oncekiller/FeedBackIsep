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
 * CourseDocument
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-01T00:52:54.999Z[GMT]")
public class CourseDocument   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("document")
  private String document = null;

  @JsonProperty("userPost_id")
  private Long userPostId = null;

  @JsonProperty("course_id")
  private Long courseId = null;

  public CourseDocument id(Long id) {
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

  public CourseDocument document(String document) {
    this.document = document;
    return this;
  }

  /**
   * link to the document
   * @return document
  **/
  @ApiModelProperty(example = "./documentLink", required = true, value = "link to the document")
  @NotNull

  public String getDocument() {
    return document;
  }

  public void setDocument(String document) {
    this.document = document;
  }

  public CourseDocument userPostId(Long userPostId) {
    this.userPostId = userPostId;
    return this;
  }

  /**
   * Get userPostId
   * @return userPostId
  **/
  @ApiModelProperty(example = "11", value = "")

  public Long getUserPostId() {
    return userPostId;
  }

  public void setUserPostId(Long userPostId) {
    this.userPostId = userPostId;
  }

  public CourseDocument courseId(Long courseId) {
    this.courseId = courseId;
    return this;
  }

  /**
   * Get courseId
   * @return courseId
  **/
  @ApiModelProperty(example = "11", required = true, value = "")
  @NotNull

  public Long getCourseId() {
    return courseId;
  }

  public void setCourseId(Long courseId) {
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
    CourseDocument courseDocument = (CourseDocument) o;
    return Objects.equals(this.id, courseDocument.id) &&
        Objects.equals(this.document, courseDocument.document) &&
        Objects.equals(this.userPostId, courseDocument.userPostId) &&
        Objects.equals(this.courseId, courseDocument.courseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, document, userPostId, courseId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CourseDocument {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    userPostId: ").append(toIndentedString(userPostId)).append("\n");
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
