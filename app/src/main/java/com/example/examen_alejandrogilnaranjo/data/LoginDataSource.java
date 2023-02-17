package com.example.examen_alejandrogilnaranjo.data;

import android.content.Intent;
import android.widget.Toast;

import com.example.examen_alejandrogilnaranjo.Welcome_activity;
import com.example.examen_alejandrogilnaranjo.data.model.LoggedInUser;
import com.example.examen_alejandrogilnaranjo.ui.login.LoginActivity;

import java.io.IOException;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
public class LoginDataSource {

    public Result<LoggedInUser> login(String username, String password) {

        try {
            // TODO: handle loggedInUser authentication
            LoggedInUser fakeUser =
                    new LoggedInUser(
                            java.util.UUID.randomUUID().toString(),
                            " Alejandro Gil Naranjo");

            return new Result.Success<>(fakeUser);

        } catch (Exception e) {
            return new Result.Error(new IOException("Error logging in", e));
        }
    }

    public void logout() {
        // TODO: revoke authentication
    }
}