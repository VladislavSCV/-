import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class V1 extends JFrame {
    private JPanel mainpanel;
    private JButton button1;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JTextField textField1;
    private JTextField textField2;

    public V1() {
        setContentPane(mainpanel);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setTitle("Двумерный массив");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int m = Integer.parseInt(textField1.getText());
                int n= Integer.parseInt(textField1.getText());
                int[][] a = new int[m][n];
                Scanner scan = new Scanner(textArea1.getText());
                for(int i=0; i < a.length; i++)
                    for(int j=0; j < a[i].length; j++)
                        a[i][j] = scan.nextInt();

                int max = FindMax(a[0]);
                int min = FindMin(a[0]);

                textArea2.append("\n");
                textArea2.append("Max = " + max);
                textArea2.append("\n");
                textArea2.append("Max = " + min);


            }
        });
    }

    public static int FindMax(int[] arr){
        int max = arr[0];
        for (int i: arr){
            if (i > max){
                max = i;
            }
        }
        return max;
    }
    public static int FindMin(int[] arr){
        int min = arr[0];
        for (int i: arr){
            if (i < min){
                min = i;
            }
        }
        return min;
    }
}
