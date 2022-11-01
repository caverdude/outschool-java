import java.io.*;

/**
 * Primitives are the most basic data structures made from bits and bytes.
 * 
 * The bit (on or off, 0 or 1, true or false)
 * boolean actually its stored as around 1 byte in the JVM, but its JVM
 * dependent.
 * BitSet is a class that stores and handles bits in bit size memory
 * allocations.
 * The Byte (8 bits)
 * byte 1 byte signed whole -128 to 127 byte times 0xff will convert it to 0 to
 * 255
 * short 2 bytes signed whole -32,768 to 32,767
 * int 4 bytes signed whole -2,147,483,648 to 2,147,483,647 (2.1Billion)
 * long 8 bytes signed whole -9,223,372,036,854,775,808 to
 * 9,223,372,036,854,775,807 (9Million-Trillion)
 * float 4 bytes signed real 6-7 significant digits ±3.40282347E+38F
 * double 8 bytes signed real 15 significant digits ±1.79769313486231570E+308
 * Character
 * char 2 bytes whole unsigned 0 to 65535 (for unicode characters) ASCII still
 * fits in first 256 or 0 to 255 space.
 * String a most common object that holds any number of char’s.
 * Reference
 * reference 4 bytes on 32 bit JVM, 8 bytes on 64 bit JVM so 8 bytes for most of
 * us.
 * 
 * 
 */
public class RandomAccessFileAllPrimitives {
    RandomAccessFile raf = null;

    public RandomAccessFileAllPrimitives() {
        boolean bool = false;
        boolean bool2 = true;
        byte aByte = (byte) 125;
        System.out.println("aByte=" + aByte);
        short aShort = (short) 32000;
        System.out.println("aShort=" + aShort);
        int anInt = 2000000;
        System.out.println("aInt=" + anInt);
        long aLong = 9223372036854775806l;
        System.out.println("aLong=" + aLong);
        float aFloat = 2323.25588f;
        double aDouble = 2983.2983298238723;
        char aChar = '3';
        try {

            raf = new RandomAccessFile("primitives.data", "rw");
            raf.seek(0);
            
            raf.writeBoolean(bool);
            raf.writeBoolean(bool2);
            raf.writeByte(aByte);
            raf.writeShort(aShort);
            raf.writeInt(anInt);
            raf.writeLong(aLong);
            raf.writeFloat(aFloat);
            raf.writeDouble(aDouble);
            raf.writeChar(aChar);
            raf.writeChar(aChar);
            raf.writeChar('4');
            raf.writeChar('b');
            
        } catch (Exception e) {
            e.printStackTrace();
        }
       
        

    }

    public static void main(String args[]) {
        new RandomAccessFileAllPrimitives();
    }
}
