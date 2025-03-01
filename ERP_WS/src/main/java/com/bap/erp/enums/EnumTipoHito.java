/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bap.erp.enums;

/**
 *
 * @author Jonas
 */
public enum EnumTipoHito {
    	ANTICIPO("DP"),
    	ENTREGA("DEL"),
    	ACEPTACION_PARCIAL("PAC"),
        ACEPTACION_FINAL("FAC");
    
    private String codigo;
    
    private EnumTipoHito(String codigo){
        this.codigo = codigo;
    }
    
    
    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
