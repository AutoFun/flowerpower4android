package de.fp4a.model;

public interface FlowerPowerListener
{

	�berlegen, ob ich den FlowerPowerListener �berhaupt brauche, da ich ja die aktuellen Daten ohnehin �ber dataAvailable bekomme
	
	public void batteryChanged(int batteryLevel);
	public void temperatureChanged(double temperature);
	public void soilMoistureChanged(double soilMoisture);
	public void sunlightChanged(double sunlight);
	
}
