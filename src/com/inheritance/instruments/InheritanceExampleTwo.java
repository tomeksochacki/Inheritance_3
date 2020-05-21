package com.inheritance.instruments;

public class InheritanceExampleTwo {
    public static void main(String[] args) {

        Piano piano1 = new Piano(VolumeIstr.LOUD, SizeIstr.BIG,true);
        System.out.println(piano1);
        System.out.println(piano1.repaired);
        piano1.getCanPlay();
        piano1.playIstr();
        piano1.stopPlayIstr();

        

    }
}
