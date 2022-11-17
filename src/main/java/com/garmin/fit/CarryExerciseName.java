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

import java.util.HashMap;
import java.util.Map;

public class CarryExerciseName  {
    public static final int BAR_HOLDS = 0;
    public static final int FARMERS_WALK = 1;
    public static final int FARMERS_WALK_ON_TOES = 2;
    public static final int HEX_DUMBBELL_HOLD = 3;
    public static final int OVERHEAD_CARRY = 4;
    public static final int INVALID = Fit.UINT16_INVALID;

    private static final Map<Integer, String> stringMap;

    static {
        stringMap = new HashMap<Integer, String>();
        stringMap.put(BAR_HOLDS, "BAR_HOLDS");
        stringMap.put(FARMERS_WALK, "FARMERS_WALK");
        stringMap.put(FARMERS_WALK_ON_TOES, "FARMERS_WALK_ON_TOES");
        stringMap.put(HEX_DUMBBELL_HOLD, "HEX_DUMBBELL_HOLD");
        stringMap.put(OVERHEAD_CARRY, "OVERHEAD_CARRY");
    }


    /**
     * Retrieves the String Representation of the Value
     * @return The string representation of the value, or empty if unknown
     */
    public static String getStringFromValue( Integer value ) {
        if( stringMap.containsKey( value ) ) {
            return stringMap.get( value );
        }

        return "";
    }

    /**
     * Retrieves a value given a string representation
     * @return The value or INVALID if unkwown
     */
    public static Integer getValueFromString( String value ) {
        for( Map.Entry<Integer, String> entry : stringMap.entrySet() ) {
            if( entry.getValue().equals( value ) ) {
                return entry.getKey();
            }
        }

        return INVALID;
    }

}
