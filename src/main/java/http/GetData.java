package http;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
    https://www.baeldung.com/java-9-http-client

    https://data.cityofnewyork.us/Transportation/TLC-New-Driver-Application-Status/dpec-ucu7
 */
public class GetData {

    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newHttpClient();

        getDataAsCSV(httpClient);

        getDataAsJson(httpClient);

        getFile(httpClient);
    }

    static void getDataAsCSV(HttpClient httpClient) throws IOException, InterruptedException {
        /*
            https://data.cityofnewyork.us/resource/dpec-ucu7.csv
            Can also use the URL in this form and exclude the Accept header
            The Accept header is the standard way of handling this
         */
        URI uri = URI.create("https://data.cityofnewyork.us/resource/dpec-ucu7");
        HttpRequest request = HttpRequest.newBuilder().uri(uri)
                .header("Accept", "text/csv")
                .GET()
                .build();

        HttpResponse<Stream<String>> response = httpClient.send(request, HttpResponse.BodyHandlers.ofLines());

        List<String> lines = response.body().collect(Collectors.toList());

        System.out.println("Returned " + lines.size() + " lines of csv data.");
    }

    static void getDataAsJson(HttpClient httpClient) throws IOException, InterruptedException {
        /*
            https://data.cityofnewyork.us/resource/dpec-ucu7.json
            Can also use the URL in this form and exclude the Accept header
            The Accept header is the standard way of handling this
         */
        URI uri = URI.create("https://data.cityofnewyork.us/resource/dpec-ucu7");
        HttpRequest request = HttpRequest.newBuilder().uri(uri)
                .header("Accept", "application/json")
                .GET()
                .build();

        HttpResponse<Stream<String>> response = httpClient.send(request, HttpResponse.BodyHandlers.ofLines());

        /*
            Getting data as JSON has a lot of benefits
            But it requires integrating with libraries to parse data easily
            That will be covered in another class
         */
        List<String> lines = response.body().collect(Collectors.toList());

        System.out.println("Returned " + lines.size() + " lines of json data.");
    }

    static void getFile(HttpClient httpClient) throws IOException, InterruptedException {
        URI uri = URI.create("https://api.worldbank.org/v2/en/country/USA?downloadformat=csv");
        HttpRequest request = HttpRequest.newBuilder().uri(uri)
                .GET()
                .build();

        HttpResponse<InputStream> response = httpClient.send(request, HttpResponse.BodyHandlers.ofInputStream());

        Map<String,List<String>> headerMap = response.headers().map();

        String fileName = headerMap.get("content-disposition").get(0)
                .replace("attachment; filename=", "");

        Path directory = Paths.get("out/writeFile/");
        Files.createDirectory(directory);

        Path path = Paths.get(directory + "/" + fileName);

        Files.copy(response.body(), path);

        System.out.println("Downloaded and saved file : " + path);

        // clean up
        Files.delete(path);
        Files.delete(directory);
    }
}
