/**
 * Project Looking Glass
 *
 * $RCSfile: JawtPanelPeer.java,v $
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
 * $Date: 2006-09-22 21:10:24 $
 * $State: Exp $
 */

package org.jdesktop.lg3d.jawt.delegate;

import java.awt.Panel;
import java.awt.event.ActionListener;
import java.awt.peer.PanelPeer;
import org.jdesktop.lg3d.jawt.swing.JawtJPanel;

/**
 * Implementation of an AWT Panel peer (java.awt.peer.PanelPeer) using
 * Swing (JPanel)
 */
public class JawtPanelPeer extends JawtContainerPeerBase<JawtJPanel>
			   implements PanelPeer {

    Panel target;
    JawtJPanel delegate;

    public JawtPanelPeer(Panel target) {
	super(target, new JawtJPanel(target));

	this.target = target;
	this.delegate = (JawtJPanel)super.delegate;
    }
}
