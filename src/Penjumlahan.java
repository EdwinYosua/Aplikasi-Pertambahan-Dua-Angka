import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Penjumlahan extends JFrame {
    private JPanel panel1;
    private JTextField txtAngka1;
    private JTextField txtAngka2;
    private JTextField txtHasil;
    private JButton btnTambah;
    private JButton btnHapus;
    private JButton btnKeluar;


    public Penjumlahan() {
        setContentPane(panel1);
        setMinimumSize(new Dimension(500,500));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);


        btnTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtHasil.setText(penjumlahanAngka(checkEmptyField()));
            }
        });

        btnHapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtHasil.setText("");
                txtAngka1.setText("");
                txtAngka2.setText("");
                txtAngka1.requestFocus();
            }
        });

        btnKeluar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    private Boolean checkEmptyField() {
      return (txtAngka1.getText().isBlank()) || (txtAngka2.getText().isBlank());
    }

    private String penjumlahanAngka(boolean checkField) {
        String hasil = "";
        if (!(checkField)) {
            hasil = Integer.toString(Integer.parseInt(txtAngka1.getText()) + Integer.parseInt(txtAngka2.getText()));
        } else {
            JOptionPane.showMessageDialog(null,"Harap isi Field Dengan Benar !");
            txtAngka1.setText("");
            txtAngka2.setText("");
            hasil = "";
            txtAngka1.requestFocus();
        }
        return hasil;
    }
}
