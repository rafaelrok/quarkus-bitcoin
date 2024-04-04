package br.com.rafaelvieira.controller;

import br.com.rafaelvieira.enums.Asset;
import br.com.rafaelvieira.model.Trade;
import br.com.rafaelvieira.service.TradeService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import java.util.List;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/trades")
public class TradeController {

    @Inject
    @RestClient
    TradeService tradeService;

    @GET
    public List<Trade> getAllTrades(Asset asset) {
        return tradeService.getAllTrades(asset);
    }
}
