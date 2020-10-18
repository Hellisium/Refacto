
/** ***************************************************
 * File:  HardwareStore.java
 *
 *    This program reads a random access file sequentially,
 *    updates data already written to the file, creates new
 *    data to be placed in the file, and deletes data
 *    already in the file.
 *
 *
 * Copyright (c) 2002-2003 Advanced Applications Total Applications Works.
 * (AATAW)  All Rights Reserved.
 *
 * AATAW grants you ("Licensee") a non-exclusive, royalty free, license to use,
 * modify and redistribute this software in source and binary code form,
 * provided that i) this copyright notice and license appear on all copies of
 * the software; and ii) Licensee does not utilize the software in a manner
 * which is disparaging to AATAW.
 *
 * This software is provided "AS IS," without a warranty of any kind. ALL
 * EXPRESS OR IMPLIED CONDITIONS, REPRESENTATIONS AND WARRANTIES, INCLUDING ANY
 * IMPLIED WARRANTY OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE OR
 * NON-INFRINGEMENT, ARE HEREBY EXCLUDED. AATAW AND ITS LICENSORS SHALL NOT BE
 * LIABLE FOR ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING
 * OR DISTRIBUTING THE SOFTWARE OR ITS DERIVATIVES. IN NO EVENT WILL AATAW OR ITS
 * LICENSORS BE LIABLE FOR ANY LOST REVENUE, PROFIT OR DATA, OR FOR DIRECT,
 * INDIRECT, SPECIAL, CONSEQUENTIAL, INCIDENTAL OR PUNITIVE DAMAGES, HOWEVER
 * CAUSED AND REGARDLESS OF THE THEORY OF LIABILITY, ARISING OUT OF THE USE OF
 * OR INABILITY TO USE SOFTWARE, EVEN IF SUN HAS BEEN ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGES.
 *
 * This software is not designed or intended for use in on-line control of
 * aircraft, air traffic, aircraft navigation or aircraft communications; or in
 * the design, construction, operation or maintenance of any nuclear
 * facility. Licensee represents and warrants that it will not use or
 * redistribute the Software for such purposes.
 */

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.lang.Runtime;
import java.util.Arrays;

/**
 *
 * <p>
 * Title: HardwareStore
 * </p>
 * <p>
 * Description: The HardwareStore application is a program that is used to
 * display hardware items and it allows these items to be created, updated,
 * and/or deleted.
 * </p>
 * <p>
 * Copyright: Copyright (c)
 * </p>
 * <p>
 * Company: TAW
 * </p>
 * 
 * @author unascribed
 * @version 2.0
 */
public class HardwareStore extends JFrame implements ActionListener {

   private static final long serialVersionUID = -2695421633289198640L;
   /** dialog box for password checking */
   private PassWord pWord;
   /** dialog box listing all records */
   private UpdateRec update;
   /** dialog box for record update */
   private NewRec newRec;
   /** dialog box for new record */
   private DeleteRec deleteRec;
   /** dialog box for delete record */
   private Record data;
   private String pData[][] = new String[250][7];
   private JMenuBar menuBar;
   private JMenu fileMenu, viewMenu, optionsMenu, toolsMenu, helpMenu, aboutMenu;
   /** File Menu Items */
   private JMenuItem eMI;
   /** View Menu Items */
   private JMenuItem lmMI, lmtMI, hdMI, dpMI, hamMI, csMI, tabMI, bandMI, sandMI, stapMI, wdvMI, sccMI;
   /** Options Menu Items */
   private JMenuItem deleteMI, addMI, updateMI, listAllMI;
   /** Tools Menu Items */
   private JMenuItem debugON, debugOFF;
   /** Help Menu Items */
   private JMenuItem helpHWMI;
   /** About Menu Items */
   private JMenuItem aboutHWMI;
   private MenuHandler menuHandler = new MenuHandler();
   private JTable table;
   private RandomAccessFile file;
   /** file from which data is read */
   private File aFile;
   private JButton cancel, refresh;
   private JPanel buttonPanel;
   protected boolean validPW = false;
   private boolean myDebug = false;
   /** This flag toggles debug */
   HardwareStore hws;

   private String columnNames[] = Data.getColumnNames();

   private String lawnMower[][] = Data.getLawnMower();

   private String lawnTractor[][] = Data.getLawnTractor();

   private String handDrill[][] = Data.getHandDrill();

   private String drillPress[][] = Data.getDrillPress();

   private String hammer[][] = Data.getHammer();

   private String bandSaw[][] = Data.getBandSaw();

   private String sanders[][] = Data.getSanders();

   private String stapler[][] = Data.getStapler();

   private String circularSaw[][] = Data.getCircularSaw();

   private String tableSaw[][] = Data.getTableSaw();

   private Container c;
   private int numEntries = 0;

   /**
    * ******************************************************** Method:
    * HardwareStore() constructor initializes the 1- Menu bar 2- Tables 3- Buttons
    * used to construct the HardwareStore GUI.
    ************************************************************/
   public HardwareStore() {
      super("Hardware Store: Lawn Mower ");

      data = new Record();
      aFile = new File("lawnmower.dat");
      c = getContentPane();

      setupMenu();

      InitRecord("lawnmower.dat", lawnMower, 27);

      InitRecord("lawnTractor.dat", lawnTractor, 11);

      InitRecord("handDrill.dat", handDrill, 15);

      InitRecord("drillPress.dat", drillPress, 10);

      InitRecord("circularSaw.dat", circularSaw, 12);

      InitRecord("hammer.dat", hammer, 12);

      InitRecord("tableSaw.dat", tableSaw, 15);

      InitRecord("bandSaw.dat", bandSaw, 10);

      InitRecord("sanders.dat", sanders, 15);

      InitRecord("stapler.dat", stapler, 15);

      setup();

      addWindowListener(new WindowHandler(this));
      setSize(700, 400);
      setVisible(true);
   }

   /**
    * ******************************************************** Method: main() is
    * the entry point that Java call on the start of this program.
    ********************************************************/
   public static void main(String args[]) {
      HardwareStore hwstore = new HardwareStore();
      hwstore.hws = hwstore;
   }

   /**
    * ************************************************************ setupMenu() is
    * called from the HardwareStore() constructor setupMenu() is used to create the
    * 1- Menu Bar 2- Menu Items
    ********************************************************/
   public void setupMenu() {
      menuBar = new JMenuBar();

      setJMenuBar(menuBar);

      fileMenu = new JMenu("File");
      menuBar.add(fileMenu);

      eMI = new JMenuItem("Exit");
      fileMenu.add(eMI);
      eMI.addActionListener(menuHandler);

      viewMenu = new JMenu("View");

      for (String menuItem : Data.getMenuItems()) {
         lmMI = new JMenuItem(menuItem);
         viewMenu.add(lmMI);
         lmMI.addActionListener(menuHandler);
      }

      menuBar.add(viewMenu);

      optionsMenu = new JMenu("Options");

      listAllMI = new JMenuItem("List All");
      optionsMenu.add(listAllMI);
      listAllMI.addActionListener(menuHandler);
      optionsMenu.addSeparator();

      addMI = new JMenuItem("Add");
      optionsMenu.add(addMI);
      addMI.addActionListener(menuHandler);

      updateMI = new JMenuItem("Update");
      optionsMenu.add(updateMI);
      updateMI.addActionListener(menuHandler);
      optionsMenu.addSeparator();

      deleteMI = new JMenuItem("Delete");
      optionsMenu.add(deleteMI);
      deleteMI.addActionListener(menuHandler);

      menuBar.add(optionsMenu);

      toolsMenu = new JMenu("Tools");
      menuBar.add(toolsMenu);
      debugON = new JMenuItem("Debug On");
      debugOFF = new JMenuItem("Debug Off");
      toolsMenu.add(debugON);
      toolsMenu.add(debugOFF);
      debugON.addActionListener(menuHandler);
      debugOFF.addActionListener(menuHandler);

      helpMenu = new JMenu("Help");

      helpHWMI = new JMenuItem("Help on HW Store");
      helpMenu.add(helpHWMI);
      helpHWMI.addActionListener(menuHandler);

      menuBar.add(helpMenu);

      aboutMenu = new JMenu("About");

      aboutHWMI = new JMenuItem("About HW Store");
      aboutMenu.add(aboutHWMI);
      aboutHWMI.addActionListener(menuHandler);

      menuBar.add(aboutMenu);
   }

   /**
    * ******************************************************** Method: setup() is
    * used to 1- Open the lawnmower.dat file 2- Call the getFileEntries() method to
    * popualte the JTable with the contents of the lawnmower.dat file.
    *
    * Called by the HardwareStore() constructor
    ********************************************************/
   public void setup() {
      data = new Record();

      try {
         /**
          * Divide the length of the file by the record size to determine the number of
          * records in the file
          */

         file = new RandomAccessFile("lawnmower.dat", "rw");

         aFile = new File("lawnmower.dat");

         numEntries = getFileEntries(file, pData);

         file.close();
      } catch (IOException ex) {
         // part.setText( "Error reading file" );
      }

      /**
       * **************************************************************** pData
       * contains the data to be loaded into the JTable. columnNames contains the
       * column names for the table. 1- Create a new JTable. 2- Add a mouse listener
       * to the table. 3- Make the table cells editable. 4- Add the table to the
       * Frame's center using the Border Layout Manager. 5- Add a scrollpane to the
       * table.
       *****************************************************************/
      table = new JTable(pData, columnNames);
      table.addMouseListener(new MouseClickedHandler(file, table, pData));
      table.setEnabled(true);

      c.add(table, BorderLayout.CENTER);
      c.add(new JScrollPane(table));
      /** Make the Frame visiable */
      cancel = new JButton("Cancel");
      refresh = new JButton("Refresh");
      buttonPanel = new JPanel();
      // buttonPanel.add( refresh ) ;
      buttonPanel.add(cancel);
      c.add(buttonPanel, BorderLayout.SOUTH);

      refresh.addActionListener(this);
      cancel.addActionListener(this);

      /** Create dialog boxes */
      update = new UpdateRec(hws, file, pData, -1);
      deleteRec = new DeleteRec(hws, file, table, pData);
      /**
       * Allocate pWord last; otherwise the update, newRec and deleteRec references
       * will be null when the PassWrod class attempts to use them.
       */
      pWord = new PassWord(this);
   }

   /**
    * **************************************************************** Method;
    * InitRecord() is used to create and initialize the tables used by the Hardware
    * Store application. The parameters passed are: 1- String fileDat: is the name
    * of the file to be created and initialized. 2- String FileRecord[][]: is the
    * two dimensional array that contains the initial data. 3- int loopCtl: is the
    * number of entries in the array.
    *
    * Called by the HardwareStore() constructor
    ******************************************************************/
   public void InitRecord(String fileDat, String FileRecord[][], int loopCtl) {

      aFile = new File(fileDat);

      try {
         /**
          * Open the fileDat file in RW mode. If the file does not exist, create it and
          * initialize it to 250 empty records.
          */

         if (!aFile.exists()) {

            file = new RandomAccessFile(aFile, "rw");
            data = new Record();

            for (int Yaxis = 0; Yaxis < loopCtl; Yaxis++) {
               data.setRecID(Integer.parseInt(FileRecord[Yaxis][0]));
               data.setToolType(FileRecord[Yaxis][1]);
               data.setBrandName(FileRecord[Yaxis][2]);
               data.setToolDesc(FileRecord[Yaxis][3]);
               data.setPartNumber(FileRecord[Yaxis][4]);
               data.setQuantity(Integer.parseInt(FileRecord[Yaxis][5]));
               data.setCost(FileRecord[Yaxis][6]);

               file.seek(Yaxis * Record.getSize());
               data.write(file);

            }
         } else {
            file = new RandomAccessFile(aFile, "rw");
         }

         file.close();
      } catch (IOException e) {
         System.exit(1);
      }
   }

   /**
    * ************************************************************* Method:
    * display() is used to display the contents of the specified table in the
    * passed parameter. This method uses the passed parameter to determine 1- Which
    * table to display 2- Whether the table exists 3- If it exists, the table is
    * opened and its contents are displayed in a JTable.
    *
    * Called from the actionPerformed() method of the MenuHandler class
    *********************************************************************/
   public void display(String str) {

      String df = null, title = null;

      if (Arrays.asList(Data.getTableName()).contains(str)) {
         final String uniformName = str.replaceAll("\\s", "").toLowerCase();
         df = new String(uniformName + ".dat");
         aFile = new File(uniformName + ".dat");
         title = new String("Hardware Store: " + str);
      }

      try {
         /**
          * Open the .dat file in RW mode. If the file does not exist, create it and
          * initialize it to 250 empty records.
          */

         sysPrint("display(): 1a - checking to see if " + df + " exists.");
         if (!aFile.exists()) {

            sysPrint("display(): 1b - " + df + " does not exist.");

         } else {
            file = new RandomAccessFile(df, "rw");

            this.setTitle(title);

            Redisplay(file, pData);
         }

         file.close();
      } catch (IOException e) {
         System.exit(1);
      }

   }

   /**
    * ******************************************************** Method: Redisplay()
    * is used to redisplay/repopualte the JTable.
    *
    * Called from the 1- display() method 2- actionPerformed() method of the
    * UpdateRec class 3- actionPerformed() method of the DeleteRec class
    ********************************************************/
   public void Redisplay(RandomAccessFile file, String a[][]) {

      for (int Yaxis = 0; Yaxis < getEntries() + 5; Yaxis++) {
         for (int Xaxis = 0; Xaxis < 7; Xaxis++) {
            a[Yaxis][Xaxis] = "";
         }
      }
      int entries = getFileEntries(file, a);
      sysPrint("Redisplay(): 1  - The number of entries is " + entries);
      setEntries(entries);
      c.remove(table);
      table = new JTable(a, columnNames);
      table.setEnabled(true);
      c.add(table, BorderLayout.CENTER);
      c.add(new JScrollPane(table));
      c.validate();
   }

   /**
    * ******************************************************************* Method:
    * actionPerformed() - This is the event handler that responds to the the cancel
    * button on the main frame.
    *
    *********************************************************************/
   public void actionPerformed(ActionEvent e) {

      if (e.getSource() == refresh) {
         sysPrint("\nThe Refresh button was pressed. ");
         Container cc = getContentPane();

         table = new JTable(pData, columnNames);
         cc.validate();
      } else if (e.getSource() == cancel)
         cleanup();
   }

   /**
    * **************************************************************** Method:
    * cleanup() -This is the cleanup method that is used to close the hardware.dat
    * file and exit the application.
    *
    * Called from the actionPerformed() method
    *********************************************************************/
   public void cleanup() {
      try {
         file.close();
      } catch (IOException e) {
         System.exit(1);
      }

      setVisible(false);
      System.exit(0);
   }

   /**
    * *************************************************************** Method:
    * displayDeleteDialog()
    *
    * Called from the actionPerformed() method of the PassWord class
    ******************************************************************/
   public void displayDeleteDialog() {
      deleteRec.setVisible(true);
   }

   /**
    * ******************************************************** Method:
    * displayUpdateDialog()
    *
    * Called from the actionPerformed() method of the PassWord class
    ******************************************************************/
   public void displayUpdateDialog() {
      sysPrint("The Update Record Dialog was made visible.\n");
      JOptionPane.showMessageDialog(null, "Enter the record ID to be updated and press enter.", "Update Record",
            JOptionPane.INFORMATION_MESSAGE);
      update = new UpdateRec(hws, file, pData, -1);
      update.setVisible(true);
   }

   /**
    * ******************************************************** Method:
    * displayAddDialog()
    *
    * Called from the actionPerformed() method of the PassWord class
    ******************************************************************/
   public void displayAddDialog() {
      sysPrint("The New/Add Record Dialog was made visible.\n");
      newRec = new NewRec(hws, file, table, pData);
      newRec.setVisible(true);
   }

   /**
    * ******************************************************** Method: setEntries()
    * is called to set the number of current entries in the pData array.
    ********************************************************/
   public void setEntries(int ent) {
      numEntries = ent;
   }

   /**
    * ******************************************************** Method: getPData()
    * returns a specific row and column
    *
    * This method is no longer used
    ********************************************************/
   public String getPData(int ii, int iii) {
      return pData[ii][iii];
   }

   /**
    * ******************************************************** Method: getEntries()
    * returns the number of current entries in the pData array.
    *
    * Called from 1- actionPerformed() method of the NewRec class 2-
    * actionPerformed() method of the DeleteRec class
    ********************************************************/
   public int getEntries() {
      return numEntries;
   }

   /**
    * ******************************************************** Method: sysPrint()
    * is a debugging aid that is used to print information to the screen.
    ********************************************************/
   public void sysPrint(String str) {
      if (myDebug) {
         System.out.println(str);
      }
   }

   /**
    * **************************************************************** Method:
    * getFileEntries(RandomAccessFile lFile, String a[][])
    *
    * Purpose: Returns an array containing all of the elements in this list in the
    * correct order.
    *
    * Called from the 1- Setup method of the HardwareStore class 2- Redisplay()
    * method
    */
   public int getFileEntries(RandomAccessFile file, String data[][]) {

      Record NodeRef = new Record();
      int actualSize = 0, Yaxis = 0, fileSize = 0;

      try {
         fileSize = (int) file.length() / Record.getSize();
         sysPrint("getFileEntries(): 1 - The size of the file is " + fileSize);
         /** If the file is empty, do nothing. */
         if (fileSize > 0) {

            /**
             * *************************************
             *
             * ***************************************
             */

            NodeRef.setFileLen(file.length());

            while (actualSize < fileSize) {

               file.seek(0);
               file.seek(actualSize * Record.getSize());
               NodeRef.setFilePos(actualSize * Record.getSize());
               NodeRef.ReadRec(file);

               if (NodeRef.getRecID() != -1) {
                  data[Yaxis][0] = String.valueOf(NodeRef.getRecID());
                  data[Yaxis][1] = NodeRef.getToolType().trim();
                  data[Yaxis][2] = NodeRef.getBrandName().trim();
                  data[Yaxis][3] = NodeRef.getToolDesc().trim();
                  data[Yaxis][4] = NodeRef.getPartNumber().trim();
                  data[Yaxis][5] = String.valueOf(NodeRef.getQuantity());
                  data[Yaxis][6] = NodeRef.getCost().trim();

                  Yaxis++;

               }

               actualSize++;

            }
         }
      } catch (IOException ex) {
         // ToDo log error input data file failure. Index is " + ii + "\nFilesize is "
         // + fileSize
      }

      return actualSize;

   }

   /**
    * *************************************************************************
    *
    * <p>
    * class PassWord
    * </p>
    * <p>
    * Description:
    * </p>
    * <p>
    * Copyright: Copyright (c)
    * </p>
    * <p>
    * Company: TSSD
    * </p>
    * 
    * @author Ronald S. Holland
    * @version 1.0
    ****************************************************************************/

   public class PassWord extends Dialog implements ActionListener {

      private static final long serialVersionUID = -1014463549957274277L;
      private JButton cancel, enter;
      private JTextField userID;
      private JLabel userIDLabel, passwordLabel;
      private JPasswordField password;
      private JPanel buttonPanel, mainPanel;
      private HardwareStore hwStore;
      private String whichDialog;

      /**
       * ******************************************************** Method: PassWord()
       * constructor is used to create the Password dialoog's 1- Labels 2- Text fields
       * 3- Buttons 4- Panels
       ********************************************************/
      public PassWord(HardwareStore hw_Store) {
         super(new Frame(), "Password Check", true);

         hwStore = hw_Store;

         /** Create the Enter and Cancel Buttons */
         enter = new JButton("Enter");
         cancel = new JButton("Cancel");

         /** Create the buttonPanel and the mainPanel */
         buttonPanel = new JPanel();
         mainPanel = new JPanel();

         /** declare the GridLayout manager for the mainPanel */
         mainPanel.setLayout(new GridLayout(3, 2));
         add(mainPanel, BorderLayout.CENTER);

         /** Create the text fields */
         userID = new JTextField(10);
         password = new JPasswordField(10);

         /** Create the labels */
         userIDLabel = new JLabel("Enter your user ID");
         passwordLabel = new JLabel("Enter your user password");

         /** add the labels and text fields to the main panel */
         mainPanel.add(userIDLabel);
         mainPanel.add(userID);
         mainPanel.add(passwordLabel);
         mainPanel.add(password);

         /** add the buttons to the button panel */
         buttonPanel.add(enter);
         buttonPanel.add(cancel);
         add(buttonPanel, BorderLayout.SOUTH);

         /** add the actionlisteners to the buttons */
         enter.addActionListener(this);
         cancel.addActionListener(this);

         setSize(400, 300);

      }

      /**
       * ************************************************************** Method:
       * displayDialog () is used to display the dialog that checks the userID and
       * password that allows the user to add, update, delete hardware items for the
       * various tables.
       ****************************************************************/
      public void displayDialog(String which_Dialog) {
         whichDialog = which_Dialog;

         /**
          * set userid and password In a real application, the following two lines are
          * not used. The dialog interrogates the user for an authorized userID and
          * password. This information is preset in this case for convenience.
          */
         userID.setText("admin");
         password.setText("hwstore");
      }
   }

   /**
    * *************************************************************************
    *
    * <p>
    * class PassWord
    * </p>
    * <p>
    * Description:
    * </p>
    * <p>
    * Copyright: Copyright (c)
    * </p>
    * <p>
    * Company: TSSD
    * </p>
    * 
    * @author Ronald S. Holland
    * @version 1.0
    ****************************************************************************/
   public class PassWord extends Dialog implements ActionListener {

      private static final long serialVersionUID = -1014463549957274277L;
      private JButton cancel, enter;
      private JTextField userID;
      private JLabel userIDLabel, passwordLabel;
      private JPasswordField password;
      private JPanel buttonPanel, mainPanel;
      private HardwareStore hwStore;
      private String whichDialog;

      /**
       * ******************************************************** Method: PassWord()
       * constructor is used to create the Password dialoog's 1- Labels 2- Text fields
       * 3- Buttons 4- Panels
       ********************************************************/
      public PassWord(HardwareStore hw_Store) {
         super(new Frame(), "Password Check", true);

         hwStore = hw_Store;

         /** Create the Enter and Cancel Buttons */
         enter = new JButton("Enter");
         cancel = new JButton("Cancel");

         /** Create the buttonPanel and the mainPanel */
         buttonPanel = new JPanel();
         mainPanel = new JPanel();

         /** declare the GridLayout manager for the mainPanel */
         mainPanel.setLayout(new GridLayout(3, 2));
         add(mainPanel, BorderLayout.CENTER);

         /** Create the text fields */
         userID = new JTextField(10);
         password = new JPasswordField(10);

         /** Create the labels */
         userIDLabel = new JLabel("Enter your user ID");
         passwordLabel = new JLabel("Enter your user password");

         /** add the labels and text fields to the main panel */
         mainPanel.add(userIDLabel);
         mainPanel.add(userID);
         mainPanel.add(passwordLabel);
         mainPanel.add(password);

         /** add the buttons to the button panel */
         buttonPanel.add(enter);
         buttonPanel.add(cancel);
         add(buttonPanel, BorderLayout.SOUTH);

         /** add the actionlisteners to the buttons */
         enter.addActionListener(this);
         cancel.addActionListener(this);

         setSize(400, 300);

      }

      /**
       * ************************************************************** Method:
       * displayDialog () is used to display the dialog that checks the userID and
       * password that allows the user to add, update, delete hardware items for the
       * various tables.
       ****************************************************************/
      public void displayDialog(String which_Dialog) {
         whichDialog = which_Dialog;

         /**
          * set userid and password In a real application, the following two lines are
          * not used. The dialog interrogates the user for an authorized userID and
          * password. This information is preset in this case for convenience.
          */
         userID.setText("admin");
         password.setText("hwstore");

         setVisible(true);
      }

      /**
       * ****************************************************************** Method:
       * actionPerformed() method responds to the enter or cancel button being pressed
       * on the Password dialog.
       *********************************************************************/
      public void actionPerformed(ActionEvent e) {

         if (e.getSource() == enter) {

            String pwd = new String(password.getPassword());
            String uID = new String(userID.getText());

            if ((uID.equals("admin")) && (pwd.equals("hwstore"))) {
               if (whichDialog == "delete") {
                  hwStore.displayDeleteDialog();
                  whichDialog = "closed";
                  userID.setText("");
                  password.setText("");
                  clear();
               } else if (whichDialog == "update") {
                  hwStore.displayUpdateDialog();
                  whichDialog = "closed";
                  userID.setText("");
                  password.setText("");
                  clear();
               } else if (whichDialog == "add") {
                  hwStore.displayAddDialog();
                  whichDialog = "closed";
                  userID.setText("");
                  password.setText("");
                  clear();
               }
            } else {
               JOptionPane.showMessageDialog(null, "A userid or the password was incorrect.\n", "Invalid Password",
                     JOptionPane.INFORMATION_MESSAGE);
               userID.setText("");
               password.setText("");
            }
         }

         clear();
      }

      private void clear() {
         setVisible(false);
         return;
      }

   }

   public class MouseClickedHandler extends MouseAdapter {
      JTable table;
      String pData[][], columnNames[];
      RandomAccessFile f;

      MouseClickedHandler(RandomAccessFile fPassed, JTable tablePassed, String p_Data[][]) {
         table = tablePassed;
         pData = p_Data;
         f = fPassed;

      }

      public void mouseClicked(MouseEvent e) {
         if (e.getSource() == table) {
            int ii = table.getSelectedRow();
            JOptionPane.showMessageDialog(null, "Enter the record ID to be updated and press enter.", "Update Record",
                  JOptionPane.INFORMATION_MESSAGE);
            UpdateRec update = new UpdateRec(hws, f, pData, ii);
            if (ii < 250) {
               update.setVisible(true);
               table.repaint();
            }
         }
      }
   }

   public class UpdateRec extends Dialog implements ActionListener {

      private static final long serialVersionUID = -6297039488136728876L;
      private RandomAccessFile file;
      private JTextField recID, toolType, brandName, toolDesc, partNum, quantity, price;
      private JLabel recIDLabel, toolTypeLabel, brandNameLabel, toolDescLabel, partNumLabel, quantityLabel, priceLabel;
      private JButton cancel, save;
      private Record data;
      private int theRecID, toCont;
      private String pData[][];
      private HardwareStore hwstore;

      public UpdateRec(HardwareStore hw_store, RandomAccessFile f, String p_Data[][], int iiPassed) {

         super(new Frame(), "Update Record", true);
         setSize(400, 280);
         setLayout(new GridLayout(9, 2));
         file = f;
         pData = p_Data;
         hwstore = hw_store;

         upDSetup();
      }

      /**
       * ******************************************************** Method: upDSetup()
       * is used to create the labels, text fields, and buttons for the UpDate Dialog.
       ********************************************************/
      public void upDSetup() {

         /** create the text fields */
         recID = new JTextField(10);
         toolType = new JTextField(10);
         brandName = new JTextField(10);
         toolDesc = new JTextField(10);
         partNum = new JTextField(10);
         quantity = new JTextField(10);
         price = new JTextField(10);

         /** create the labels */
         recIDLabel = new JLabel("Record ID");
         toolTypeLabel = new JLabel("Type of Tool");
         brandNameLabel = new JLabel("Brand Name");
         toolDescLabel = new JLabel("Tool Description");
         partNumLabel = new JLabel("Part Number");
         quantityLabel = new JLabel("Quantity");
         priceLabel = new JLabel("Price");

         /** create the buttons */
         save = new JButton("Save Changes");
         cancel = new JButton("Cancel");

         /** attach the ActionListener */
         recID.addActionListener(this);
         save.addActionListener(this);
         cancel.addActionListener(this);

         /**
          * Add the labels and text fields to the GridLayout manager context
          */
         add(recIDLabel);
         add(recID);
         add(toolTypeLabel);
         add(toolType);
         add(brandNameLabel);
         add(brandName);
         add(toolDescLabel);
         add(toolDesc);
         add(partNumLabel);
         add(partNum);
         add(quantityLabel);
         add(quantity);
         add(priceLabel);
         add(price);
         add(save);
         add(cancel);

         data = new Record();
      }

      /**
       * **************************************************** Method: checkDigit() is
       * used to ensure that the data entered is a digit
       *****************************************************/
      public boolean checkDigit(String strVal) {

         int strLength = 0;
         boolean notDig = true;

         strLength = strVal.length();

         for (int ii = 0; ii < strLength; ii++) {
            if (!Character.isDigit(strVal.charAt(ii))) {
               notDig = false;
               break;
            }
         }

         return notDig;
      }

      /**
       * ************************************************************* Method:
       * actionPerformed() is the event handler that reesponds to the GUI events
       * generated by the UpDate dialog.
       **************************************************************/
      public void actionPerformed(ActionEvent e) {
         if (e.getSource() == recID) {
            if (checkDigit(recID.getText())) {
               theRecID = Integer.parseInt(recID.getText());
            } else if (theRecID < 0 || theRecID > 250) {
               JOptionPane.showMessageDialog(null,
                     "A recID entered was:  less than 0 or greater than 250, which is invalid.\n"
                           + "Please enter a number greater than 0 and less than 251.",
                     "RecID Entered", JOptionPane.INFORMATION_MESSAGE);
               return;
            }

            theRecID = Integer.parseInt(recID.getText());

            for (int iii = 0; iii < pData.length; iii++) {
               if (pData[iii][0] != null) {
                  if (Integer.parseInt(pData[iii][0]) == theRecID) {
                     theRecID = Integer.parseInt(pData[iii][0]);
                     break;
                  }
               }
            }

            try {

               file = new RandomAccessFile(hwstore.aFile, "rw");
               file.seek((theRecID) * Record.getSize());
               data.ReadRec(file);

               recID.setText("" + theRecID);
               toolType.setText(data.getToolType().trim());
               brandName.setText(data.getBrandName().trim());
               toolDesc.setText(data.getToolDesc().trim());
               partNum.setText(data.getPartNumber().trim());
               quantity.setText(Integer.toString(data.getQuantity()));
               price.setText(data.getCost().trim());
            } catch (IOException ex) {
               recID.setText("UpdateRec(): 2d -  Error reading file");
            }

            if (data.getRecID() >= 0) {
               /*
                * recID.setText( String.valueOf( data.getRecID() ) ); toolType.setText(
                * data.getToolType().trim() ); brandName.setText( data.getBrandName().trim() )
                * ; toolDesc.setText( data.getToolDesc().trim() ) ; partNum.setText(
                * data.getPartNumber().trim() ) ; quantity.setText( Integer.toString(
                * data.getQuantity() ) ); price.setText( data.getCost().trim() );
                */
            } else
               recID.setText("This record " + theRecID + " does not exist");
         } else if (e.getSource() == save) {
            try {
               data.setRecID(Integer.parseInt(recID.getText()));
               data.setToolType(toolType.getText().trim());
               data.setBrandName(brandName.getText().trim());
               data.setToolDesc(toolDesc.getText().trim());
               data.setPartNumber(partNum.getText().trim());
               data.setQuantity(Integer.parseInt(quantity.getText().trim()));
               data.setCost(price.getText().trim());

               file.seek(0);
               file.seek(theRecID * Record.getSize());
               data.write(file);

               Redisplay(file, pData);
            } catch (IOException ex) {
               recID.setText("Error writing file");
               return;
            }

            toCont = JOptionPane.showConfirmDialog(null, "Do you want to add another record? \nChoose one",
                  "Choose one", JOptionPane.YES_NO_OPTION);

            if (toCont == JOptionPane.YES_OPTION) {
               recID.setText("");
               toolType.setText("");
               quantity.setText("");
               brandName.setText("");
               toolDesc.setText("");
               partNum.setText("");
               price.setText("");
            } else {
               upClear();
            }
         } else if (e.getSource() == cancel) {
            setVisible(false);
            upClear();
         }
      }

      private void upClear() {
         recID.setText("");
         brandName.setText("");
         quantity.setText("");
         price.setText("");
         setVisible(false);
      }
   }

   /**
    * ******************************************************** class NewRec is used
    * to gather and insert data for new hardware item records.
    ********************************************************/
   public class NewRec extends Dialog implements ActionListener {

      private static final long serialVersionUID = -762409770038796514L;
      private RandomAccessFile file;
      private JTextField recID, toolType, brandName, toolDesc, partNum, quantity, price;
      private JLabel recIDLabel, toolTypeLabel, brandNameLabel, toolDescLabel, partNumLabel, quantityLabel, priceLabel;
      private JButton cancel, save;
      private Record data;
      private int theRecID, toCont, fileLen;
      private JTable table;
      private String pData[][];
      private String columnNames[] = { "Record ID", "Type of tool", "Brand Name", "Tool Description", "partNum",
            "Quantity", "Price" };
      private HardwareStore hwStore;

      /**
       * ******************************************************** Method: NewRec() is
       * the constructor that is used to initialized/create the 1- Labels 2-
       * Textfields 3- buttons for this class.
       ********************************************************/
      public NewRec(HardwareStore hw_store, RandomAccessFile f, JTable tab, String p_Data[][]) {

         super(new Frame(), "New Record", true);

         file = f;
         table = tab;
         pData = p_Data;
         hwStore = hw_store;

         newSetup();
      }

      /**
       * ******************************************************** Method: setup() does
       * the actual label, textfield, button setup and declares the layout manager
       * that is used. It 1- sets the size of the dialog 2- creates the text fields 3-
       * creates the labels 4- creates the buttons 5- adds the fields, labels, and
       * buttons to the dialog context.
       ********************************************************/
      public void newSetup() {
         setSize(400, 250);
         setLayout(new GridLayout(9, 2));

         recID = new JTextField(10);
         recID.setEnabled(false);
         try {
            file = new RandomAccessFile(hwStore.aFile, "rw");
            file.seek(0);
            fileLen = (int) file.length() / Record.getSize();
            recID.setText("" + fileLen);
         } catch (IOException ex) {
            partNum.setText("Error reading file");
         }
         toolType = new JTextField(10);
         brandName = new JTextField(10);
         toolDesc = new JTextField(10);
         partNum = new JTextField(10);
         quantity = new JTextField(10);
         price = new JTextField(10);
         recIDLabel = new JLabel("Record ID");
         toolTypeLabel = new JLabel("Type of Tool");
         brandNameLabel = new JLabel("Brand Name");
         toolDescLabel = new JLabel("Tool Description");
         partNumLabel = new JLabel("Part Number");
         quantityLabel = new JLabel("Quantity");
         priceLabel = new JLabel("Price");
         save = new JButton("Save Changes");
         cancel = new JButton("Cancel");

         recID.addActionListener(this);
         save.addActionListener(this);
         cancel.addActionListener(this);

         add(recIDLabel);
         add(recID);
         add(toolTypeLabel);
         add(toolType);
         add(brandNameLabel);
         add(brandName);
         add(toolDescLabel);
         add(toolDesc);
         add(partNumLabel);
         add(partNum);
         add(quantityLabel);
         add(quantity);
         add(priceLabel);
         add(price);
         add(save);
         add(cancel);

         data = new Record();
         JOptionPane.showMessageDialog(null, "The recID field is currently set to the next record ID.\n"
               + "Please just fill in the " + "remaining fields.", "RecID To Be Entered",
               JOptionPane.INFORMATION_MESSAGE);

      }

      /**
       * ************************************************************ Method:
       * actionPerformed() is the event handler that reesponds to the GUI events
       * generated by the NewRecord dialog.
       ***************************************************************/
      public void actionPerformed(ActionEvent e) {
         try {
            file = new RandomAccessFile(hwStore.aFile, "rw");
            file.seek(0);
            fileLen = (int) file.length() / Record.getSize();
            recID.setText("" + fileLen);
         } catch (IOException ex) {
            partNum.setText("Error reading file");
         }

         if (e.getSource() == recID) {
            recID.setEnabled(false);
         } else if (e.getSource() == save) {
            if (recID.getText().equals("")) {
               /*
                * JOptionPane.showMessageDialog(null,
                * "A recID entered was:  null or blank, which is invalid.\n" +
                * "Please enter a number greater than 0 and less than 251.", "RecID Entered",
                * JOptionPane.INFORMATION_MESSAGE) ; return ;
                */
            } else {
               try {
                  data.setRecID(Integer.parseInt(recID.getText()));
                  data.setToolType(toolType.getText().trim());
                  data.setBrandName(brandName.getText().trim());
                  data.setToolDesc(toolDesc.getText().trim());
                  data.setPartNumber(partNum.getText().trim());
                  data.setQuantity(Integer.parseInt(quantity.getText()));
                  data.setCost(price.getText().trim());
                  file.seek(0);
                  file.seek((data.getRecID()) * Record.getSize());
                  data.write(file);

                  // Account for index starting at 0 and for the next slot
                  theRecID = hwStore.getEntries();
                  hwStore.sysPrint("NewRec 1: The numbers of entries is " + (theRecID - 1));

                  hwStore.sysPrint("NewRec 2: A new record is being added at " + theRecID);
                  pData[theRecID][0] = Integer.toString(data.getRecID());
                  pData[theRecID][1] = data.getToolType().trim();
                  pData[theRecID][2] = data.getBrandName().trim();
                  pData[theRecID][3] = data.getToolDesc().trim();
                  pData[theRecID][4] = data.getPartNumber().trim();
                  pData[theRecID][5] = Integer.toString(data.getQuantity());
                  pData[theRecID][6] = data.getCost().trim();
                  table = new JTable(pData, columnNames);
                  table.repaint();
                  hwStore.setEntries(hwStore.getEntries() + 1);
               } catch (IOException ex) {
                  partNum.setText("Error writing file");
                  return;
               }
            }

            toCont = JOptionPane.showConfirmDialog(null, "Do you want to add another record? \nChoose one",
                  "Choose one", JOptionPane.YES_NO_OPTION);

            if (toCont == JOptionPane.YES_OPTION) {
               recID.setText("");
               toolType.setText("");
               quantity.setText("");
               brandName.setText("");
               toolDesc.setText("");
               partNum.setText("");
               price.setText("");
            } else {
               newClear();
            }
         } else if (e.getSource() == cancel) {
            newClear();
         }
      }

      /**
       * ******************************************************** Method: newClear()
       * is used to cleanup and exit the NewRecord dialog.
       ********************************************************/
      private void newClear() {
         partNum.setText("");
         toolType.setText("");
         quantity.setText("");
         price.setText("");
         setVisible(false);
      }
   }
};