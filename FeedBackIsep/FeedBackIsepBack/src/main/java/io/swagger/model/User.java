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
 * User
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-01T00:52:54.999Z[GMT]")
public class User   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("username")
  private String username = null;

  @JsonProperty("firstname")
  private String firstname = null;

  @JsonProperty("lastname")
  private String lastname = null;

  @JsonProperty("isep_id")
  private Long isepId = null;

  @JsonProperty("mail")
  private String mail = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("avatar")
  private String avatar = null;

  @JsonProperty("color")
  private String color = null;

  @JsonProperty("parent_id")
  private Long parentId = null;

  @JsonProperty("enabled")
  private Boolean enabled = null;

  public User id(Long id) {
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

  public User username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(example = "acanard", required = true, value = "")
  @NotNull

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public User firstname(String firstname) {
    this.firstname = firstname;
    return this;
  }

  /**
   * Get firstname
   * @return firstname
  **/
  @ApiModelProperty(example = "Antoine", required = true, value = "")
  @NotNull

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public User lastname(String lastname) {
    this.lastname = lastname;
    return this;
  }

  /**
   * Get lastname
   * @return lastname
  **/
  @ApiModelProperty(example = "CANARD", required = true, value = "")
  @NotNull

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public User isepId(Long isepId) {
    this.isepId = isepId;
    return this;
  }

  /**
   * Get isepId
   * @return isepId
  **/
  @ApiModelProperty(example = "9236", required = true, value = "")
  @NotNull

  public Long getIsepId() {
    return isepId;
  }

  public void setIsepId(Long isepId) {
    this.isepId = isepId;
  }

  public User mail(String mail) {
    this.mail = mail;
    return this;
  }

  /**
   * Get mail
   * @return mail
  **/
  @ApiModelProperty(example = "canard.antoine@gmail.com", required = true, value = "")
  @NotNull

  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public User password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(example = "root", required = true, value = "")
  @NotNull

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public User avatar(String avatar) {
    this.avatar = avatar;
    return this;
  }

  /**
   * link the picture of the avatar
   * @return avatar
  **/
  @ApiModelProperty(example = "./pictureAvatar", required = true, value = "link the picture of the avatar")
  @NotNull

  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  public User color(String color) {
    this.color = color;
    return this;
  }

  /**
   * Get color
   * @return color
  **/
  @ApiModelProperty(example = "#222222", required = true, value = "")
  @NotNull

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public User parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * Get parentId
   * @return parentId
  **/
  @ApiModelProperty(example = "11", required = true, value = "")
  @NotNull

  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  public User enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
  **/
  @ApiModelProperty(example = "true", required = true, value = "")
  @NotNull

  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.username, user.username) &&
        Objects.equals(this.firstname, user.firstname) &&
        Objects.equals(this.lastname, user.lastname) &&
        Objects.equals(this.isepId, user.isepId) &&
        Objects.equals(this.mail, user.mail) &&
        Objects.equals(this.password, user.password) &&
        Objects.equals(this.avatar, user.avatar) &&
        Objects.equals(this.color, user.color) &&
        Objects.equals(this.parentId, user.parentId) &&
        Objects.equals(this.enabled, user.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, username, firstname, lastname, isepId, mail, password, avatar, color, parentId, enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    isepId: ").append(toIndentedString(isepId)).append("\n");
    sb.append("    mail: ").append(toIndentedString(mail)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
