package viewer;

import javax.swing.*;

public class SQLiteViewer extends JFrame {

    public SQLiteViewer() {
        super("SQLite Viewer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 900);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);

        initControls();
        setVisible(true);
    }

    void initControls() {
        add(new JTextField() {{
            setName("FileNameTextField");
            setBounds(10, 10, 550, 30);
        }});
        add(new JButton("Open") {{
            setName("OpenFileButton");
            setBounds(570, 10, 100, 30);
        }});
    }
}
