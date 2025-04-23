package com.dilaniz.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class HelloControlPractica {

//Primer trabajo 
    @GetMapping("/hola")
    public String holamundo(){
        return "¡Hola Mundooo!";
    } 
//Segundo trabajo
    @GetMapping("/hola/{nombre}")
    public String holamundo(@PathVariable String nombre){
        return "Hola a todos, mi nombre es " + nombre;
    }
//Tercer trabajo
    @GetMapping("/suma")
    public String suma(){
        return "SUMANDOO";
    }
    @GetMapping("/resta")
    public String resta(){
        return "RESTANDO";
    }
    @GetMapping("/multiplicacion")
    public String multiplicacion(){
        return "MULTIPLICANDO";
    }
    @GetMapping("/division")
    public String division(){
        return "DIVIDIENDO";
    } 

//Cuarto trabajo
    @GetMapping ("/suma/{a}/{b}")
    public String suma(@PathVariable int a, @PathVariable int b){
        int resultado = a + b;
        return "El resultado de la suma es " + resultado;
    }

    @GetMapping("/resta/{a}/{b}")
    public String resta(@PathVariable int a, @PathVariable int b){
        int resultado = a - b;
        return "El resultado de la resta es " + resultado;
    }
    

    @GetMapping("/multiplicacion/{a}/{b}")
    public String multiplicacion(@PathVariable int a, @PathVariable int b){
        int resultado = a * b;
        return "El resultado de la multiplicacion es " + resultado;
    }
    
    @GetMapping("/division/{a}/{b}")
    public String division(@PathVariable int a, @PathVariable int b){
        if (b == 0){
            return "No se puede dividir por 0 ";
        }
        double resultado = (double) a / b;
        return "El resultado de la division es " + resultado;
    }
@RestController
@RequestMapping("/clientes")
public class ClienteController { 

    @GetMapping
    public String index(){
        return "bienvenidos al listado clientes";
    }
    
    }   
@RestController
@RequestMapping("/productos")
public class ProductoController { 

    @GetMapping("/hhh")
    public String index(){
        return "bienvenidos al listado de productos";
    }
    
    }   
}   
