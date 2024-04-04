package br.com.rafaelvieira.service;

import br.com.rafaelvieira.enums.Asset;
import br.com.rafaelvieira.model.Trade;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.List;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

/**
 * @author rafae
 */

@RegisterRestClient
public interface TradeService {

    @GET
    @Path("/{asset}/trades")
    @Produces({ MediaType.APPLICATION_JSON })
    List<Trade> getAllTrades(@PathParam("asset") Asset asset);
}
