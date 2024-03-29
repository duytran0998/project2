
package atm_v1;

import atm_v1.processData.Customer;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class ChuyenKhoan extends javax.swing.JFrame {
    static ArrayList<Customer> list;
     SingIn singin;
    /**
     * Creates new form ChuyenKhoan
     */
    public ChuyenKhoan() {
        initComponents();
        this.list=singin.list;
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Chuyển tiền tới số TK");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Chuyển số tiền ");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });

        jMenu1.setText("Chuyen khoan");
        jMenu1.setToolTipText("");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField2)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField1))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int d=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i).pass.equals(singin.password))
            {
                d=i;
            }
        }
        //int _tk=Integer.parseInt(jTextField2.getText());
        //double _tk =0;
        //checkFormat: Kiem tra so tien can chuyen la 1 so
//        boolean checkFormat=true;
//        try {
//             _tk=Double.parseDouble(jTextField2.getText());
//        } catch (NumberFormatException e) {
//            //JOptionPane.showMessageDialog(this, e.getMessage());
//            checkFormat=false;
//            setjTextField1(jTextField2);
//        }
//        
        //String acount=jTextField1.getText();
        //JOptionPane.showMessageDialog(this, "Test: "+list.get(d).name);
        //Check1: Kiem tra tai khoan nguoi nhan trung TK nguoi gui
        //boolean check1=jTextField1.getText().equals(list.get(d).so_tk);
        if(jTextField1.getText().length()!=0){
            //JOptionPane.showMessageDialog(this, "OK");
            //Check: Kiem tra nguoi nhan co trong DataBase ko?
            boolean check=false;
            for(int i=0;i<list.size();i++){
                if(list.get(i).so_tk.equals(jTextField1.getText()))
                    check=true;
            }
            //Check jTextFiled2 khac Null
            if(jTextField2.getText().length()!=0){
                //Check nguoi nhan co trong DataBase
                if(check){
                    //Check trung tai khoan nguoi gui
                    if(!jTextField1.getText().equals(list.get(d).so_tk)){
                        //JOptionPane.showMessageDialog(this, "OK");
                        //checkFormat: Kiem tra so tien can chuyen la 1 so
                        double _tk =0;
                        boolean checkFormat=true;
                        try {
                             _tk=Double.parseDouble(jTextField2.getText());
                        } catch (NumberFormatException e) {
                            //JOptionPane.showMessageDialog(this, e.getMessage());
                            checkFormat=false;
                            //setjTextField1(jTextField2);
                        }
                        //Check so tien phai la so
                        if(checkFormat){
                            /////////////////////////////////////
                            if(_tk%10==0&&_tk>0){
                                if(list.get(d).tk-50<_tk){
                                        JOptionPane.showMessageDialog(this, "Tai khoan khong du");
                                        setjTextField1(jTextField1);
                                }
                                else{
                                    list.get(d).tk-=_tk;
                                    processData prD=new processData();
                                    File f=new File("dataATM.txt");
                                    try {            
                                        prD.writeListToFile(list, f);
                                    } catch (FileNotFoundException ex) {
                                        Logger.getLogger(RutTien.class.getName()).log(Level.SEVERE, null, ex);
                                    } catch (IOException ex) {
                                        Logger.getLogger(RutTien.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    JOptionPane.showMessageDialog(this, "Chuyen khoan thanh cong");
                                    this.dispose();
                                    //new Desktop().setVisible(true);
                                }
                            }
                            else{
                                 JOptionPane.showMessageDialog(this, "So tien chuyen khoan phai la boi cua 10 va khong am.");
                                 setjTextField2(jTextField2);
                            }
                            ////////////////////////////////////
                        }
                        else{
                            JOptionPane.showMessageDialog(this, "So tien ban nhap khong dung");
                            //setjTextField1(jTextField1);//
                            setjTextField2(jTextField2);
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "Khong the chuyen khoan cho chinh ban.");
                        setjTextField1(jTextField1);
                    }

                }
                else{
                    JOptionPane.showMessageDialog(this, "TK nguoi nhan khong dung");
                    setjTextField1(jTextField1);
                }

            }
            if(jTextField2.getText().length()==0){
                JOptionPane.showMessageDialog(this, "Ban chua nhap so tien can chuyen");
                setjTextField2(jTextField2);
            }
        }
        if(jTextField1.getText().length()==0){
            JOptionPane.showMessageDialog(this, "Ban chua nhap TK");
            setjTextField1(jTextField1);
        }
            //Check1:kiem tra tai khoan nguoi nhan trung TK nguoi gui
//            if(!check1){
//                if(checkFormat){
//                    if(!check){
//                        JOptionPane.showMessageDialog(this, "So TK khong dung!");
//                        setjTextField1(jTextField1);
//                    }
//                    else{
//                        if(_tk%10==0){
//                            if(_tk>list.get(d).tk-50){
//                                JOptionPane.showMessageDialog(this, "TK cua ban khong du!");
//                                setjTextField1(jTextField1);
//                            }
//                            else{
//                                list.get(d).tk-=_tk;
//                                for(int i=0;i<list.size();i++){
//                                    if(list.get(i).so_tk.equals(acount)){
//                                        list.get(i).tk+=_tk;
//                                    }
//                                }
//                                processData prD=new processData();
//                                File f=new File("dataATM.txt");
//                                try {                               
//                                    prD.writeListToFile(list, f);
//                                } catch (FileNotFoundException ex) {
//                                    Logger.getLogger(ChuyenKhoan.class.getName()).log(Level.SEVERE, null, ex);
//                                } catch (IOException ex) {
//                                    Logger.getLogger(ChuyenKhoan.class.getName()).log(Level.SEVERE, null, ex);
//                                }
//
//                                JOptionPane.showMessageDialog(this, "Chuyen khoan thanh cong!");
//                                this.dispose();
//                            }
//                        }
//                        else {
//                            JOptionPane.showMessageDialog(this, "So tien can chuyen phai la boi cua 10.");
//                                setjTextField1(jTextField1);
//                        }
//                    }
//                }
//                else{
//                    JOptionPane.showMessageDialog(this, "So tien can chuyen khong dung");
//                                setjTextField2(jTextField2);
//                }    
//            }
//            //Check tai khoan nguoi nhan trung TK nguoi gui
//            else{
//                JOptionPane.showMessageDialog(this, "Khong the chuyen cho TK cua ban");
//                            setjTextField1(jTextField1);
//            }
        //}


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        this.dispose();
        //new Desktop().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
     
        jButton1ActionPerformed(evt);
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        
        jButton1ActionPerformed(evt);
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            jButton1ActionPerformed(null);
        }
    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
        
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            jButton2ActionPerformed(null);
        }
    }//GEN-LAST:event_jButton2KeyPressed

   
    public static void main(String args[]) {
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChuyenKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChuyenKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChuyenKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChuyenKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
   

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChuyenKhoan().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    public void setjTextField1(JTextField jTextField1) {
        this.jTextField1 = jTextField1;
    }

    public void setjTextField2(JTextField jTextField2) {
        this.jTextField2 = jTextField2;
    }

}
