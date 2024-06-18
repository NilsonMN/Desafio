import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.management.modelmbean.ModelMBean;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Period;

public class Consulta {
    public Moneda consultar(String monodeIni, String tipoMondeda, int cntMoneda){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        URI direccion = URI.create(
                "https://v6.exchangerate-api.com/v6/0db1b24c3d725231691491ea/pair/"+
                monodeIni + "/" + tipoMondeda + "/" + cntMoneda);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try{
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
            /*
            String json = response.body();
            Moneda moneda = gson.fromJson(json, Moneda.class);
            System.out.println(moneda);
             */
        }
        catch (Exception e){
            throw new RuntimeException("Error " +
                    e);
        }
    }
}
