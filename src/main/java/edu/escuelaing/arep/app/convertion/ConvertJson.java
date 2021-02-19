package edu.escuelaing.arep.app.convertion;


import org.json.JSONObject;

public class ConvertJson {
    JSONObject myObjectJson ;

    public ConvertJson(){
        myObjectJson = new JSONObject();
    }

    public JSONObject stringToJSON(double number){
        return myObjectJson.put("result", number);
    }

}
