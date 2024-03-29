/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mejoradeluzag;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import rsscalelabel.RSScaleLabel;

/**
 *
 * @author pollu
 */
public class Main extends javax.swing.JFrame {

    File archivo = null;

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlOriginal = new javax.swing.JPanel();
        lblOriginal = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblProcesada = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Generaciones = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Mutacion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Cruza = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TMutacion = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cbxSeleccion = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cbxElit = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cbxMaxmin = new javax.swing.JComboBox<>();
        btnEnviarD = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        cbxpoblacion = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlOriginal.setBorder(javax.swing.BorderFactory.createTitledBorder("Imagen Original"));

        javax.swing.GroupLayout pnlOriginalLayout = new javax.swing.GroupLayout(pnlOriginal);
        pnlOriginal.setLayout(pnlOriginalLayout);
        pnlOriginalLayout.setHorizontalGroup(
            pnlOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblOriginal, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
        );
        pnlOriginalLayout.setVerticalGroup(
            pnlOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOriginalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Imagen Procesada"));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblProcesada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblProcesada, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Geneticos"));

        jButton1.setText("Buscar Imagen");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Generaciones:");

        jLabel2.setText("Porcentaje Mutacion");

        jLabel3.setText("Probabilidad de cruza");

        jLabel4.setText("Tipo de mutacion:");

        TMutacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sutil", "Drastica" }));

        jLabel5.setText("Tipo de seleccion:");

        cbxSeleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elitista" }));

        jLabel10.setText("Elitista de:");

        cbxElit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6", "7", "8", "9" }));

        jLabel6.setText("Optimizar para:");

        cbxMaxmin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Maximizar", "Minimizar" }));

        btnEnviarD.setText("Procesar Imagenes");
        btnEnviarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarDActionPerformed(evt);
            }
        });

        jLabel11.setText("Tamaño de poblacion:");

        cbxpoblacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Generaciones))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Mutacion, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cruza)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TMutacion, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbxElit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxMaxmin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxpoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnEnviarD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(478, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(Mutacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(TMutacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(cbxElit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(cbxpoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Generaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cruza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(cbxSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(cbxMaxmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEnviarD)))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlOriginal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(139, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //limpiando texto cuando se usa fichero
        JFileChooser selectorArchivos = new JFileChooser();
        selectorArchivos.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        UIManager.put("selectorArchivos.alternateRowColor", Color.green);

        //Para solo buscar archivos .jpg
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de imagen .JPG", "jpg");
        FileNameExtensionFilter filtro2 = new FileNameExtensionFilter("Archivos de imagen .PNG", "png");
        selectorArchivos.setFileFilter(filtro);
        selectorArchivos.setFileFilter(filtro2);

        // indica cual fue la accion de usuario sobre el jfilechooser
        int resultado = selectorArchivos.showOpenDialog(this);
        // Se obtiene el archivo seleccionado
        archivo = selectorArchivos.getSelectedFile();
        // muestra error si es inválido
        if ((archivo == null) || (archivo.getName().equals(""))) {
            JOptionPane.showMessageDialog(this, "Nombre de archivo inválido", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            rsscalelabel.RSScaleLabel.setScaleLabel(lblOriginal, archivo.toString());
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEnviarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarDActionPerformed
        
        int M = Integer.parseInt(Mutacion.getText());
        int Cr = Integer.parseInt(Cruza.getText());
        int Gens = Integer.parseInt(Generaciones.getText());
        String Tmut = TMutacion.getSelectedItem().toString();
        String Seleccion = cbxSeleccion.getSelectedItem().toString();
        int Eli = Integer.parseInt(cbxElit.getSelectedItem().toString());
        String opc = cbxMaxmin.getSelectedItem().toString();
        int pob =  Integer.parseInt(cbxpoblacion.getSelectedItem().toString());
        
        int poblacion[] = new int[pob];
        int ADN[][] = new int[pob][3];
        String ADNS[][] = new String[pob][3];
        int ADNV[] = new int[3];
        String lvlGris[] = new String[3];
        int TPixeles, restantes, f, c,ft,ct;
        File fich = new File ("fotoGenetica.jpg");
        String format = "jpg";
        

        
        try {
            //abrir la imagen para tratar su matriz     
            BufferedImage Imagen = ImageIO.read(archivo);
            BufferedImage ITratada = ImageIO.read(archivo);//es la nueva imagen (Con el algoritmo genetico aplicado)
            
            //SE OBTIENE EL ALTO Y EL ANCHO DE LA IMAGEN
            int width = Imagen.getWidth();
            int height = Imagen.getHeight();
            System.out.println("Ancho: " + width + "Alto: " + height);

            Color colores[][] = new Color[100][100]; //SE DEFINE UNA MATRIZ DE COLORES 

            TPixeles = width * height;
            restantes = TPixeles;
            c = 0;
            f = 0;
            ft = 0;
            ct = 0;
            // SE RECORRE LA IMAGEN Y SE LEE CADA PIXEL
            for (int e = 0; e < Gens; e++) {
                for (int i = 0; i < width - 1; i++) {
                    for (int j = 0; j < height - 1; j++) {
                        //EL VALOR DE PIXEL ES EN FORMATO HEXADECIMAL
                        //POR LO TANTO DEBE OBTENER SU EQUIVALENCIA A VALOR DECIMAL. SE PROCEDE ENTONCES
                        //A OBTENER LOS VALORES PARA RED, GREEEN Y BLUE MEDIANTE FILTRADO Y RECORRIMIENTO DE BITS
                        int individuos = 0;
                        int individuosN = 0;
                        if (restantes >= pob) {//Si se puede tomar 9 pixeles de la imagen se toman 9
                            //seccionar el tratamiento de la imagen en vecindades de 9 pixeles
                            //System.out.println("C antes: " + c);
                            while (individuos < pob) {
                                if (c == height) {
                                    //System.out.println("hola");
                                    f = f + 1;
                                    c = 0;
                                }
                                int pixel = Imagen.getRGB(f, c); //se le asigna al pixel el valor del bufer de la imagen
                                int R = (pixel & 0x00ff0000) >> 16;
                                int G = (pixel & 0x0000ff00) >> 8;
                                int B = pixel & 0x000000ff;
                                int nivel_gris = (R + G + B) / 3;
                                //Guardamos el nivel de gris
                                poblacion[individuos] = nivel_gris;//POBLACION ES EL VECTOR DE FITNESS
                                //System.out.println("Nivel de gris/ Fitness = " + nivel_gris);
                                //Guardar el valor decimal del ADN de los individuos
                                ADN[individuos][0] = R;
                                ADN[individuos][1] = G;
                                ADN[individuos][2] = B;
                                //Incrementamos el contador de individuos
                                individuos = individuos + 1;
                                c = c + 1;
                            }
                            //System.out.println("C: " + c);
                            //System.out.println("Individuos: " + individuos);
                            restantes = restantes - pob;
                            System.out.println("Restantes: " + restantes);

                            // obtener el valor binario del ADN
                            ADNS = Metodos.DecaBinV(ADN, 3);
                            //Corregir el numero de cromosomas
                            ADNS = Metodos.PonCromosomas(ADNS, 3, 8);
                            for (int k = 0; k < pob; k++) {
                                System.out.println("ADN de esta poblacion: " + Arrays.toString(ADN[k]));
                            }
                            //Una vez que obtenemos el numero de pixeles para la poblacion y sus datos
                            //Obtener mis individuos de Elite
                            lvlGris = Metodos.SeleccionE(ADNS, Eli, poblacion, opc, pob);
                            //System.out.println("Elites de esta poblacion: " + Arrays.toString(lvlGris));


                            //SE REALIZA LA CRUZA DE LOS INDIVIDUOS (SE GENERAN NUEVAS POBLACIONES)
                            ADNS = Metodos.CruzaLuz(lvlGris, 8, pob, 3, Cr);
                            for (int k = 0; k < pob; k++) {
                                System.out.println("nueva poblacion poblacion(ADN): " + Arrays.toString(ADNS[k]));
                            }
                            //Se aplica la mutacion a la nueva poblacion Y LA CONVERSION A DECIMAL
                            if (TMutacion.equals("Sutil")) {
                                ADNS = Metodos.MutacionS(ADNS, pob, 3, M);
                                ADN = Metodos.BinaDec(ADNS, 3);
                            } else {
                                ADNS = Metodos.MutacionD(ADNS, pob, 3, M);
                                ADN = Metodos.BinaDec(ADNS, 3);
                            }
                            for (int k = 0; k < pob; k++) {
                                System.out.println("nueva poblacion poblacion: " + Arrays.toString(ADN[k]));
                            }
                            //ASIGNAR ESTOS NUEVOS VALORES DE RGB A LA IMAGEN TRATADA
                            while (individuosN < pob) {
                                if (ct == height) {
                                    //System.out.println("hola");
                                    ft = ft + 1;
                                    ct = 0;
                                }
                                int pixel = Imagen.getRGB(ft, ct); //se le asigna al pixel el valor del bufer de la imagen
                                int R = ADN[individuosN][0];
                                int G = ADN[individuosN][1];
                                int B = ADN[individuosN][2];
                                int nivel_gris = (R + G + B) / 3;
                                //Guardamos el nivel de gris en el pixel correspondiente
                                ITratada.setRGB(ft, ct,new Color(R,G,B).getRGB()); //se le da el color a la imagen
                                //Incrementamos el contador de individuos
                                individuosN = individuosN + 1;
                                ct = ct + 1;
                            }
                            //Escribir la imagen 
                            ImageIO.write(ITratada,format,fich);


                        } else if (restantes > 0 && restantes < pob) {//Si quedan menos de 9 pixeles por selccionar entonces se toman los restantes
                            while (individuos < restantes) {
                                if (c == height) {
                                    //System.out.println("hola");
                                    f = f + 1;
                                    c = 0;
                                }
                                int pixel = Imagen.getRGB(f, c); //se le asigna al pixel el valor del bufer de la imagen
                                int R = (pixel & 0x00ff0000) >> 16;
                                int G = (pixel & 0x0000ff00) >> 8;
                                int B = pixel & 0x000000ff;
                                int nivel_gris = (R + G + B) / 3;
                                //Guardamos el nivel de gris
                                poblacion[individuos] = nivel_gris;
                                //System.out.println("Nivel de gris/ Fitness = " + nivel_gris);
                                //Guardar el valor decimal del ADN de los individuos
                                ADN[individuos][0] = R;
                                ADN[individuos][1] = G;
                                ADN[individuos][2] = B;
                                //Incrementamos el contador de individuos
                                individuos = individuos + 1;
                                c = c + 1;
                            }
                            //System.out.println("C: " + c);
                            //System.out.println("Individuos: " + individuos);
                            restantes = restantes - pob;
                            System.out.println("Restantes: " + restantes);

                            // obtener el valor binario del ADN
                            ADNS = Metodos.DecaBinV(ADN, 3);
                            //Corregir el numero de cromosomas
                            ADNS = Metodos.PonCromosomas(ADNS, 3, 8);
                            for (int k = 0; k < pob; k++) {
                                System.out.println("ADN de esta poblacion: " + Arrays.toString(ADN[k]));
                            }
                            //Una vez que obtenemos el numero de pixeles para la poblacion y sus datos
                            //Obtener mis individuos de Elite
                            lvlGris = Metodos.SeleccionE(ADNS, Eli, poblacion, opc, pob);
                            //System.out.println("Elites de esta poblacion: " + Arrays.toString(lvlGris));
                            //SE REALIZA LA CRUZA DE LOS INDIVIDUOS (SE GENERAN NUEVAS POBLACIONES)
                            ADNS = Metodos.CruzaLuz(lvlGris, 8, pob, 3, Cr);
                            for (int k = 0; k < pob; k++) {
                                System.out.println("nueva poblacion poblacion(ADN): " + Arrays.toString(ADNS[k]));
                            }
                            //Se aplica la mutacion a la nueva poblacion
                            if (TMutacion.equals("Sutil")) {
                                ADNS = Metodos.MutacionS(ADNS, pob, 3, M);
                                ADN = Metodos.BinaDec(ADNS, 3);
                            } else {
                                ADNS = Metodos.MutacionD(ADNS, pob, 3, M);
                                ADN = Metodos.BinaDec(ADNS, 3);
                            }
                            for (int k = 0; k < pob; k++) {
                                System.out.println("nueva poblacion poblacion: " + Arrays.toString(ADN[k]));
                            }
                            //ASIGNAR ESTOS NUEVOS VALORES DE RGB A LA IMAGEN TRATADA
                            while (individuosN < pob) {
                                if (ct == height) {
                                    //System.out.println("hola");
                                    ft = ft + 1;
                                    ct = 0;
                                }
                                int pixel = Imagen.getRGB(ft, ct); //se le asigna al pixel el valor del bufer de la imagen
                                int R = ADN[individuosN][0];
                                int G = ADN[individuosN][1];
                                int B = ADN[individuosN][2];
                                int nivel_gris = (R + G + B) / 3;
                                //Guardamos el nivel de gris en el pixel correspondiente
                                ITratada.setRGB(ft, ct,new Color(R,G,B).getRGB()); //se le da el color a la imagen
                                //Incrementamos el contador de individuos
                                individuosN = individuosN + 1;
                                ct = ct + 1;
                            }
                            //Escribir la imagen 
                            ImageIO.write(ITratada,format,fich);
                        }

                    }
                 }
            }
            rsscalelabel.RSScaleLabel.setScaleLabel(lblProcesada, fich.toString() );
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnEnviarDActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cruza;
    private javax.swing.JTextField Generaciones;
    private javax.swing.JTextField Mutacion;
    private javax.swing.JComboBox<String> TMutacion;
    private javax.swing.JButton btnEnviarD;
    private javax.swing.JComboBox<String> cbxElit;
    private javax.swing.JComboBox<String> cbxMaxmin;
    private javax.swing.JComboBox<String> cbxSeleccion;
    private javax.swing.JComboBox<String> cbxpoblacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblOriginal;
    private javax.swing.JLabel lblProcesada;
    private javax.swing.JPanel pnlOriginal;
    // End of variables declaration//GEN-END:variables
}
