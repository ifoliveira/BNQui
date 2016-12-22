/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bnqui;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Nacho
 */
class Generar {

    public void escribir_txt(Boolean [][] valorPronostico, String [][] estadisticas) throws IOException {
        double [] porcentaje = new double [14];
        
        Boolean[][] pronostico = valorPronostico;
        String[] Detalle = new String[15];
        int[] Detalle1 = new int[15];
        
        double detalpor;
        Detalle[14]="FF";
        
        String ruta = "D:/Cap_Qv1.1/archivo.txt";
        File archivo = new File(ruta);
        String[] resultado={"1", "X", "2"};
        BufferedWriter bw;
        bw = new BufferedWriter(new FileWriter(archivo));

        for(int r0 = 0; r0 <= 2; r0 = r0 + 1){
            if (pronostico[0][r0] == true){
                Detalle[0] = resultado[r0];
                Detalle1[0]=r0;
                porcentaje[0] = Double.parseDouble(estadisticas[0][r0])/100;
                for(int r1 = 0; r1 <= 2; r1 = r1 + 1){
                    if (pronostico[1][r1] == true){
                        Detalle[1] = resultado[r1];
                        Detalle1[1] = r1;
                        porcentaje[1] = Double.parseDouble(estadisticas[1][r1])/100;

                        for(int r2 = 0; r2 <= 2; r2 = r2 + 1){
                            if (pronostico[2][r2] == true){
                                Detalle[2] = resultado[r2];
                                Detalle1[2] = r2;
                                porcentaje[2] = Double.parseDouble(estadisticas[2][r2])/100;
                        for(int r3 = 0; r3 <= 2; r3 = r3 + 1){
                            if (pronostico[3][r3] == true){
                                Detalle[3] = resultado[r3];
                                Detalle1[3] = r3;
                                porcentaje[3] = Double.parseDouble(estadisticas[3][r3])/100;
                        for(int r4 = 0; r4 <= 2; r4 = r4 + 1){
                            if (pronostico[4][r4] == true){
                                Detalle[4] = resultado[r4];
                                Detalle1[4] = r4;
                                porcentaje[4] = Double.parseDouble(estadisticas[4][r4])/100;
                        for(int r5 = 0; r5 <= 2; r5 = r5 + 1){
                            if (pronostico[5][r5] == true){
                                Detalle[5] = resultado[r5];
                                Detalle1[5] = r5;
                                porcentaje[5] = Double.parseDouble(estadisticas[5][r5])/100;
                        for(int r6 = 0; r6 <= 2; r6 = r6 + 1){
                            if (pronostico[6][r6] == true){
                                Detalle[6] = resultado[r6];
                                Detalle1[6] = r6;
                                porcentaje[6] = Double.parseDouble(estadisticas[6][r6])/100;
                        for(int r7 = 0; r7 <= 2; r7 = r7 + 1){
                            if (pronostico[7][r7] == true){
                                Detalle[7] = resultado[r7];
                                Detalle1[7] = r7;
                                porcentaje[7] = Double.parseDouble(estadisticas[7][r7])/100;
                        for(int r8 = 0; r8 <= 2; r8 = r8 + 1){
                            if (pronostico[8][r8] == true){
                                Detalle[8] = resultado[r8];
                                Detalle1[8] = r8;
                                porcentaje[8] = Double.parseDouble(estadisticas[8][r8])/100;
                        for(int r9 = 0; r9 <= 2; r9 = r9 + 1){
                            if (pronostico[9][r9] == true){
                                Detalle[9] = resultado[r9];
                                Detalle1[9] = r9;
                                porcentaje[9] = Double.parseDouble(estadisticas[9][r9])/100;
                        for(int r10 = 0; r10 <= 2; r10 = r10 + 1){
                            if (pronostico[10][r10] == true){
                                Detalle1[10] = r10;
                                Detalle[10] = resultado[r10];
                                porcentaje[10] = Double.parseDouble(estadisticas[10][r10])/100;
                        for(int r11 = 0; r11 <= 2; r11 = r11 + 1){
                            if (pronostico[11][r11] == true){
                                Detalle[11] = resultado[r11];
                                Detalle1[11] = r11;
                                porcentaje[11] = Double.parseDouble(estadisticas[11][r11])/100;

                                for(int r12 = 0; r12 <= 2; r12 = r12 + 1){
                                    if (pronostico[12][r12] == true){
                                        Detalle[12] = resultado[r12];
                                        Detalle1[12] = r12;
                                        porcentaje[12] = Double.parseDouble(estadisticas[12][r12])/100;

                                        for(int r13 = 0; r13 <= 2; r13 = r13 + 1){
                                            if (pronostico[13][r13] == true){
                                                Detalle[13] = resultado[r13];
                                                Detalle1[13] = r13;
                                                porcentaje[13] = Double.parseDouble(estadisticas[13][r13])/100;
                                                
                                                detalpor =  porcentaje[0]*porcentaje[1]*
                                                            porcentaje[2]*porcentaje[3]*
                                                            porcentaje[4]*porcentaje[5]*
                                                            porcentaje[6]*porcentaje[7]*
                                                            porcentaje[8]*porcentaje[9]*
                                                            porcentaje[10]*porcentaje[11]*
                                                            porcentaje[12]*porcentaje[13];
                                                
/*                                                detalpor = detalpor * 7000000;
                                                
                                                if (detalpor > 0.35 && detalpor < 0.66) {*/


                                                bw.write(Detalle[0] + Detalle[1] + Detalle[2] + 
                                                         Detalle[3] + Detalle[4] + Detalle[5] +
                                                         Detalle[6] + Detalle[7] + Detalle[8] +
                                                         Detalle[9] + Detalle[10]+ Detalle[11] +
                                                         Detalle[12]+ Detalle[13] +  "ZZ\r\n");
//                                                        +String.valueOf(detalpor)+"\r\n");
                                                       
                                            }
                                        }
                                    }
                                }
                            }
                        }}}}}}}}}}}}}}}}}}}}}}}
          
        bw.close();
}   
}
