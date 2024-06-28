/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.login;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Pass {
    private Pattern pattern;
    private Matcher matcher;
    
    private static final String PASSWORD_REGEX =
                      "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";

    public Pass()
    {
        pattern = Pattern.compile(PASSWORD_REGEX);
    }

    /**
     * Validate password with regular expression
     *
     * @param password  password for validation
     * @return true valid password, false invalid password
     */
    public boolean validate(final String password)
    {
        matcher = pattern.matcher(password);
        return matcher.matches();
    }

}
