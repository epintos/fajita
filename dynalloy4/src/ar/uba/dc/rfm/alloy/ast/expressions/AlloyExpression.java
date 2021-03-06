/*
 * Dynalloy Translator
 * Copyright (c) 2007 Universidad de Buenos Aires
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA,
 * 02110-1301, USA
 */
package ar.uba.dc.rfm.alloy.ast.expressions;

import java.util.LinkedList;
import java.util.List;

import ar.uba.dc.rfm.alloy.AlloyVariable;

/**
 * @author jgaleotti
 *
 */
public abstract class AlloyExpression {

	public abstract Object accept(IExpressionVisitor v);

	@Override
	protected final Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	public static List<AlloyExpression> asAlloyExpression(List<AlloyVariable> vs) {
		List<AlloyExpression> result = new LinkedList<AlloyExpression>();
		for (AlloyVariable v : vs) 
			result.add(ExprVariable.buildExprVariable(v));
		
		return result;
	}
}
