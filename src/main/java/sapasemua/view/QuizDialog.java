/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package sapasemua.view;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author versa
 */
public class QuizDialog extends javax.swing.JDialog {
    
    private final JRadioButton[] answerButtons;

    /**
     * Creates new form QuizDialog
     * @param parent
     * @param modal
     */
    public QuizDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.answerButtons = new JRadioButton[]{radioA, radioB, radioC, radioD};
        setResizable(false);
    }

    public JRadioButton[] getAnswerButtons() {
        return answerButtons;
    }

    public ButtonGroup getAnswerButtonGroup() {
        return answerButtonGroup;
    }

    public ImageCanvas getImageCanvas() {
        return imageCanvas;
    }

    public JList<String> getSoalList() {
        return soalList;
    }

    public JButton getSelesaiButton() {
        return SelesaiButton;
    }

    public JButton getSimpanButton() {
        return simpanButton;
    }
    
    public void showMessage(String msg){
        JOptionPane.showMessageDialog(this, msg);
    }
    
    public void setTopikText(String text){
        topikLabel.setText(text);
    }
    
    public void addListener(ActionListener e){
        simpanButton.addActionListener(e);
        SelesaiButton.addActionListener(e);
    }
    
    public void addAdapter(MouseAdapter ma){
        soalList.addMouseListener(ma);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        answerButtonGroup = new javax.swing.ButtonGroup();
        QuestionContentPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        radioA = new javax.swing.JRadioButton();
        radioB = new javax.swing.JRadioButton();
        radioC = new javax.swing.JRadioButton();
        radioD = new javax.swing.JRadioButton();
        simpanButton = new javax.swing.JButton();
        imageCanvas = new sapasemua.view.ImageCanvas();
        QuestionNumberPanel = new javax.swing.JPanel();
        topikLabel = new javax.swing.JLabel();
        SelesaiButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        soalList = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        QuestionContentPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Apa terjemahan dari bahasa isyarat ini?");

        answerButtonGroup.add(radioA);
        radioA.setText("jRadioButton1");

        answerButtonGroup.add(radioB);
        radioB.setText("jRadioButton2");

        answerButtonGroup.add(radioC);
        radioC.setText("jRadioButton3");

        answerButtonGroup.add(radioD);
        radioD.setText("jRadioButton4");

        simpanButton.setText("Simpan");

        javax.swing.GroupLayout QuestionContentPanelLayout = new javax.swing.GroupLayout(QuestionContentPanel);
        QuestionContentPanel.setLayout(QuestionContentPanelLayout);
        QuestionContentPanelLayout.setHorizontalGroup(
            QuestionContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuestionContentPanelLayout.createSequentialGroup()
                .addGroup(QuestionContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(QuestionContentPanelLayout.createSequentialGroup()
                        .addGroup(QuestionContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(QuestionContentPanelLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(QuestionContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(radioC, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                    .addComponent(radioB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(radioA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(radioD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(QuestionContentPanelLayout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(simpanButton)))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(QuestionContentPanelLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(imageCanvas, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        QuestionContentPanelLayout.setVerticalGroup(
            QuestionContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuestionContentPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imageCanvas, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioD)
                .addGap(18, 18, 18)
                .addComponent(simpanButton)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        QuestionNumberPanel.setBackground(new java.awt.Color(0, 255, 255));
        QuestionNumberPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        topikLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        topikLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        SelesaiButton.setText("Selesai");

        soalList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane1.setViewportView(soalList);

        javax.swing.GroupLayout QuestionNumberPanelLayout = new javax.swing.GroupLayout(QuestionNumberPanel);
        QuestionNumberPanel.setLayout(QuestionNumberPanelLayout);
        QuestionNumberPanelLayout.setHorizontalGroup(
            QuestionNumberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuestionNumberPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(QuestionNumberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(SelesaiButton, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                .addGap(34, 34, 34))
            .addComponent(topikLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        QuestionNumberPanelLayout.setVerticalGroup(
            QuestionNumberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QuestionNumberPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(topikLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SelesaiButton)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(QuestionNumberPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(QuestionContentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(QuestionContentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(QuestionNumberPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel QuestionContentPanel;
    private javax.swing.JPanel QuestionNumberPanel;
    private javax.swing.JButton SelesaiButton;
    private javax.swing.ButtonGroup answerButtonGroup;
    private sapasemua.view.ImageCanvas imageCanvas;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioA;
    private javax.swing.JRadioButton radioB;
    private javax.swing.JRadioButton radioC;
    private javax.swing.JRadioButton radioD;
    private javax.swing.JButton simpanButton;
    private javax.swing.JList<String> soalList;
    private javax.swing.JLabel topikLabel;
    // End of variables declaration//GEN-END:variables
}
