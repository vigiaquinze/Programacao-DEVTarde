import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class JFrameComponents extends JFrame{
    public JFrameComponents() {
        super("Janela principal");
        this.setBounds(500, 250, 900, 600);
        //modificando o layout do frame
        FlowLayout flow = new FlowLayout();
        this.setLayout(flow);
        //adicionar os componentes
        for (int i = 1; i < 51; i++) {
            this.add(new JButton(""+i));
        }
        //set frame
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}