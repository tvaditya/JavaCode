package genericostipo;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aditya on 30/06/2016.
 */
public class Formulario extends JFrame {
    private JPanel pnNorte, pnCentro, pnSul;
    public JTextArea taTexto;
    public JTextField txtValor, txtNumMaximo;
    protected JButton btnExcluir, btnIncluir, btnLimpar, btnListar, btnUltimo;

    public Formulario(){
        super("Formulario Padrao");
        setSize(250,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container tela = getContentPane();
        tela.setLayout(new BorderLayout());

        txtValor = new JTextField();
        pnNorte = new JPanel();
        pnNorte.setLayout(new GridLayout(1,2, 5, 5));
        pnNorte.add(txtValor);

        taTexto = new JTextArea();
        pnCentro = new JPanel();
        pnCentro.setLayout(new GridLayout(1,1));
        pnCentro.add(new JScrollPane(taTexto));

        btnIncluir = new JButton("Incluir");
        btnExcluir = new JButton("Excluir");
        btnLimpar = new JButton("Limpar");
        btnListar = new JButton("Listar");
        btnUltimo = new JButton("Ultimo");

        txtNumMaximo = new JTextField("5");

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


}
