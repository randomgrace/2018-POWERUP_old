package com.spartronics4915.lib.util.drivers;

import com.spartronics4915.lib.util.drivers.IRSensor;

/**
 * Driver for a set of Sharp analog IR sensors that provide distance
 * measurement over a set range.
 */
public class SpartIRSensor
{

    protected final double mMinVoltage = 0.25;
    protected final double mMaxVoltage = 3.1;
	private static int kIRSensorPort = 3;
	private IRSensor mSensor = new IRSensor(kIRSensorPort, mMinVoltage, mMaxVoltage);
    

    public SpartIRSensor(int port)
    {
    }
    
    public IRSensor getSensor()
    {
        return this.mSensor;
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
