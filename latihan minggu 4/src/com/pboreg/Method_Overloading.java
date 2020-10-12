package com.pboreg;

public class Method_Overloading {
    static  int myMethod(int x, int y){
        return x + y;
    }
    static double myMethod(double x, double y){
        return x + y;
    }
    static String myMethod (String x, String y){
        String hasil = x + " " + y;
        return hasil;
    }
    static String myMethod (String x, int y){
        String hasil = "Nama" + x + ", umur" + y + "tahun";
        return hasil;
    }
  public static void main (String[] args){
        String myNum3 = myMethod("irhamsyah", "ramadhan");
        int myNum1 = myMethod(8, 10);
        double myNum2 = myMethod(4.3, 6.26);
        String myNum4 = myMethod(" irham", 19);
        System.out.println("int:"+myNum1);
        System.out.println("double:"+ myNum2);
      System.out.println("Nilai Int : " + myNum1);
      System.out.println("Nilai Double : " + myNum2);
      System.out.println("Nilai String : " + myNum3);
      System.out.println("Keterangan : " + myNum4);
  }
}
