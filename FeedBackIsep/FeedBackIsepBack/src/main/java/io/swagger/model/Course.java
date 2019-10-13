package io.swagger.model;

import java.util.Date;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;	
import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Course
 */
@Entity
@Table(name = "courses")
public class Course   {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name= "id", nullable = false, unique = true)  
  @JsonProperty("id")
  private Long id = null;
  
  @Column(name = "teacher_id")
  @JsonProperty("teacher_id")
  private Long teacherId = null;
  
  @Column(name = "material_id")
  @JsonProperty("material_id")
  private Long materialId = null;
  
  @Column(name = "date_time")
  @JsonProperty("date_time")
  private Date dateTime = null;
  
  @Column(name = "duration")
  @JsonProperty("duration")
  private Integer duration = null;

  public Course id(Long id) {
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

  public Course teacherId(Long teacherId) {
    this.teacherId = teacherId;
    return this;
  }

  /**
   * Get teacherId
   * @return teacherId
  **/
  @ApiModelProperty(example = "11", required = true, value = "")
  @NotNull

  public Long getTeacherId() {
    return teacherId;
  }

  public void setTeacherId(Long teacherId) {
    this.teacherId = teacherId;
  }

  public Course materialId(Long materialId) {
    this.materialId = materialId;
    return this;
  }

  /**
   * Get materialId
   * @return materialId
  **/
  @ApiModelProperty(example = "11", required = true, value = "")
  @NotNull

  public Long getMaterialId() {
    return materialId;
  }

  public void setMaterialId(Long materialId) {
    this.materialId = materialId;
  }

  public Course dateTime(Date dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  /**
   * dateTime when the course started
   * @return dateTime
  **/
  @ApiModelProperty(required = true, value = "dateTime when the course started")
  @NotNull

  @Valid
  public Date getDateTime() {
    return dateTime;
  }

  public void setDateTime(Date dateTime) {
    this.dateTime = dateTime;
  }

  public Course duration(Integer duration) {
    this.duration = duration;
    return this;
  }

  /**
   * number of minutes of the course
   * @return duration
  **/
  @ApiModelProperty(example = "60", required = true, value = "number of minutes of the course")
  @NotNull

  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Course course = (Course) o;
    return Objects.equals(this.id, course.id) &&
        Objects.equals(this.teacherId, course.teacherId) &&
        Objects.equals(this.materialId, course.materialId) &&
        Objects.equals(this.dateTime, course.dateTime) &&
        Objects.equals(this.duration, course.duration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, teacherId, materialId, dateTime, duration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Course {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    teacherId: ").append(toIndentedString(teacherId)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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
