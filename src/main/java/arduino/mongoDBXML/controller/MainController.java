package arduino.mongoDBXML.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


/**
 * Created by bodyfake on 26.06.2017.
 */

@RestController
public class MainController
{
    @RequestMapping("/isAlive")
    public Response isAlive() {
        return Response.ok("isAlive", MediaType.TEXT_PLAIN).build();
    }
    @RequestMapping("createUser")
    public Response createUser() {

        return Response.ok("User was created successfully").build();
    }
}
