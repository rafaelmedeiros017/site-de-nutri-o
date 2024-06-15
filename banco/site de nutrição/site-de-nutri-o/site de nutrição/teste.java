import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class LoginCRUD {
    private JFrame frame;
    private JTextField txtNome;
    private JPasswordField txtSenha;
    private JTextField txtNomeCRUD;
    private JTextField txtEmailCRUD;
    private JButton btnLogin;
    private JButton btnCreate;
    private JButton btnRead;
    private JButton btnUpdate;
    private JButton btnDelete;

    private Connection conn;
    private Statement stmt;

    public LoginCRUD() {
        // Criar conexão com o banco de dados
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "senha");
            stmt = conn.createStatement();
        } catch (Exception e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }

        // Criar janela de login
        frame = new JFrame("Login CRUD");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Criar campos de login
        JLabel lblNome = new JLabel("Nome:");
        txtNome = new JTextField(20);
        JLabel lblSenha = new JLabel("Senha:");
        txtSenha = new JPasswordField(20);

        // Criar botão de login
        btnLogin = new JButton("Login");
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                login();
            }
        });

        // Adicionar campos e botão de login à janela
        frame.add(lblNome);
        frame.add(txtNome);
        frame.add(lblSenha);
        frame.add(txtSenha);
        frame.add(btnLogin);

        // Criar janela de CRUD
        JPanel panelCRUD = new JPanel();
        panelCRUD.setLayout(new FlowLayout());

        // Criar campos de CRUD
        JLabel lblNomeCRUD = new JLabel("Nome:");
        txtNomeCRUD = new JTextField(20);
        JLabel lblEmailCRUD = new JLabel("Email:");
        txtEmailCRUD = new JTextField(20);

        // Criar botões de CRUD
        btnCreate = new JButton("Criar");
        btnCreate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                create();
            }
        });

        btnRead = new JButton("Ler");
        btnRead.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                read();
            }
        });

        btnUpdate = new JButton("Atualizar");
        btnUpdate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                update();
            }
        });

        btnDelete = new JButton("Deletar");
        btnDelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                delete();
            }
        });

        // Adicionar campos e botões de CRUD à janela
        panelCRUD.add(lblNomeCRUD);
        panelCRUD.add(txtNomeCRUD);
        panelCRUD.add(lblEmailCRUD);
        panelCRUD.add(txtEmailCRUD);
        panelCRUD.add(btnCreate);
        panelCRUD.add(btnRead);
        panelCRUD.add(btnUpdate);
        panelCRUD.add(btnDelete);

        frame.add(panelCRUD);

        // Mostrar janela de login
        frame.pack();
        frame.setVisible(true);
    }

    private void login() {
        String nome = txtNome.getText();
        String senha = new String(txtSenha.getPassword());

        try {
            ResultSet rs = stmt.executeQuery("SELECT * FROM usuarios WHERE nome='" + nome + "' AND senha='" + senha + "'");
            if (rs.next()) {
                JOptionPane.showMessageDialog(frame, "Login realizado com sucesso!");
                frame.remove(0);
                frame.add(panelCRUD);
                frame.revalidate();
                frame.repaint();
            } else {
                JOptionPane.showMessageDialog(frame, "Nome ou senha incorretos!");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao realizar login: " + e.getMessage());
        }
    }

    private void create() {
        String nome = txtNomeCRUD.getText();
        String email = txtEmailCRUD.getText();

        try {
            stmt.executeUpdate("INSERT INTO usuarios (nome, email) VALUES ('" + nome + "', '" + email + "')");
            JOptionPane.showMessageDialog(frame, "Usuário criado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao criar usuário: " + e.getMessage());
        }
    }

    private void read() {
        try {
            ResultSet rs = stmt.executeQuery("SELECT * FROM usuarios");
            String usuarios = "";
            while (rs.next()) {
                usuarios += rs.getString("nome") + " - " + rs.getString("email") + "\n