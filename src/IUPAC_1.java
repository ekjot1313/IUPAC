/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * IUPAC_1.java
 *
 * Created on Feb 2, 2013, 2:39:04 PM
 */

/**
 *
 * @author ekjot
 */
public class IUPAC_1 extends javax.swing.JFrame {
int c=0,h=0,single=0,x=0;
int num[]={-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
int enenum[]={-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
int ynenum[]={-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
String number="";

String draw[][];
public  void Draw(){
    if(txt.getText()!="ERROR"){
    jTable1.setModel(new javax.swing.table.DefaultTableModel(5, (2*c)+3));
String d="";
for(int z=0;z<5;z++){                                                                                      //Printing array draw
for(int y=0;y<(2*c)+3;y++){
d=d+draw[z][y];
jTable1.setValueAt(draw[z][y],z,y);
}
}
}}



    /** Creates new form IUPAC_1 */
    public IUPAC_1() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        dec = new javax.swing.JButton();
        non = new javax.swing.JButton();
        oct = new javax.swing.JButton();
        hept = new javax.swing.JButton();
        hex = new javax.swing.JButton();
        pent = new javax.swing.JButton();
        but = new javax.swing.JButton();
        prop = new javax.swing.JButton();
        meth = new javax.swing.JButton();
        eth = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        j1 = new javax.swing.JButton();
        j5 = new javax.swing.JButton();
        j4 = new javax.swing.JButton();
        j6 = new javax.swing.JButton();
        j7 = new javax.swing.JButton();
        j8 = new javax.swing.JButton();
        j10 = new javax.swing.JButton();
        j9 = new javax.swing.JButton();
        j3 = new javax.swing.JButton();
        j2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        ane = new javax.swing.JButton();
        ene = new javax.swing.JButton();
        yne = new javax.swing.JButton();
        ol = new javax.swing.JButton();
        reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 500));

        txt.setFont(new java.awt.Font("Comic Sans MS", 3, 18));

        jTable1.setFont(new java.awt.Font("Courier New", 3, 23));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.setEnabled(false);
        jTable1.setShowHorizontalLines(false);
        jTable1.setShowVerticalLines(false);
        jScrollPane2.setViewportView(jTable1);

        dec.setText("Dec");
        dec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decActionPerformed(evt);
            }
        });

        non.setText("Non");
        non.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nonActionPerformed(evt);
            }
        });

        oct.setText("Oct");
        oct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                octActionPerformed(evt);
            }
        });

        hept.setText("Hept");
        hept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heptActionPerformed(evt);
            }
        });

        hex.setText("Hex");
        hex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hexActionPerformed(evt);
            }
        });

        pent.setText("Pent");
        pent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pentActionPerformed(evt);
            }
        });

        but.setText("But");
        but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butActionPerformed(evt);
            }
        });

        prop.setText("Prop");
        prop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                propActionPerformed(evt);
            }
        });

        meth.setText("Meth");
        meth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                methActionPerformed(evt);
            }
        });

        eth.setText("Eth");
        eth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ethActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dec, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
            .addComponent(non, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
            .addComponent(oct, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
            .addComponent(hept, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
            .addComponent(hex, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
            .addComponent(pent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
            .addComponent(but, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
            .addComponent(prop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
            .addComponent(meth, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(eth, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(meth)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eth)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(but)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hex)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hept)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(oct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(non)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dec))
        );

        j1.setText("1");
        j1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j1ActionPerformed(evt);
            }
        });

        j5.setText("5");
        j5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j5ActionPerformed(evt);
            }
        });

        j4.setText("4");
        j4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j4ActionPerformed(evt);
            }
        });

        j6.setText("6");
        j6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j6ActionPerformed(evt);
            }
        });

        j7.setText("7");
        j7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j7ActionPerformed(evt);
            }
        });

        j8.setText("8");
        j8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j8ActionPerformed(evt);
            }
        });

        j10.setText("10");
        j10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j10ActionPerformed(evt);
            }
        });

        j9.setText("9");
        j9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j9ActionPerformed(evt);
            }
        });

        j3.setText("3");
        j3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j3ActionPerformed(evt);
            }
        });

        j2.setText("2");
        j2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(j1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(j5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(j4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(j6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(j7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(j8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(j10, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(j9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(j3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(j2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(j1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(j2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(j3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(j4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(j5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(j6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(j7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(j8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(j9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(j10))
        );

        ane.setText("ane");
        ane.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aneActionPerformed(evt);
            }
        });

        ene.setText("ene");
        ene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eneActionPerformed(evt);
            }
        });

        yne.setText("yne");
        yne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ane)
            .addComponent(ene)
            .addComponent(yne)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(ane)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ene)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(yne))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ol.setText("ol");
        ol.setEnabled(false);
        ol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                olActionPerformed(evt);
            }
        });

        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ol, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(352, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(1251, Short.MAX_VALUE)
                .addComponent(reset))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(reset)
                .addGap(82, 82, 82)
                .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(56, 56, 56))
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(ol)
                .addContainerGap(255, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void methActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_methActionPerformed
txt.setText("Meth");
c=1;
x=0;
{j1.setEnabled(false);
j2.setEnabled(false);
j3.setEnabled(false);
j4.setEnabled(false);
j5.setEnabled(false);
j6.setEnabled(false);
j7.setEnabled(false);
j8.setEnabled(false);
j9.setEnabled(false);
j10.setEnabled(false);
ene.setEnabled(false);
yne.setEnabled(false);
ol.setEnabled(false);}
// TODO add your handling code here:
    }//GEN-LAST:event_methActionPerformed

    private void ethActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ethActionPerformed
txt.setText("Eth");
c=2;
x=0;
{j1.setEnabled(true);
j2.setEnabled(false);
j3.setEnabled(false);
j4.setEnabled(false);
j5.setEnabled(false);
j6.setEnabled(false);
j7.setEnabled(false);
j8.setEnabled(false);
j9.setEnabled(false);
j10.setEnabled(false);
ene.setEnabled(true);
yne.setEnabled(true);
ol.setEnabled(false);}
// TODO add your handling code here:
    }//GEN-LAST:event_ethActionPerformed

    private void propActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_propActionPerformed
txt.setText("Prop");
c=3;
x=0;
{j1.setEnabled(true);
j2.setEnabled(true);
j3.setEnabled(false);
j4.setEnabled(false);
j5.setEnabled(false);
j6.setEnabled(false);
j7.setEnabled(false);
j8.setEnabled(false);
j9.setEnabled(false);
j10.setEnabled(false);
ene.setEnabled(true);
yne.setEnabled(true);
ol.setEnabled(false);}
// TODO add your handling code here:
    }//GEN-LAST:event_propActionPerformed

    private void butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butActionPerformed
txt.setText("But");
c=4;
x=0;
{j1.setEnabled(true);
j2.setEnabled(true);
j3.setEnabled(true);
j4.setEnabled(false);
j5.setEnabled(false);
j6.setEnabled(false);
j7.setEnabled(false);
j8.setEnabled(false);
j9.setEnabled(false);
j10.setEnabled(false);
ene.setEnabled(true);
yne.setEnabled(true);
ol.setEnabled(false);}
// TODO add your handling code here:
    }//GEN-LAST:event_butActionPerformed

    private void pentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pentActionPerformed
txt.setText("Pent");
c=5;
x=0;
{j1.setEnabled(true);
j2.setEnabled(true);
j3.setEnabled(true);
j4.setEnabled(true);
j5.setEnabled(false);
j6.setEnabled(false);
j7.setEnabled(false);
j8.setEnabled(false);
j9.setEnabled(false);
j10.setEnabled(false);
ene.setEnabled(true);
yne.setEnabled(true);
ol.setEnabled(false);}
// TODO add your handling code here:
    }//GEN-LAST:event_pentActionPerformed

    private void hexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hexActionPerformed
txt.setText("Hex");
c=6;
x=0;
{j1.setEnabled(true);
j2.setEnabled(true);
j3.setEnabled(true);
j4.setEnabled(true);
j5.setEnabled(true);
j6.setEnabled(false);
j7.setEnabled(false);
j8.setEnabled(false);
j9.setEnabled(false);
j10.setEnabled(false);
ene.setEnabled(true);
yne.setEnabled(true);
ol.setEnabled(false);}
// TODO add your handling code here:
    }//GEN-LAST:event_hexActionPerformed

    private void heptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heptActionPerformed
txt.setText("Hept");
c=7;
x=0;
{j1.setEnabled(true);
j2.setEnabled(true);
j3.setEnabled(true);
j4.setEnabled(true);
j5.setEnabled(true);
j6.setEnabled(true);
j7.setEnabled(false);
j8.setEnabled(false);
j9.setEnabled(false);
j10.setEnabled(false);
ene.setEnabled(true);
yne.setEnabled(true);
ol.setEnabled(false);}
// TODO add your handling code here:
    }//GEN-LAST:event_heptActionPerformed

    private void octActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_octActionPerformed
txt.setText("Oct");
c=8;
x=0;
{j1.setEnabled(true);
j2.setEnabled(true);
j3.setEnabled(true);
j4.setEnabled(true);
j5.setEnabled(true);
j6.setEnabled(true);
j7.setEnabled(true);
j8.setEnabled(false);
j9.setEnabled(false);
j10.setEnabled(false);
ene.setEnabled(true);
yne.setEnabled(true);
ol.setEnabled(false);}
// TODO add your handling code here:
    }//GEN-LAST:event_octActionPerformed

    private void nonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nonActionPerformed
txt.setText("Non");
c=9;
x=0;
{j1.setEnabled(true);
j2.setEnabled(true);
j3.setEnabled(true);
j4.setEnabled(true);
j5.setEnabled(true);
j6.setEnabled(true);
j7.setEnabled(true);
j8.setEnabled(true);
j9.setEnabled(false);
j10.setEnabled(false);
ene.setEnabled(true);
yne.setEnabled(true);
ol.setEnabled(false);}
// TODO add your handling code here:
    }//GEN-LAST:event_nonActionPerformed

    private void decActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decActionPerformed
txt.setText("Dec");
c=10;
x=0;
{j1.setEnabled(true);
j2.setEnabled(true);
j3.setEnabled(true);
j4.setEnabled(true);
j5.setEnabled(true);
j6.setEnabled(true);
j7.setEnabled(true);
j8.setEnabled(true);
j9.setEnabled(true);
j10.setEnabled(false);
ene.setEnabled(true);
yne.setEnabled(true);
ol.setEnabled(false);}
// TODO add your handling code here:
}//GEN-LAST:event_decActionPerformed

    private void aneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aneActionPerformed
String a=txt.getText();
int l=a.length();               //but2ene

        if(!a.endsWith("ane")){a=a+"ane";}
txt.setText(a);
//System.out.println("C= "+c+" H= "+h+" S= "+single+" d1= "+draw1+" d2= "+draw2);



draw=new String[5][(2*c)+3];

for(int x=0;x<5;x++){                                                                                      //Creating array and assigning spaces to all it's values
for(int y=0;y<(2*c)+3;y++){
draw[x][y]=" ";}}

for(int i=2,j=0;j<c;j++,i+=2){                                                                          //Assigning C, H, -, | to their respective places
draw[2][i]="C";
draw[1][i]="|";
draw[3][i]="|";
draw[0][i]="H";
draw[4][i]="H";
draw[2][0]="H";
draw[2][i-1]="-";
draw[2][i+1]="-";
draw[2][(2*c)+2]="H";}





ol.setEnabled(true);
ene.setEnabled(false);
yne.setEnabled(false);
Draw();

// TODO add your handling code here:
}//GEN-LAST:event_aneActionPerformed

    private void j1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j1ActionPerformed

String a=txt.getText();
if(x>0){ int len=a.length()-1;a=a.substring(0,len)+",1-";}
else{a=a+"-1-";}
txt.setText(a);
num[x]=0; x++;
ene.setEnabled(true);
yne.setEnabled(true);
// TODO add your handling code here:
}//GEN-LAST:event_j1ActionPerformed

    private void j2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j2ActionPerformed

String a=txt.getText();
if(x>0){ int len=a.length()-1;a=a.substring(0,len)+",2-";}
else{a=a+"-2-";}
txt.setText(a);
num[x]=1; x++;
ene.setEnabled(true);
yne.setEnabled(true);
// TODO add your handling code here:
    }//GEN-LAST:event_j2ActionPerformed

    private void j3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j3ActionPerformed

String a=txt.getText();
if(x>0){ int len=a.length()-1;a=a.substring(0,len)+",3-";}
else{a=a+"-3-";}
txt.setText(a);
num[x]=2; x++;
ene.setEnabled(true);
yne.setEnabled(true);
// TODO add your handling code here:
    }//GEN-LAST:event_j3ActionPerformed

    private void j4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j4ActionPerformed

String a=txt.getText();
if(x>0){ int len=a.length()-1;a=a.substring(0,len)+",4-";}
else{a=a+"-4-";}
txt.setText(a);
num[x]=3; x++;
ene.setEnabled(true);
yne.setEnabled(true);
// TODO add your handling code here:
    }//GEN-LAST:event_j4ActionPerformed

    private void j5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j5ActionPerformed

String a=txt.getText();
if(x>0){ int len=a.length()-1;a=a.substring(0,len)+",5-";}
else{a=a+"-5-";}
txt.setText(a);
num[x]=4; x++;
ene.setEnabled(true);
yne.setEnabled(true);
// TODO add your handling code here:
    }//GEN-LAST:event_j5ActionPerformed

    private void j6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j6ActionPerformed

String a=txt.getText();
if(x>0){ int len=a.length()-1;a=a.substring(0,len)+",6-";}
else{a=a+"-6-";}
txt.setText(a);
num[x]=5; x++;
ene.setEnabled(true);
yne.setEnabled(true);
// TODO add your handling code here:
    }//GEN-LAST:event_j6ActionPerformed

    private void j7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j7ActionPerformed

String a=txt.getText();
if(x>0){ int len=a.length()-1;a=a.substring(0,len)+",7-";}
else{a=a+"-7-";}
txt.setText(a);
num[x]=6; x++;
ene.setEnabled(true);
yne.setEnabled(true);
// TODO add your handling code here:
    }//GEN-LAST:event_j7ActionPerformed

    private void j8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j8ActionPerformed

String a=txt.getText();
if(x>0){ int len=a.length()-1;a=a.substring(0,len)+",8-";}
else{a=a+"-8-";}
txt.setText(a);
num[x]=7; x++;
ene.setEnabled(true);
yne.setEnabled(true);
// TODO add your handling code here:
    }//GEN-LAST:event_j8ActionPerformed

    private void j9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j9ActionPerformed

String a=txt.getText();
if(x>0){ int len=a.length()-1;a=a.substring(0,len)+",9-";}
else{a=a+"-9-";}
txt.setText(a);
num[x]=8; x++;
ene.setEnabled(true);
yne.setEnabled(true);
// TODO add your handling code here:
    }//GEN-LAST:event_j9ActionPerformed

    private void j10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j10ActionPerformed

String a=txt.getText();
if(x>0){ int len=a.length()-1;a=a.substring(0,len)+",10-";}
else{a=a+"-10-";}
txt.setText(a);
num[x]=9;
ene.setEnabled(true);
yne.setEnabled(true);
// TODO add your handling code here:
    }//GEN-LAST:event_j10ActionPerformed

    private void eneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eneActionPerformed
  ane.doClick();
   String a=txt.getText();
  int l=a.length()-3;
 a=a.substring(0,l);
 if(x==0){j1.doClick(); a=a+"";}
 else if(x==2){for(int i=0;i<l;i++){if(a.charAt(i)=='-'){a=a.substring(0,i)+"a"+a.substring(i,l); break;}}a=a+"di";}
  else if(x==3){for(int i=0;i<l;i++){if(a.charAt(i)=='-'){a=a.substring(0,i)+"a"+a.substring(i,l); break;}}   a=a+"tri";}
  else if(x==4){for(int i=0;i<l;i++){if(a.charAt(i)=='-'){a=a.substring(0,i)+"a"+a.substring(i,l); break;}}   a=a+"tetra";}
  else if(x>4){for(int i=0;i<l;i++){if(a.charAt(i)=='-'){a=a.substring(0,i)+"a"+a.substring(i,l); break;}}   a=a+"("+x+")";}
a=a+"ene";
 
   txt.setText(a);

   for(int i=0;num[i]!=-1;i++){
int z=num[i]+1;
    if(z!=-1){
draw[2][2*z+1]="=";
if(draw[3][2*z+0]==" "){draw[1][2*z+0]=" ";}
else{draw[3][2*z+0]=" ";}
if(draw[4][2*z+0]==" "){draw[0][2*z+0]=" ";}
else{draw[4][2*z+0]=" ";}
if(draw[3][2*z+2]==" "){draw[1][2*z+2]=" ";}
else{draw[3][2*z+2]=" ";}
if(draw[4][2*z+2]==" "){draw[0][2*z+2]=" ";}
else{draw[4][2*z+2]=" ";}
}
}

   for(int i=0;num[i]!=-1;i++){enenum[i]=num[i]; num[i]=-1;}
x=0;
ol.setEnabled(true);
ane.setEnabled(false);
ene.setEnabled(false);
yne.setEnabled(false);

Draw();
        // TODO add your handling code here:
}//GEN-LAST:event_eneActionPerformed

    private void yneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yneActionPerformed
 draw=new String[5][(2*c)+3];
         for(int z=0;z<5;z++){                                                                                      //Creating array and assigning spaces to all it's values
for(int y=0;y<(2*c)+3;y++){
draw[z][y]=" ";}}
 
            for(int l=2,m=0;m<c;m++,l+=2){                                                                          //Assigning C, H, -, | to their respective places
              draw[2][l]="C";
              draw[1][l]="|";
              draw[3][l]="|";
              draw[0][l]="H";
              draw[4][l]="H";
              draw[2][0]="H";
              draw[2][l-1]="-";
              draw[2][l+1]="-";
              draw[2][(2*c)+2]="H";}


        String a=txt.getText();
               int y=a.length()-4;

                for(int i=0;i<=y;i++){
                if(a.substring(i,i+3).equals("ene")){
           

            
              for(int j=0;enenum[j]!=-1;j++){
             int z=enenum[j]+1;
                  if(z!=-1){
          draw[2][2*z+1]="=";
              if(draw[3][2*z+0]==" "){draw[1][2*z+0]=" ";}
             else{draw[3][2*z+0]=" ";}
                if(draw[4][2*z+0]==" "){draw[0][2*z+0]=" ";}
       else{draw[4][2*z+0]=" ";}
                   if(draw[3][2*z+2]==" "){draw[1][2*z+2]=" ";}
                    else{draw[3][2*z+2]=" ";}
                      if(draw[4][2*z+2]==" "){draw[0][2*z+2]=" ";}
                      else{draw[4][2*z+2]=" ";}}}

           for(int k=0;enenum[k]!=-1;k++){ynenum[k]=enenum[k]; enenum[k]=-1;}
               }}
                 

    

   int l=a.length();
a=a.substring(0,l);
 if(x==0){j1.doClick(); a=a+"";}
 else if(x==2){for(int i=0;i<l;i++){if(a.charAt(i)=='-'){if(a.charAt(i-1)!='a'){a=a.substring(0,i)+"a"+a.substring(i,l);}break;}}   a=a+"di";}
  else if(x==3){for(int i=0;i<l;i++){if(a.charAt(i)=='-'){if(a.charAt(i-1)!='a'){a=a.substring(0,i)+"a"+a.substring(i,l);}break;}}   a=a+"tri";}
  else if(x==4){for(int i=0;i<l;i++){if(a.charAt(i)=='-'){if(a.charAt(i-1)!='a'){a=a.substring(0,i)+"a"+a.substring(i,l);}break;}}   a=a+"tetra";}
  else if(x>4){for(int i=0;i<l;i++){if(a.charAt(i)=='-'){if(a.charAt(i-1)!='a'){a=a.substring(0,i)+"a"+a.substring(i,l);}break;}}   a=a+"("+x+")";}
a=a+"yne";
   txt.setText(a);

   for(int i=0;num[i]!=-1;i++){
int z=num[i]+1;
if(
        (
        (i!=0)&&((num[i]==num[i-1]+1)||(num[i]==num[i-1]-1))
        )
        ||(draw[2][2*z-1]=="=")||(draw[2][2*z+3]=="=")
        )
{reset.doClick(); txt.setText("ERROR"); break; }
else{
   
draw[2][2*z+1]=(char)8801+"";
draw[0][2*z]=" ";
draw[0][2*z+2]=" ";
draw[1][2*z]=" ";
draw[1][2*z+2]=" ";
draw[3][2*z]=" ";
draw[3][2*z+2]=" ";
draw[4][2*z]=" ";
draw[4][2*z+2]=" ";
}
}

   for(int i=0;num[i]!=-1;i++){num[i]=-1;}
x=0;
Draw();

for(int z=0;z<5;z++){                                                                                      //Creating array and assigning spaces to all it's values
for(int i=0;i<(2*c)+3;i++){
draw[z][i]=" ";}
}
ol.setEnabled(true);
ane.setEnabled(false);
ene.setEnabled(false);
yne.setEnabled(false);
        // TODO add your handling code here:
}//GEN-LAST:event_yneActionPerformed

    private void olActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_olActionPerformed
String a=txt.getText();
int l=a.length()-1;    

a=a.substring(0,l+1);
 if(x==0){j1.doClick(); for(int i=l;i>=0;i--){
if(a.charAt(i)=='e'){
a=a.substring(0,i)+a.substring(i+1,l+1)+"ol";
break;}}}
 else if(x==2){for(int i=0;i<l;i++){if(a.charAt(i)=='-'){if(a.charAt(i-1)!='a'){a=a.substring(0,i)+"a"+a.substring(i,l+1);} break;}}   a=a+"di";}
  else if(x==3){for(int i=0;i<l;i++){if(a.charAt(i)=='-'){if(a.charAt(i-1)!='a'){a=a.substring(0,i)+"a"+a.substring(i,l+1);} break;}}   a=a+"tri";}
  else if(x==4){for(int i=0;i<l;i++){if(a.charAt(i)=='-'){if(a.charAt(i-1)!='a'){a=a.substring(0,i)+"a"+a.substring(i,l+1);} break;}}   a=a+"tetra";}
  else if(x>4){for(int i=0;i<l;i++){if(a.charAt(i)=='-'){if(a.charAt(i-1)!='a'){a=a.substring(0,i)+"a"+a.substring(i,l+1);} break;}}   a=a+"("+x+")";}
a=a+"ol";
txt.setText(a);
/*
for(int i=0;num[i]!=-1;i++){
int n=num[i];
if((draw[2][2*n-1]==""+(char)8801||draw[2][2*n+1]==""+(char)8801)
        ||
    ((draw[2][2*n-1]=="="&&draw[2][2*n+1]=="="))
         ||
    (draw[2][2*n-2]!="H"&&draw[2][2*n+2]!="H"&&draw[0][2*n]!="H"&&draw[4][2*n]!="H")){
reset.doClick();  txt.setText("ERROR");  break;}

else if(draw[0][2*n]=="H"){draw[0][2*n]="OH";}
else if(draw[4][2*n]=="H"){draw[4][2*n]="OH";}
else if(draw[2][2*n+2]=="H"){draw[2][2*n+2]="OH";}
else if(draw[2][2*n-2]=="H"){draw[2][2*n-2]="OH";}


}
Draw();*/



ol.setEnabled(false);
ane.setEnabled(false);
yne.setEnabled(false);
ene.setEnabled(false);



// TODO add your handling code here:
}//GEN-LAST:event_olActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed

     c=0;h=0;single=0;x=0;
     for(int i=1;i<10;i++){
 num[i]=-1;
     enenum[i]=-1;
     ynenum[i]=-1;}

number="";

    jTable1.setModel(new javax.swing.table.DefaultTableModel(0,0));
draw=new String[0][0];

{j1.setEnabled(true);
j2.setEnabled(true);
j3.setEnabled(true);
j4.setEnabled(true);
j5.setEnabled(true);
j6.setEnabled(true);
j7.setEnabled(true);
j8.setEnabled(true);
j9.setEnabled(true);
j10.setEnabled(true);
ane.setEnabled(true);
ene.setEnabled(true);
yne.setEnabled(true);
ol.setEnabled(false);
meth.setEnabled(true);
eth.setEnabled(true);
prop.setEnabled(true);
but.setEnabled(true);
pent.setEnabled(true);
hex.setEnabled(true);
hept.setEnabled(true);
oct.setEnabled(true);
non.setEnabled(true);
dec.setEnabled(true);
txt.setText("");
}
    // TODO add your handling code here:
}//GEN-LAST:event_resetActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IUPAC_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ane;
    private javax.swing.JButton but;
    private javax.swing.JButton dec;
    private javax.swing.JButton ene;
    private javax.swing.JButton eth;
    private javax.swing.JButton hept;
    private javax.swing.JButton hex;
    private javax.swing.JButton j1;
    private javax.swing.JButton j10;
    private javax.swing.JButton j2;
    private javax.swing.JButton j3;
    private javax.swing.JButton j4;
    private javax.swing.JButton j5;
    private javax.swing.JButton j6;
    private javax.swing.JButton j7;
    private javax.swing.JButton j8;
    private javax.swing.JButton j9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton meth;
    private javax.swing.JButton non;
    private javax.swing.JButton oct;
    private javax.swing.JButton ol;
    private javax.swing.JButton pent;
    private javax.swing.JButton prop;
    private javax.swing.JButton reset;
    private javax.swing.JTextField txt;
    private javax.swing.JButton yne;
    // End of variables declaration//GEN-END:variables

}
