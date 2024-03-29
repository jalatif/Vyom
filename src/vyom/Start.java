/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vyom;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author jalatif
 */
public class Start extends javax.swing.JFrame {

		public static String filename = "";
		public static int runType = 0;
		public static HashMap hm = new HashMap();
		/**
		 * Creates new form Start
		 */
		public Start() {
				initComponents();
				hm.put("C", "c");
				hm.put("Java", "java");
				hm.put("Python", "py");
		}

		/**
		 * This method is called from within the constructor to initialize the
		 * form. WARNING: Do NOT modify this code. The content of this method is
		 * always regenerated by the Form Editor.
		 */
		@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CB_Language = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        TF_FilePath = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA_Code = new javax.swing.JTextArea();
        B_Run = new javax.swing.JButton();
        B_Selector = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        TF_CMD = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TA_Output = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        B_Enable = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CB_Language.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "C", "C++", "Java", "Python" }));

        jLabel1.setText("Select Language");

        TF_FilePath.setText("/home/jalatif");
        TF_FilePath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_FilePathActionPerformed(evt);
            }
        });

        TA_Code.setColumns(20);
        TA_Code.setRows(5);
        jScrollPane1.setViewportView(TA_Code);

        B_Run.setText("Run");
        B_Run.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_RunActionPerformed(evt);
            }
        });

        B_Selector.setText("Select Program File");
        B_Selector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_SelectorActionPerformed(evt);
            }
        });

        jButton3.setText("Submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        TF_CMD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_CMDActionPerformed(evt);
            }
        });

        jLabel2.setText("Code to Run");

        jLabel3.setText("Input Arguments");

        TA_Output.setColumns(20);
        TA_Output.setRows(5);
        jScrollPane2.setViewportView(TA_Output);

        jLabel4.setText("Output");

        B_Enable.setText("Clear");
        B_Enable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_EnableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CB_Language, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(79, 79, 79)
                                        .addComponent(B_Selector)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TF_FilePath, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(TF_CMD, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 173, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(B_Enable)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addGap(38, 38, 38)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B_Run)
                    .addComponent(jButton3))
                .addGap(54, 54, 54))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CB_Language, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TF_FilePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B_Selector))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B_Enable))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TF_CMD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(B_Run)))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

		private void B_RunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_RunActionPerformed
				// TODO add your handling code here:
				String lang = String.valueOf(CB_Language.getSelectedItem());
				String fln = "";
				if (runType == 1){
					fln = filename;
				}
				else{
					fln = TA_Code.getText();
				}
				String cmd_input = TF_CMD.getText();
				Executor ex = new Executor();
				List<String> output = ex.runCode(fln, lang, cmd_input, runType);
				ex.listPrinter(output);
				TA_Output.setText("");
				for (int i = 0; i<output.size();i++)
					TA_Output.append(output.get(i));
					TA_Output.append("\n");
		}//GEN-LAST:event_B_RunActionPerformed

		private void TF_CMDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_CMDActionPerformed
				// TODO add your handling code here:
		}//GEN-LAST:event_TF_CMDActionPerformed

		private void B_SelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_SelectorActionPerformed
				// TODO add your handling code here:
				//FilePath fp = new FilePath();
				//filename = FilePath.fileadd;
				//fp.setVisible(true);	
				//TF_FilePath.setText(filename);
				JFileChooser filechooser=new JFileChooser();
				String lang = String.valueOf(CB_Language.getSelectedItem());
				FileFilter lang_filter = new ExtensionFileFilter(lang, new String[] {hm.get(lang).toString()});
				//FileFilter lang_filter = new ExtensionFileFilter("C, Java and Python", new String[] { "py", "java", "c", "cpp" });
				filechooser.setFileFilter(lang_filter);
				int result=filechooser.showOpenDialog(null);
				if (result==JFileChooser.APPROVE_OPTION){
					try{
						filename=filechooser.getSelectedFile().toString();
						TF_FilePath.setText(filename);
						BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
						String ss;
						TA_Code.setText("");
						while((ss=br.readLine())!=null){
							TA_Code.append(ss);
							TA_Code.append("\n");
						}
						TA_Code.disable();
						runType = 1;
					}
					catch(Exception e){
						System.out.println(e);
					}
     
				}
		}//GEN-LAST:event_B_SelectorActionPerformed

		private void TF_FilePathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_FilePathActionPerformed
				// TODO add your handling code here:
		}//GEN-LAST:event_TF_FilePathActionPerformed

		private void B_EnableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_EnableActionPerformed
				// TODO add your handling code here:
				runType = 0;
				TA_Code.setText("");
				TF_FilePath.setText("");
				filename = "";
		}//GEN-LAST:event_B_EnableActionPerformed

		private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
				// TODO add your handling code here:
				Imager bsod = new Imager();
				this.setVisible(false);
				bsod.setVisible(true);
		}//GEN-LAST:event_jButton3ActionPerformed

		class ExtensionFileFilter extends FileFilter {
  String description;

  String extensions[];

  public ExtensionFileFilter(String description, String extension) {
    this(description, new String[] { extension });
  }

  public ExtensionFileFilter(String description, String extensions[]) {
    if (description == null) {
      this.description = extensions[0];
    } else {
      this.description = description;
    }
    this.extensions = (String[]) extensions.clone();
    toLower(this.extensions);
  }

  private void toLower(String array[]) {
    for (int i = 0, n = array.length; i < n; i++) {
      array[i] = array[i].toLowerCase();
    }
  }

  public String getDescription() {
    return description;
  }

  public boolean accept(File file) {
    if (file.isDirectory()) {
      return true;
    } else {
      String path = file.getAbsolutePath().toLowerCase();
      for (int i = 0, n = extensions.length; i < n; i++) {
        String extension = extensions[i];
        if ((path.endsWith(extension) && (path.charAt(path.length() - extension.length() - 1)) == '.')) {
          return true;
        }
      }
    }
    return false;
  }
}

		/**
		 * @param args the command line arguments
		 */
		public static void main(String args[]) {
				/*
				 * Set the Nimbus look and feel
				 */
				//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
				 * If Nimbus (introduced in Java SE 6) is not available, stay
				 * with the default look and feel. For details see
				 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
				 */
				try {
						for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
								if ("Nimbus".equals(info.getName())) {
										javax.swing.UIManager.setLookAndFeel(info.getClassName());
										break;
								}
						}
				} catch (ClassNotFoundException ex) {
						java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
				} catch (InstantiationException ex) {
						java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
				} catch (IllegalAccessException ex) {
						java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
				} catch (javax.swing.UnsupportedLookAndFeelException ex) {
						java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
				}
				//</editor-fold>

				/*
				 * Create and display the form
				 */
				java.awt.EventQueue.invokeLater(new Runnable() {

						public void run() {
								new Start().setVisible(true);
						}
				});
		}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Enable;
    private javax.swing.JButton B_Run;
    private javax.swing.JButton B_Selector;
    private javax.swing.JComboBox CB_Language;
    private javax.swing.JTextArea TA_Code;
    private javax.swing.JTextArea TA_Output;
    private javax.swing.JTextField TF_CMD;
    private javax.swing.JTextField TF_FilePath;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
