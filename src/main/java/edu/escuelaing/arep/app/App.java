package edu.escuelaing.arep.app;
import edu.escuelaing.arep.app.convertion.ConvertJson;
import edu.escuelaing.arep.app.operation.Calculator;

import java.util.ArrayList;
import java.util.List;

import static spark.Spark.*;
/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args ) {
        port(getPort());
        get("/operation", (request, response) -> {
            //System.out.println(request.queryParams("operation"));
            //System.out.println(request.queryParams("number"));
            //System.out.println(Double.parseDouble(request.queryParams("number")));
            Calculator calculator =  new Calculator(Double.parseDouble(request.queryParams("number")),request.queryParams("operation"));
            ConvertJson convert = new ConvertJson();
            System.out.println(convert.stringToJSON(calculator.getResultOperation()));
            return convert.stringToJSON(calculator.getResultOperation());
        });
    }
    /**
     * Funcion que retorna el número del puerto por el cual se correrá el servicio.
     * @return El número de puerto del servicio.
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}
