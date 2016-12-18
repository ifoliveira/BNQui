/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bnqui;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nacho
 */
public class columna {
    Boolean [][] columna = new Boolean [15][3];
    
        public columna() {
            
            int j;
            int i;
            for (j=0;j<=13;j++){
                for (i=0;i<=2;i++){
                    columna[j][i]= false;
             }
         }
        }
   
    public void setColumna(Boolean check, int i, int j){
    
         columna[i][j]= check;
    }
    
    public Boolean [][] getColumna(){
        
        return columna;
    }
}

