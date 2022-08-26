/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.couchbase.sangre_1;
import com.couchbase.client.java.json.JsonObject;
import com.couchbase.client.java.Collection;
        
/**
 *
 * @author SQL
 */
public class AddCita {
     public AddCita(Collection collection,String folio,String horario,
             boolean asistencia,boolean donapt,String observ,boolean foto,
             String status,String idpac,String iduser,String fecha,String tipodon){
         
        //JsonArray enrollments = JsonArray.create();//                                
        JsonObject Paciente = JsonObject.create()
                .put("horario",horario)
                .put("asistencia",asistencia)
                .put("donador_apto",donapt)
                .put("observaciones",observ)
                .put("fotofrafia",foto)
                .put("estatus",status)
                .put("id_paciente",idpac)
                .put("id_usuario",iduser)
                .put("fecha",fecha)
                .put("tipo_donador",tipodon);       
        collection.upsert(folio,Paciente);
    }
}
