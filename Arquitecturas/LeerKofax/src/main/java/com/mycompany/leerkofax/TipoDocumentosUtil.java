/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.leerkofax;

/**
 *
 * @author Aaron Jazhiel
 */
public enum TipoDocumentosUtil {
    
  //BARÇA("FC Barcelona",1), REAL_MADRID("Real Madrid",2),
  //	SEVILLA("Sevilla FC",4), VILLAREAL("Villareal",7); 
  
    DOCUMENTO_IFE_FRONTAL(1,"ife frontal"),
    DOCUMENTO_IFE_REVERSO(1,"ife reverso"),
    DOCUMENTO_TELMEX(1,"docuemnto de telmex");
    
    
    private int tipoDocumento;
    private String descripcion;

    private TipoDocumentosUtil(int tipoDocumento, String descripcion) {
        this.tipoDocumento = tipoDocumento;
        this.descripcion = descripcion;
    }

    public int getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(int tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
