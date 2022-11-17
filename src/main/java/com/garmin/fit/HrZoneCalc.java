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


public enum HrZoneCalc  {
    CUSTOM((short)0),
    PERCENT_MAX_HR((short)1),
    PERCENT_HRR((short)2),
    INVALID((short)255);

    protected short value;

    private HrZoneCalc(short value) {
        this.value = value;
    }

    public static HrZoneCalc getByValue(final Short value) {
        for (final HrZoneCalc type : HrZoneCalc.values()) {
            if (value == type.value)
                return type;
        }

        return HrZoneCalc.INVALID;
    }

    /**
     * Retrieves the String Representation of the Value
     * @return The string representation of the value
     */
    public static String getStringFromValue( HrZoneCalc value ) {
        return value.name();
    }

    public short getValue() {
        return value;
    }


}
