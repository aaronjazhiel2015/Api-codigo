package com.mycompany.leerkofax;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * Hello world!
 *
 */
public class App {
    
    
    

    public static void main(String[] args) {
        FileReader fr;
        BufferedReader br;
        List<Map<String, String>> lstMaps;
        Map<String, String> map = new HashMap<String, String>();;
        // String linea, llave, valor;
        StringTokenizer st;
        
        
        
        
        try {
            File extraction = new File("C:/TEMP/Shared Folders/banamex/imagenes/data.txt");
            fr = new FileReader(extraction);
            br = new BufferedReader(fr);

            String strLinea,llave;
            ArrayList lineas = new ArrayList();
            while ((strLinea = br.readLine()) != null) {
                ArrayList campos = new ArrayList();
                st = new StringTokenizer(strLinea,",");								
            
                while(st.hasMoreTokens()){
                        llave = st.nextToken();
                        llave=llave.replaceAll("\"", "");
                        campos.add(llave);
                }
                
                DocumentoKofax docuementCampo= new  DocumentoKofax();
                docuementCampo.setIdentificador(1);
                docuementCampo.setClasidicacion(campos.get(1).toString());
                docuementCampo.setDocumentacion(campos.get(3).toString());
                docuementCampo.setPaterno(campos.get(5).toString());
                docuementCampo.setMaterno(campos.get(7).toString());
                docuementCampo.setNombre(campos.get(9).toString());
                docuementCampo.setCalle(campos.get(11).toString());
                docuementCampo.setNumero(campos.get(13).toString());
                docuementCampo.setColonia(campos.get(15).toString());
                docuementCampo.setMunicipio(campos.get(17).toString());
                docuementCampo.setEstado(campos.get(19).toString());
                docuementCampo.setCodigoPostal(campos.get(21).toString());
                docuementCampo.setCurp(campos.get(23).toString());
                docuementCampo.setFechaNaciento(campos.get(25).toString());
                docuementCampo.setSexo(campos.get(27).toString());
                docuementCampo.setRuta(campos.get(28).toString());
                lineas.add(docuementCampo);
                
            }
            
            TipoDocumentosUtil.DOCUMENTO_IFE_FRONTAL.getTipoDocumento();
            
             imprimirArchivo(lineas);
       } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static  void imprimirArchivo(ArrayList lineas){
            for(int i=0;i<lineas.size();i++){
                    DocumentoKofax  Kofax=(DocumentoKofax) lineas.get(i);
                    System.out.println("campo"+ i+" :"+" "+Kofax.getIdentificador()+" ,"+Kofax.getClasidicacion()+", "+Kofax.getDocumentacion()+", "+
                    Kofax.getPaterno()+" "+ Kofax.getMaterno()+ ","+ Kofax.getNombre()+","+
                    Kofax.getCalle()+", "+Kofax.getNumero() +", "+Kofax.getColonia() +","+Kofax.getMunicipio()+", "+
                    Kofax.getEstado()+" ," +Kofax.getCodigoPostal() +", " +Kofax.getCodigoPostal() +", "+
                    Kofax.getCurp()+", "+ Kofax.getFechaNaciento()+ Kofax.getSexo()+","+ Kofax.getRuta());
                 }
    }
}
