package application;

import java.util.ArrayList;
import java.util.List;

/**
 * AverageSensor
 */
public class AverageSensor implements Sensor {
	private ArrayList<Sensor> sensors;
	private List<Integer> averages;

	public AverageSensor(){
		this.sensors = new ArrayList<>(); 
		this.averages = new ArrayList<>();
	}

	public void addSensor(Sensor toAdd){
		this.sensors.add(toAdd);

	}

	public List<Integer> readings(){
		return averages;

	}

	@Override
	public boolean isOn() {
		return sensors.stream()
			.allMatch(Sensor::isOn);
	}

	@Override
	public void setOn() {
		sensors.stream()
			.forEach(Sensor::setOn);
	}

	@Override
	public void setOff() {
		sensors.stream().forEach(Sensor::setOff);
	}

	@Override
	public int read() {
		int average = (int) Math.round(sensors.stream()
						.mapToInt(Sensor::read)
						.average()
						.orElse(0.0));
		averages.add(average);
		return average;
	}


	
}
