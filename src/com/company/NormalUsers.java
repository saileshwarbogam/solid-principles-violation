package com.company;


public class NormalUsers implements User{
    //violating dependency inversion due to high coupling
    Advertisements ads;
    @Override
    public int getVideosCount() {
        return 0;
    }
    @Override
    public void addVideos(String videoName) {
    }
    @Override
    public void showVideos() {
    }
    @Override
    public String userType() {
        return null;
    }
    public NormalUsers(Advertisements ad){
        this.ads = ad;
        System.out.println(ads.getAd());
    }
}