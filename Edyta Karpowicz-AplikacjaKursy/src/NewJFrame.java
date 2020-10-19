
import java.time.Duration;
import java.util.Date;
import javax.swing.JOptionPane;

public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Kierowca:");

        jLabel2.setText("Data wyjazdu:");

        jLabel3.setText("Data powrotu:");

        jSpinner1.setModel(new javax.swing.SpinnerDateModel());

        jSpinner2.setModel(new javax.swing.SpinnerDateModel());

        jLabel4.setText("Liczba przejechanych km:");

        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jButton1.setText("Dodaj kurs ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("jLabel6");

        jLabel7.setText("jLabel7");

        jLabel8.setText("jLabel8");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jSpinner3))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(72, 72, 72)
                                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 21, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(11, 11, 11)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jLabel5.getAccessibleContext().setAccessibleName("jLabel_h");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        if(jComboBox1.getSelectedIndex()==-1)
            jLabel6.setText("Proszę o wybranie kierowcy!");
        
//        JOptionPane.showMessageDialog(null,"Nie wybrano kierowcy");
        
        Kurs kurs1 = new Kurs();
        kurs1.setDatawyjazdu((Date)jSpinner1.getValue());
        kurs1.setDataPowrotu((Date)jSpinner2.getValue());
        kurs1.setIloscKm((int)jSpinner3.getValue());
        kurs1.setKierowca(Kierowca.listaKierowcow.get(jComboBox1.getSelectedIndex()));
        Kurs.listaKursow.add(kurs1);
        
        String txt = "Kurs został realizowany przez kierowcę o imieniu "
                +kurs1.getKierowca().imie+". Jego staż: "+(2020-kurs1.getKierowca().rok_uzyk_pj);
        
        jLabel6.setText(txt);
        
        jLabel7.setText("ilość godzin wynosi:"+kurs1.czas());
        
        if(jComboBox1.getSelectedIndex()==0)
        {
            int wyn= (int) (((int)kurs1.czas()*(kurs1.stawka_za_h+2) )+ (kurs1.getIloscKm()*(kurs1.stawka_za_km+2)));
            jLabel8.setText("wynagrodzenie wynosi;"+wyn);
        }
        else if(jComboBox1.getSelectedIndex()==1)
        {
            int wyn= (int) (((int)kurs1.czas()*(kurs1.stawka_za_h+1) )+ (kurs1.getIloscKm()*(kurs1.stawka_za_km)));
            jLabel8.setText("wynagrodzenie wynosi;"+wyn);
        }
        else
         jLabel8.setText("wynagrodzenie wynosi;"+kurs1.wynagrodzenie());
        
        
                
        
    }//GEN-LAST:event_jButton1ActionPerformed


    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
   
        for (Kierowca k : Kierowca.listaKierowcow)
        {
            jComboBox1.addItem(k.imie + " "+k.nazwisko);
        }
        
    }//GEN-LAST:event_formWindowOpened

 
    public static void main(String args[]) {
      
        Kierowca k1 = new Kierowca("Edyta","Karpowicz",2008,2010);
        Kierowca k2 = new Kierowca("Katarzyna","Majchrzak",2010,2015);
        Kierowca k3 = new Kierowca("Rafał","Dębowski",2000,2003);
        Kierowca k4 = new Kierowca("Daniel","Grzelak",2004,2008);
        Kierowca k5 = new Kierowca("Konrad","Weber",2001,2002);
        
        Kierowca.listaKierowcow.add(k1);
        Kierowca.listaKierowcow.add(k2);
        Kierowca.listaKierowcow.add(k3);
        Kierowca.listaKierowcow.add(k4);
        Kierowca.listaKierowcow.add(k5);
        
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    // End of variables declaration//GEN-END:variables
}
