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
 * Defines an operator. Ther are static instances for ADD, SUBSTRACT, MULTIPLY, and DIVIDE.
 */
public class Operator {    
    public static Operator ADD = new Operator();
    public static Operator SUBSTRACT = new Operator();
    public static Operator MULTIPLY = new Operator();
    public static Operator DIVIDE = new Operator();
    public static Operator MODULO = new Operator(); // For demonstration purposes no Operation will be implemented for this Operator
  
    /**
     * Make default constructor private so that people can not create arbitrary operators.
     */
    private Operator() {
    }
}
