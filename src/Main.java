import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) {
        Consulta consulta = new Consulta();
        Moneda moneda = consulta.consultar("AED");
        System.out.println(moneda);
    }
}
