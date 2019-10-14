package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CourseDocument
 */
@Entity
@Table(name = "course_documents")
public class CourseDocument   {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name= "id", nullable = false, unique = true)  	  
  @JsonProperty("id")
  private Long id = null;
  
  @Column(name = "name")
  @JsonProperty("name")
  private String name = null;
  
  @Column(name = "document")
  @JsonProperty("document")
  private String document = null;
  
  @Column(name = "user_post_id")
  @JsonProperty("user_post_id")
  private Long userPostId = null;
  
  @Column(name = "course_id")
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

  public CourseDocument name(String name) {
    this.name = name;
    return this;
  }

  /**
   * name of the file
   * @return name
  **/
  @ApiModelProperty(example = "documentName", required = true, value = "name of the file")
  @NotNull

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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
        Objects.equals(this.name, courseDocument.name) &&
        Objects.equals(this.document, courseDocument.document) &&
        Objects.equals(this.userPostId, courseDocument.userPostId) &&
        Objects.equals(this.courseId, courseDocument.courseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, document, userPostId, courseId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CourseDocument {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
