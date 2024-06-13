package application;

import java.util.Random;

/**
 * TemperatureSensor
 */
public class TemperatureSensor implements Sensor{

	private boolean sensorState;


	@Override
	public boolean isOn() {
		if (sensorState) {
			return true;
		}
		return false;
	}

	@Override
	public void setOn() {
		this.sensorState = true;
	}

	@Override
	public void setOff() {
		this.sensorState = false;
	}

	@Override
	public int read() {
		if (sensorState) {
			return new Random().nextInt(61)  - 30;
		} else {
			throw new IllegalStateException("The sensor state must be ON");
		}
	}

	
}
