package main;
import javax.swing.*;
import java.awt.*;
import javax.swing.text.*;
import java.text.*;
import java.awt.event.*;


public class App extends JFrame{
	//Variáveis
    JRadioButton pf,pj;
    JLabel msg,Lstat,Lnome,Lbairro,Lcidade,Lestado,LtelCom,Lcnpj,Linsc,Lemail,
            Lobs,Lrua,Lnum,Lcomp,Lcep,LtelRes,LtelCel,Lcpf,Lrg,Ldata;
    JFormattedTextField FTtelCom,FTcnpj,FTinsc,FTcep,FTtelRes,FTtelCel,FTcpf,
            FTrg,FTdata;
    JTextField Tnome,Tbairro,Tcidade,Testado,Trua,Tnum,Tcomp,Temail;
    MaskFormatter MtelCom,Mcnpj,Minsc,Mcep,MtelRes,MtelCel,Mcpf,Mrg,Mdata;
    JTextArea Tbox;
    JScrollPane painelr;
    JPanel painel;
    JButton btnCadastrar;
    ImageIcon icone,icon;

    public App() {//Método construtor
        super("Cadastro de Clientes");  //Construindo a interface
        Container tela = getContentPane();
        setLayout(null);
        msg = new JLabel("Cadastro de Clientes");
        msg.setBounds(5,10,250,20);
        msg.setForeground(new Color(80, 144, 131));
        msg.setFont(new Font("Calibri (Corpo)",Font.BOLD,24));
        Lstat = new JLabel("Status:");
        Lstat.setBounds(80,50,80,20);
        pf = new JRadioButton("Pessoa Física");
        pf.setBounds(120,50,110,20);
        pf.setMnemonic(KeyEvent.VK_J);
        pj = new JRadioButton("Pessoa Juridica");
        pj.setMnemonic(KeyEvent.VK_J);
        pj.setBounds(230,50,120,20);
        icone = new ImageIcon("client.png");
        btnCadastrar = new JButton("Cadastrar",icone);
        btnCadastrar.setBounds(720,425,150,40);
        icon = new ImageIcon("icon.png");

        Lnome = new JLabel("Nome:");
        Lnome.setBounds(80,80,80,20);
        Lbairro = new JLabel("Bairro:");
        Lbairro.setBounds(80,110,80,20);
        Lcidade = new JLabel("Cidade:");
        Lcidade.setBounds(80,140,80,20);
        Lestado = new JLabel("Estado:");
        Lestado.setBounds(80,170,80,20);
        LtelCom = new JLabel("Telefone Comercial:");
        LtelCom.setBounds(5,200,120,20);
        Lcnpj = new JLabel("CNPJ:");
        Lcnpj.setBounds(80,230,80,20);
        Linsc = new JLabel("Inscrição Estadual:");
        Linsc.setBounds(5,260,120,20);
        Lemail = new JLabel("Email:");
        Lemail.setBounds(80,290,80,20);
        Lobs = new JLabel("Observação:");
        Lobs.setBounds(40,400,80,20);
        Lrua = new JLabel("Rua:");
        Lrua.setBounds(680,50,80,20);
        Lnum = new JLabel("Número:");
        Lnum.setBounds(655,80,80,20);
        Lcomp = new JLabel("Complemento:");
        Lcomp.setBounds(620,110,120,20);
        Lcep = new JLabel("Cep:");
        Lcep.setBounds(675,140,80,20);
        LtelRes = new JLabel("Telefone Residencial:");
        LtelRes.setBounds(580,170,200,20);
        LtelCel = new JLabel("Telefone Celular:");
        LtelCel.setBounds(595,200,200,20);
        Lcpf = new JLabel("CPF:");
        Lcpf.setBounds(680,230,200,20);
        Lrg = new JLabel("RG:");
        Lrg.setBounds(680,260,200,20);
        Ldata = new JLabel("Data de Nascimento:");
        Ldata.setBounds(590,290,200,20);
        try{
            MtelCom = new MaskFormatter("(##)####-####");
            Mcnpj = new MaskFormatter("###.###.###/####-##");
            Minsc = new MaskFormatter("###.###.###.###");
            Mcep = new MaskFormatter("######-###");
            MtelRes = new MaskFormatter("(##)####-####");
            MtelCel = new MaskFormatter("(##)#####-####");
            Mcpf = new MaskFormatter("###.###.###-##");
            Mrg = new MaskFormatter("##.###.###-#");
            Mdata = new MaskFormatter("##/##/####");
            
            MtelCom.setPlaceholderCharacter('_');
            Mcnpj.setPlaceholderCharacter('_');
            Minsc.setPlaceholderCharacter('_');
            Mcep.setPlaceholderCharacter('_');
            MtelRes.setPlaceholderCharacter('_');
            MtelCel.setPlaceholderCharacter('_');
            Mcpf.setPlaceholderCharacter('_');
            Mrg.setPlaceholderCharacter('_');
            Mdata.setPlaceholderCharacter('_');
        }
        catch(ParseException excp){}
        Tnome = new JTextField(50);
        Tnome.setBounds(130,80,225,20);
        Tbairro = new JTextField(50);
        Tbairro.setBounds(130,110,200,20);
        Tcidade = new JTextField(50);
        Tcidade.setBounds(130,140,200,20);
        Testado = new JTextField(50);
        Testado.setBounds(130,170,150,20);
        FTtelCom = new JFormattedTextField(MtelCom);
        FTtelCom.setBounds(130,200,90,20);
        FTcnpj = new JFormattedTextField(Mcnpj);
        FTcnpj.setBounds(130,230,125,20);
        FTinsc = new JFormattedTextField(Minsc);
        FTinsc.setBounds(130,260,100,20);
        Temail = new JTextField(50);
        Temail.setBounds(130,290,250,20);
        Trua = new JTextField(50);
        Trua.setBounds(720,50,250,20);
        Tnum = new JTextField(10);
        Tnum.setBounds(720,80,50,20);
        Tcomp = new JTextField(50);
        Tcomp.setBounds(720,110,50,20);
        FTcep = new JFormattedTextField(Mcep);
        FTcep.setBounds(720,140,75,20);
        FTtelRes = new JFormattedTextField(MtelRes);
        FTtelRes.setBounds(720,170,90,20);
        FTtelCel = new JFormattedTextField(MtelCel);
        FTtelCel.setBounds(720,200,95,20);
        FTcpf = new JFormattedTextField(Mcep);
        FTcpf.setBounds(720,230,75,20);
        FTrg = new JFormattedTextField(Mrg);
        FTrg.setBounds(720,260,80,20);
        FTdata = new JFormattedTextField(Mdata);
        FTdata.setBounds(720,290,70,20);
        
        Tbox = new JTextArea(10,20);
        painelr = new JScrollPane(Tbox);
        painelr.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        painelr.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        painel = new JPanel();
        painel.add(painelr);
        painel.setBounds(130,350,250,250);
        
        this.btnCadastrar.addActionListener(
        		new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						JOptionPane.showMessageDialog(null, "Cadastro Realizado com Sucesso!");
						
					}
				}
        	);
               
        tela.add(msg);
        tela.add(Lstat);
        tela.add(pf);
        tela.add(pj);
        tela.add(Lnome);
        tela.add(Lbairro);
        tela.add(Lcidade);
        tela.add(Lestado);
        tela.add(LtelCom);
        tela.add(Lcnpj);
        tela.add(Linsc);
        tela.add(Lemail);
        tela.add(Lobs);
        tela.add(Lrua);
        tela.add(Lnum);
        tela.add(Lcomp);
        tela.add(Lcep);
        tela.add(LtelRes);
        tela.add(LtelCel);
        tela.add(Lcpf);
        tela.add(Lrg);
        tela.add(Ldata);

        tela.add(Tnome);
        tela.add(Tbairro);
        tela.add(Tcidade);
        tela.add(Testado);
        tela.add(FTtelCom);
        tela.add(FTcnpj);
        tela.add(FTinsc);
        tela.add(Temail);
        tela.add(Trua);
        tela.add(Tnum);
        tela.add(Tcomp);
        tela.add(FTcep);
        tela.add(FTtelRes);
        tela.add(FTtelCel);
        tela.add(FTcpf);
        tela.add(FTrg);
        tela.add(FTdata);
        tela.add(btnCadastrar);
        tela.add(painel);
        setIconImage(icon.getImage());
        setSize(1000,600);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    public static void main(String[] args) {
        App app = new App();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
