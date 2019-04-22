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
 * This exception should be thrown if no member of the chanin of commands can process the specified operator.
 */
class IllegalOperatorException extends Exception {
    /**
        Addind a serialVersionUID is recommended practice for all serializeable classes.
        As Exception is serializeable, this applies to this object too.
        For unserstanding the chain-of-command pattern, this is not necessary.
        It was merely aded to avoid a warning by the IDE.
    */
    private static final long serialVersionUID = 1L;
}