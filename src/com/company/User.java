package com.company;


//violating interface segregation
public interface User extends Playlist {
    String userType();
}
