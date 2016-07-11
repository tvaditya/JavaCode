package genericostipo;

/**
 * Created by Aditya on 10/07/2016.
 */

import javax.swing.*;
import java.awt.*;


/**
 * Created by Aditya on 30/06/2016.
 */
public class Formulario2 extends JFrame {
    private JPanel pnNorte, pnCentro, pnSul;
    public JTextArea taTexto;
    public JTextField txtValor, txtNumMaximo;
    protected JButton btnExcluir, btnIncluir, btnLimpar, btnListar, btnUltimo;
    protected JLabel lblNumItem, lblPosInicio, lblValorInicio, lblPosfFim, lblValorFim;

    public Formulario2(){
        super("Formulario Padrao");
        setSize(250,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container tela = getContentPane();
        tela.setLayout(new BorderLayout());
        lblNumItem = new JLabel("Num itens = 0");
        lblPosInicio = new JLabel("Pos Inicio = 0");
        lblValorInicio = new JLabel("Valor inicio = ");
        lblPosfFim = new JLabel("Pos fim = 0");
        lblValorFim = new JLabel("Valor fim = 0");
        txtValor = new JTextField();
        pnNorte = new JPanel();
        pnNorte.setLayout(new GridLayout(3, 2, 5, 5));
        pnNorte.add(lblNumItem);
        pnNorte.add(txtValor);
        pnNorte.add(lblPosInicio);
        pnNorte.add(lblValorInicio);
        pnNorte.add(lblPosfFim);
        pnNorte.add(lblValorFim);

        taTexto = new JTextArea();
        pnCentro = new JPanel();
        pnCentro.setLayout(new GridLayout(1,1));
        pnCentro.add(new JScrollPane(taTexto));

        btnIncluir = new JButton("Incluir");
        btnExcluir = new JButton("Excluir");
        btnLimpar = new JButton("Limpar");
        btnListar = new JButton("Listar");
        btnUltimo = new JButton("Ultimo");

        txtNumMaximo = new JTextField("4");

        pnSul = new JPanel();
        pnSul.setLayout(new GridLayout(3,2,2,2));
        pnSul.add(btnIncluir);
        pnSul.add(btnExcluir);
        pnSul.add(btnLimpar);
        pnSul.add(btnListar);
        pnSul.add(btnUltimo);
        pnSul.add(txtNumMaximo);

        tela.add(pnNorte, BorderLayout.NORTH);
        tela.add(pnCentro, BorderLayout.CENTER);
        tela.add(pnSul, BorderLayout.SOUTH);

    }

 /*   public static void main(String args[]){
        new Formulario2().setVisible(true);
    }
*/

}

