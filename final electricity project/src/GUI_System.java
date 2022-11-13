import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class GUI_System {
    connection c;
    private JPanel MainPanel;
    private JButton addUserButton;
    private JButton dispalyAllUsersButton;
    private JButton searchForUserButton;
    private JButton searchForUserButton1;
    private JButton addCurrentReadButton;
    private JButton deleteUserButton;
    private JButton paymentButton;
    private JButton exitButton;
    private JPanel everycard;
    private JPanel f1;
    private JPanel f2;
    private JPanel f3;
    private JPanel f4;
    private JPanel f5;
    private JPanel f6;
    private JPanel f7;
    private JPanel f8;
    private JTextField fname;
    private JTextField mname;
    private JTextField lname;
    private JTextField phone;
    private JTextField address;
    private JButton addButton;
    private JTextArea textArea1;
    private JButton editingUserButton;
    private JTextArea searchDisplayTextArea;
    private JTextField id;
    private JButton button1;
    private JTextField ID;
    private JButton editMname;
    private JTextField Fname;
    private JTextField Mname;
    private JTextField Lname;
    private JTextField Phone;
    private JTextField Address;
    private JTextField user_id;
    private JButton deleteButton;
    private JTextArea textArea2;
    private JTextField C_id;
    private JTextField CurrenT_read;
    private JTextField month;
    private JButton addCurrentReadButton1;
    private JTextField Id;
    private JTextField Money;
    private JButton button3;
    private JTextArea textArea3;
    private JButton editLname;
    private JButton editfname;
    private JButton editAddress;
    private JButton editPhone;

    public GUI_System() throws FileNotFoundException {
        c=new connection();
        addUserButton.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                everycard.removeAll();
                everycard.add(f1);
                everycard.repaint();
                everycard.revalidate();
            }
        });
        dispalyAllUsersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                everycard.removeAll();
                everycard.add(f2);
                everycard.repaint();
                everycard.revalidate();
               String head="FirstName "+"\t"+"Midlename"+"\t"+"Lastname"+"\t"+"Phone"+"\t"+"Address"+"\t"+" Id"+"\t"+ "Month"+"\t"+ "KiloPrice"+"\t"+ "Current_read"+"\t"+"Previous_read Debt\n";
                ArrayList<user>alluser=new ArrayList<>();
                alluser.addAll(c.display());
                for (user s:alluser
                     ) {
                    if(s!=null){
                       head=head+s.display_forgrapgic();

                    }
                    textArea1.setText(head);


                }
            }
        });
        searchForUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                everycard.removeAll();
                everycard.add(f3);
                everycard.repaint();
                everycard.revalidate();
            }
        });

        editingUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                everycard.removeAll();
                everycard.add(f4);
                everycard.repaint();
                everycard.revalidate();


            }
        });

        addCurrentReadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                everycard.removeAll();
                everycard.add(f5);
                everycard.repaint();
                everycard.revalidate();
            }
        });
        deleteUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                everycard.removeAll();
                everycard.add(f6);
                everycard.repaint();
                everycard.revalidate();
            }
        });
        paymentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                everycard.removeAll();
                everycard.add(f7);
                everycard.repaint();
                everycard.revalidate();
            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                everycard.removeAll();
                everycard.add(f8);
                everycard.repaint();
                everycard.revalidate();
                try {
                    c.Write_to_file();
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
                System.exit(0);
            }
        });
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Firstname=fname.getText();
                String Mname=mname.getText();
                String Lname=lname.getText();
                Long pho=Long.parseLong(phone.getText());
                String ad=address.getText();
                boolean added=c.add(Firstname,Mname,Lname,pho,ad);
                if(added)
                {


                    JOptionPane.showMessageDialog(null,"added successfully");
                }else JOptionPane.showMessageDialog(null,"something went wrong");
                fname.setText("");
                mname.setText("");
                lname.setText("");
                phone.setText("");
                address.setText("");


            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ID=Integer.parseInt(id.getText());
                String head="FirstName "+"\t"+"Midlename"+"\t"+"Lastname"+"\t"+"Phone"+"\t"+"Address"+"\t"+" Id"+"\t"+ "Month"+"\t"+ "KiloPrice"+"\t"+ "Current_read"+"\t"+"Previous_read Debt\n";
                user d=c.search(ID);
                if(d!=null){

                  head=head+d.display_forgrapgic();
                   searchDisplayTextArea.setText(head);
                }
                else {
                    searchDisplayTextArea.setText("");
                    JOptionPane.showMessageDialog(null, "sorry something went wrong");

                }
id.setText("");


            }


        });
        editfname.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int id = Integer.parseInt(ID.getText());
                String Firstname = Fname.getText();
                boolean a;
                a = c.editName(id, Firstname);
                 if (a ) {
                    JOptionPane.showMessageDialog(null, "change successfully");
                } else JOptionPane.showMessageDialog(null, "nothing change");
                Fname.setText("");
                ID.setText("");
            }
        });
        editMname.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(ID.getText());
                String mname = Mname.getText();
                boolean a;

                a = c.editMame(id, mname);
                if (a ) {
                    JOptionPane.showMessageDialog(null, "change successfully");
                } else JOptionPane.showMessageDialog(null, "nothing change");
                Mname.setText("");
            }});
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               textArea2.setText("");
                int ID=Integer.parseInt(user_id.getText());
                int num=c.delete(ID);
                if(num==1)
                    textArea2.setText("done successfully");
                else if (num==2) textArea2.setText("you still have to pay money");
                    else textArea2.setText("sorry some thing is wrong or may e the id is wrong");

                }




        });
        addCurrentReadButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id=Integer.parseInt(C_id.getText());
                int read=Integer.parseInt(CurrenT_read.getText());
                //month
                int mon=Integer.parseInt(month.getText());
                user d=c.search(id);
                if (d!=null){

                    if (c.setting_current_read(read,id,mon))
                    {   JOptionPane.showMessageDialog(null,"done sucessfully");
                    }
                    else
                        JOptionPane.showMessageDialog(null,"sorry something is wrong!");


                }
                else JOptionPane.showMessageDialog(null,"sorry something is wrong!");
                C_id.setText("");
                CurrenT_read.setText("");
                month.setText("");

            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id=Integer.parseInt(Id.getText());
                double money=Double.parseDouble(Money.getText());
             user u =c.search(id);
                if (u!=null)
                {int num= c.pay(id,money);
                 textArea3.setText("your bill is:"+u.p.getDept()+"\n");
                if (money>0)
                {
                    if(num==1)
                    {
                        textArea3.setText("you fully paid your bill\n");
                    }
                    else if (num==2) {

                        textArea3.setText("your debt is:"+u.p.getDept()+"you didn't fully paid your bill please pay it soon or our service will be cut\n");
                    }
                    else textArea3.setText("we can't accept more than you have to pay\n");

                }else
                textArea3.setText("the money input is wrong\n");
            }


        }
        });

        editLname.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(ID.getText());
                String lname = Lname.getText();
                boolean a;

                a = c.editLame(id, lname);
                if (a ) {
                    JOptionPane.showMessageDialog(null, "change successfully");
                } else JOptionPane.showMessageDialog(null, "nothing change");
                Lname.setText("");
            }
        });
        editPhone.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(ID.getText());
                long phone= Long.parseLong(Phone.getText());
                boolean a;

                a = c.editPhone(id, phone);
                if (a) {
                    JOptionPane.showMessageDialog(null, "change successfully");
                } else JOptionPane.showMessageDialog(null, "nothing change");
                Phone.setText("");

            }
        });
        editAddress.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(ID.getText());
                String address= Address.getText();
                boolean a;

                a = c.editAddress(id, address);
                if (a) {
                    JOptionPane.showMessageDialog(null, "change successfully");
                } else JOptionPane.showMessageDialog(null, "nothing change");
                Address.setText("");

            }
        });
    }

    public static void main(String[] args) throws FileNotFoundException {
        JFrame frame = new JFrame("GUI_System");
        frame.setContentPane(new GUI_System().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // frame.pack();
        frame.setSize(1000,1000);
        frame.setVisible(true);
    }
}
