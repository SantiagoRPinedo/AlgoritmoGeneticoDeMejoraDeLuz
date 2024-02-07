/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mejoradeluzag;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author pollu
 */
public class Metodos {

// TRATAMIENTO DE NUMEROS

    //POBLACION A BINATRIO CON VARIAS VARIABLES 
     public static String [][] DecaBinV (int[][] poblacion, int variables){
        String[][] binario = new String[poblacion.length][variables];
        String Cadena = "";
        int digito= 0;
        int decimal;
        for (int i = 0; i < poblacion.length; i++) {
            for (int j = 0; j < variables; j++) {
                decimal = poblacion[i][j];//SE OBTIENE EL NUMERO DECIMAL A TRATAR
                if (decimal <0){//Si el numero es negativo
                    decimal = -(decimal);//se obtiene el numero decimal positivo
                    while (decimal != 0){//procedimiento para convertir a binario
                        digito = decimal % 2;
                        decimal = decimal/2;
                        Cadena = digito + Cadena;
                    }
                    Cadena = complementoaDos(Cadena);//se regresa el binario negativo
                }else{//si es un numero positivo solo  se hace el procedimiento normal
                    while (decimal != 0){
                        digito = decimal % 2;
                        decimal = decimal/2;
                        Cadena = digito + Cadena;
                    }
                }
                binario[i][j] = Cadena;
                Cadena = "";
            }
        }
        return binario;
    }
    //POBLACION DE BINARIO A DECIMAL 
     public static int[][] BinaDec (String[][] binarios,int variables){
        int[][] decimales = new int [binarios.length][variables];
        int numero = 0;
        int fracc = 0; 
        char vecC[] = null;
        for (int i = 0; i < binarios.length; i++) {
            for (int j = 0; j < variables; j++) {
                vecC = binarios[i][j].toCharArray();
                //para recorrer la cadena de 1s y 0s
                for (int x = 0; x < vecC.length; x++) {
                    char c = vecC[x];
                    String s = c + "";
                    if (s.equals("1")){
                        fracc = (int) Math.pow(2, vecC.length - (x+1));
                        numero = numero + fracc;
                    }else{
                        numero = numero + 0; 
                    }
                }
                decimales[i][j]= numero;
                numero = 0;
            }
        }

        return decimales;
    } 
     //POBLACION DE BINARIO A DECIMAL VECTOR
     public static int[] BinaDecV (String[] binarios){
        int[] decimales = new int [binarios.length];
        int numero = 0;
        int fracc = 0; 
        char vecC[] = null;
        for (int i = 0; i < binarios.length; i++) {
                vecC = binarios[i].toCharArray();
                //para recorrer la cadena de 1s y 0s
                for (int x = 0; x < vecC.length; x++) {
                    char c = vecC[x];
                    String s = c + "";
                    if (s.equals("1")){
                        fracc = (int) Math.pow(2, vecC.length - (x+1));
                        numero = numero + fracc;
                    }else{
                        numero = numero + 0; 
                    }
                }
                decimales[i]= numero/2;
                numero = 0;
        }

        return decimales;
    } 
        //Complemento a 2 (Números binarios negativos)
    public static String complementoaDos(String nBin) {
        StringBuilder sb = new StringBuilder(nBin);
        nBin = sb.reverse().toString();//Invertir la cadena
        boolean band = true;
        String nBinN = "";
        int i = 0;
        do {//Guardar los números hasta que se encuentre un 1
            if (nBin.charAt(i) == '1') {
                nBinN += nBin.charAt(i);
                band = false;
            } else {
                nBinN += nBin.charAt(i);
            }
            i++;
        } while (band);
        for (int j = nBinN.length(); j < nBin.length(); j++) {
            if (nBin.charAt(j) == '1') {
                nBinN += "0";
            } else {
                nBinN += "1";
            }
        }
        sb = new StringBuilder(nBinN);
        nBinN = sb.reverse().toString();//Invertir la cadena
        return nBinN;
    }
// CREAR POBLACIONES
    //POBLACIONES CON VARIAS VARIABLES 
    
    //POBLACION CON VARIABLES ENTERAS
    public static int[][] PoblacionV (int tamaño, int variables, int minimo, int maximo) {
        int[][] poblacion = new int [tamaño][variables];
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < variables; j++) {
                poblacion[i][j] = ThreadLocalRandom.current().nextInt(minimo,maximo);
            }
        }
        return poblacion;
    }
    
   //POBLACION CON VARIAS VARIABLES FLOATS
     public static float[][] PoblacionVF (int tamaño, int variables, int minimo, int maximo) {
        Random rand = new Random();
        float[][] poblacion = new float [tamaño][variables];
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < variables; j++) {
                poblacion[i][j] = minimo + ( maximo - minimo ) * rand.nextFloat();
            }
        }
        return poblacion;
    }
    
    
// IMPRIMIR DATOS
      //Datos Int
    public static void ImprimirV (String cadena, int[]datos){
        for (int i = 0; i < datos.length; i++) {
            System.out.println(cadena + datos[i]);
        }
        System.out.println("\n");
    }
    //Datos float
    public static void ImprimirV (String cadena, float[]datos){
        for (int i = 0; i < datos.length; i++) {
            System.out.println(cadena + datos[i]);
        }
        System.out.println("\n");
    }
//CALCULAR EL PROMEDIO DE UN VECTOR
    public static float Promedio (float[] Fitness){
        float prom = 0;
        float suma = 0;
        for (int i = 0; i < Fitness.length; i++) {
            suma = suma + Fitness[i];
        }
        prom = suma/ (Fitness.length);
        return prom;
    }
//CORRECCION DE CROMOSOMAS
    public static String[][] PonCromosomas (String[][] ADNS,int variables, int Cromosomas){
        String [][] ADNC = new String[ADNS.length][variables];
        String ADN = "";
        for (int i = 0; i < ADNS.length; i++) {
            for (int j = 0; j < variables; j++) {
                //de aqui para abajo se hace la correcion de cromosomas
                ADN = ADNS[i][j];//Se asigna el ADN sin gorregir a la cadena
                int CromO = ADN.length();//Se obtiene la longitud real de cromosomas
                if(CromO < Cromosomas){//si los cromosomas son menores se agregan los faltantes
                    int mas = Cromosomas - CromO;
                    for (int x = 0; x < mas; x++) {
                        ADN = "0" + ADN;
                    }
                }
                ADNC[i][j]= ADN;
            }
        }
        return ADNC;
    }
//CORRECCION DE CROMOSOMAS DEPSUES DE LA CRUZA
    public static String[] PonCruza(String[] ADNS, int Cromosomas){
        String [] ADNC = new String[ADNS.length];
        String ADN = "";
        for (int i = 0; i < ADNS.length; i++) {
            ADN = ADNS[i];
            int dif = ADN.length();
            if(ADN.length() < Cromosomas){//si los cromosomas son menores se agregan los faltantes
                int mas = Cromosomas - dif ;
                for (int x = 0; x < mas; x++) {
                    ADN = "0" + ADN;
                }
                ADNS[i]= ADN;
            }
        }
        return ADNS;
    }
//METODO DE MUTACION
    //MUTACION SUTIL
    public static String[][] MutacionS (String[][] ADNS,int tamaño, int variables, int Porcentaje){
        int Individuos = (Porcentaje * tamaño) /100;
        //System.out.println(Individuos);
        int Mutar;
        int MutarX;
        String Cadena,aux = "";
        char[] CadeChar;
        // se llena el vector con la ubiacion de los individuos a mutar
        for (int i = 0; i < Individuos; i++) {
            Mutar = ThreadLocalRandom.current().nextInt(0,tamaño);//Aleatorio para individuo
            MutarX= ThreadLocalRandom.current().nextInt(0,variables);//Aleatorio en variables
        //Se recorre la cadena de la posicion de los individuos a mutar
            int x = Mutar;
            int y = MutarX;
            
            Cadena = ADNS[x][y];//Se asigna el individuo a mutar a la cadena
            CadeChar = Cadena.toCharArray(); //La cadena se convierte a un arreglo de caracteres
            int fin = Cadena.length()-1;
            aux = CadeChar[fin] + ""; //al auxiliar le vamos a asignar el ultimo valor de la cadena
            
            if (aux.equals("1")){//Si es un 1 lo hacemos 0 y viceversa
                CadeChar[fin] = '0';
            }else{
                CadeChar[fin] = '1';
            }
            Cadena = "";
            //Finalmente a cadena le asignamos su nuevo valor
            for (int j = 0; j < CadeChar.length; j++) {
                Cadena = Cadena + CadeChar[j];
            }
            ADNS[x][y] = Cadena;
            
            //MutarX = ThreadLocalRandom.current().nextInt(0,variables);//Aleatorio en variables
        }
        
        return ADNS;
    }
    //MUTACION Drastica
    public static String[][] MutacionD (String[][] ADNS,int tamaño, int variables, int Porcentaje){
        int Individuos = (Porcentaje * tamaño) /100;
        //System.out.println(Individuos);
        int Mutar;
        int MutarX;
        String Cadena,aux = "";
        char[] CadeChar;
        // se llena el vector con la ubiacion de los individuos a mutar
        for (int i = 0; i < Individuos; i++) {
            Mutar = ThreadLocalRandom.current().nextInt(0,tamaño);//Aleatorio para individuo
            MutarX= ThreadLocalRandom.current().nextInt(0,variables);//Aleatorio en variables
        //Se recorre la cadena de la posicion de los individuos a mutar
            int x = Mutar;
            int y = MutarX;
            
            Cadena = ADNS[x][y];//Se asigna el individuo a mutar a la cadena
            CadeChar = Cadena.toCharArray(); //La cadena se convierte a un arreglo de caracteres
            aux = CadeChar[0] + ""; //al auxiliar le vamos a asignar el ultimo valor de la cadena
            
            if (aux.equals("1")){//Si es un 1 lo hacemos 0 y viceversa
                CadeChar[0] = '0';
            }else{
                CadeChar[0] = '1';
            }
            Cadena = "";
            //Finalmente a cadena le asignamos su nuevo valor
            for (int j = 0; j < CadeChar.length; j++) {
                Cadena = Cadena + CadeChar[j];
            }
            ADNS[x][y] = Cadena;
            
            //MutarX = ThreadLocalRandom.current().nextInt(0,variables);//Aleatorio en variables
        }
        
        return ADNS;
    }
    //FUNCION PARA SELECCION ELITISTA DE INDIVIDUOS
    public static String[] SeleccionE (String[][] ADNS,int Cantidad,int[] Fitness, String Opc, int pob){
        float grande = Fitness[0];
        int[] seleccionados = new int [Cantidad];
        String[] SelecBin = new String[Cantidad];
        int posicion =0 ;
        if (Opc.equals("Maximizar")){
            for (int j = 0; j < Cantidad; j++) {
                for (int i = 0; i < pob; i++) {
                    if (Fitness[i] > grande){
                        grande = Fitness[i];
                        posicion = i;
                        //System.out.println("Posicion:" + posicion + "Valor: " +grande);
                    }
                    if (i == pob-1 && grande == Fitness[0]){
                        grande =  Fitness[0];
                        Fitness[0] = -1;
                        posicion = 0;
                        //System.out.println("Posicion:" + 0 + "Valor: " +grande);
                    }
                }
                grande =  0;
                Fitness[posicion] = -1;
                seleccionados[j] = posicion;
            }
        }else {
            for (int j = 0; j < Cantidad; j++) {
                for (int i = 0; i < pob; i++) {
                    if (Fitness[i] < grande){
                        grande = Fitness[i];
                        posicion = i;
                        //System.out.println("Posicion:" + posicion + "Valor: " +grande);
                    }
                    if (i == pob-1 && grande == Fitness[0]){
                        grande =  Fitness[0];
                        Fitness[0] = 1000000;
                        posicion = 0;
                        //System.out.println("Posicion:" + 0 + "Valor: " +grande);
                    }
                }
                grande =  100000;
                Fitness[posicion] = 1000000;
                seleccionados[j] = posicion;
            }
        }
        //Se obtienen los valores STR de los individuos elite
        for (int i = 0; i < SelecBin.length; i++) {
            int s = seleccionados[i];
            //System.out.println("s" + s);
            SelecBin[i] = Arrays.toString(ADNS[s]);
        }
        return SelecBin;
    }
    //FUNCION PARA CRUZA (CREACION DE POBLACIONES NUEVAS)
     public static String[][] Cruza (String [] Individuos,int cromosomas, int Tamano, int Variables, int porcentaje){
        String[][] poblacion = new String [Tamano][Variables];
        String [] Cromos = new String [Individuos.length];
        String [] Combinados = new String [Tamano];
        char [] indc;
        String Cadena = "";
        int inicio = 0;
        
        //OBTENEMOS EL TOTAL DE CROMOSOMAS (VARIABLES)(CROMOSOMAS)
        int tCrom = cromosomas * Variables; 
        //Porcentaje de cromosomas para cruza
        int com = (porcentaje * tCrom) /100;
        //System.out.println("porcentaje: " + com);
        //Primero vamos a eliminar las ',' de los string seleccionados
         for (int i = 0; i < Individuos.length; i++) {
             indc = Individuos[i].toCharArray();
             for (int j = 0; j < indc.length; j++) {
                 String c = indc[j] +"";
                 if (c.equals("0") || c.equals("1")){
                     Cadena = Cadena + c;
                 }  
             }
             Cromos [i] = Cadena;
             Cadena = "";
         }
         Cadena = "";
         
         // GENERAR UN RANDOM EN EL RANGO DEL PORCENTAJE DE CROMOSOMAS TOTALES
         inicio = ThreadLocalRandom.current().nextInt(0,com);//Aleatorio para individuo
         //Iniciar a tomar cromosomas de los individuos
         for (int i = 0; i < Tamano; i++) { //cantidad de individuos a generar
             for (int j = 0; j < Individuos.length; j++) {
                indc = Cromos[j].toCharArray();
                for (int x = inicio; x < (com + inicio); x++) {//a partir de donde se tomaran cromosomas
                    Cadena = Cadena + indc[x];
                }
                //System.out.println("Inicio: " + inicio);
                inicio = ThreadLocalRandom.current().nextInt(0,com);//Aleatorio para individuo
             }
             Combinados[i] = Cadena;
             Cadena= "";
             inicio = ThreadLocalRandom.current().nextInt(0,com);//Aleatorio para individuo
        }
        //EN CASO DE SER NECESARIO AGRAGAR CROMOSOMAS FALTANTES
        Combinados = PonCruza(Combinados,tCrom);
        //Separamos las variables segun el numero de cromosomas que dbe tener cada una
        indc = null;
        Cadena = "";
        for (int i = 0; i < Tamano; i++) {
            indc = Combinados[i].toCharArray();
            for (int j = 0; j < Variables; j++) {
                for (int k = 0; k < cromosomas; k++) {
                    Cadena = Cadena + indc[k];
                }
                poblacion[i][j] = Cadena;
                Cadena = "";
            }
        }
        return poblacion;
    }
    //FUNCION PARA CRUZA EN EL PROBLEMA DE LA MEJORA DE LUZ
     public static String[][] CruzaLuz (String [] Individuos,int cromosomas, int Tamano, int Variables, int porcentaje){
        
        String[][] poblacion = new String [Tamano][Variables];//Nueva poblacion
        String [] Combinados = new String [Tamano];//vector con las cadenas de cruza
        String Cadena= "";
        String Cad= "";
        char [] CadA ;
        int inicio = 0;
        
        //OBTENEMOS EL TOTAL DE CROMOSOMAS (VARIABLES)(CROMOSOMAS)(INDIVIDUOS)
        int tCrom = cromosomas * Variables * Individuos.length; 
        //Porcentaje de cromosomas para cruza
        int Pcrom = (porcentaje * tCrom) /100;
        int restantes = (cromosomas * Variables) + Pcrom;
        int R = tCrom - Pcrom; //Cromosomas restantes a tomar del siguiente individuo   
        
        //Primero eliminar las  "," de la cadena de bits
        for (int i = 0; i < Individuos.length; i++) {
             char [] indc = Individuos[i].toCharArray();//vector de caracteres de la cadena de bits
             for (int j = 0; j < indc.length; j++) {
                 String c = indc[j] +"";
                 if (c.equals("0") || c.equals("1")){
                     Cadena = Cadena + c;//Se guardan los bits de todos los individuos en una sola cadena
                 }  
             }
        }
        //System.out.println("Cadena de bits:" + Cadena);
        CadA = Cadena.toCharArray();
        inicio = ThreadLocalRandom.current().nextInt(0,R);//Aleatorio para iniciar seleccion de bits
         //System.out.println("Inicio antes de for: " + inicio);
         //System.out.println("Cad antes de for: " + Cad);
        //Ahora vamos a tomar bits de la cadena total segun el porcentaje
        for (int i = 0; i < Tamano; i++) {
            //Tomar el porcentaje de bits que toca
            for (int j = inicio; j < Pcrom; j++) { 
                Cad = Cad + CadA[j];
            }
            //System.out.println("Inicio a mitad de for: " + inicio);
            //System.out.println("Cad a mitad de for: " + Cad);
            // Tomar los bits que hagan falta para completar el numero de cromosomas
            inicio = ThreadLocalRandom.current().nextInt(0,Pcrom);//Aleatorio para iniciar seleccion de bits
            for (int j = inicio; j < restantes ; j++) {
                 Cad = Cad + CadA[j];
            }
            inicio = ThreadLocalRandom.current().nextInt(0,R);//Aleatorio para iniciar seleccion de bits
            Combinados[i] = Cad;
        }
         
        Cad= "";
        int f = 0;
        //SEPARAMOS LOS CROMOSOMAS OBTENIDOS EN LOS QUE LE TOCAN A CADA VARIABLE
         for (int i = 0; i < Tamano; i++) {
             CadA = Combinados[i].toCharArray();
             for (int j = 0; j < Variables; j++) {
                 for (int k = 0; k < cromosomas; k++) {
                     Cad = Cad + CadA[f];
                     f = f + 1 ;
                 }
                 poblacion[i][j] = Cad;
                 Cad = "";
             }
         }
        return poblacion;
    }
    //CRUZA PARA PIXEL
    public static int[] CruzaPix (int[] elites, int[][] poblacion, int lvlGris){
        int val = 0;
        int Cruza [] = new int[3];
        Cruza[0] = 0;
        Cruza[1] = 0;
        Cruza[2] = 0;
        for (int i = 0; i < elites.length; i++) {
            val = elites[i];
            for (int j = 0; j < poblacion.length; j++) {
                if (val == poblacion[j][0]){
                    Cruza[j] = val;
                }              
            }
        }
        return Cruza;
    }
    //MUTACION DE UN PIXEL
    public static int[] MutaPix (int[] Cruza,int lvlGris){
        int val = 0;
        for (int i = 0; i < Cruza.length; i++) {
            if (Cruza[i] == 0){
                Cruza[i] = lvlGris;
            }
        }
        return Cruza;
    }
        
    //MAPEO DE UNA POBLACION EN FLOAT A UNA POBLACION DE ENTEROS 
    public static int[][] MapeoADec (float [][] poblacion, int variables, int tamano) {
        int[][] poblacionN = new int [tamano][variables];
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < variables; j++) {
                poblacionN[i][j] = (int) (poblacion[i][j] * 100);
            }
        }
        return poblacionN;
    }
    //DEMAPEAR xd
    public static float[][] DesMapeo (int [][] poblacion, int variables, int tamano) {
        float[][] poblacionN = new float [tamano][variables];
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < variables; j++) {
                float n1= (float)(poblacion[i][j]);
                float n2 = (float)(100);
                poblacionN[i][j] =(float)n1 / n2;
            }
        }
        return poblacionN;
    }
     //FITNESS DE PRUEBA
     public static float[] Fitness (int [][] Poblacion){
         int x1,x2,x3,d1,x12,x22,x32,d2,d3, suma;
         float [] fit = new float [Poblacion.length];
         float e;
         for (int i = 0; i < Poblacion.length; i++) {
            //Funcion x^2 + y^2
            x1  = Poblacion[i][0];
            x2 = Poblacion[i][1];
            x3 = Poblacion[i][2];
            
            x12 = Poblacion[i][0] * Poblacion[i][0];
            x22 = Poblacion[i][1] * Poblacion[i][1];
            x32 = Poblacion[i][2] * Poblacion[i][2];
            
            d1 = (1/4000)*(x12);
            d2 = (1/4000)*(x22);
            d3 = (1/4000)*(x32);
            
            suma = 1+ d1+d2+d3;
            double mul1 = 0.5 * x2 * 1.41;
            double mul2 = 0.33 * x3 * 1.73;
            
            fit [i] = (float) (suma - (Math.cos(x1)*Math.cos(mul1) * Math.cos(mul2) ));
         }
         return fit;
    }
        
}