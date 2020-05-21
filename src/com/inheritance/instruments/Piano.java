package com.inheritance.instruments;

public class Piano extends AbstractInstruments{

    public boolean repaired = true;

    public Piano(VolumeIstr volumeIstr, SizeIstr sizeIstr, boolean repaired){
        super(sizeIstr, volumeIstr);
        this.repaired = repaired;
    }

    public boolean getCanPlay(){
        if (repaired = true){
            System.out.println("This piano can play.");
        }
        return repaired;
    }

    public SizeIstr getSizeIstr(){
        return sizeIstr;
    }

    public void setSizeIstr(SizeIstr sizeIstr){
        this.sizeIstr = sizeIstr;
    }

    public VolumeIstr getVolumeIstr(){
        return volumeIstr;
    }

    public void setVolumeIstr(VolumeIstr volumeIstr){
        this.volumeIstr = volumeIstr;
    }

    public boolean playIstr(){
        if (repaired = true);
        System.out.println("This piano play.");
        return true;
    }

    public boolean stopPlayIstr(){
        if(repaired = false){}
        System.out.println("This piano stop play.");
        return true;

    }

    public String toString(){
        return "Piano size is = " + sizeIstr + ", volume = " + volumeIstr + ", repaired = " + repaired;
    }




}
