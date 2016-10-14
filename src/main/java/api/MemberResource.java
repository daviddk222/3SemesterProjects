/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import model.DataFactory;
import model.Member;

/**
 * REST Web Service
 *
 * @author HazemSaeid
 */
@Path("member")
public class MemberResource {
    
    
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of MemberResource
     */
    public MemberResource() {
    }

    /**
     * Retrieves representation of an instance of api.MemberResource
     * @return an instance of java.lang.String
     */
    @GET
    //@Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
    DataFactory df = new DataFactory();
            return df.getMembersAsJson();
    }
//    public static void main(String[] args) {
//        DataFactory df = new DataFactory();
//        System.out.println(df.getMembersAsJson());
//    }
    /**
     * PUT method for updating or creating an instance of MemberResource
     * @param content representation for the resource
     */
  
}
