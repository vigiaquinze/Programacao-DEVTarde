package View;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import java.awt.event.MouseEvent;

import Control.OperacoesUsuarios;
import Control.Serializacao;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.io.File;

import Model.Usuario;

public class CadastroUsuarios extends JPanel {
    // atributos
    private JTextField inputNome;
    private JTextField inputIdade;
    private DefaultTableModel tableModel;
    private JTable table;
    private List<Usuario> usuarios = new ArrayList<>();
    private int linhaSelecionada = -1;
    private JButton cadastrarButton, atualizarButton, apagarButton, apagarTodosButton, salvarButton;

    // construtor
    public CadastroUsuarios() {
       

        // construir minha tabela
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Nome");
        tableModel.addColumn("Idade");
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);

        // criar os componentes
        inputNome = new JTextField(20);
        inputIdade = new JTextField(5);
        cadastrarButton = new JButton("Cadastrar");
        atualizarButton = new JButton("Atualizar");
        apagarButton = new JButton("Apagar");
        apagarTodosButton = new JButton("Apagar Todos");
        salvarButton = new JButton("Salvar");

        // add os componentes
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Nome:"));
        inputPanel.add(inputNome);
        inputPanel.add(new JLabel("Idade:"));
        inputPanel.add(inputIdade);
        inputPanel.add(cadastrarButton);
        inputPanel.add(atualizarButton);
        inputPanel.add(apagarButton);
        inputPanel.add(apagarTodosButton);
        inputPanel.add(salvarButton);

        // set do Layout
        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        // Criação do Arquivo Binário
        File arquivo = new File("dados.txt");
        if (arquivo.exists()) {
            usuarios = Serializacao.deserializar("dados.txt");
            atualizarTabela();
        }
        // tratamento de Eventos
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                linhaSelecionada = table.rowAtPoint(evt.getPoint());
                if (linhaSelecionada != -1) {
                    inputNome.setText((String) table.getValueAt(linhaSelecionada, 0));
                    inputIdade.setText(table.getValueAt(linhaSelecionada, 1).toString());

                }
            }
        });
        OperacoesUsuarios operacoes = new OperacoesUsuarios(usuarios, tableModel, table);

        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.cadastrarUsuario(inputNome.getText(), inputIdade.getText());
                inputNome.setText("");
                inputIdade.setText("");
            }
        });
        atualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.atualizarUsuario(linhaSelecionada, inputNome.getText(),

                        inputIdade.getText());

            }
        });
        apagarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.apagarUsuario(linhaSelecionada);
            }
        });
        apagarTodosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.apagarTodosUsuarios();
            }
        });
        salvarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.salvarUsuarios();
            }
        });

    }

    
    private void atualizarTabela() {
        tableModel.setRowCount(0);
        for (Usuario usuario : usuarios) {
            tableModel.addRow(new Object[] { usuario.getNome(), usuario.getIdade() });
        }
    }

}
