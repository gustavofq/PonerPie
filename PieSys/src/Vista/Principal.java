/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType0Font;

/**
 *
 * @author gustavo
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setTitle("C.D.D.I - Pie de Página.");
        this.setResizable(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfOrigen = new javax.swing.JTextField();
        jtfDestino = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaSalida = new javax.swing.JTextArea();
        jpbProgreso = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        jbCopiarOrigen = new javax.swing.JButton();
        jbCopiarDestino = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jmiSoporte = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Origen:");
        jLabel1.setToolTipText("\"Oringe de los documentos pdf\"");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Destino:");
        jLabel2.setToolTipText("\"Destino de los Documentos pdf \"");

        jtfOrigen.setToolTipText("Ingrese la ruta absoluta del directorio donde están los documentos PDF para poner pie de página.");
        jtfOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfOrigenActionPerformed(evt);
            }
        });

        jtfDestino.setToolTipText("Ingrese la ruta absoluta del directorio donde se depositaran los documentos PDF con pie de página.");

        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setText("OK");
        jButton1.setToolTipText("Inicia el proceso de poner pie de página.");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.setToolTipText("Termina el proceso de poner pie de página.");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jtaSalida.setColumns(20);
        jtaSalida.setRows(5);
        jtaSalida.setToolTipText("");
        jScrollPane1.setViewportView(jtaSalida);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Progreso:");

        jbCopiarOrigen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-pegar-16.png"))); // NOI18N
        jbCopiarOrigen.setToolTipText("Copiar");
        jbCopiarOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCopiarOrigenActionPerformed(evt);
            }
        });

        jbCopiarDestino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-pegar-16.png"))); // NOI18N
        jbCopiarDestino.setToolTipText("copiar");
        jbCopiarDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCopiarDestinoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfOrigen)
                            .addComponent(jtfDestino))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbCopiarOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbCopiarDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jpbProgreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCopiarOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCopiarDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpbProgreso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jMenu1.setText("Archivo");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");

        jmiSoporte.setText("Soporte");
        jmiSoporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSoporteActionPerformed(evt);
            }
        });
        jMenu2.add(jmiSoporte);

        jMenuItem2.setText("Acerca de");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(0==JOptionPane.showConfirmDialog(null, "Debe hacer un control de calidad de los documentos."+'\n'+ "Estas seguro de continuar?" ,"Antes de seguir", JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE)){
            if(!this.jtfOrigen.getText().isEmpty()){
                if(!this.jtfDestino.getText().isEmpty()){
                    String text = "";
                    String origen = this.jtfOrigen.getText();
                    String destino = this.jtfDestino.getText();
                    File _dir = new File(origen);
                    File dir = new File(destino);
                    File[] ficheros = _dir.listFiles();
                    String path;
                    int progreso = 0;
                    try {
                        path = new java.io.File(".").getCanonicalPath();
                    }catch (IOException ex) {
                        Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    if(_dir.exists()){
                        this.jpbProgreso.setMaximum(ficheros.length);
                        if(dir.exists()){
                            for (int x=0;x<ficheros.length;x++){
                                try {
                                    File file = new File(origen+"\\"+ficheros[x].getName());
                                    jtaSalida.append("Procesando: "+ origen+"\\"+ficheros[x].getName()+ '\n'+ '\r');                               
                                    PDDocument document = PDDocument.load(file);
                                    int noOfPages= document.getNumberOfPages();
                                    for(int i= 0;i < noOfPages; i++){
                                        PDPage page = document.getPage(i);
                                        jtaSalida.append("Agregando pie a página: " + (i + 1) +" de " + noOfPages  + '\n' +'\r');
                                        PDPageContentStream contentStream;
                                        try {
                                            contentStream = new PDPageContentStream(document, page,PDPageContentStream.AppendMode.APPEND, true, true);
                                            contentStream.beginText();
                                            contentStream.newLineAtOffset(200, 50);
                                            contentStream.setNonStrokingColor(Color.BLUE);
                                            PDType0Font font = PDType0Font.load(document, new File("c:\\windows\\fonts\\Swis721_BlkOul_BT_Black.ttf"));
                                            contentStream.setFont(font, 20 );
                                            contentStream.setLeading(14.5f);
                                            text="C.D.D.I - Página " + (i + 1) + " de " + noOfPages ;
                                            contentStream.showText(text);
                                            contentStream.endText();
                                            contentStream.close();                                       
                                        }catch (IOException ex) {
                                            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                    }                                
                                    String nombreNuevo = ficheros[x].getName().substring(1, ficheros[x].getName().length());
                                    this.jtaSalida.append("Guardado en : "+ destino +"\\" +  nombreNuevo + '\n' +'\r');
                                    this.jtaSalida.update(this.jtaSalida.getGraphics());
                                    document.save(destino +"\\" + "" + nombreNuevo);
                                    document.close();
                                }catch (IOException ex) {
                                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                progreso++;
                                this.jpbProgreso.setValue(progreso);
                                this.jpbProgreso.update(this.jpbProgreso.getGraphics());
                            }
                            JOptionPane.showMessageDialog(null, "Se ha realizado con exito.");
                        }else{
                            JOptionPane.showMessageDialog(null, "La ruta de Destino no es correcta.");
                        }   
                    }else{
                        JOptionPane.showMessageDialog(null, "La ruta de Origen no es correcta.");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Ingrese Ruta de directorio Destino");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Ingrese Ruta de directorio Origen");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtfOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfOrigenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfOrigenActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(0==JOptionPane.showConfirmDialog(null, "Esta seguro que quiere salir?" ,"Antes de seguir", JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE)){
            this.dispose();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jbCopiarOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCopiarOrigenActionPerformed
        // TODO add your handling code here:
        String resultado = "";
        Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable contenido = cb.getContents(null);
        if(contenido.isDataFlavorSupported(DataFlavor.stringFlavor)){
            try {
                resultado  = (String) contenido.getTransferData(DataFlavor.stringFlavor);
                this.jtfOrigen.setText(resultado);
            } catch (UnsupportedFlavorException | IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jbCopiarOrigenActionPerformed

    private void jbCopiarDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCopiarDestinoActionPerformed
        // TODO add your handling code here:
        String resultado = "";
        Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable contenido = cb.getContents(null);
        if(contenido.isDataFlavorSupported(DataFlavor.stringFlavor)){
            try {
                resultado  = (String) contenido.getTransferData(DataFlavor.stringFlavor);
                this.jtfDestino.setText(resultado);
            } catch (UnsupportedFlavorException | IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jbCopiarDestinoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "PieSys agrega pie de pagina a los documentos PDF." + '\n'+ 
        "Desarrollado por Quintana Gustavo Fernando," + '\n'+
        "Con colaboracion de Ing. Cricel Gisela y todo el equipo de C.D.D.I" + '\n'+
                "® Todos los Derechos Reservados. ©");
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    
    private void agregarPlaceHolder(){
        
    }
    
    
    private void jmiSoporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSoporteActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Oringe: ruta absoluta del directorio que contiene los documentos PDF a agregar pie de página."+'\n'+ 
                "Destino: ruta absoluta del directorio que contendrá los documentos PDF con pie de página." + '\n' +
                "boton ok: inicia el proceso de poner pie a los docuentos PDF del directorio origen."+'\n'+ 
                "boton cancelar: termina y cierra el programa.");
    }//GEN-LAST:event_jmiSoporteActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCopiarDestino;
    private javax.swing.JButton jbCopiarOrigen;
    private javax.swing.JMenuItem jmiSoporte;
    private javax.swing.JProgressBar jpbProgreso;
    private javax.swing.JTextArea jtaSalida;
    private javax.swing.JTextField jtfDestino;
    private javax.swing.JTextField jtfOrigen;
    // End of variables declaration//GEN-END:variables
}