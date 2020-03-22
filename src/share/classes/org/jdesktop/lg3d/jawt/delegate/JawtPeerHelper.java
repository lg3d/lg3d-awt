/**
 * Project Looking Glass
 *
 * $RCSfile: JawtPeerHelper.java,v $
 *
 * Copyright (c) 2004, Sun Microsystems, Inc., All Rights Reserved
 *
 * Redistributions in source code form must reproduce the above
 * copyright and this condition.
 *
 * The contents of this file are subject to the GNU General Public
 * License, Version 2 (the "License"); you may not use this file
 * except in compliance with the License. A copy of the License is
 * available at http://www.opensource.org/licenses/gpl-license.php.
 *
 * $Revision: 1.1 $
 * $Date: 2006-09-22 21:10:25 $
 * $State: Exp $
 */

package org.jdesktop.lg3d.jawt.delegate;

import java.awt.AWTEvent;
import java.util.EventObject;
import org.jdesktop.lg3d.jawt.util.JawtField;

/**
 * A Helper class for implementing AWT (non-top-level) peers using Swing.
 */
public class JawtPeerHelper {

    private static JawtField awtEventSourceField =
				JawtField.create(EventObject.class, "source");

    /**
     * Changes the source of the event.
     * @return the same event with a modified source or null
     */
    public static final AWTEvent setEventSource(AWTEvent event, Object source) {
	if (awtEventSourceField != null) {
	    awtEventSourceField.set(event, source);
	    return event;
	}

	return null;
    }
}
