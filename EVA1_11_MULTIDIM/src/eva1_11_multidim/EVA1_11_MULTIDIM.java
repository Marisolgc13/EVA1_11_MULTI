/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_multidim;

/**
 *
 * @author Marisol G
 */
public class EVA1_11_MULTIDIM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arregloMultiDim[][][][] = new int [3][3][3][3];
       // arregloMultiDim [2][2][1][0] = 100;
        for (int i = 0; i <arregloMultiDim.length; i++) {
            for (int j = 0; j < arregloMultiDim[i].length; j++) {
                for (int k = 0; k <arregloMultiDim[i][j].length; k++) {
                    for (int l = 0; l < arregloMultiDim[i][j][k].length; l++) {
                        arregloMultiDim[i][j][k][l] = (int)(Math.random() * 100);
                    }
                }
            }
        }
          for (int i = 0; i <arregloMultiDim.length; i++) {
            for (int j = 0; j < arregloMultiDim[i].length; j++) {
                for (int k = 0; k <arregloMultiDim[i][j].length; k++) {
                    for (int l = 0; l < arregloMultiDim[i][j][k].length; l++) {
                        System.out.println("[" + arregloMultiDim [i][j][k][l] + "]");
                    }
                }
            }
        }
    }
}

