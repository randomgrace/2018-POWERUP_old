package com.spartronics4915.lib.util.drivers;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
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
    Map<String, double[]> models = new TreeMap<String, double[]>();

    models.put("A41", new double[] {0.25, 3.1, 4.0, 30.0});
    models.put("A51", new double[] {0.25, 5.5, 2.0, 15.0});
    models.put("A21", new double[] {0.25, 5.5, 2.0, 15.0});
    models.put("A60", new double[] {0.25, 5.5, 2.0, 15.0});
    models.put("A02", new double[] {0.25, 5.5, 2.0, 15.0});
    models.put("A71", new double[] {0.25, 5.5, 2.0, 15.0});
    

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
