import java.io.*;
import java.util.ArrayList;
import java.util.regex.*;

public class FixedWidthReader2 {
    private static String aFileName = "fixedWidthData.csv";
    private static String outFileName = "fixedWidthDataOut.csv";
    private BufferedReader br = null;
    ArrayList<String> lines = new ArrayList<String>();

    private void read() {
        try {
            br = new BufferedReader(new FileReader(aFileName));
            String aLine;

            while ((aLine = br.readLine()) != null) {
                lines.add(aLine);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int headingWidth = 15;

    private static String justify(String aString) {
        int len = aString.length();
        int diff = headingWidth - len;
        String whiteSpace = "";
        for (int i = 0; i < diff; i++) {
            whiteSpace = whiteSpace + " ";
        }
        return aString + whiteSpace;

    }

    private static int row;
    private String tableData[][];
    private int fields = 6;
    private int records = 0;

    public static void main(String[] args) {
        FixedWidthReader2 fwr = new FixedWidthReader2();
        fwr.read();
        fwr.records = fwr.lines.size();
        fwr.fields = 6;
        fwr.tableData = new String[fwr.records][fwr.fields];

        fwr.lines.forEach(line -> {
            fwr.tableData[row][0] = line.substring(0, 12);
            fwr.tableData[row][1] = line.substring(12, 23);
            fwr.tableData[row][2] = line.substring(23, 38);
            fwr.tableData[row][3] = line.substring(38, 50);
            fwr.tableData[row][4] = line.substring(50, 65);
            fwr.tableData[row][5] = line.substring(65, 75);
            row++;
        });

        for (int r = 1; r < fwr.tableData.length; r++) {
            System.out.println("---------- Record #" + r + " ----------------");
            System.out.println("" + justify(fwr.tableData[0][0]) + "---: " + fwr.tableData[r][0]);
            System.out.println("" + justify(fwr.tableData[0][1]) + "---: " + fwr.tableData[r][1]);
            System.out.println("" + justify(fwr.tableData[0][2]) + "---: " + fwr.tableData[r][2]);
            System.out.println("" + justify(fwr.tableData[0][3]) + "---: " + fwr.tableData[r][3]);
            System.out.println("" + justify(fwr.tableData[0][4]) + "---: " + fwr.tableData[r][4]);
        }
        fwr.write();

    }

    public void write() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outFileName))) {
            String line = "";
            for (int r = 0; r < records; r++) {
                line="";
                for (int f = 0; f < fields; f++)
                    line = line + tableData[r][f];
                bw.write(line+"\n");
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}