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
 * Message
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-01T00:52:54.999Z[GMT]")
public class Message   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("conversation_id")
  private Long conversationId = null;

  @JsonProperty("is_from_sender")
  private Boolean isFromSender = null;

  @JsonProperty("content")
  private String content = null;

  @JsonProperty("read")
  private Boolean read = null;

  @JsonProperty("dateTime")
  private OffsetDateTime dateTime = null;

  public Message id(Long id) {
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

  public Message conversationId(Long conversationId) {
    this.conversationId = conversationId;
    return this;
  }

  /**
   * Get conversationId
   * @return conversationId
  **/
  @ApiModelProperty(example = "11", required = true, value = "")
  @NotNull

  public Long getConversationId() {
    return conversationId;
  }

  public void setConversationId(Long conversationId) {
    this.conversationId = conversationId;
  }

  public Message isFromSender(Boolean isFromSender) {
    this.isFromSender = isFromSender;
    return this;
  }

  /**
   * is this message is from the creator of the conversation
   * @return isFromSender
  **/
  @ApiModelProperty(example = "true", required = true, value = "is this message is from the creator of the conversation")
  @NotNull

  public Boolean isIsFromSender() {
    return isFromSender;
  }

  public void setIsFromSender(Boolean isFromSender) {
    this.isFromSender = isFromSender;
  }

  public Message content(String content) {
    this.content = content;
    return this;
  }

  /**
   * content of the message
   * @return content
  **/
  @ApiModelProperty(example = "this is the content of the message", required = true, value = "content of the message")
  @NotNull

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Message read(Boolean read) {
    this.read = read;
    return this;
  }

  /**
   * is this message have been read
   * @return read
  **/
  @ApiModelProperty(example = "true", value = "is this message have been read")

  public Boolean isRead() {
    return read;
  }

  public void setRead(Boolean read) {
    this.read = read;
  }

  public Message dateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  /**
   * dateTime when the message have been posted
   * @return dateTime
  **/
  @ApiModelProperty(required = true, value = "dateTime when the message have been posted")
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
    Message message = (Message) o;
    return Objects.equals(this.id, message.id) &&
        Objects.equals(this.conversationId, message.conversationId) &&
        Objects.equals(this.isFromSender, message.isFromSender) &&
        Objects.equals(this.content, message.content) &&
        Objects.equals(this.read, message.read) &&
        Objects.equals(this.dateTime, message.dateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, conversationId, isFromSender, content, read, dateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Message {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    isFromSender: ").append(toIndentedString(isFromSender)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
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
