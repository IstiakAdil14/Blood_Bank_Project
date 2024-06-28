
package javaapplication10;

import com.databaseCon.DB;
import com.login.LoginFrame;


public class JavaApplication10 {

    public static void main(String[] args) {
        // TODO code application logic here
        LoginFrame obj=new LoginFrame();
        obj.show();
        DB.loadConnection();
    }
    
}
