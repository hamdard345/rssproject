package rss;


import javax.swing.JFrame;


/**
 * This is the RemoveCaseWorker class. It allows the user to select and remove any caseworker from the database.
 * 
 * @author Spaced
 */
public class RemoveCaseWorker extends javax.swing.JFrame {

    /**
     * Creates new form RemoveCaseWorker
     */
    public RemoveCaseWorker() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        cswtable = new javax.swing.JTable();
        removetf = new javax.swing.JTextField();
        removebtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backBtn.setText("Main Menue");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        cswtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        cswtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cswtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(cswtable);

        removetf.setText("enter caseWorker id to remove");
        removetf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removetfMouseClicked(evt);
            }
        });
        removetf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removetfActionPerformed(evt);
            }
        });

        removebtn.setText("Remove Case Worker ");
        removebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
                    .addComponent(backBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removetf, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(removebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removetf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removebtn)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * This is the back method. It allows the user to return to the main menu.
     * 
     * @param evt the action event
     */
    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
       MainMenue M = new MainMenue();
        this.dispose();
        M.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    /**
     * This is the select caseworker method. It allows the user to select an entry in the caseworker table and remove it.
     * 
     * @param evt the mouse event
     */
    private void cswtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cswtableMouseClicked
        Integer row= cswtable.getSelectedRow();
        removetf.setText(cswtable.getModel().getValueAt(row, 0).toString());
        
       

    }//GEN-LAST:event_cswtableMouseClicked

    /**
     * This is the remove selected caseworker method. It removes the caseworker entry in a selected entry.
     * 
     * @param evt the mouse event
     */
    private void removetfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removetfMouseClicked

        removetf.setText("");
    }//GEN-LAST:event_removetfMouseClicked

    private void removetfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removetfActionPerformed
      
    }//GEN-LAST:event_removetfActionPerformed

    /**
     * This is a remove caseworker method. It removes the caseworker entry whose id is in the GUI text field.
     * 
     * @param evt the action event
     */
    private void removebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removebtnActionPerformed
   
        rssDatabase rssdb = new rssDatabase();
        int i=Integer.parseInt(removetf.getText());
        rssdb.removeCaseWorker(i);

    }//GEN-LAST:event_removebtnActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    public javax.swing.JTable cswtable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removebtn;
    private javax.swing.JTextField removetf;
    // End of variables declaration//GEN-END:variables
}