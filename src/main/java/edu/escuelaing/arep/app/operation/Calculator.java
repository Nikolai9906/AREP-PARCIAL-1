package edu.escuelaing.arep.app.operation;

public class Calculator {
    public double number;
    public String operation;

    public Calculator(double number, String operation){
        this.number = number;
        this.operation = operation;
    }

    public double getResultOperation(){
        double res = 0;
        //System.out.println(number + "operacion");
        if(operation.equals("sin")){
            res = Math.sin(number);
        }else if (operation.equals("cos")){
            res = Math.cos(number);
        }else if (operation.equals("tan")){
            res = Math.tan(number);
        }
        //System.out.println(res + "RES CALCUL");
        return res;
    }

}
