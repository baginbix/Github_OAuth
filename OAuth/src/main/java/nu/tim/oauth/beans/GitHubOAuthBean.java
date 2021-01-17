/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.tim.oauth.beans;

import javax.ejb.Stateless;
import javax.json.JsonObject;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Tim
 */
@Stateless
public class GitHubOAuthBean {
    private final String CLIENT_ID ="a36d2aaa108e16bb3604";
    private final String CLIENTSECRET ="67ebb53de5b284805a77c371f5eb869416ada800";
    
    
    public String getToken(String code){

    }
    
    public JsonObject githubAuth(String token){
    }
}
