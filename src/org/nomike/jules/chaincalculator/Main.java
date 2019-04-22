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
 * Main class for chaincalculator.
 */
public class Main {
    /**
     * Creates new operations for add, multiply, substract and divide.
     * Does some basic calculations with it.
     * @param argv Command line arguments are ignored
     */
    public static void main(String[] argv) {
        Operation calculator = new Add();
        calculator.setNext(new Substract());
        calculator.getNext().setNext(new Multiply());
        calculator.getNext().getNext().setNext(new Divide());

        // do some calculations
        try {
            System.out.println(calculator.compute(12, 3, Operator.ADD));
            System.out.println(calculator.compute(1230, 212, Operator.DIVIDE));
            System.out.println(calculator.compute(1230, 212, Operator.SUBSTRACT));
            System.out.println(calculator.compute(1230, 212, Operator.MODULO)); // This line will throw an exception as no Operation for Modulo is implemented
        } catch (IllegalOperatorException e) {
            /*
            Normal output of this program is printed to STDOUT. This error message is printed to STDERR.
            As these two separate output-streams are both buffered the order might be mixed up.
            */
            System.err.println("Illegal operation specified.");
        }
    }
}
