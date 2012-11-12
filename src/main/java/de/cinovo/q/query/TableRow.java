// -------------------------------------------------------------------------------
// Copyright (c) 2011-2012 Cinovo AG
// All rights reserved. This program and the accompanying materials
// are made available under the terms of the Apache License, Version 2.0
// which accompanies this distribution, and is available at
// http://www.apache.org/licenses/LICENSE-2.0.html
// -------------------------------------------------------------------------------

package de.cinovo.q.query;

import de.cinovo.q.query.column.Column;
import de.cinovo.q.query.type.Type;
import de.cinovo.q.query.value.Value;

/**
 * Result.
 * 
 * @author mwittig
 * 
 */
public interface TableRow {
	
	/**
	 * @param column Column
	 * @param <J> Java type
	 * @param <T> Type of column
	 * @return Value for this column in the row
	 */
	<J, T extends Type<J>> Value<J, T> get(Column<T> column);
	
}
