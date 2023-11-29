package friendsContact;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

import javax.swing.*;

public class VentanaPrincipal extends JFrame implements ActionListener {
    
    private Container contenedor;
    private JLabel name, number;
    private JTextField field_name, field_number;
    private JButton clear, exit, create, read, update, delete;
 
    public VentanaPrincipal(){
        inicio();

        setTitle("friendsContact"); 
        setSize(500,260); 
        setLocationRelativeTo(null); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false); 

    }

    private void inicio() {
        contenedor = getContentPane(); 
        contenedor.setLayout(null); 
        name = new JLabel();
        name.setText("Name:");
        name.setBounds(20, 20, 135, 30); 

        field_name = new JTextField();
        field_name.setBounds(105, 20, 300, 30);
    
        number = new JLabel();
        number.setText("Number:");
        number.setBounds(20, 60, 135, 30); 

        field_number = new JTextField();  
        field_number.setBounds(105, 60, 300, 30);

        clear = new JButton();
        clear.setText("clear");
        clear.setBounds(140, 170, 100, 30); 
        clear.addActionListener(this);

        exit = new JButton();
        exit.setText("exit");
        exit.setBounds(250, 170, 100, 30); 
        exit.addActionListener(this);

        create = new JButton();
        create.setText("create");
        create.setBounds(30, 120, 100, 30); 
        create.addActionListener(this);
        
        read = new JButton();
        read.setText("read");
        read.setBounds(140, 120, 100, 30); 
        read.addActionListener(this);

        update = new JButton();
        update.setText("update");
        update.setBounds(250, 120, 100, 30); 
        update.addActionListener(this);

        delete = new JButton();
        delete.setText("delete");
        delete.setBounds(360, 120, 100, 30); 
        delete.addActionListener(this);

        contenedor.add(name);
        contenedor.add(field_name);

        contenedor.add(number);
        contenedor.add(field_number);

        contenedor.add(create);
        contenedor.add(read);
        contenedor.add(update);
        contenedor.add(delete);
        contenedor.add(exit);
        contenedor.add(clear);


    }

    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == create) {

                try {
    
                // Get the name of the contact to be updated
                // from the Command line argument
                String newName = String.valueOf(field_name.getText());
    
                // Get the number to be updated
                // from the Command line argument
                long newNumber = Long.parseLong(field_number.getText());
    
                String nameNumberString;
                String name;
                long number;
                int index;
    
                // Using file pointer creating the file.
                File file = new File("C:\\Users\\lacar\\OneDrive\\Desktop\\friendsContact.txt");
    
                if (!file.exists()) {
    
                    // Create a new file if not exists.
                    file.createNewFile();
                }
    
                // Opening file in reading and write mode.
    
                RandomAccessFile raf = new RandomAccessFile(file, "rw");
                boolean found = false;
    
                // Checking whether the name
                // of contact already exists.
                // getFilePointer() give the current offset
                // value from start of the file.
                while (raf.getFilePointer() < raf.length()) {
    
                    // reading line from the file.
                    nameNumberString = raf.readLine();
    
                    // splitting the string to get name and
                    // number
                    String[] lineSplit
                        = nameNumberString.split("!");
    
                    // separating name and number.
                    name = lineSplit[0];
                    number = Long.parseLong(lineSplit[1]);
    
                    // if condition to find existence of record.
                    if (name.equals(newName) || number == newNumber) {
                        found = true;
                        break;
                    }
                }
    
                if (found == false) {
    
                    // Enter the if block when a record
                    // is not already present in the file.
                    nameNumberString = newName + "!" + String.valueOf(newNumber);
    
                    // writeBytes function to write a string
                    // as a sequence of bytes.
                    raf.writeBytes(nameNumberString);
    
                    // To insert the next record in new line.
                    raf.writeBytes(System.lineSeparator());
    
                    // Print the message
                    JOptionPane.showMessageDialog(null,(" Friend added. "));
    
                    // Closing the resources.
                    raf.close();
                }
                // The contact to be updated
                // could not be found
                else {
    
                    // Closing the resources.
                    raf.close();
    
                    // Print the message
                    JOptionPane.showMessageDialog(null, (" Input name " + newName + " already exists. "));
                }
            }
    
            catch (IOException ioe) {
    
                System.out.println(ioe);
            }
            catch (NumberFormatException nef) {
    
                System.out.println(nef);
            }
        }  

        if (evento.getSource() == read) {

            try {
    
                // Get the name of the contact to be updated
                // from the Command line argument
                String newName = String.valueOf(field_name.getText());
    
                String nameNumberString;
                String name;
                long number;
                int index;
    
                // Using file pointer creating the file.
                File file = new File("C:\\Users\\lacar\\OneDrive\\Desktop\\friendsContact.txt");
    
                if (!file.exists()) {
    
                    // Create a new file if not exists.
                    file.createNewFile();
                }
    
                // Opening file in reading and write mode.
    
                RandomAccessFile raf = new RandomAccessFile(file, "rw");
                boolean found = false;
    
                // Checking whether the name
                // of contact already exists.
                // getFilePointer() give the current offset
                // value from start of the file.
                while (raf.getFilePointer() < raf.length()) {
    
                    // reading line from the file.
                    nameNumberString = raf.readLine();
    
                    // splitting the string to get name and
                    // number
                    String[] lineSplit
                        = nameNumberString.split("!");
    
                    // separating name and number.
                    name = lineSplit[0];
                    number = Long.parseLong(lineSplit[1]);
    
                    // if condition to find existence of record.
                    if (name.equals(newName)) {
                        found = true;
                        field_name.setText(String.valueOf(name));
                        field_number.setText(String.valueOf(number));

                        break;
                    }
                }
    
                if (found == false) {
    
                    JOptionPane.showMessageDialog(null, (" Input name " + newName + " does not exists. "));
                    // Closing the resources.
                    raf.close();
                }

            }
    
            catch (IOException ioe) {
    
                System.out.println(ioe);
            }
            catch (NumberFormatException nef) {
    
                System.out.println(nef);
            }
        }

        if (evento.getSource() == update) {
            
            try {

                // Get the name of the contact to be updated
                // from the Command line argument
                String newName = String.valueOf(field_name.getText());
    
                // Get the number to be updated
                // from the Command line argument
                long newNumber = Long.parseLong(field_number.getText());
    
                String nameNumberString;
                String name;
                long number;
                int index;
    
                // Using file pointer creating the file.
                File file = new File("C:\\Users\\lacar\\OneDrive\\Desktop\\friendsContact.txt");
    
                if (!file.exists()) {
    
                    // Create a new file if not exists.
                    file.createNewFile();
                }
    
                // Opening file in reading and write mode.
                RandomAccessFile raf
                    = new RandomAccessFile(file, "rw");
                boolean found = false;
    
                // Checking whether the name
                // of contact already exists.
                // getFilePointer() give the current offset
                // value from start of the file.
                while (raf.getFilePointer() < raf.length()) {
    
                    // reading line from the file.
                    nameNumberString = raf.readLine();
    
                    // splitting the string to get name and
                    // number
                    String[] lineSplit
                        = nameNumberString.split("!");
    
                    // separating name and number.
                    name = lineSplit[0];
                    number = Long.parseLong(lineSplit[1]);
    
                    // if condition to find existence of record.
                    if (name.equals(newName) == true || number == newNumber) {
                        found = true;
                        break;
                    }
                }
    
                // Update the contact if record exists.
                if (found == true) {
    
                    // Creating a temporary file
                    // with file pointer as tmpFile.
                    File tmpFile = new File("C:\\Users\\lacar\\OneDrive\\Desktop\\temp.txt");
    
                    // Opening this temporary file
                    // in ReadWrite Mode
                    RandomAccessFile tmpraf
                        = new RandomAccessFile(tmpFile, "rw");
    
                    // Set file pointer to start
                    raf.seek(0);
    
                    // Traversing the friendsContact.txt file
                    while (raf.getFilePointer() < raf.length()) {
    
                        // Reading the contact from the file
                        nameNumberString = raf.readLine();
    
                        index = nameNumberString.indexOf('!');
                        name = nameNumberString.substring(0, index);
    
                        // Check if the fetched contact
                        // is the one to be updated
                        if (name.equals(newName)) {
    
                            // Update the number of this contact
                            nameNumberString= name + "!" + String.valueOf(newNumber);
                        }
    
                        // Add this contact in the temporary
                        // file
                        tmpraf.writeBytes(nameNumberString);
    
                        // Add the line separator in the
                        // temporary file
                        tmpraf.writeBytes(
                            System.lineSeparator());
                    }
    
                    // The contact has been updated now
                    // So copy the updated content from
                    // the temporary file to original file.
    
                    // Set both files pointers to start
                    raf.seek(0);
                    tmpraf.seek(0);
    
                    // Copy the contents from
                    // the temporary file to original file.
                    while (tmpraf.getFilePointer()
                        < tmpraf.length()) {
                        raf.writeBytes(tmpraf.readLine());
                        raf.writeBytes(System.lineSeparator());
                    }
    
                    // Set the length of the original file
                    // to that of temporary.
                    raf.setLength(tmpraf.length());
    
                    // Closing the resources.
                    tmpraf.close();
                    raf.close();
    
                    // Deleting the temporary file
                    tmpFile.delete();
    
                    JOptionPane.showMessageDialog(null,(" The friend's number of " + newName + " was updated. "));
                }
    
                // The contact to be updated
                // could not be found
                else {
    
                    // Closing the resources.
                    raf.close();
    
                    // Print the message
                    JOptionPane.showMessageDialog(null, (" Input name " + newName + " does not exist. "));
                }
            }
    
            catch (IOException ioe) {
                System.out.println(ioe);
            }
    
            catch (NumberFormatException nef) {
                System.out.println(nef);
            }
        }

        if (evento.getSource() == delete) {

            try {

                // Get the name of the contact to be updated
                // from the Command line argument
                String newName = String.valueOf(field_name.getText());
    
                String nameNumberString;
                String name;
                long number;
                int index;
    
                // Using file pointer creating the file.
                File file = new File("C:\\Users\\lacar\\OneDrive\\Desktop\\friendsContact.txt");
    
                if (!file.exists()) {
    
                    // Create a new file if not exists.
                    file.createNewFile();
                }
    
                // Opening file in reading and write mode.
                RandomAccessFile raf
                    = new RandomAccessFile(file, "rw");
                boolean found = false;
    
                // Checking whether the name of contact exists.
                // getFilePointer() give the current offset
                // value from start of the file.
                while (raf.getFilePointer() < raf.length()) {
    
                    // reading line from the file.
                    nameNumberString = raf.readLine();
    
                    // splitting the string to get name and
                    // number
                    String[] lineSplit
                        = nameNumberString.split("!");
    
                    // separating name and number.
                    name = lineSplit[0];
                    number = Long.parseLong(lineSplit[1]);
    
                    // if condition to find existence of record.
                    if (name.equals(newName) == true) {
                        found = true;
                        break;
                    }
                }
    
                // Delete the contact if record exists.
                if (found == true) {
    
                    // Creating a temporary file
                    // with file pointer as tmpFile.
                    File tmpFile = new File("C:\\Users\\lacar\\OneDrive\\Desktop\\temp.txt");
    
                    // Opening this temporary file
                    // in ReadWrite Mode
                    RandomAccessFile tmpraf = new RandomAccessFile(tmpFile, "rw");
    
                    // Set file pointer to start
                    raf.seek(0);
    
                    // Traversing the friendsContact.txt file
                    while (raf.getFilePointer() < raf.length()) {
    
                        // Reading the contact from the file
                        nameNumberString = raf.readLine();
    
                        index = nameNumberString.indexOf('!');
                        name = nameNumberString.substring(0, index);
    
                        // Check if the fetched contact
                        // is the one to be deleted
                        if (name.equals(newName)) {
    
                            // Skip inserting this contact
                            // into the temporary file
                            continue;
                        }
    
                        // Add this contact in the temporary
                        // file
                        tmpraf.writeBytes(nameNumberString);
    
                        // Add the line separator in the
                        // temporary file
                        tmpraf.writeBytes(
                            System.lineSeparator());
                    }
    
                    // The contact has been deleted now
                    // So copy the updated content from
                    // the temporary file to original file.
    
                    // Set both files pointers to start
                    raf.seek(0);
                    tmpraf.seek(0);
    
                    // Copy the contents from
                    // the temporary file to original file.
                    while (tmpraf.getFilePointer() < tmpraf.length()) {
                        raf.writeBytes(tmpraf.readLine());
                        raf.writeBytes(System.lineSeparator());
                    }
    
                    // Set the length of the original file
                    // to that of temporary.
                    raf.setLength(tmpraf.length());
    
                    // Closing the resources.
                    tmpraf.close();
                    raf.close();
    
                    // Deleting the temporary file
                    tmpFile.delete();
    
                    JOptionPane.showMessageDialog(null, (" Friend deleted. "));
                }
    
                // The contact to be deleted
                // could not be found
                else {
    
                    // Closing the resources.
                    raf.close();
    
                    // Print the message
                    JOptionPane.showMessageDialog(null,(" Input name " + newName + " does not exist. "));
                }
            }
    
            catch (IOException ioe) {
                System.out.println(ioe);
            }
        }
 
        if (evento.getSource() == clear) {

            field_name.setText("");
            field_number.setText("");

        }

        if (evento.getSource() == exit) { 

            System.exit(0);

        }
    }
}