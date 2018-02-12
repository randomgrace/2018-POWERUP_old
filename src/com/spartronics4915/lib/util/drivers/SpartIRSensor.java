package com.spartronics4915.lib.util.drivers;

import com.spartronics4915.lib.util.drivers.IRSensor;

/**
 * Driver for a set of Sharp analog IR sensors that provide distance
 * measurement over a set range.
 * 
 * Usage: SpartIRSensor(int port, double minVoltage, double maxVoltage)
 * 
 * where port = analog input port number on RoboRio
 * 
 *       minVoltage = minimum voltage for range
 *       
 *       maxVoltage = maximum voltage for range
 *       
 */
public class SpartIRSensor
{

    double mMinVoltage = 0.25;
    double mMaxVoltage = 3.1;
    private IRSensor mSensor;
    

    public SpartIRSensor(int port, double minVoltage, double maxVoltage)
    {
        mSensor = new IRSensor(port, minVoltage, maxVoltage);
        mMinVoltage = minVoltage;
        mMaxVoltage = maxVoltage;

    }
    
    public IRSensor getSensor()
    {
        return mSensor;
    }

    public double getVoltage()
    {
        return this.getSensor().getVoltage();
    }

    public boolean isTargetAcquired(double voltage)
    {
        if (voltage > mMinVoltage && voltage < mMaxVoltage) {
            return true;
        } else {
            return false;
        }
    }

}
