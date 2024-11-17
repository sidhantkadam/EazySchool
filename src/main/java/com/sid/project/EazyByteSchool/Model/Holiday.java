package com.sid.project.EazyByteSchool.Model;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Holiday
{
    private final String day;
    private final String reason;
    private final Type type;

    public enum Type
    {
        FEDERAL, FESTIVAL
    }
}
