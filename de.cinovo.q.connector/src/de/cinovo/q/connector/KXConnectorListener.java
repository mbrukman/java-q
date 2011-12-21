// -------------------------------------------------------------------------------
// Copyright (c) 2011 Cinovo AG
// All rights reserved. This program and the accompanying materials
// are made available under the terms of the Eclipse Public License v1.0
// which accompanies this distribution, and is available at
// http://www.eclipse.org/legal/epl-v10.html
// -------------------------------------------------------------------------------

package de.cinovo.q.connector;

/**
 * KXConnector listener.
 *
 * Every KXConnector has one KXConnectorListener.
 *
 * @author mwittig
 *
 */
public interface KXConnectorListener {

	/**
	 * KXError occurred. Is handled by the KXConnector. Just an information.
	 *
	 * @param e Error
	 */
	void error(KXError e);

	/**
	 * KXException occurred. Must be handled by yourself!
	 *
	 * @param e Exception
	 */
	void exception(KXException e);

	/**
	 * Data received.
	 *
	 * @param handle Unique handle to identify received data
	 * @param data KX table
	 */
	void dataReceived(final String handle, KXTable data);

}