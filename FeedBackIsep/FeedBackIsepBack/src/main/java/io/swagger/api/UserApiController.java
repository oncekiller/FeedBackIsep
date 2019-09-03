package io.swagger.api;

import io.swagger.model.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-01T00:52:54.999Z[GMT]")
@Controller
public class UserApiController implements UserApi {

    private static final Logger log = LoggerFactory.getLogger(UserApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public UserApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addUser(@ApiParam(value = "User to add"  )  @Valid @RequestBody User body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> deleteUser(@ApiParam(value = "The id that needs to be deleted",required=true) @PathVariable("userId") String userId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<String>(objectMapper.readValue("''", String.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<User>> getAllUsers(@ApiParam(value = "Isep id of the user to search") @Valid @RequestParam(value = "isepId", required = false) String isepId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<User>>(objectMapper.readValue("[ {\"firstname\" : \"Antoine\",\n" + 
                		"  \"password\" : \"root\",\n" + 
                		"  \"mail\" : \"canard.antoine@gmail.com\",\n" + 
                		"  \"color\" : \"#222222\",\n" + 
                		"  \"parent_id\" : 11,\n" + 
                		"  \"isep_id\" : 9236,\n" + 
                		"  \"id\" : 11,\n" + 
                		"  \"avatar\" : \"./pictureAvatar\",\n" + 
                		"  \"enabled\" : true,\n" + 
                		"  \"username\" : \"acanard\",\n" + 
                		"  \"lastname\" : \"CANARD\"\n" + 
                		"}, {\n" + 
                		"  \"firstname\" : \"Antoine\",\n" + 
                		"  \"password\" : \"root\",\n" + 
                		"  \"mail\" : \"canard.antoine@gmail.com\",\n" + 
                		"  \"color\" : \"#222222\",\n" + 
                		"  \"parent_id\" : 11,\n" + 
                		"  \"isep_id\" : 9236,\n" + 
                		"  \"id\" : 11,\n" + 
                		"  \"avatar\" : \"./pictureAvatar\",\n" + 
                		"  \"enabled\" : true,\n" + 
                		"  \"username\" : \"acanard\",\n" + 
                		"  \"lastname\" : \"CANARD\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<User>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<User>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<User>> getUserId(@ApiParam(value = "Id of the user to search",required=true) @PathVariable("userId") String userId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<User>>(objectMapper.readValue("[ { \"firstname\" : \"Antoine\",\n" + 
                		"  \"password\" : \"root\",\n" + 
                		"  \"mail\" : \"canard.antoine@gmail.com\",\n" + 
                		"  \"color\" : \"#222222\",\n" + 
                		"  \"parent_id\" : 11,\n" + 
                		"  \"isep_id\" : 9236,\n" + 
                		"  \"id\" : 11,\n" + 
                		"  \"avatar\" : \"./pictureAvatar\",\n" + 
                		"  \"enabled\" : true,\n" + 
                		"  \"username\" : \"acanard\",\n" + 
                		"  \"lastname\" : \"CANARD\"\n" + 
                		"}, {\n" + 
                		"  \"firstname\" : \"Antoine\",\n" + 
                		"  \"password\" : \"root\",\n" + 
                		"  \"mail\" : \"canard.antoine@gmail.com\",\n" + 
                		"  \"color\" : \"#222222\",\n" + 
                		"  \"parent_id\" : 11,\n" + 
                		"  \"isep_id\" : 9236,\n" + 
                		"  \"id\" : 11,\n" + 
                		"  \"avatar\" : \"./pictureAvatar\",\n" + 
                		"  \"enabled\" : true,\n" + 
                		"  \"username\" : \"acanard\",\n" + 
                		"  \"lastname\" : \"CANARD\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<User>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<User>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<User> updateUser(@ApiParam(value = "Updated user object" ,required=true )  @Valid @RequestBody User body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<User>(objectMapper.readValue("{'firstname' : 'Antoine',\n" + 
                		"  'password' : 'root',\n" + 
                		"  'mail' : 'canard.antoine@gmail.com',\n" + 
                		"  'color' : ''#222222',\n" + 
                		"  'parent_id' : 11,\n" + 
                		"  'isep_id' : 9236,\n" + 
                		"  'id' : 11,\n" + 
                		"  'avatar' : './pictureAvatar',\n" + 
                		"  'enabled' : true,\n" + 
                		"  'username' : 'acanard',\n" + 
                		"  'lastname' : 'CANARD'}", User.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<User>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<User>(HttpStatus.NOT_IMPLEMENTED);
    }

}
