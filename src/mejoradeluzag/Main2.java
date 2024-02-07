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
public class Main2 extends javax.swing.JFrame {

    /**
     * Creates new form Main2
     */
    File archivo = null;
    public Main2() {
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
        jLabel5 = new javax.swing.JLabel();
        cbxSeleccion = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cbxElit = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cbxMaxmin = new javax.swing.JComboBox<>();
        btnEnviarD = new javax.swing.JButton();

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
            .addComponent(lblProcesada, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
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

        jLabel5.setText("Tipo de seleccion:");

        cbxSeleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elitista" }));

        jLabel10.setText("Elitista de:");

        cbxElit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2" }));

        jLabel6.setText("Optimizar para:");

        cbxMaxmin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Maximizar", "Minimizar" }));
        cbxMaxmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMaxminActionPerformed(evt);
            }
        });

        btnEnviarD.setText("Procesar Imagenes");
        btnEnviarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbxElit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxMaxmin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Generaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEnviarD)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(cbxElit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(cbxMaxmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 5, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(cbxSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Generaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEnviarD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(163, 163, 163))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlOriginal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(125, Short.MAX_VALUE))
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

        //int M = Integer.parseInt(Mutacion.getText());
        //int Cr = Integer.parseInt(Cruza.getText());
        int Gens = Integer.parseInt(Generaciones.getText());
        //String Tmut = TMutacion.getSelectedItem().toString();
        String Seleccion = cbxSeleccion.getSelectedItem().toString();
        int Eli = Integer.parseInt(cbxElit.getSelectedItem().toString());
        String opc = cbxMaxmin.getSelectedItem().toString();
        //int pob =  Integer.parseInt(cbxpoblacion.getSelectedItem().toString());

        int poblacion[][] = new int[3][1];
        int Fitness [] = new int [3];
        int Eliteint [] = new int [3];
        int ADN[][] = new int[3][3];
        String ADNS[][] = new String[3][3];
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
            
            // SE RECORRE LA IMAGEN Y SE LEE CADA PIXEL
            for (int e = 0; e < Gens; e++) {
                System.out.println("****************GENERACION NUMERO: " + e + "****************");
                System.out.println("****************GENERACION NUMERO: " + e + "****************");
                System.out.println("****************GENERACION NUMERO: " + e + "****************");
                System.out.println("****************GENERACION NUMERO: " + e + "****************");
                System.out.println("****************GENERACION NUMERO: " + e + "****************");
                System.out.println("****************GENERACION NUMERO: " + e + "****************");
                for (int i = 0; i < width - 1; i++) {
                    for (int j = 0; j < height - 1; j++) {
                        //EL VALOR DE PIXEL ES EN FORMATO HEXADECIMAL
                        //POR LO TANTO DEBE OBTENER SU EQUIVALENCIA A VALOR DECIMAL. SE PROCEDE ENTONCES
                        //A OBTENER LOS VALORES PARA RED, GREEEN Y BLUE MEDIANTE FILTRADO Y RECORRIMIENTO DE BITS
                        int pixel = ITratada.getRGB(i, j); //se le asigna al pixel el valor del bufer de la imagen
                        int R = (pixel & 0x00ff0000) >> 16;
                        int G = (pixel & 0x0000ff00) >> 8;
                        int B = pixel & 0x000000ff;
                        //Guardamos el nivel de gris
                        poblacion[0][0] = R;//poblacion sera el vector para tratar valores RGB como inds
                        poblacion[1][0] = G;
                        poblacion[2][0] = B;
                        int nivel_gris = (poblacion[0][0] + poblacion[1][0] + poblacion[2][0]) / 3;
                        System.out.println("LVL gris: " + nivel_gris);
                        //Llenar el vector de fitness
                        Fitness[0]= R;
                        Fitness[1]= G;
                        Fitness[2]= B;
                        //Mostrar la poblacion
                        System.out.println("ADN de esta poblacion: " + Arrays.toString(poblacion[0]));
                        System.out.println("ADN de esta poblacion: " + Arrays.toString(poblacion[1]));
                        System.out.println("ADN de esta poblacion: " + Arrays.toString(poblacion[2]));
                        // obtener el valor binario del ADN
                        ADNS= Metodos.DecaBinV(poblacion,1);
                        //Corregir el numero de cromosomas
                        ADNS = Metodos.PonCromosomas(ADNS, 1, 8);
                        for (int k = 0; k < 3; k++) {
                            System.out.println("ADN Binario de esta poblacion: " + Arrays.toString(ADNS[k]));
                        }
                        //Una vez que obtenemos el numero de pixeles para la poblacion y sus datos
                        //Obtener mis individuos de Elite
                        lvlGris = Metodos.SeleccionE(ADNS, Eli, Fitness, opc, 3);
                        System.out.println("Elites de esta poblacion: " + Arrays.toString(lvlGris));
                        //Pasar a entero los niveles de gris
                        Eliteint = Metodos.BinaDecV(lvlGris);
                        System.out.println("Elites de esta poblacion Dec: " + Arrays.toString(Eliteint));
                        //SE REALIZA LA CRUZA DE LOS INDIVIDUOS (SE GENERAN NUEVAS POBLACIONES)
                        //ADNS = Metodos.CruzaLuz(lvlGris, 8, pob, 1, Cr);
                        Fitness = Metodos.CruzaPix(Eliteint, poblacion, nivel_gris);
                        //Se aplica la mutacion a la nueva poblacion Y LA CONVERSION A DECIMAL
                        Fitness = Metodos.MutaPix(Fitness, nivel_gris);
                        System.out.println("nueva poblacion poblacion: " + Arrays.toString(Fitness));
                        //ASIGNAR ESTOS NUEVOS VALORES DE RGB A LA IMAGEN TRATADA
                        // pixel = Imagen.getRGB(i, j); //se le asigna al pixel el valor del bufer de la imagen
                        R = Fitness[0];
                        G = Fitness[1];
                        B = Fitness[2];
                        //Guardamos el nivel de gris en el pixel correspondiente
                        ITratada.setRGB(i, j,new Color(R,G,B).getRGB()); //se le da el color a la imagen   
                        //Escribir la imagen
                        ImageIO.write(ITratada,format,fich);
                    }
                }
            }
            rsscalelabel.RSScaleLabel.setScaleLabel(lblProcesada, fich.toString() );
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEnviarDActionPerformed

    private void cbxMaxminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMaxminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxMaxminActionPerformed

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
            java.util.logging.Logger.getLogger(Main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Generaciones;
    private javax.swing.JButton btnEnviarD;
    private javax.swing.JComboBox<String> cbxElit;
    private javax.swing.JComboBox<String> cbxMaxmin;
    private javax.swing.JComboBox<String> cbxSeleccion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblOriginal;
    private javax.swing.JLabel lblProcesada;
    private javax.swing.JPanel pnlOriginal;
    // End of variables declaration//GEN-END:variables
}