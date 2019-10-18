package io.swagger.model;

import java.util.Date;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
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
 * Message
 */
@Entity
@Table(name = "messages")
public class Message   {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name= "id", nullable = false, unique = true)    
  @JsonProperty("id")
  private Long id = null;

  @Column(name = "conversation_id")
  @JsonProperty("conversation_id")
  private Long conversationId = null;

  @Column(columnDefinition="tinyint(1)", name = "is_from_sender")
  @JsonProperty("is_from_sender")
  private Boolean isFromSender = null;

  @Column(name = "content")
  @JsonProperty("content")
  private String content = null;

  @Column(columnDefinition="tinyint(1)",name = "is_read")
  @JsonProperty("is_read")
  private Boolean isRead = null;

  @Column(name = "date_time")
  @JsonProperty("date_time")
  private Date dateTime = null;

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

  public Message isRead(Boolean isRead) {
    this.isRead = isRead;
    return this;
  }

  /**
   * is this message have been read
   * @return isRead
  **/
  @ApiModelProperty(example = "true", required = true, value = "is this message have been read")
  @NotNull

  public Boolean isIsRead() {
    return isRead;
  }

  public void setIsRead(Boolean isRead) {
    this.isRead = isRead;
  }

  public Message dateTime(Date dateTime) {
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
  public Date getDateTime() {
    return dateTime;
  }

  public void setDateTime(Date dateTime) {
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
        Objects.equals(this.isRead, message.isRead) &&
        Objects.equals(this.dateTime, message.dateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, conversationId, isFromSender, content, isRead, dateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Message {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    isFromSender: ").append(toIndentedString(isFromSender)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    isRead: ").append(toIndentedString(isRead)).append("\n");
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
