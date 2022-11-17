/////////////////////////////////////////////////////////////////////////////////////////////
// Copyright 2022 Garmin International, Inc.
// Licensed under the Flexible and Interoperable Data Transfer (FIT) Protocol License; you
// may not use this file except in compliance with the Flexible and Interoperable Data
// Transfer (FIT) Protocol License.
/////////////////////////////////////////////////////////////////////////////////////////////
// ****WARNING****  This file is auto-generated!  Do NOT edit this file.
// Profile Version = 21.94Release
// Tag = production/akw/21.94.00-0-g0f668193
/////////////////////////////////////////////////////////////////////////////////////////////


package com.garmin.fit;


public enum SessionTrigger  {
    ACTIVITY_END((short)0),
    MANUAL((short)1),
    AUTO_MULTI_SPORT((short)2),
    FITNESS_EQUIPMENT((short)3),
    INVALID((short)255);

    protected short value;

    private SessionTrigger(short value) {
        this.value = value;
    }

    public static SessionTrigger getByValue(final Short value) {
        for (final SessionTrigger type : SessionTrigger.values()) {
            if (value == type.value)
                return type;
        }

        return SessionTrigger.INVALID;
    }

    /**
     * Retrieves the String Representation of the Value
     * @return The string representation of the value
     */
    public static String getStringFromValue( SessionTrigger value ) {
        return value.name();
    }

    public short getValue() {
        return value;
    }


}
