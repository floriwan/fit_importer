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


public enum DisplayHeart  {
    BPM((short)0),
    MAX((short)1),
    RESERVE((short)2),
    INVALID((short)255);

    protected short value;

    private DisplayHeart(short value) {
        this.value = value;
    }

    public static DisplayHeart getByValue(final Short value) {
        for (final DisplayHeart type : DisplayHeart.values()) {
            if (value == type.value)
                return type;
        }

        return DisplayHeart.INVALID;
    }

    /**
     * Retrieves the String Representation of the Value
     * @return The string representation of the value
     */
    public static String getStringFromValue( DisplayHeart value ) {
        return value.name();
    }

    public short getValue() {
        return value;
    }


}
