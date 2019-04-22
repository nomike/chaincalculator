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
 * Operation for dividing two floats.
 */
public class Divide extends Operation {
    /**
     * Divide two floats if the operation is add. Call next Operation if it is not,
     */
    public float compute(float a, float b, Operator operator) throws IllegalOperatorException {
        if(operator == Operator.DIVIDE) {
            return a / b;
        } else {
            if(next != null) {
                return next.compute(a, b, operator);
            } else {
                throw new IllegalOperatorException();
            }
        }
    }
}
