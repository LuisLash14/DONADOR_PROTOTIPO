/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.couchbase.sangre_1;
import java.util.Scanner;

/**
 *
 * @author SQL
 */
public class Menu_select {
    String caso; //variable para menu
    //Variables para los datos de la cita
    String folio,horario,observ,status,idpac,iduser,fecha,tipodon;
    boolean asistencia,donapt,foto;
    //
    public void MenuCaso(){      
        Scanner entrada = new Scanner(System.in);
        System.out.println("""                       
                           
                           ******DIGITE EL NUMERO DE UNA OPCION:****** 
                           AGENDAR CITA: 1 
                           AGREGAR PACIENTE: 2 
                           AGREGAR HOSPITAL: 3 
                           AGREGAR DONADOR: 4 
                           AGREGAR A PADRON DONADORES: 5 
                           VER FECHAS Y TURNOS: 6 
                           SALIR: 7 """);
        caso = entrada.nextLine();                
    }
    public void KeysCita(){      
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n******DATOS DE LA CITA******");
        System.out.println("Introduzca el FOLIO del documento: ");
        folio = entrada.nextLine();       
        System.out.println("Introduzca las observaciones: ");
        observ = entrada.nextLine(); 
        System.out.println("Introduzca el status: ");
        status = entrada.nextLine();
        System.out.println("Introduzca el id del paciente: ");
        idpac = entrada.nextLine();
        System.out.println("Introduzca el id del usuario: ");
        iduser = entrada.nextLine();
        System.out.println("Introduzca la fecha: FORMATO AAAA-MM-DD ");
        fecha = entrada.nextLine();
        System.out.println("Introduzca el tipo de donador: ");
        tipodon = entrada.nextLine();
        System.out.println("Asistencia:  true/false ");
        asistencia = entrada.nextBoolean();      
        System.out.println("Es donador apto?  true/false");
        donapt= entrada.nextBoolean();
        System.out.println("Acepta tomar foto?  true/false");
        foto= entrada.nextBoolean();
    }
    
    
    public String getCaso(){
        return(caso);
    }
    public boolean getAsist(){
        return(asistencia);
    }
    public boolean getDonApt(){
        return(donapt);
    }
    public String getObserv(){
        return(observ);
    }
    public boolean getFoto(){
        return(foto);
    }
    public String getStatus(){
        return(status);
    }
    public String getIdPac(){
        return(idpac);
    }
    public String getIdUser(){
        return(iduser);
    }
    public String getFecha(){
        return(fecha);
    }
    public String getTipoDon(){
        return(tipodon);
    }
    public String getHorario(){
        return(horario);
    }
    public String getFolio(){
        return(folio);
    }
}
