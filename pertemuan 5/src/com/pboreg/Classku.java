package com.pboreg;

public class Classku  {
    //Atribut
    public int x = 5;//atribut ini tdk boleh diakses secara langsung dari luar classku
    int y = 15;//atribut ini dpt diakses scra lgsg diluar classku dalaam 1 package
    private int z = 20;//atribut ini tidak boleh diakses secara langsung dr luar classku

    //method
    public int tampilkanz(){
        return this.z;
    }
}
