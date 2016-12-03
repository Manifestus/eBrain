/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stark_travel;

/**
 *
 * @author admin
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    // End of variables declaration//GEN-END:variables
public Estrella kruskal(Estrella grafo){
    Estrella temp=lista;
    Estrella temp_2=new Estrella();
    int size=1;
    boolean revision=true;
    while(revision){
        if(!lista.getNext().equals(null)){
            size++;
            temp=temp.getNext();
        }else{
            revision=false;
        }
    }
    temp=lista;
    Estrella temp_3=new Estrella();
    for (int i = 0; i < size; i++) {
        if(grafo.getNombre().equals(temp.getNombre())){
            temp.setVisitado(true);
        }
        if(i==0){
            temp_2=temp;
        }else{
            temp_3.setNext(temp);
        }
        temp_3=temp;
        temp=temp.getNext(); 
    }
    temp=temp_2;
    boolean recorriendo=true;
    while(recorriendo){
        Adyacencia opciones=new Adyacencia();
        Adyacencia opciones_final=new Adyacencia();
        for (int i = 0; i < size; i++) {
            if(temp.isVisitado()){
                boolean agregar=true;
                while(agregar){
                    if (opciones.equals(null)) {
                        opciones=temp.getAdj();
                        Adyacencia mas_op=opciones;
                        while(!mas_op.getNext().equals(null)){
                            mas_op=mas_op.getNext();
                        }
                        opciones_final=mas_op;
                    }else{
                        opciones_final.setNext(temp.getAdj());
                        Adyacencia mas_op=opciones_final;
                        while(!mas_op.getNext().equals(null)){
                            mas_op=mas_op.getNext();
                        }
                        opciones_final=mas_op;
                    }
                } 
            }
            temp=temp.getNext();
        }
        boolean verificar=true;
        Adyacencia menor=new Adyacencia();
        Adyacencia menor_final=new Adyacencia();
        menor.setPeso(-9);
        while(!opciones.getNext().equals(null)){
            if (opciones.getPeso()<menor.getPeso()&&menor.getOrigen().isVisitado()==false){
                if (menor.getPeso()==-9) {
                    Adyacencia nueva=opciones;
                    menor=nueva;
                    menor_final=nueva;
                    menor.setNext(null);
                }else{
                    Adyacencia nueva=opciones;
                    menor_final.setNext(nueva);
                    menor_final=nueva;
                    menor_final.setNext(null);
                }
               
            }
            opciones=opciones.getNext();
        }
        temp=temp_2;
        while(!menor.equals(null)){
            boolean si=true;
            while(!temp.equals(null)){
                if (temp.getNombre().equals(menor.getOrigen().getNombre())) {
                    Adyacencia nueva=new Adyacencia(menor.getEstrella(),menor.getPeso());
                    nueva.setOrigen(menor.getOrigen());
                    temp.setVisitado(true);
                    temp.setAdj(nueva);
                    
                }
                temp=temp.getNext();
            }
            menor=menor.getNext();
        }
        
    }
    
    return temp;
}
Estrella lista;
Estrella lista_fin;
}
