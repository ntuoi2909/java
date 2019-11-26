
package MainWindows;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import tabs.QLHangHoa;
import tabs.QLKhachHang;
import tabs.ThanhToan;
import tabs.ThongKe;


public class Main extends javax.swing.JFrame {
    private JFrame frame;
	private QLHangHoa qlhanghoa;
	private QLKhachHang qlkhachhang;
	private ThanhToan thanhtoan;
        private ThongKe  thongke;


    public Main() {
        
        frame = new JFrame();
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("SIEUTHI_T_T");//set title for main window
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		qlhanghoa = new QLHangHoa();
		tabbedPane.addTab("QLHangHoa", null, qlhanghoa, null);
		
		
		qlkhachhang = new QLKhachHang();
		tabbedPane.addTab("QLKhachHang", null, qlkhachhang, null);
		
		
		thanhtoan = new ThanhToan();
		tabbedPane.addTab("ThanhToan", null, thanhtoan, null);
		
                thongke = new ThongKe();
		tabbed.addTab("ThongKe", null, thongke, null);
	}	
	
	
        
        
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        labelmkh = new javax.swing.JLabel();
        labeltkh = new javax.swing.JLabel();
        labeldc = new javax.swing.JLabel();
        labelsdt = new javax.swing.JLabel();
        textmkh = new javax.swing.JTextField();
        texttkh = new javax.swing.JTextField();
        textdc = new javax.swing.JTextField();
        textsdt = new javax.swing.JTextField();
        btthemkh = new javax.swing.JButton();
        btsua = new javax.swing.JButton();
        btxoa = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablekh = new javax.swing.JTable();
        btcapnhatkh = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        labelmhh = new javax.swing.JLabel();
        labelthh = new javax.swing.JLabel();
        labeldg = new javax.swing.JLabel();
        labeldvt = new javax.swing.JLabel();
        textmhh = new javax.swing.JTextField();
        textthh = new javax.swing.JTextField();
        textdg = new javax.swing.JTextField();
        textdvt = new javax.swing.JTextField();
        btthemhh = new javax.swing.JButton();
        btcapnhathh = new javax.swing.JButton();
        btcapnhatdg = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        bttracuu = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        labelmhtt = new javax.swing.JLabel();
        labelsltt = new javax.swing.JLabel();
        textmh = new javax.swing.JTextField();
        textsl = new javax.swing.JTextField();
        btthemsptt = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        labelthhtt = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUẢN LÝ SIÊU THỊ MINI");

        labelmkh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelmkh.setText("Mã khách hàng");

        labeltkh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labeltkh.setText("Tên khách hàng");

        labeldc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labeldc.setText("Địa chỉ");

        labelsdt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelsdt.setText("Số điện thoại");

        btthemkh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btthemkh.setText("THÊM KHÁCH HÀNG");

        btsua.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btsua.setText("SỬA");

        btxoa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btxoa.setText("XÓA");

        tablekh.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablekh);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 40, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btcapnhatkh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btcapnhatkh.setText("CẬP NHẬT");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(labelmkh)
                        .addGap(47, 47, 47)
                        .addComponent(textmkh, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(btthemkh)
                        .addContainerGap(40, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(labelsdt)
                                .addGap(57, 57, 57)
                                .addComponent(textsdt))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labeltkh)
                                    .addComponent(labeldc))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textdc, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(texttkh, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btsua)
                                    .addComponent(btxoa)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(btcapnhatkh)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelmkh)
                    .addComponent(textmkh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btthemkh))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labeltkh)
                    .addComponent(texttkh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btsua))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labeldc)
                    .addComponent(textdc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btxoa))
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelsdt)
                    .addComponent(textsdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btcapnhatkh))
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("KHÁCH HÀNG", jPanel3);

        jPanel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        labelmhh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelmhh.setText("Mã hàng hóa");

        labelthh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelthh.setText("Tên hàng hóa");

        labeldg.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labeldg.setText("Đơn giá");

        labeldvt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labeldvt.setText("Đơn vị tính");

        textdg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textdgActionPerformed(evt);
            }
        });

        btthemhh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btthemhh.setText("THÊM HÀNG HÓA");
        btthemhh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btthemhhActionPerformed(evt);
            }
        });

        btcapnhathh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btcapnhathh.setText("CẬP NHẬT");

        btcapnhatdg.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btcapnhatdg.setText("CẬP NHẬT ĐƠN GIÁ");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bttracuu.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bttracuu.setText("TRA CỨU");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(labeldg)
                        .addGap(83, 83, 83)
                        .addComponent(textdg))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(labeldvt)
                        .addGap(68, 68, 68)
                        .addComponent(textdvt))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelmhh)
                            .addComponent(labelthh))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textthh, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                            .addComponent(textmhh))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btcapnhathh)
                    .addComponent(btthemhh)
                    .addComponent(btcapnhatdg)
                    .addComponent(bttracuu))
                .addGap(66, 66, 66))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelmhh)
                    .addComponent(textmhh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btthemhh))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelthh)
                            .addComponent(textthh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btcapnhathh)))
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labeldg)
                    .addComponent(textdg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btcapnhatdg))
                .addGap(41, 41, 41)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labeldvt)
                    .addComponent(textdvt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttracuu))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("HÀNG HÓA", jPanel4);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 721, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("THỐNG KÊ", jPanel6);

        labelmhtt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelmhtt.setText("Mã hàng");

        labelsltt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelsltt.setText("Số lượng");

        btthemsptt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btthemsptt.setText("THÊM SẢN PHẨM");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelthhtt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelthhtt.setText("Tên hàng hóa");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(btthemsptt))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelmhtt)
                            .addComponent(labelsltt)
                            .addComponent(labelthhtt))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textsl, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                            .addComponent(textmh)
                            .addComponent(jTextField1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelmhtt)
                    .addComponent(textmh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelthhtt)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelsltt)
                    .addComponent(textsl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btthemsptt)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("THANH TOÁN", jPanel7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textdgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textdgActionPerformed
        
        

    }//GEN-LAST:event_textdgActionPerformed

    private void btthemhhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btthemhhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btthemhhActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main main = new Main();
					Main.frame.setVisible(true);
//                                }
                                    catch (Exception e) {
					e.printStackTrace();
                                    }
			}
	});
    }
}
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
        private javax.swing.JButton btcapnhatdg;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcapnhatdg;
    private javax.swing.JButton btcapnhathh;
    private javax.swing.JButton btcapnhatkh;
    private javax.swing.JButton btsua;
    private javax.swing.JButton btthemhh;
    private javax.swing.JButton btthemkh;
    private javax.swing.JButton btthemsptt;
    private javax.swing.JButton bttracuu;
    private javax.swing.JButton btxoa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labeldc;
    private javax.swing.JLabel labeldg;
    private javax.swing.JLabel labeldvt;
    private javax.swing.JLabel labelmhh;
    private javax.swing.JLabel labelmhtt;
    private javax.swing.JLabel labelmkh;
    private javax.swing.JLabel labelsdt;
    private javax.swing.JLabel labelsltt;
    private javax.swing.JLabel labelthh;
    private javax.swing.JLabel labelthhtt;
    private javax.swing.JLabel labeltkh;
    private javax.swing.JTable tablekh;
    private javax.swing.JTextField textdc;
    private javax.swing.JTextField textdg;
    private javax.swing.JTextField textdvt;
    private javax.swing.JTextField textmh;
    private javax.swing.JTextField textmhh;
    private javax.swing.JTextField textmkh;
    private javax.swing.JTextField textsdt;
    private javax.swing.JTextField textsl;
    private javax.swing.JTextField textthh;
    private javax.swing.JTextField texttkh;
    // End of variables declaration//GEN-END:variables
}
