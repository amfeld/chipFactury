package de.tum.in.ase.pse.controller;

import de.tum.in.ase.pse.model.AssemblyMachine;
import de.tum.in.ase.pse.model.ChipType;
import de.tum.in.ase.pse.utils.FactoryException;

/**
 * The controller class for the model AssemblyMachine
 * This class and the corresponding buttons form the controller part of the system.
 * Actually this only delegates the calls. It was however implemented to mock a dedicated controller.
 */
public class AssemblyTerminal {

    private final AssemblyMachine machine;
    private static final int MIN_SPACE = 27;
    private static final int MAX_SPACE = 60;

    public AssemblyTerminal(AssemblyMachine assemblyMachine) {
        this.machine = assemblyMachine;
    }

    /**
     * This method updates the target temperature of the machine (by using machine's setter).
     * It checks if the input value is between the min. and the max. temperature of the machine,
     * and throws a FactoryException otherwise.
     */
    public void setTargetTemperature(int targetTemperature) throws FactoryException {
        /**
         * 1. TODO: Implement this function by checking, if the passed targetTemperature is in the range denoted \
         *          by the machine's min- and max-temperature. If in range, set the machines target temperature, \
         *          if not throw a new Factory Exception
         */

        if (targetTemperature > machine.getMaxTemperature() || targetTemperature < machine.getMinTemperature()) {
            throw new FactoryException("Temperature out of bound");
        }
        machine.setTargetTemperature(targetTemperature);
    }

    /**
     * This method updates the target voltage of the machine (by using machine's setter).
     * It checks if the input value is between the min. and the max. voltage of the machine,
     * and throws a FactoryException otherwise.
     */
    public void setTargetVoltage(int targetVoltage) {
        /**
         * 2. TODO: Implement this function by checking, if the passed targetVoltage is in the range denoted \
         *          by the machine's min- and max-temperature. If in range, set the machines target voltage, \
         *          if not throw a new Factory Exception
         */

        if (targetVoltage > machine.getMaxVoltage() || targetVoltage < machine.getMinVoltage()) {
            throw new FactoryException("Voltage out of bound");
        }
        machine.setTargetVoltage(targetVoltage);
    }

    /**
     * This method sets the space between transistors ("fin pitch") of the assembly machine (by using machine's setter).
     * It checks if the input value is reasonable (between 27nm and 60nm),
     * and throws a FactoryException otherwise.
     */
    public void setSpaceBetweenTrans(int space) {
        /**
         * 3. TODO: Implement this function by checking, if the passed space is in the range [27, 60] \
         *          If in range, set the machines target space , if not throw a new Factory Exception
         */
        if (space > MAX_SPACE || space < MIN_SPACE) {
            throw new FactoryException("Space of is not within [27, 60] ");
        }
        machine.setSpaceBetweenTrans(space);
    }

    /**
     * This method sets the chip type of the assembly machine (by using machine's setter).
     */
    public void setChipType(ChipType chipType) {
        machine.setChipType(chipType);
    }
}
