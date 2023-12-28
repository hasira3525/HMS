
import java.io.File;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class CheckUp extends javax.swing.JFrame {

    ArrayList<BillingInfo> allRecords = new ArrayList<>();
    ArrayList<Medicine> allMedicines = new ArrayList<>();
     ArrayList<Patient> allPatients = new ArrayList<>();
    
    public CheckUp() {
        initComponents();
        readAllMData();
        readAllPData();
        readAllRData();
        LoadMed();
    }
    
    void readAllRData(){
        try {
            File pfile = new File("record.txt");
            Scanner scanner = new Scanner(pfile);
            
            while(scanner.hasNextLine()){
               String data = scanner.nextLine(); 
               String[] curData = data.split(";");
               BillingInfo record = new BillingInfo();
               record.setPatientID(Integer.parseInt(curData[0]));
               record.setFee(Integer.parseInt(curData[1]));
               record.setRecomendations(curData[2]);   //Integer.parseInt(curData[2]));
               record.setDate(curData[3]);
               String []mList = curData[4].split(",");
                  for(int i=0;i<mList.length;i++)
                  {  record.setMedicineID(Integer.parseInt(mList[i]));
                  }
                  allRecords.add(record);
            }
        } catch (Exception e) {
        }
    
    }
    
    
    void LoadMed()
    {   //allM.removeAllItems();
        for(int i=0; i<allMedicines.size();i++)
           {  allM.addItem(allMedicines.get(i).getId()+";"+allMedicines.get(i).getName());
           }
    }
    
    void readAllPData(){
        try {
            File pfile = new File("pdata.txt");
            Scanner scanner = new Scanner(pfile);
            
            while(scanner.hasNextLine()){
               String data = scanner.nextLine(); 
               String[] curData = data.split(";");
               Patient patient = new Patient();
               patient.setId(Integer.parseInt(curData[0]));
               patient.setName(curData[1]);
               patient.setAge(Integer.parseInt(curData[2]));
               patient.setGender(curData[3]);
               patient.setAddress(curData[4]);
               patient.setContact(curData[5]);
               allPatients.add(patient);
            }
        } catch (Exception e) {
        }
    
    }
    
    
    void readAllMData(){
        try {
            File pfile = new File("mdata.txt");
            Scanner scanner = new Scanner(pfile);
            
            while(scanner.hasNextLine()){
               String data = scanner.nextLine(); 
               String[] curData = data.split(";");
               Medicine medicines = new Medicine();
               medicines.setId(Integer.parseInt(curData[0]));
               medicines.setName(curData[1]);
               medicines.setSellingPrice(Integer.parseInt(curData[2]));
               medicines.setBuyingPrice(Integer.parseInt(curData[3]));
               medicines.setQuantity(Integer.parseInt(curData[4]));
               medicines.setDescription(curData[5]);
               allMedicines.add(medicines);
            }
        } catch (Exception e) {
        }
    
    }
    

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fee = new javax.swing.JTextField();
        allM = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        mList = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        rec = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsz_chkp.jpg"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Checkup Menu");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Medicare Hospital");

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 102, 204));
        jButton3.setText("Home");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(45, 45, 45))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(125, 125, 125)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2))
                    .addContainerGap(838, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(32, Short.MAX_VALUE)))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Patient ID");

        id.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Medicines");

        fee.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        allM.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        allM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allMActionPerformed(evt);
            }
        });

        mList.setColumns(20);
        mList.setRows(5);
        jScrollPane1.setViewportView(mList);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 204, 153));
        jButton1.setText("Add Medicines");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Medicines List");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Fee");

        rec.setColumns(20);
        rec.setRows(5);
        jScrollPane2.setViewportView(rec);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Recomendations");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 153));
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Quantity");

        quantity.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(79, 455, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(56, 56, 56))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel9))
                                        .addGap(84, 84, 84))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fee, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(allM, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                            .addComponent(quantity)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(458, 458, 458))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(allM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(fee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1123, 649));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
   /*void SaveAllMData(){
        try {
            FileWriter fileWriter = new FileWriter("mdata.txt");
            for(int i=0;i<allMedicines.size();i++){
              fileWriter.write(allMedicines.get(i).getId()+";"+allMedicines.get(i).getName()+";"+allMedicines.get(i).getSellingPrice()+";"+allMedicines.get(i).getBuyingPrice()+";"+allMedicines.get(i).getQuantity()+";"+allMedicines.get(i).getDescription());
              }
            fileWriter.close();
        } catch (Exception e) {
        }
    }
    */
    void SavePAllData(){
        try {
            FileWriter fileWriter = new FileWriter("pdata.txt");
            for(int i=0;i<allPatients.size();i++){
              fileWriter.write(allPatients.get(i).getId()+";"+allPatients.get(i).getName()+";"+allPatients.get(i).getAge()+";"+allPatients.get(i).getGender()+";"+allPatients.get(i).getAddress()+";"+allPatients.get(i).getContact());
              }
            fileWriter.close();
        } catch (Exception e) {
        }
    }
   
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    boolean PatientIdExist()
    {
       for(int i=0;i<allPatients.size();i++)
           
       {  if(id.getText().equals(allPatients.get(i).getId()+""))
           {return false;
           }
       }
        
       return true;
    }
    void SaveAllMData(){
        try {
            FileWriter fileWriter = new FileWriter("mdata.txt");
            for(int i=0;i<allMedicines.size();i++){
              fileWriter.write(allMedicines.get(i).getId()+";"+allMedicines.get(i).getName()+";"+allMedicines.get(i).getSellingPrice()+";"+allMedicines.get(i).getBuyingPrice()+";"+allMedicines.get(i).getQuantity()+";"+allMedicines.get(i).getDescription());
              }
            fileWriter.close();
        } catch (Exception e) {
        }
    }
    
    void SaveAllRData(){
        try {
            FileWriter fileWriter = new FileWriter("record.txt");
            for(int i=0;i<allRecords.size();i++){
              fileWriter.append(allRecords.get(i).getPatientID()+";"+allRecords.get(i).getFee()+";"+allRecords.get(i).getDate()+";"+allRecords.get(i).getRecomendations()+";");
              ArrayList<Integer> tmp = allRecords.get(i).getMedicineID();
              for(int j=0;j<tmp.size();j++)
              {
                  fileWriter.append(tmp.get(j)+","); //jjjjjxdsdws,s
              }
              
              fileWriter.append("\n");
              }
            fileWriter.close();
        } catch (Exception e) {
        }
    }
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       if(id.getText().equals("")||fee.getText().equals("")||rec.getText().equals(""))
          {     JOptionPane.showMessageDialog(null, "All Fields are Required!");
          }
        
        
      else if(PatientIdExist())
          {     JOptionPane.showMessageDialog(null, "Patient ID didn't exist");
          }
      else{
          
           try {
               
          
          
           BillingInfo billingInfo = new BillingInfo();
           String Bill = "";
           int total=0;
           billingInfo.setPatientID(Integer.parseInt(id.getText()));
           billingInfo.setFee(Integer.parseInt(fee.getText()));
           String[] Mdata = mList.getText().split("\n");
           
           for(int i=0;i<Mdata.length;i++)
           {  billingInfo.setMedicineID(Integer.parseInt(Mdata[i].split(";")[0]));
              int curQ = Integer.parseInt(Mdata[i].split(";")[2]);
              int curID = Integer.parseInt(Mdata[i].split(";")[0]);
              
                for(int j=0;j<allMedicines.size();j++)
                {   if(allMedicines.get(j).getId()==curID)
                       {  Bill+=allMedicines.get(j).getName()+"="+allMedicines.get(j).getSellingPrice()+"\n";
                            total+=allMedicines.get(j).getSellingPrice();
                           allMedicines.get(j).setQuantity(allMedicines.get(j).getQuantity()-curQ);
                       }
                }
               
           }
            billingInfo.setRecomendations(rec.getText());
            DateFormat CDateFormat = new SimpleDateFormat("dd:MM:yyyy");
            Date cdate = new Date();
            billingInfo.setDate(CDateFormat.format(cdate));
            
            allRecords.add(billingInfo);   //******* record
            
            SaveAllMData();
            SaveAllRData();
            Bill+="\nTotal Medicines Cost="+total;
            Bill+="\nDoctor Fee="+fee.getText();
            Bill+="Total ="+(total+Integer.parseInt(fee.getText()));
            JOptionPane.showMessageDialog(null, "Your Bill \n"+Bill);
            id.setText("");
            fee.setText("");
            rec.setText("");
            mList.setText("");
            
            
             } catch (Exception e) {
                 System.out.println(e);
           }
      }
        
         
    /*    if(id.getText().equals("")||name.getText().equals("")||sellingPrice.getText().equals("")||buyingPrice.getText().equals("")||quantity.getText().equals("")||description.getText().equals("")){
            JOptionPane.showMessageDialog(null, "All fields are required !");
        }
        else if(checkIDC()){
            JOptionPane.showMessageDialog(null, "ID or Contact No already exist !");
        }
        else{
            try {
                Medicine medicines = new Medicine();
                medicines.setId(Integer.parseInt(id.getText()));
                medicines.setName(name.getText());
                medicines.setSellingPrice(Integer.parseInt(sellingPrice.getText()));
                medicines.setBuyingPrice(Integer.parseInt(buyingPrice.getText()));
                medicines.setQuantity(Integer.parseInt(quantity.getText()));
                medicines.setDescription(description.getText());
                allMedicines.add(medicines);

                id.setText("");
                name.setText("");
                sellingPrice.setText("");
                quantity.setText("");
                buyingPrice.setText("");
                description.setText("");
                WriteAllData();
                SaveAllData();
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ID and Age must be Integer !");
            }
        }*/
    }//GEN-LAST:event_jButton2ActionPerformed
              
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           if(quantity.getText().equals("")|| allM.getSelectedItem().toString().equals(""))
           {
                 JOptionPane.showMessageDialog(null, "Please select Medicine or enter Quantity");
           }
           else if(checkForQuantity())
           {
               JOptionPane.showMessageDialog(null, "Current quantity is greater than available quantity ");
           }
           else{
               mList.append(allM.getSelectedItem()+";"+quantity.getText()+"\n");
               quantity.setText("");
           }
                  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void allMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allMActionPerformed
       
    }//GEN-LAST:event_allMActionPerformed

    boolean checkForQuantity()
    {
        int currMID = Integer.parseInt(allM.getSelectedItem().toString().split(";")[0]);
        for(int i=0;i<allMedicines.size();i++)
        {  
            if(currMID==allMedicines.get(i).getId())
            {
                if(Integer.parseInt(quantity.getText())>allMedicines.get(i).getQuantity())
                    return true;
                    
            }
        }
        return false;
    }
    
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
            java.util.logging.Logger.getLogger(CheckUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox allM;
    private javax.swing.JTextField fee;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea mList;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextArea rec;
    // End of variables declaration//GEN-END:variables
}
