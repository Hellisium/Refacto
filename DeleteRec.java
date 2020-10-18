import java.awt.event.*;
import java.lang.Runtime;

/**
    * *************************************************************** Class:
    * DeleteRec is used to create the Delete Record dialog, which in turn, is used
    * to to delete records from the specified table(s).
    ******************************************************************/
public class DeleteRec extends Dialog implements ActionListener {

    private static final long serialVersionUID = 1625262050597034514L;
    private RandomAccessFile file;
    private JTextField recID;
    private JLabel recIDLabel;
    private JButton cancel, delete;
    private Record data;
    private int theRecID = -1, toCont;
    private String pData[][];
    private HardwareStore hwStore;

    public DeleteRec(HardwareStore hw_store, RandomAccessFile f, JTable tab, String p_Data[][]) {

       super(new Frame(), "Delete Record", true);
       setSize(400, 150);
       setLayout(new GridLayout(2, 2));
       file = f;
       table = tab;
       pData = p_Data;
       hwStore = hw_store;
       delSetup();
    }

    /**
     * ******************************************************** Method: delSetup()
     * is used to create 1- Label Record text field 3- The Record ID button 4- The
     * Cancel button
     ********************************************************/
    public void delSetup() {
       recIDLabel = new JLabel("Record ID");
       recID = new JTextField(10);
       delete = new JButton("Delete Record");
       cancel = new JButton("Cancel");

       cancel.addActionListener(this);
       delete.addActionListener(this);
       recID.addActionListener(this);

       add(recIDLabel);
       add(recID);
       add(delete);
       add(cancel);

       data = new Record();
    }

    /**
     * ******************************************************** Method:
     * actionPerformed() is used to respond to the event emanating from the Delete
     * Record dialog. They are: 1- Pressing the enter key with the cursor in the
     * record ID text field. 2- Pressing the Delete button. 3- Pressing the Cancel
     * button.
     ********************************************************/
    public void actionPerformed(ActionEvent e) {
       if (e.getSource() == recID) {
          theRecID = Integer.parseInt(recID.getText());

          if (theRecID < 0 || theRecID > 250) {
             recID.setText("Invalid part number");
             // return;
          } else {

             try {
                file = new RandomAccessFile(hwStore.aFile, "rw");

                file.seek(theRecID * Record.getSize());
                data.ReadRec(file);
             } catch (IOException ex) {
                recID.setText("Error reading file");
             }

             // if ( data.getRecID() == 0 )
             // recID.setText( partNum + " does not exist" );
          }
       } else if (e.getSource() == delete) {
          theRecID = Integer.parseInt(recID.getText());

          for (int iii = 0; iii < pData.length; iii++) {
             if ((pData[iii][0]).equals("" + theRecID)) {
                theRecID = Integer.parseInt(pData[iii][0]);
                break;
             }
          }

          try {

             file = new RandomAccessFile(hwStore.aFile, "rw");
             data.setRecID(theRecID);

             hwStore.setEntries(hwStore.getEntries() - 1);
             file.seek((0));
             file.seek((theRecID) * Record.getSize());
             data.ReadRec(file);
             data.setRecID(-1);
             file.seek((0));
             file.seek((theRecID) * Record.getSize());
             data.writeInteger(file, -1);

             file.close();
          } catch (IOException ex) {
             recID.setText("Error writing file");
             return;
          }

          toCont = JOptionPane.showConfirmDialog(null, "Do you want to delete another record? \nChoose one",
                "Select Yes or No", JOptionPane.YES_NO_OPTION);

          if (toCont == JOptionPane.YES_OPTION) {
             recID.setText("");
          } else {
             delClear();
          }
       } else if (e.getSource() == cancel) {
          delClear();
       }
    }

    /**
     * ******************************************************** Method: delClear()
     * is used to close the delete record dialog.
     ********************************************************/
    private void delClear() {
       try {
          file = new RandomAccessFile(hwStore.aFile, "rw");

          Redisplay(file, pData);
          file.close();
       } catch (IOException ex) {
          recID.setText("Error writing file");
          return;
       }
       setVisible(false);
       recID.setText("");
    }
 }
 
}
