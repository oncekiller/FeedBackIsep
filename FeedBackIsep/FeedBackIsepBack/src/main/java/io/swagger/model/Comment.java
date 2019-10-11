package io.swagger.model;

import java.util.Date;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import org.springframework.validation.annotation.Validated;

import javax.persistence.*;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Comment
 */

@Entity
@Table(name = "comments")
public class Comment   {
	
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name= "id", nullable = false, unique = true)
  @JsonProperty("id")
  private Long id = null;
  
  @Column(name = "user_id")
  @JsonProperty("user_id")
  private Long userId = null;
  
  @Column(name = "course_id")
  @JsonProperty("course_id")
  private Long courseId = null;
  
  @Column(name = "content")
  @JsonProperty("content")
  private String content = null;
  
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "date_time")
  @JsonProperty("date_time")
  private Date dateTime = null;
  
  @Column(name = "number_like")
  @JsonProperty("number_like")
  private Long numberLike = null;
  
  @Column(name = "number_dislike")
  @JsonProperty("number_dislike")
  private Long numberDislike = null;
  
  @Column(name = "parent_id")
  @JsonProperty("parent_id")
  private Long parentId = null;

  public Comment id(Long id) {
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

  public Comment userId(Long userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(example = "11", required = true, value = "")
  @NotNull

  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public Comment courseId(Long courseId) {
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

  public Comment content(String content) {
    this.content = content;
    return this;
  }

  /**
   * content of the comment
   * @return content
  **/
  @ApiModelProperty(example = "this is the content of a comment", required = true, value = "content of the comment")
  @NotNull

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Comment dateTime(Date dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  /**
   * dateTime when the comment have benn posted
   * @return dateTime
  **/
  @ApiModelProperty(required = true, value = "dateTime when the comment have benn posted")
  @NotNull

  @Valid
  public Date getDateTime() {
    return dateTime;
  }

  public void setDateTime(Date dateTime) {
    this.dateTime = dateTime;
  }

  public Comment numberLike(Long numberLike) {
    this.numberLike = numberLike;
    return this;
  }

  /**
   * Get numberLike
   * @return numberLike
  **/
  @ApiModelProperty(example = "11", required = true, value = "")
  @NotNull

  public Long getNumberLike() {
    return numberLike;
  }

  public void setNumberLike(Long numberLike) {
    this.numberLike = numberLike;
  }

  public Comment numberDislike(Long numberDislike) {
    this.numberDislike = numberDislike;
    return this;
  }

  /**
   * Get numberDislike
   * @return numberDislike
  **/
  @ApiModelProperty(example = "11", required = true, value = "")
  @NotNull

  public Long getNumberDislike() {
    return numberDislike;
  }

  public void setNumberDislike(Long numberDislike) {
    this.numberDislike = numberDislike;
  }

  public Comment parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * Get parentId
   * @return parentId
  **/
  @ApiModelProperty(example = "11", value = "")

  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Comment comment = (Comment) o;
    return Objects.equals(this.id, comment.id) &&
        Objects.equals(this.userId, comment.userId) &&
        Objects.equals(this.courseId, comment.courseId) &&
        Objects.equals(this.content, comment.content) &&
        Objects.equals(this.dateTime, comment.dateTime) &&
        Objects.equals(this.numberLike, comment.numberLike) &&
        Objects.equals(this.numberDislike, comment.numberDislike) &&
        Objects.equals(this.parentId, comment.parentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, courseId, content, dateTime, numberLike, numberDislike, parentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Comment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    courseId: ").append(toIndentedString(courseId)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    numberLike: ").append(toIndentedString(numberLike)).append("\n");
    sb.append("    numberDislike: ").append(toIndentedString(numberDislike)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
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
