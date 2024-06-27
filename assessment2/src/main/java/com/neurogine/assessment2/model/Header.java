package com.neurogine.assessment2.model;

import org.beanio.annotation.Field;
import org.beanio.annotation.Record;

/**
 * @version : 1.0.0
 * @description :
 * @author : SanWaiLwin
 * @date : Jun 27, 2024 3:18:18 PM
 */
@Record
public class Header {
    @Field(at = 0, length = 1, literal = "H")
    private String recordType;

    @Field(at = 13, length = 9, literal = "FLAT_FILE")
    private String fileType;
}