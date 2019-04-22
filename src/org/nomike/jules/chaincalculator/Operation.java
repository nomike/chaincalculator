/*
chaincalculator - a simple calculator demonstrating the chain-of-command pattern
Copyright (C) 2019 nomike

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <https://www.gnu.org/licenses/>.
*/
package org.nomike.jules.chaincalculator;

/**
 * Defines a mathematical operation.
 * This class follows the Chain-Of-Responsibility Pattern.
 */
public abstract class Operation {
    /**
     * Compute the result of a and b, according to the operator. If the class implementing this method
     * does not know how to perform the calculation, it should forward it to the next Operation. If there
     * is no next Operation a IllegalOperatorException should be thrown
     * 
     * @param a first operand
     * @param b second operand
     * @param operator operator
     * @throws IllegalOperatorException is thrown when the last class in the chain of responsibility still
     * can not handle the operation.
     * @return the result of the operation
     */
    public abstract float compute(float a, float b, Operator operator) throws IllegalOperatorException;

    /**
     * The next Operation to try if the current one can't handle the operation.
     */
    protected Operation next;

    /**
     * 
     * @param operation the next operation in the chain of commands
     */
    public void setNext(Operation operation) {
        this.next = operation;
    }

    /**
     * 
     * @return the next operation in the chain of commands
     */
    public Operation getNext() {
        return this.next;
    }
}
