package Lab_08;

public interface IAnimal {

	// regular / default interface methods

	static int getHorsePower(int rpm, int torque) {
		return (rpm * torque) / 5252;
	}
}
