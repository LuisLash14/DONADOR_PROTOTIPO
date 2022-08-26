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
public class Conexion {
    String bucket,scope,collection,host,user,passw;        
    public void Credenciales(){
        Scanner entrada = new Scanner(System.in); 
        System.out.println("******OBTENCION DE DATOS DEL CLUSTER******");
        System.out.println("Introduzca la dir. del host: ");
        host = entrada.nextLine();
        System.out.println("Introduzca el usuario: ");
        user = entrada.nextLine();
        System.out.println("Introduzca el password: ");
        passw = entrada.nextLine();
        System.out.println("******DATOS INGRESADOS******");
        System.out.println("HOST: "+host+"\nUser: "+user+"\nPassword:"+passw);
    }
    public void Context(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("******CONTEXTO DEL QUERY******");
        System.out.println("Introduzca el nombre del bucket: ");
        bucket= entrada.nextLine();
        System.out.println("Introduzca el nombre del scope: ");
        scope= entrada.nextLine();
        System.out.println("Introduzca el nombre de collection: ");
        collection= entrada.nextLine();
        System.out.println("******CONTEXTO INGRESADO****** ");
        System.out.println("BUCKET: "+bucket +"\nSCOPE: "+scope + "\nCollection: "+collection);
    }    
    
    public String getHost(){
        return(host);
    } 
    public String getUser(){
        return(user);
    } 
    public String getPassw(){
        return(passw);
    } 
    public String getD1(){
        return(bucket);
    } 
    public String getD2(){
        return(scope);
    } 
    public String getD3(){
        return(collection);
    } 
}
