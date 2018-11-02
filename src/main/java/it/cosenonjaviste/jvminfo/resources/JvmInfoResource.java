package it.cosenonjaviste.jvminfo.resources;

import it.cosenonjaviste.jvminfo.models.JvmInfo;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("jvm")
public class JvmInfoResource {

    @GET
    public JvmInfo getLsCpu() {
        return new JvmInfo();
    }
}
