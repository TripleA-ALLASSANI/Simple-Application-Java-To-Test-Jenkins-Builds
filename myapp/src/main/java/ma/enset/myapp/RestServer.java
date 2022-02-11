package ma.enset.myapp;
import static spark.Spark.*;

import java.util.*;

import com.google.gson.Gson;

public class RestServer {
    public static void main(String[] args) {
        Gson gson = new Gson();
        //fonction lambda(reconnue par java8)
        get("/hello",(req,resp)->{
            Map<String , Object> data = new HashMap<>();
            data.put("name", "Mohamed");
            data.put("salaire", "6500");
            resp.type("application/json");
            return data;
        }, gson::toJson);
    }
}
