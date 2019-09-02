package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Conversation
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-01T00:52:54.999Z[GMT]")
public class Conversation   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("from_id")
  private Long fromId = null;

  @JsonProperty("to_id")
  private Long toId = null;

  @JsonProperty("object")
  private String object = null;

  @JsonProperty("dateTime")
  private OffsetDateTime dateTime = null;

  public Conversation id(Long id) {
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

  public Conversation fromId(Long fromId) {
    this.fromId = fromId;
    return this;
  }

  /**
   * Get fromId
   * @return fromId
  **/
  @ApiModelProperty(example = "11", required = true, value = "")
  @NotNull

  public Long getFromId() {
    return fromId;
  }

  public void setFromId(Long fromId) {
    this.fromId = fromId;
  }

  public Conversation toId(Long toId) {
    this.toId = toId;
    return this;
  }

  /**
   * Get toId
   * @return toId
  **/
  @ApiModelProperty(example = "11", required = true, value = "")
  @NotNull

  public Long getToId() {
    return toId;
  }

  public void setToId(Long toId) {
    this.toId = toId;
  }

  public Conversation object(String object) {
    this.object = object;
    return this;
  }

  /**
   * object of the conversation
   * @return object
  **/
  @ApiModelProperty(example = "This is the object of the conversation", required = true, value = "object of the conversation")
  @NotNull

  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public Conversation dateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  /**
   * dateTime when the conversation have been created
   * @return dateTime
  **/
  @ApiModelProperty(required = true, value = "dateTime when the conversation have been created")
  @NotNull

  @Valid
  public OffsetDateTime getDateTime() {
    return dateTime;
  }

  public void setDateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Conversation conversation = (Conversation) o;
    return Objects.equals(this.id, conversation.id) &&
        Objects.equals(this.fromId, conversation.fromId) &&
        Objects.equals(this.toId, conversation.toId) &&
        Objects.equals(this.object, conversation.object) &&
        Objects.equals(this.dateTime, conversation.dateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fromId, toId, object, dateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Conversation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fromId: ").append(toIndentedString(fromId)).append("\n");
    sb.append("    toId: ").append(toIndentedString(toId)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
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
