package model.services;

import com.google.gson.Gson;
import model.entites.Address;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class AddressQuery implements Convert {



    @Override
    public Object conver(Object objeto, String uri) {


        String endereco = "https://viacep.com.br/ws/" + uri + "/json";
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), Address.class);
        }catch (Exception e) {
            throw new RuntimeException("You can't get the address from that zip code.");
        }
    }
}