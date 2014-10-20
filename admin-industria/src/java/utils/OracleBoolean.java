/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utils;

/**
 *
 * @author Gustavo Calandrini
 */
public enum OracleBoolean {
    TRUE('Y'),
    FALSE('N');
    
    Character value;

    private OracleBoolean(Character value) {
        this.value = value;
    }

    public static OracleBoolean getFALSE() {
        return FALSE;
    }

    public static OracleBoolean getTRUE() {
        return TRUE;
    }

    public Character getValue() {
        return value;
    }
    
    
    
}
