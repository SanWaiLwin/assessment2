package com.neurogine.assessment2.model;

import org.beanio.annotation.Field;
import org.beanio.annotation.Record;

/**
 * @version : 1.0.0
 * @description :
 * @author : SanWaiLwin
 * @date : Jun 27, 2024 3:17:47 PM
 */
@Record
public class Body {

    @Field(at = 19, length = 14)
    private String referenceNo;

    @Field(at = 39, length = 16)
    private String amount;

    public Body() {
        super();
    }

    public Body(String referenceNo, String amount) {
        this.referenceNo = referenceNo;
        this.amount = amount;
    }
}

