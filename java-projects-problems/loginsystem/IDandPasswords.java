package LoginSystem;

import java.util.HashMap;

public class IDandPasswords {
    HashMap<String,String> loginInfo = new HashMap<String,String>();

    IDandPasswords(){
        loginInfo.put("Cosmin","cosmin123");
        loginInfo.put("Ana","ana123");
        loginInfo.put("John","john123");
    }
    protected HashMap getLoginInfo(){
        return loginInfo;
    }
}
