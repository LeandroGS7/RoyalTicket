/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author leang
 */
public class Palcos extends javax.swing.JFrame {

    /**
     * Creates new form Palcos
     */
    public String palcoSelected; 
    
    List<JButton> myArrayList = new ArrayList<>(); 
    
    public Palcos() {
        initComponents();
        //crearArray();
    }
    
    
    
    
    
    /*{getA1(), getA2(), getA3(),getA4(),getA5(),getA6(),getA7(),getA8(),
    getB1(),getB2(),getB3(),getB4(),getB5(),getB6(),getB7(),getB8(), getC1(),getC2(),getC3(),getC4(),
    getC5(),getC6(),getC6(),getC7(),getC8(),getD1(),getD2(),getD3(),getD4(),getD5(),getD6(),getD7(),
    getD8(),getE1(),getE2(),getE3(),getE4(),getE5(),getE6(),getE7(),getE8(),getF1(),getF2(),getF3(),
    getF4(),getF5(),getF6(),getF7(),getF8()};*/
  
    /*
    public void crearArray(){
        myArrayList.add(getA1()); myArrayList.add(getA2()); myArrayList.add(getA3()); myArrayList.add(getA4());
        myArrayList.add(getA5()); myArrayList.add(getA6()); myArrayList.add(getA7()); myArrayList.add(getA8());
        myArrayList.add(getB1()); myArrayList.add(getB2()); myArrayList.add(getB3()); myArrayList.add(getB4());
        myArrayList.add(getB5()); myArrayList.add(getB6()); myArrayList.add(getB7()); myArrayList.add(getB8());
        myArrayList.add(getC1()); myArrayList.add(getC2()); myArrayList.add(getC3()); myArrayList.add(getC4());
        myArrayList.add(getC5()); myArrayList.add(getC6()); myArrayList.add(getC7()); myArrayList.add(getC8());
        myArrayList.add(getD1()); myArrayList.add(getD2()); myArrayList.add(getD3()); myArrayList.add(getD4());
        myArrayList.add(getD5()); myArrayList.add(getD6()); myArrayList.add(getD7()); myArrayList.add(getD8());
        myArrayList.add(getE1()); myArrayList.add(getE2()); myArrayList.add(getE3()); myArrayList.add(getE4());
        myArrayList.add(getE5()); myArrayList.add(getE6()); myArrayList.add(getE7()); myArrayList.add(getE8());
        myArrayList.add(getF1()); myArrayList.add(getF2()); myArrayList.add(getF3()); myArrayList.add(getF4());
        myArrayList.add(getF5()); myArrayList.add(getF6()); myArrayList.add(getF7()); myArrayList.add(getF8());     
    }
    
    public void actualizarPalcos(){
        System.out.println("boton 1 "+myArrayList.get(0).getName());
    }*/
    
    public JButton getF8() {
        return this.F8;
    }

    public JButton getF7() {
        return this.F7;
    }

    public JButton getF6() {
        return this.F6;
    }

    public JButton getF5() {
        return this.F5;
    }

    public JButton getF4() {
        return this.F4;
    }

    public JButton getF3() {
        return this.F3;
    }

    public JButton getF2() {
        return this.F2;
    }

    public JButton getF1() {
        return this.F1;
    }

    public JButton getE8() {
        return this.E8;
    }

    public JButton getE7() {
        return this.E7;
    }

    public JButton getE6() {
        return this.E6;
    }

    public JButton getE5() {
        return this.E5;
    }

    public JButton getE4() {
        return this.E4;
    }

    public JButton getE3() {
        return this.E3;
    }

    public JButton getE2() {
        return this.E2;
    }

    public JButton getE1() {
        return this.E1;
    }

    public JButton getD8() {
        return this.D8;
    }

    public JButton getD7() {
        return this.D7;
    }

    public JButton getD6() {
        return this.D6;
    }

    public JButton getD5() {
        return this.D5;
    }

    public JButton getD4() {
        return this.D4;
    }

    public JButton getD3() {
        return this.D3;
    }

    public JButton getD2() {
        return this.D2;
    }

    public JButton getD1() {
        return this.D1;
    }

    public JButton getC8() {
        return this.C8;
    }

    public JButton getC7() {
        return this.C7;
    }

    public JButton getC6() {
        return this.C6;
    }

    public JButton getC5() {
        return this.C5;
    }

    public JButton getC4() {
        return this.C4;
    }

    public JButton getC3() {
        return this.C3;
    }

    public JButton getC2() {
        return this.C2;
    }

    public JButton getC1() {
        return this.C1;
    }

    public JButton getB8() {
        return this.B8;
    }

    public JButton getB7() {
        return this.B7;
    }

    public JButton getB6() {
        return this.B6;
    }

    public JButton getB5() {
        return this.B5;
    }

    public JButton getB4() {
        return this.B4;
    }

    public JButton getB3() {
        return this.B3;
    }

    public JButton getB2() {
        return this.B2;
    }

    public JButton getB1() {
        return this.B1;
    }

    public JButton getA8() {
        return this.A8;
    }

    public JButton getA7() {
        return this.A7;
    }

    public JButton getA6() {
        return this.A6;
    }

    public JButton getA5() {
        return this.A5;
    }

    public JButton getA4() {
        return this.A4;
    }

    public JButton getA3() {
        return this.A3;
    }
    public JButton getA2() {
        return this.A2;
    }

    public JButton getA1() {
        return this.A1;
    }
    
    /*
    public void setPalcoSelected(String palco){
        this.palcoSelected = palco;
    }
    
    public String getPalcoSelected(){
        return this.palcoSelected;
    }*/
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        D2 = new javax.swing.JButton();
        F2 = new javax.swing.JButton();
        A1 = new javax.swing.JButton();
        A2 = new javax.swing.JButton();
        A3 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        A6 = new javax.swing.JButton();
        A7 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        A5 = new javax.swing.JButton();
        A4 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        C8 = new javax.swing.JButton();
        C1 = new javax.swing.JButton();
        C2 = new javax.swing.JButton();
        C5 = new javax.swing.JButton();
        C6 = new javax.swing.JButton();
        C7 = new javax.swing.JButton();
        C3 = new javax.swing.JButton();
        C4 = new javax.swing.JButton();
        D1 = new javax.swing.JButton();
        D4 = new javax.swing.JButton();
        D3 = new javax.swing.JButton();
        D6 = new javax.swing.JButton();
        D5 = new javax.swing.JButton();
        D8 = new javax.swing.JButton();
        D7 = new javax.swing.JButton();
        E2 = new javax.swing.JButton();
        E1 = new javax.swing.JButton();
        E4 = new javax.swing.JButton();
        E3 = new javax.swing.JButton();
        E6 = new javax.swing.JButton();
        E5 = new javax.swing.JButton();
        E8 = new javax.swing.JButton();
        E7 = new javax.swing.JButton();
        F1 = new javax.swing.JButton();
        F4 = new javax.swing.JButton();
        F3 = new javax.swing.JButton();
        F6 = new javax.swing.JButton();
        F5 = new javax.swing.JButton();
        G8 = new javax.swing.JButton();
        F7 = new javax.swing.JButton();
        G2 = new javax.swing.JButton();
        G1 = new javax.swing.JButton();
        G3 = new javax.swing.JButton();
        G6 = new javax.swing.JButton();
        G7 = new javax.swing.JButton();
        F8 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        A8 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        btnIngreso1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TARIMA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel2)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 140, 50));

        jPanel3.setBackground(new java.awt.Color(102, 0, 102));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 520, 20));

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 200, 20, 20));

        D2.setBackground(new java.awt.Color(255, 102, 204));
        D2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        D2.setForeground(new java.awt.Color(255, 255, 255));
        D2.setText("L");
        D2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D2MouseClicked(evt);
            }
        });
        jPanel1.add(D2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 70, 40));

        F2.setBackground(new java.awt.Color(102, 102, 102));
        F2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        F2.setForeground(new java.awt.Color(255, 255, 255));
        F2.setText("L");
        F2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F2MouseClicked(evt);
            }
        });
        jPanel1.add(F2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 70, 40));

        A1.setBackground(new java.awt.Color(255, 51, 51));
        A1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        A1.setForeground(new java.awt.Color(255, 255, 255));
        A1.setText("L");
        A1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                A1MousePressed(evt);
            }
        });
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });
        jPanel1.add(A1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 70, 40));

        A2.setBackground(new java.awt.Color(255, 51, 51));
        A2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        A2.setForeground(new java.awt.Color(255, 255, 255));
        A2.setText("L");
        A2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A2MouseClicked(evt);
            }
        });
        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2ActionPerformed(evt);
            }
        });
        jPanel1.add(A2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 70, 40));

        A3.setBackground(new java.awt.Color(255, 51, 51));
        A3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        A3.setForeground(new java.awt.Color(255, 255, 255));
        A3.setText("L");
        A3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A3MouseClicked(evt);
            }
        });
        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });
        jPanel1.add(A3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 70, 40));

        B1.setBackground(new java.awt.Color(255, 51, 51));
        B1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        B1.setForeground(new java.awt.Color(255, 255, 255));
        B1.setText("L");
        B1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B1MouseClicked(evt);
            }
        });
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        jPanel1.add(B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 70, 40));

        B2.setBackground(new java.awt.Color(255, 51, 51));
        B2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        B2.setForeground(new java.awt.Color(255, 255, 255));
        B2.setText("L");
        B2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B2MouseClicked(evt);
            }
        });
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });
        jPanel1.add(B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 70, 40));

        A6.setBackground(new java.awt.Color(255, 51, 51));
        A6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        A6.setForeground(new java.awt.Color(255, 255, 255));
        A6.setText("L");
        A6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A6MouseClicked(evt);
            }
        });
        A6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A6ActionPerformed(evt);
            }
        });
        jPanel1.add(A6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 70, 40));

        A7.setBackground(new java.awt.Color(255, 51, 51));
        A7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        A7.setForeground(new java.awt.Color(255, 255, 255));
        A7.setText("L");
        A7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A7MouseClicked(evt);
            }
        });
        A7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A7ActionPerformed(evt);
            }
        });
        jPanel1.add(A7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 70, 40));

        B7.setBackground(new java.awt.Color(255, 51, 51));
        B7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        B7.setForeground(new java.awt.Color(255, 255, 255));
        B7.setText("L");
        B7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B7MouseClicked(evt);
            }
        });
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });
        jPanel1.add(B7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 70, 40));

        B8.setBackground(new java.awt.Color(255, 51, 51));
        B8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        B8.setForeground(new java.awt.Color(255, 255, 255));
        B8.setText("L");
        B8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B8MouseClicked(evt);
            }
        });
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });
        jPanel1.add(B8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 70, 40));

        A5.setBackground(new java.awt.Color(0, 204, 255));
        A5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        A5.setForeground(new java.awt.Color(255, 255, 255));
        A5.setText("L");
        A5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A5MouseClicked(evt);
            }
        });
        A5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A5ActionPerformed(evt);
            }
        });
        jPanel1.add(A5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 70, 40));

        A4.setBackground(new java.awt.Color(0, 204, 255));
        A4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        A4.setForeground(new java.awt.Color(255, 255, 255));
        A4.setText("L");
        A4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A4MouseClicked(evt);
            }
        });
        A4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A4ActionPerformed(evt);
            }
        });
        jPanel1.add(A4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 70, 40));

        B6.setBackground(new java.awt.Color(0, 204, 255));
        B6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        B6.setForeground(new java.awt.Color(255, 255, 255));
        B6.setText("L");
        B6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B6MouseClicked(evt);
            }
        });
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });
        jPanel1.add(B6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 70, 40));

        B5.setBackground(new java.awt.Color(0, 204, 255));
        B5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        B5.setForeground(new java.awt.Color(255, 255, 255));
        B5.setText("L");
        B5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B5MouseClicked(evt);
            }
        });
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });
        jPanel1.add(B5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 70, 40));

        B4.setBackground(new java.awt.Color(0, 204, 255));
        B4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        B4.setForeground(new java.awt.Color(255, 255, 255));
        B4.setText("L");
        B4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B4MouseClicked(evt);
            }
        });
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });
        jPanel1.add(B4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 70, 40));

        B3.setBackground(new java.awt.Color(0, 204, 255));
        B3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        B3.setForeground(new java.awt.Color(255, 255, 255));
        B3.setText("L");
        B3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B3MouseClicked(evt);
            }
        });
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });
        jPanel1.add(B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 70, 40));

        C8.setBackground(new java.awt.Color(255, 51, 51));
        C8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        C8.setForeground(new java.awt.Color(255, 255, 255));
        C8.setText("L");
        C8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C8MouseClicked(evt);
            }
        });
        C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C8ActionPerformed(evt);
            }
        });
        jPanel1.add(C8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 70, 40));

        C1.setBackground(new java.awt.Color(255, 51, 51));
        C1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        C1.setForeground(new java.awt.Color(255, 255, 255));
        C1.setText("L");
        C1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C1MouseClicked(evt);
            }
        });
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });
        jPanel1.add(C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 70, 40));

        C2.setBackground(new java.awt.Color(255, 51, 51));
        C2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        C2.setForeground(new java.awt.Color(255, 255, 255));
        C2.setText("L");
        C2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C2MouseClicked(evt);
            }
        });
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });
        jPanel1.add(C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 70, 40));

        C5.setBackground(new java.awt.Color(255, 51, 51));
        C5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        C5.setForeground(new java.awt.Color(255, 255, 255));
        C5.setText("L");
        C5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C5MouseClicked(evt);
            }
        });
        C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C5ActionPerformed(evt);
            }
        });
        jPanel1.add(C5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 70, 40));

        C6.setBackground(new java.awt.Color(255, 51, 51));
        C6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        C6.setForeground(new java.awt.Color(255, 255, 255));
        C6.setText("L");
        C6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C6MouseClicked(evt);
            }
        });
        C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C6ActionPerformed(evt);
            }
        });
        jPanel1.add(C6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 70, 40));

        C7.setBackground(new java.awt.Color(255, 51, 51));
        C7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        C7.setForeground(new java.awt.Color(255, 255, 255));
        C7.setText("L");
        C7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C7MouseClicked(evt);
            }
        });
        C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C7ActionPerformed(evt);
            }
        });
        jPanel1.add(C7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 70, 40));

        C3.setBackground(new java.awt.Color(255, 51, 51));
        C3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        C3.setForeground(new java.awt.Color(255, 255, 255));
        C3.setText("L");
        C3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C3MouseClicked(evt);
            }
        });
        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });
        jPanel1.add(C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 70, 40));

        C4.setBackground(new java.awt.Color(255, 51, 51));
        C4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        C4.setForeground(new java.awt.Color(255, 255, 255));
        C4.setText("L");
        C4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C4MouseClicked(evt);
            }
        });
        C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C4ActionPerformed(evt);
            }
        });
        jPanel1.add(C4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 70, 40));

        D1.setBackground(new java.awt.Color(255, 102, 204));
        D1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        D1.setForeground(new java.awt.Color(255, 255, 255));
        D1.setText("L");
        D1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D1MouseClicked(evt);
            }
        });
        jPanel1.add(D1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 70, 40));

        D4.setBackground(new java.awt.Color(255, 102, 204));
        D4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        D4.setForeground(new java.awt.Color(255, 255, 255));
        D4.setText("L");
        D4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D4MouseClicked(evt);
            }
        });
        jPanel1.add(D4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 70, 40));

        D3.setBackground(new java.awt.Color(255, 102, 204));
        D3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        D3.setForeground(new java.awt.Color(255, 255, 255));
        D3.setText("L");
        D3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D3MouseClicked(evt);
            }
        });
        jPanel1.add(D3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 70, 40));

        D6.setBackground(new java.awt.Color(255, 102, 204));
        D6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        D6.setForeground(new java.awt.Color(255, 255, 255));
        D6.setText("L");
        D6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D6MouseClicked(evt);
            }
        });
        jPanel1.add(D6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 70, 40));

        D5.setBackground(new java.awt.Color(255, 102, 204));
        D5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        D5.setForeground(new java.awt.Color(255, 255, 255));
        D5.setText("L");
        D5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D5MouseClicked(evt);
            }
        });
        jPanel1.add(D5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 70, 40));

        D8.setBackground(new java.awt.Color(255, 102, 204));
        D8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        D8.setForeground(new java.awt.Color(255, 255, 255));
        D8.setText("L");
        D8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D8MouseClicked(evt);
            }
        });
        jPanel1.add(D8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, 70, 40));

        D7.setBackground(new java.awt.Color(255, 102, 204));
        D7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        D7.setForeground(new java.awt.Color(255, 255, 255));
        D7.setText("L");
        D7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D7MouseClicked(evt);
            }
        });
        jPanel1.add(D7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 70, 40));

        E2.setBackground(new java.awt.Color(255, 102, 204));
        E2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        E2.setForeground(new java.awt.Color(255, 255, 255));
        E2.setText("L");
        E2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E2MouseClicked(evt);
            }
        });
        jPanel1.add(E2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 70, 40));

        E1.setBackground(new java.awt.Color(255, 102, 204));
        E1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        E1.setForeground(new java.awt.Color(255, 255, 255));
        E1.setText("L");
        E1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E1MouseClicked(evt);
            }
        });
        jPanel1.add(E1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 70, 40));

        E4.setBackground(new java.awt.Color(255, 102, 204));
        E4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        E4.setForeground(new java.awt.Color(255, 255, 255));
        E4.setText("L");
        E4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E4MouseClicked(evt);
            }
        });
        jPanel1.add(E4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 70, 40));

        E3.setBackground(new java.awt.Color(255, 102, 204));
        E3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        E3.setForeground(new java.awt.Color(255, 255, 255));
        E3.setText("L");
        E3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E3MouseClicked(evt);
            }
        });
        jPanel1.add(E3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 70, 40));

        E6.setBackground(new java.awt.Color(255, 102, 204));
        E6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        E6.setForeground(new java.awt.Color(255, 255, 255));
        E6.setText("L");
        E6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E6MouseClicked(evt);
            }
        });
        jPanel1.add(E6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 70, 40));

        E5.setBackground(new java.awt.Color(255, 102, 204));
        E5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        E5.setForeground(new java.awt.Color(255, 255, 255));
        E5.setText("L");
        E5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E5MouseClicked(evt);
            }
        });
        jPanel1.add(E5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 70, 40));

        E8.setBackground(new java.awt.Color(255, 102, 204));
        E8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        E8.setForeground(new java.awt.Color(255, 255, 255));
        E8.setText("L");
        E8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E8MouseClicked(evt);
            }
        });
        E8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E8ActionPerformed(evt);
            }
        });
        jPanel1.add(E8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, 70, 40));

        E7.setBackground(new java.awt.Color(255, 102, 204));
        E7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        E7.setForeground(new java.awt.Color(255, 255, 255));
        E7.setText("L");
        E7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E7MouseClicked(evt);
            }
        });
        jPanel1.add(E7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, 70, 40));

        F1.setBackground(new java.awt.Color(102, 102, 102));
        F1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        F1.setForeground(new java.awt.Color(255, 255, 255));
        F1.setText("L");
        F1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F1MouseClicked(evt);
            }
        });
        jPanel1.add(F1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 70, 40));

        F4.setBackground(new java.awt.Color(102, 102, 102));
        F4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        F4.setForeground(new java.awt.Color(255, 255, 255));
        F4.setText("L");
        F4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F4MouseClicked(evt);
            }
        });
        jPanel1.add(F4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 70, 40));

        F3.setBackground(new java.awt.Color(102, 102, 102));
        F3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        F3.setForeground(new java.awt.Color(255, 255, 255));
        F3.setText("L");
        F3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F3MouseClicked(evt);
            }
        });
        jPanel1.add(F3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 70, 40));

        F6.setBackground(new java.awt.Color(102, 102, 102));
        F6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        F6.setForeground(new java.awt.Color(255, 255, 255));
        F6.setText("L");
        F6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F6MouseClicked(evt);
            }
        });
        jPanel1.add(F6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 70, 40));

        F5.setBackground(new java.awt.Color(102, 102, 102));
        F5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        F5.setForeground(new java.awt.Color(255, 255, 255));
        F5.setText("L");
        F5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F5MouseClicked(evt);
            }
        });
        jPanel1.add(F5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 70, 40));

        G8.setBackground(new java.awt.Color(102, 102, 102));
        G8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        G8.setForeground(new java.awt.Color(255, 255, 255));
        G8.setText("L");
        G8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                G8MouseClicked(evt);
            }
        });
        jPanel1.add(G8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, 70, 40));

        F7.setBackground(new java.awt.Color(102, 102, 102));
        F7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        F7.setForeground(new java.awt.Color(255, 255, 255));
        F7.setText("L");
        F7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F7MouseClicked(evt);
            }
        });
        jPanel1.add(F7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 370, 70, 40));

        G2.setBackground(new java.awt.Color(102, 102, 102));
        G2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        G2.setForeground(new java.awt.Color(255, 255, 255));
        G2.setText("L");
        G2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                G2MouseClicked(evt);
            }
        });
        jPanel1.add(G2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 70, 40));

        G1.setBackground(new java.awt.Color(102, 102, 102));
        G1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        G1.setForeground(new java.awt.Color(255, 255, 255));
        G1.setText("L");
        G1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                G1MouseClicked(evt);
            }
        });
        jPanel1.add(G1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 70, 40));

        G3.setBackground(new java.awt.Color(102, 102, 102));
        G3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        G3.setForeground(new java.awt.Color(255, 255, 255));
        G3.setText("L");
        G3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                G3MouseClicked(evt);
            }
        });
        jPanel1.add(G3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 70, 40));

        G6.setBackground(new java.awt.Color(102, 102, 102));
        G6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        G6.setForeground(new java.awt.Color(255, 255, 255));
        G6.setText("L");
        G6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                G6MouseClicked(evt);
            }
        });
        jPanel1.add(G6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 70, 40));

        G7.setBackground(new java.awt.Color(102, 102, 102));
        G7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        G7.setForeground(new java.awt.Color(255, 255, 255));
        G7.setText("L");
        G7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                G7MouseClicked(evt);
            }
        });
        jPanel1.add(G7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, 70, 40));

        F8.setBackground(new java.awt.Color(102, 102, 102));
        F8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        F8.setForeground(new java.awt.Color(255, 255, 255));
        F8.setText("L");
        F8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F8MouseClicked(evt);
            }
        });
        jPanel1.add(F8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 70, 40));

        jPanel4.setBackground(new java.awt.Color(102, 0, 102));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 160, 20, -1));

        jLabel1.setText("Palco Dakiti");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 200, -1, -1));

        A8.setBackground(new java.awt.Color(255, 51, 51));
        A8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        A8.setForeground(new java.awt.Color(255, 255, 255));
        A8.setText("L");
        A8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A8MouseClicked(evt);
            }
        });
        A8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A8ActionPerformed(evt);
            }
        });
        jPanel1.add(A8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 70, 40));

        jLabel3.setText("Invitados Especiales");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 160, -1, -1));

        jButton5.setBackground(new java.awt.Color(0, 204, 255));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 240, 20, 20));

        jLabel4.setText("Palco Yonaguni");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 240, -1, -1));

        jButton6.setBackground(new java.awt.Color(255, 102, 204));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 280, 20, 20));

        jLabel5.setText("Palco Callaita");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 280, -1, -1));

        jLabel6.setText("Palco Oasis");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 320, -1, -1));

        jButton7.setBackground(new java.awt.Color(102, 102, 102));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 320, 20, 20));

        btnIngreso1.setBackground(new java.awt.Color(255, 0, 51));
        btnIngreso1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        btnIngreso1.setForeground(new java.awt.Color(255, 255, 255));
        btnIngreso1.setText("CERRAR");
        btnIngreso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngreso1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngreso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 410, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("G");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 10, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("8");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, 10, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("B");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 10, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("C");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 10, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("D");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 10, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("E");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 10, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("F");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 10, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("A");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 10, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("1");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 10, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("2");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 10, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("3");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 10, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("4");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 10, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("5");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 10, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("6");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 10, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("7");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 10, -1));

        jLabel22.setText("Seleccione el palco para conocer su precio.");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 90, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed
                  
    }//GEN-LAST:event_A1ActionPerformed

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A2ActionPerformed

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A3ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B2ActionPerformed

    private void A6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A6ActionPerformed

    private void A7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A7ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B7ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B8ActionPerformed

    private void A5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A5ActionPerformed

    private void A4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A4ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B6ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B5ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B4ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B3ActionPerformed

    private void C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C8ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C1ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C2ActionPerformed

    private void C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C5ActionPerformed

    private void C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C6ActionPerformed

    private void C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C7ActionPerformed

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C3ActionPerformed

    private void C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C4ActionPerformed

    private void A8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btnIngreso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngreso1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnIngreso1ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        JOptionPane.showMessageDialog(null, "Palco invitados especiales no está en venta.");
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        JOptionPane.showMessageDialog(null, "Palco Dakiti.  Valor: $5'000.000");
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        JOptionPane.showMessageDialog(null, "Palco Yonaguni.  Valor: $6'200.000");
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        JOptionPane.showMessageDialog(null, "Palco Callaita.  Valor: $4'300.000");
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        JOptionPane.showMessageDialog(null, "Palco Oasis.  Valor: $3'500.000");
    }//GEN-LAST:event_jLabel6MouseClicked

    public void actualizarPalcoSeleccionado(String codigoPalco){
        ComprarPalco palco = new ComprarPalco();
        palco.setPalcoSelected(codigoPalco);  
        JOptionPane.showMessageDialog(null, "Palco "+codigoPalco+" seleccionado, puede continuar con la compra.");
    }
    private void A1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A1MouseClicked
        actualizarPalcoSeleccionado("A1");
        
    }//GEN-LAST:event_A1MouseClicked

    private void A1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A1MousePressed
    }//GEN-LAST:event_A1MousePressed

    private void E8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_E8ActionPerformed

    private void A2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A2MouseClicked
        actualizarPalcoSeleccionado("A2");
    }//GEN-LAST:event_A2MouseClicked

    private void A3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A3MouseClicked
        actualizarPalcoSeleccionado("A3");
    }//GEN-LAST:event_A3MouseClicked

    private void A4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A4MouseClicked
        actualizarPalcoSeleccionado("A4");
    }//GEN-LAST:event_A4MouseClicked

    private void A5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A5MouseClicked
        actualizarPalcoSeleccionado("A5");
    }//GEN-LAST:event_A5MouseClicked

    private void A6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A6MouseClicked
        actualizarPalcoSeleccionado("A6");
    }//GEN-LAST:event_A6MouseClicked

    private void A7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A7MouseClicked
        actualizarPalcoSeleccionado("A7");
    }//GEN-LAST:event_A7MouseClicked

    private void A8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A8MouseClicked
        actualizarPalcoSeleccionado("A8");
    }//GEN-LAST:event_A8MouseClicked

    private void B1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B1MouseClicked
        actualizarPalcoSeleccionado("B1");
    }//GEN-LAST:event_B1MouseClicked

    private void B2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B2MouseClicked
        actualizarPalcoSeleccionado("B2");
    }//GEN-LAST:event_B2MouseClicked

    private void B3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B3MouseClicked
        actualizarPalcoSeleccionado("B3");
    }//GEN-LAST:event_B3MouseClicked

    private void B4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B4MouseClicked
       actualizarPalcoSeleccionado("B4");
    }//GEN-LAST:event_B4MouseClicked

    private void B5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B5MouseClicked
        actualizarPalcoSeleccionado("B5");
    }//GEN-LAST:event_B5MouseClicked

    private void B6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B6MouseClicked
        actualizarPalcoSeleccionado("B6");
    }//GEN-LAST:event_B6MouseClicked

    private void B7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B7MouseClicked
        actualizarPalcoSeleccionado("B7");
    }//GEN-LAST:event_B7MouseClicked

    private void B8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B8MouseClicked
        actualizarPalcoSeleccionado("B8");
    }//GEN-LAST:event_B8MouseClicked

    private void C1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C1MouseClicked
        actualizarPalcoSeleccionado("C1");
    }//GEN-LAST:event_C1MouseClicked

    private void C2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C2MouseClicked
        actualizarPalcoSeleccionado("C2");
    }//GEN-LAST:event_C2MouseClicked

    private void C3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C3MouseClicked
        actualizarPalcoSeleccionado("C3");
    }//GEN-LAST:event_C3MouseClicked

    private void C4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C4MouseClicked
        actualizarPalcoSeleccionado("C4");
    }//GEN-LAST:event_C4MouseClicked

    private void C5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C5MouseClicked
        actualizarPalcoSeleccionado("C5");
    }//GEN-LAST:event_C5MouseClicked

    private void C6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C6MouseClicked
        actualizarPalcoSeleccionado("C6");
    }//GEN-LAST:event_C6MouseClicked

    private void C7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C7MouseClicked
        actualizarPalcoSeleccionado("C7");
    }//GEN-LAST:event_C7MouseClicked

    private void C8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C8MouseClicked
        actualizarPalcoSeleccionado("C8");
    }//GEN-LAST:event_C8MouseClicked

    private void D1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D1MouseClicked
        actualizarPalcoSeleccionado("D1");
    }//GEN-LAST:event_D1MouseClicked

    private void D2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D2MouseClicked
        actualizarPalcoSeleccionado("D2");
    }//GEN-LAST:event_D2MouseClicked

    private void D3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D3MouseClicked
        actualizarPalcoSeleccionado("D3");
    }//GEN-LAST:event_D3MouseClicked

    private void D4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D4MouseClicked
        actualizarPalcoSeleccionado("D4");
    }//GEN-LAST:event_D4MouseClicked

    private void D5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D5MouseClicked
        actualizarPalcoSeleccionado("D5");
    }//GEN-LAST:event_D5MouseClicked

    private void D6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D6MouseClicked
        actualizarPalcoSeleccionado("D6");
    }//GEN-LAST:event_D6MouseClicked

    private void D7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D7MouseClicked
        actualizarPalcoSeleccionado("D7");
    }//GEN-LAST:event_D7MouseClicked

    private void D8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D8MouseClicked
        actualizarPalcoSeleccionado("D8");
    }//GEN-LAST:event_D8MouseClicked

    private void E1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E1MouseClicked
        actualizarPalcoSeleccionado("E1");
    }//GEN-LAST:event_E1MouseClicked

    private void E2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E2MouseClicked
        actualizarPalcoSeleccionado("E2");
    }//GEN-LAST:event_E2MouseClicked

    private void E3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E3MouseClicked
        actualizarPalcoSeleccionado("E3");
    }//GEN-LAST:event_E3MouseClicked

    private void E4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E4MouseClicked
        actualizarPalcoSeleccionado("E4");
    }//GEN-LAST:event_E4MouseClicked

    private void E5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E5MouseClicked
        actualizarPalcoSeleccionado("E5");
    }//GEN-LAST:event_E5MouseClicked

    private void E6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E6MouseClicked
        actualizarPalcoSeleccionado("E6");
    }//GEN-LAST:event_E6MouseClicked

    private void E7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E7MouseClicked
        actualizarPalcoSeleccionado("E7");
    }//GEN-LAST:event_E7MouseClicked

    private void E8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E8MouseClicked
        actualizarPalcoSeleccionado("E8");
    }//GEN-LAST:event_E8MouseClicked

    private void F1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F1MouseClicked
        actualizarPalcoSeleccionado("F1");
    }//GEN-LAST:event_F1MouseClicked

    private void F2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F2MouseClicked
        actualizarPalcoSeleccionado("F2");
    }//GEN-LAST:event_F2MouseClicked

    private void F3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F3MouseClicked
        actualizarPalcoSeleccionado("F3");
    }//GEN-LAST:event_F3MouseClicked

    private void F4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F4MouseClicked
        actualizarPalcoSeleccionado("F4");
    }//GEN-LAST:event_F4MouseClicked

    private void F5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F5MouseClicked
        actualizarPalcoSeleccionado("F5");
    }//GEN-LAST:event_F5MouseClicked

    private void F6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F6MouseClicked
        actualizarPalcoSeleccionado("F6");
    }//GEN-LAST:event_F6MouseClicked

    private void F7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F7MouseClicked
        actualizarPalcoSeleccionado("F7");
    }//GEN-LAST:event_F7MouseClicked

    private void F8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F8MouseClicked
        actualizarPalcoSeleccionado("F8");
    }//GEN-LAST:event_F8MouseClicked

    private void G1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G1MouseClicked
        actualizarPalcoSeleccionado("C6");
    }//GEN-LAST:event_G1MouseClicked

    private void G2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G2MouseClicked
        actualizarPalcoSeleccionado("G2");
    }//GEN-LAST:event_G2MouseClicked

    private void G3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G3MouseClicked
        actualizarPalcoSeleccionado("G3");
    }//GEN-LAST:event_G3MouseClicked

    private void G6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G6MouseClicked
        actualizarPalcoSeleccionado("G6");
    }//GEN-LAST:event_G6MouseClicked

    private void G7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G7MouseClicked
        actualizarPalcoSeleccionado("G7");
    }//GEN-LAST:event_G7MouseClicked

    private void G8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G8MouseClicked
        actualizarPalcoSeleccionado("G8");
    }//GEN-LAST:event_G8MouseClicked
       
    
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
            java.util.logging.Logger.getLogger(Palcos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Palcos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Palcos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Palcos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Palcos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton A1;
    private javax.swing.JButton A2;
    private javax.swing.JButton A3;
    private javax.swing.JButton A4;
    private javax.swing.JButton A5;
    private javax.swing.JButton A6;
    private javax.swing.JButton A7;
    private javax.swing.JButton A8;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton C1;
    private javax.swing.JButton C2;
    private javax.swing.JButton C3;
    private javax.swing.JButton C4;
    private javax.swing.JButton C5;
    private javax.swing.JButton C6;
    private javax.swing.JButton C7;
    private javax.swing.JButton C8;
    private javax.swing.JButton D1;
    private javax.swing.JButton D2;
    private javax.swing.JButton D3;
    private javax.swing.JButton D4;
    private javax.swing.JButton D5;
    private javax.swing.JButton D6;
    private javax.swing.JButton D7;
    private javax.swing.JButton D8;
    private javax.swing.JButton E1;
    private javax.swing.JButton E2;
    private javax.swing.JButton E3;
    private javax.swing.JButton E4;
    private javax.swing.JButton E5;
    private javax.swing.JButton E6;
    private javax.swing.JButton E7;
    private javax.swing.JButton E8;
    private javax.swing.JButton F1;
    private javax.swing.JButton F2;
    private javax.swing.JButton F3;
    private javax.swing.JButton F4;
    private javax.swing.JButton F5;
    private javax.swing.JButton F6;
    private javax.swing.JButton F7;
    private javax.swing.JButton F8;
    private javax.swing.JButton G1;
    private javax.swing.JButton G2;
    private javax.swing.JButton G3;
    private javax.swing.JButton G6;
    private javax.swing.JButton G7;
    private javax.swing.JButton G8;
    private javax.swing.JButton btnIngreso1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
