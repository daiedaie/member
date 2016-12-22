package com.paytong.platform.acc.exception;


public class IllegalEntryRequestException extends AbstractAccException{

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -4380794292812299164L;
     
    @Override
    public String getCode() {
        // TODO Auto-generated method stub
        return "EASAC0009";
    }
}
