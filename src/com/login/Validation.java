
package com.login;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    public static boolean email_validation(String email){
        boolean status=false;
        
        String email_pattern= "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,}$";
        
        Pattern pattern = Pattern.compile(email_pattern);
        Matcher matcher =pattern.matcher(email);
        
        if(matcher.matches()){
            status = true;
        }
        else{
            status = false;
        }
        return status;
    }
    
    
    public static boolean pass_validation(String pass){
        boolean status_pass=false;
        
        String pass_pattern= "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";
        
        Pattern pattern = Pattern.compile(pass_pattern);
        Matcher matcher =pattern.matcher(pass);
        
        if(matcher.matches() && (pass.length()>8)){
            status_pass = true;
        }
        else{
            status_pass = false;
        }
        return status_pass;
    }
    
    
    
    
}
