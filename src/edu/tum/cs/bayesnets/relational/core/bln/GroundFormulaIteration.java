package edu.tum.cs.bayesnets.relational.core.bln;

import java.util.Iterator;

import org.python.core.PyObject.ConversionException;

public class GroundFormulaIteration implements Iterator<GroundFormula>, Iterable<GroundFormula> {

	protected BayesianLogicNetwork bln;
	protected int i, count;
	
	public GroundFormulaIteration(BayesianLogicNetwork bln) throws ConversionException {
		this.bln = bln;
		i = 0;
		count = bln.jython.evalInt("len(mln.gndFormulas)");
	}
	
	public boolean hasNext() {
		return i < count;
	}

	public GroundFormula next() {
		try {
			return new GroundFormula(bln.jython, i++);
		}
		catch (ConversionException e) {
			throw new RuntimeException(e.getMessage());
		}			
	}

	public void remove() {
		throw new RuntimeException("Remove is not supported by this iterator.");
	}

	public Iterator<GroundFormula> iterator() {			
		return this;
	}		
}