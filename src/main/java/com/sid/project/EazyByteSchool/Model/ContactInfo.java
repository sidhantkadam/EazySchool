package com.sid.project.EazyByteSchool.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ContactInfo
{
    private final String name;
    private final String message;
    private final String mobileNum;
    private final String email;
    private final String subject;

    @Override
    public String toString()
    {
        return "ContactInfo = " +
                "name='" + name + '\'' +
                ", message='" + message + '\'' +
                ", mobileNum='" + mobileNum + '\'' +
                ", email='" + email + '\'' +
                ", subject='" + subject + '\'';
    }
}
