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



public class AntTxMesg extends Mesg   {

    
    public static final int TimestampFieldNum = 253;
    
    public static final int FractionalTimestampFieldNum = 0;
    
    public static final int MesgIdFieldNum = 1;
    
    public static final int MesgDataFieldNum = 2;
    
    public static final int ChannelNumberFieldNum = 3;
    
    public static final int DataFieldNum = 4;
    

    protected static final  Mesg antTxMesg;
    static {int field_index = 0;
        // ant_tx
        antTxMesg = new Mesg("ant_tx", MesgNum.ANT_TX);
        antTxMesg.addField(new Field("timestamp", TimestampFieldNum, 134, 1, 0, "s", false, Profile.Type.DATE_TIME));
        field_index++;
        antTxMesg.addField(new Field("fractional_timestamp", FractionalTimestampFieldNum, 132, 32768, 0, "s", false, Profile.Type.UINT16));
        field_index++;
        antTxMesg.addField(new Field("mesg_id", MesgIdFieldNum, 13, 1, 0, "", false, Profile.Type.BYTE));
        field_index++;
        antTxMesg.addField(new Field("mesg_data", MesgDataFieldNum, 13, 1, 0, "", false, Profile.Type.BYTE));
        antTxMesg.fields.get(field_index).components.add(new FieldComponent(3, false, 8, 1, 0)); // channel_number
        antTxMesg.fields.get(field_index).components.add(new FieldComponent(4, false, 8, 1, 0)); // data
        antTxMesg.fields.get(field_index).components.add(new FieldComponent(4, false, 8, 1, 0)); // data
        antTxMesg.fields.get(field_index).components.add(new FieldComponent(4, false, 8, 1, 0)); // data
        antTxMesg.fields.get(field_index).components.add(new FieldComponent(4, false, 8, 1, 0)); // data
        antTxMesg.fields.get(field_index).components.add(new FieldComponent(4, false, 8, 1, 0)); // data
        antTxMesg.fields.get(field_index).components.add(new FieldComponent(4, false, 8, 1, 0)); // data
        antTxMesg.fields.get(field_index).components.add(new FieldComponent(4, false, 8, 1, 0)); // data
        antTxMesg.fields.get(field_index).components.add(new FieldComponent(4, false, 8, 1, 0)); // data
        field_index++;
        antTxMesg.addField(new Field("channel_number", ChannelNumberFieldNum, 2, 1, 0, "", false, Profile.Type.UINT8));
        field_index++;
        antTxMesg.addField(new Field("data", DataFieldNum, 13, 1, 0, "", false, Profile.Type.BYTE));
        field_index++;
    }

    public AntTxMesg() {
        super(Factory.createMesg(MesgNum.ANT_TX));
    }

    public AntTxMesg(final Mesg mesg) {
        super(mesg);
    }


    /**
     * Get timestamp field
     * Units: s
     *
     * @return timestamp
     */
    public DateTime getTimestamp() {
        return timestampToDateTime(getFieldLongValue(253, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD));
    }

    /**
     * Set timestamp field
     * Units: s
     *
     * @param timestamp
     */
    public void setTimestamp(DateTime timestamp) {
        setFieldValue(253, 0, timestamp.getTimestamp(), Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get fractional_timestamp field
     * Units: s
     *
     * @return fractional_timestamp
     */
    public Float getFractionalTimestamp() {
        return getFieldFloatValue(0, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set fractional_timestamp field
     * Units: s
     *
     * @param fractionalTimestamp
     */
    public void setFractionalTimestamp(Float fractionalTimestamp) {
        setFieldValue(0, 0, fractionalTimestamp, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get mesg_id field
     *
     * @return mesg_id
     */
    public Byte getMesgId() {
        return getFieldByteValue(1, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set mesg_id field
     *
     * @param mesgId
     */
    public void setMesgId(Byte mesgId) {
        setFieldValue(1, 0, mesgId, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    public Byte[] getMesgData() {
        
        return getFieldByteValues(2, Fit.SUBFIELD_INDEX_MAIN_FIELD);
        
    }

    /**
     * @return number of mesg_data
     */
    public int getNumMesgData() {
        return getNumFieldValues(2, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get mesg_data field
     *
     * @param index of mesg_data
     * @return mesg_data
     */
    public Byte getMesgData(int index) {
        return getFieldByteValue(2, index, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set mesg_data field
     *
     * @param index of mesg_data
     * @param mesgData
     */
    public void setMesgData(int index, Byte mesgData) {
        setFieldValue(2, index, mesgData, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get channel_number field
     *
     * @return channel_number
     */
    public Short getChannelNumber() {
        return getFieldShortValue(3, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set channel_number field
     *
     * @param channelNumber
     */
    public void setChannelNumber(Short channelNumber) {
        setFieldValue(3, 0, channelNumber, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    public Byte[] getData() {
        
        return getFieldByteValues(4, Fit.SUBFIELD_INDEX_MAIN_FIELD);
        
    }

    /**
     * @return number of data
     */
    public int getNumData() {
        return getNumFieldValues(4, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get data field
     *
     * @param index of data
     * @return data
     */
    public Byte getData(int index) {
        return getFieldByteValue(4, index, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set data field
     *
     * @param index of data
     * @param data
     */
    public void setData(int index, Byte data) {
        setFieldValue(4, index, data, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

}
