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


public enum TimerTrigger  {
    MANUAL((short)0),
    AUTO((short)1),
    FITNESS_EQUIPMENT((short)2),
    INVALID((short)255);

    protected short value;

    private TimerTrigger(short value) {
        this.value = value;
    }

    public static TimerTrigger getByValue(final Short value) {
        for (final TimerTrigger type : TimerTrigger.values()) {
            if (value == type.value)
                return type;
        }

        return TimerTrigger.INVALID;
    }

    /**
     * Retrieves the String Representation of the Value
     * @return The string representation of the value
     */
    public static String getStringFromValue( TimerTrigger value ) {
        return value.name();
    }

    public short getValue() {
        return value;
    }


}
