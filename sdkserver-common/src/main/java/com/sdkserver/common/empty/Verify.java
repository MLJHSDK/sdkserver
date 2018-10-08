package com.sdkserver.common.empty;


import com.sdkserver.common.exception.ExistObjectException;
import com.sdkserver.common.exception.NullObjectException;

public class Verify {

    public static  void objectNull(Object object)  {
        if (object == null){
           throw new NullObjectException();
        }
    }
    public static  void objectExist (Object object)  {
        if (object != null){
            throw new ExistObjectException();
        }
    }
}
