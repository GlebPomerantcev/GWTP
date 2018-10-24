package com.mydomain.myproject.client.security;

//import com.mydomain.myproject.client.shared.dto.CurrentUserDto;
//import com.mydomain.myproject.client.shared.dto.UserDto;

public class CurrentUser {
    private Boolean loggedIn;
//    private UserDto userDto;

    public CurrentUser() {
        loggedIn = false;
    }
//
//    public void fromCurrentUserDto(CurrentUserDto currentUserDto) {
//        setLoggedIn(currentUserDto.isLoggedIn());
//        setUser(currentUserDto.getUser());
//    }

//    public void reset() {
//        setLoggedIn(false);
//        setUser(null);
//    }

    public Boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(Boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

//    public UserDto getUser() {
//        return userDto;
//    }
//
//    public void setUser(UserDto userDto) {
//        this.userDto = userDto;
//    }
}