package application;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import entities.Album;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Program {

    static void main(String[] args) throws IOException, InterruptedException {

        String adress = "https://api.spotify.com/v1/albums/41GuZcammIkupMPKH2OJ6I";

        HttpClient httpClient = HttpClient.newBuilder().build();

        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create(adress))
                .header("Authorization", "Bearer BQCG6KI45-j441mBrj7GZQIeE5e1waXQ1AO2EkwJvlqotF7hHGUMqVPygI8Htr14kmIRDxR9PcOe9xfE4l1fco7MMBnvyeWq0BaaUGT71FHhuTaZpW7lbprVilST5b29Ns8-u4guL_ct")
                .build();

        HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        System.out.println(httpResponse.body());

        String response = httpResponse.body();

        JsonObject jsonObject = JsonParser.parseString(response).getAsJsonObject();

        String body =  response;
        JsonObject albuns = jsonObject.getAsJsonObject("albuns");
        JsonArray musicas = albuns.getAsJsonArray("tracks");



    }
}
