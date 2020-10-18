import java.awt.event.*;

public class MenuHandler implements ActionListener {
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == eMI) {
            /** The Exit menu Item was selected. */
            cleanup();
        } else if (e.getSource() == lmMI) {

            display("Lawn Mowers");
        } else if (e.getSource() == lmtMI) {

            display("Lawn Tractor Mowers");
        } else if (e.getSource() == hdMI) {

            display("Hand Drill Tools");
        } else if (e.getSource() == dpMI) {

            display("Drill Press Power Tools");
        } else if (e.getSource() == csMI) {

            display("Circular Saws");
        } else if (e.getSource() == hamMI) {

            display("Hammers");
        } else if (e.getSource() == tabMI) {

            display("Table Saws");
        } else if (e.getSource() == bandMI) {

            display("Band Saws");
        } else if (e.getSource() == sandMI) {

            display("Sanders");
        } else if (e.getSource() == stapMI) {

            display("Staplers");
        } else if (e.getSource() == wdvMI) {
            // sysPrint("The Wet-Dry Vacs menu Item was selected.\n");
            // ListRecs BPTRecs = new ListRecs( hws , "WDV", "Wet-Dry Vacs" );
        } else if (e.getSource() == sccMI) {
            // sysPrint("The Storage, Chests & Cabinets menu Item was selected.\n");
            // ListRecs BPTRecs = new ListRecs( hws , "SCC", "Storage, Chests & Cabinets" );
        } else if (e.getSource() == deleteMI) {
            // sysPrint("The Delete Record Dialog was made visible.\n");
            // DeleteRec( HardwareStore hw_store, RandomAccessFile f,
            // JTable tab, String p_Data[] [] )
            deleteRec = new DeleteRec(hws, file, table, pData);
            deleteRec.setVisible(true);
        } else if (e.getSource() == addMI) {
            pWord.displayDialog("add");
        } else if (e.getSource() == updateMI) {
            update = new UpdateRec(hws, file, pData, -1);
            update.setVisible(true);
        } else if (e.getSource() == listAllMI) {
            // listRecs.setVisible( true );
        } else if (e.getSource() == debugON) {
            myDebug = true;
        } else if (e.getSource() == debugOFF) {
            myDebug = false;
        } else if (e.getSource() == helpHWMI) {
            File hd = new File("HW_Tutorial.html");

            Runtime rt = Runtime.getRuntime();
            // String[] callAndArgs = { "d:\\Program Files\\netscape\\netscape\\Netscp.exe"
            // ,
            String[] callAndArgs = { "c:\\Program Files\\Internet Explorer\\IEXPLORE.exe", "" + hd.getAbsolutePath() };

            try {

                Process child = rt.exec(callAndArgs);
                child.waitFor();
                sysPrint("Process exit code is: " + child.exitValue());
            } catch (IOException e2) {
                sysPrint("IOException starting process!");
            } catch (InterruptedException e3) {
            }
        } else if (e.getSource() == aboutHWMI) {
            sysPrint("The About menu Item was selected.\n");
            Runtime rt = Runtime.getRuntime();
            String[] callAndArgs = { "c:\\Program Files\\Internet Explorer\\IEXPLORE.exe",
                    "http://www.sumtotalz.com/TotalAppsWorks/ProgrammingResource.html" };
            try {
                Process child = rt.exec(callAndArgs);
                child.waitFor();
                sysPrint("Process exit code is: " + child.exitValue());
            } catch (IOException e2) {
            } catch (InterruptedException e3) {
            }
        }
    }
}
