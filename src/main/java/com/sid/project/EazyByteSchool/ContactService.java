package com.sid.project.EazyByteSchool;

import com.sid.project.EazyByteSchool.Model.ContactInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ContactService
{
    public boolean doContact(ContactInfo contactInfo)
    {
        boolean isTrue = true;
        if(isTrue)
        {
            log.info(contactInfo.toString());
        }
        return isTrue;
    }
}
