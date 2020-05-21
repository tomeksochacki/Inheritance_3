package com.inheritance.instruments;

public class InheritanceExampleTwo {
    public static void main(String[] args) {

        Piano piano1 = new Piano(VolumeIstr.LOUD, SizeIstr.BIG,true);
        System.out.println(piano1);
        System.out.println(piano1.repaired);
        piano1.getCanPlay();
        piano1.playIstr();
        piano1.stopPlayIstr();

        System.out.println();
        Piano piano2 = new Piano(VolumeIstr.QUIET, SizeIstr.MEDIUM, false);
        System.out.println(piano2);
        piano1.getCanPlay();

        System.out.println();
        Piano piano3 = new Piano(VolumeIstr.LOUD, SizeIstr.SMALL, true);
        System.out.println(piano3);

    }
}
