/*******************************************************************************
 * Copyright (C) 2006-2012 Dominik Jain.
 * 
 * This file is part of ProbCog.
 * 
 * ProbCog is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * ProbCog is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with ProbCog. If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package probcog.srldb.datadict;

import java.io.Serializable;

import probcog.srldb.datadict.domain.Domain;


/**
 * Data dictionary definition of a type of relation partner that is a fixed set of constants 
 * @author Dominik Jain
 */
public class DDConstantArgument extends DDAttribute implements IDDRelationArgument, Serializable {

	private static final long serialVersionUID = 1L;

	public DDConstantArgument(String name, Domain<?> domain) {
		super(name, domain);		
	}
	
	public String getDomainName() {
		return this.domain.getName();
	}

}
