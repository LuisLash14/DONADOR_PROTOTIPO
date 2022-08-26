/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.couchbase.sangre_1;
import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.Cluster;
import com.couchbase.client.java.Collection;
import com.couchbase.client.java.Scope;

/**
 *
 * @author SQL
 */
public class SANGRE_1 {
       
    public static void main(String[] args){ 
        //INICIO PROGRAMA PRUEBA SANGRE
        boolean stop = false;    
        Conexion conectar = new Conexion();
        conectar.Credenciales();
        Menu_select activar = new Menu_select();                         
            while(stop==false){   
                activar.MenuCaso();  
                switch(activar.getCaso()){
                    case "1" -> {System.out.println("******AGENDAR CITA******");
                    conectar.Context();
                    activar.KeysCita();                         
                    //conexion
                    Cluster cluster = Cluster.connect(conectar.getHost(),conectar.getUser(),conectar.getPassw()); 
                    
                    Bucket bucket = cluster.bucket(conectar.getD1());      
                    Scope scope = bucket.scope(conectar.getD2());     
                    Collection collection1 = scope.collection(conectar.getD3());
                    //creacion del json                    
                    AddCita cita = new AddCita(collection1,activar.getFolio(),activar.getHorario(),activar.getAsist(),activar.getDonApt()
                    ,activar.getObserv(),activar.getFoto(),activar.getStatus(),activar.getIdPac(),activar.getIdUser(),activar.getFecha(),activar.getTipoDon());                             
                    cluster.disconnect();
                    
                    System.out.println("******CITA AGREGADA CON EXITO******");
                    
                    }
                    case "2" -> System.out.println("******AGREGAR PACIENTE******");
                    case "3" -> System.out.println("******AGREGAR HOSPITAL******");
                    case "4" -> System.out.println("******AGREGAR DONADOR******");
                    case "5" -> System.out.println("******AGREGAR A PADRON DONADORES******");
                    case "6" -> System.out.println("******VER FECHAS Y TURNOS******");
                    case "7" -> {
                        System.out.println("******SALIENDO******");
                        stop= true;
                    }
                    default ->System.out.println("*****ESTA OPCION NO EXISTE******");
                    }     
                }              
            
    }
}

