/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Futbolista extends Humano{
    
    public String posición;
    public int contrato;
    
    public void entrenar(){
        
        System.out.println("Entrenamos liviano");
    }
    
    public void jugar(){
    
        System.out.println("Se juega el próximo fin de semana");
    }
    
    public static void main (String []args) {

        Futbolista jugador1 = new Futbolista();
        
            jugador1.nombre = "Pepe";
            jugador1.equipo = "El Mejor";
            jugador1.edad = 28;
            jugador1.posición = "volante izquierdo";
            jugador1.contrato = 2024;
            
            System.out.println("Futbolista : " + jugador1.nombre);
            System.out.println("Equipo : " + jugador1.equipo);
            System.out.println("Edad : " + jugador1.edad);
            System.out.println("Posición : " + jugador1.posición);
            System.out.println("Contrato vigente hasta : " + jugador1.contrato);
            
            jugador1.comer();
            jugador1.dormir();
            jugador1.entrenar();
            jugador1.jugar();
                     
            
}
    
    
}
