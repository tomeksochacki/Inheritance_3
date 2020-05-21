package com.inheritance.instruments;

public abstract class AbstractInstruments {

    public SizeIstr sizeIstr;
    public VolumeIstr volumeIstr;

    public AbstractInstruments(SizeIstr sizeIstr, VolumeIstr volumeIstr){
        this.sizeIstr = sizeIstr;
        this.volumeIstr = volumeIstr;
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

    public abstract boolean playIstr();
    public abstract boolean stopPlayIstr();

}
