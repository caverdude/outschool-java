import java.util.regex.*;
import java.io.*;
import java.util.*;
import java.text.*;

public class PropertiesReader2 {
    public class PropertyRecord {
        String name = null;
        String value = null;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");

        public int getInt() {
            return Integer.parseInt(value);
        }

        public void setInt(int anInt) {
            value = "" + anInt;
        }

        public float getFloat() {
            return Float.parseFloat(value);
        }

        public void setFloat(int aFloat) {
            value = "" + aFloat;
        }

        public boolean getBoolean() {
            return Boolean.parseBoolean(value);
        }

        public void setBoolean(boolean aBoolean) {
            value = "" + aBoolean;
        }

        public Date getDate() {
            return new Date(value);
        }

        public void setDate(int date) {
            dateFormat.format(date);
        }

        public String toString() {
            return name + "=" + value;
        }
    }

    private static String aFileName = "properties1.txt";

    public PropertiesReader2() {
        PropertyRecord property = null;
        ArrayList<PropertyRecord> properties = new ArrayList<PropertyRecord>();
        try (BufferedReader br = new BufferedReader(new FileReader(aFileName))) {
            String aLine;
            while ((aLine = br.readLine()) != null) {
                String[] propertyInput = aLine.split(Pattern.quote("="));
                property = new PropertyRecord();
                property.name = propertyInput[0];
                property.value = propertyInput[1];
                properties.add(property);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Iterator<PropertyRecord> propertiesIterator = properties.iterator();
        while (propertiesIterator.hasNext()) {
            System.out.println(propertiesIterator.next().toString());
        }
    }

    public static void main(String[] args) {
        new PropertiesReader2();
    }
}
