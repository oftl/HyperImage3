/*
 * CDDL HEADER START
 *
 * The contents of this file are subject to the terms of the
 * Common Development and Distribution License, Version 1.0 only
 * (the "License").  You may not use this file except in compliance
 * with the License.
 *
 * You can obtain a copy of the license at license/HYPERIMAGE.LICENSE
 * or http://www.sun.com/cddl/cddl.html.
 * See the License for the specific language governing permissions
 * and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL HEADER in each
 * file and include the License file at license/HYPERIMAGE.LICENSE.
 * If applicable, add the following below this CDDL HEADER, with the
 * fields enclosed by brackets "[]" replaced with your own identifying
 * information: Portions Copyright [yyyy] [name of copyright owner]
 *
 * CDDL HEADER END
 */

/*
 * Copyright 2006-2009 Humboldt-Universitaet zu Berlin
 * All rights reserved.  Use is subject to license terms.
 */

package org.hyperimage.client.gui;

import javax.swing.JPanel;

/**
 * @author Jens-Martin Loebel
 */
public abstract class HITextFieldControl extends JPanel {

	private static final long serialVersionUID = 5921617841660656247L;

	
	public void setText(String text) {
	}
	
	public String getText() {
		return null;
	}

	public void updateTitle(String title) {
		// implemented in subclasses
	}
	
	public void setEditable(boolean editable) {
		// implemented in subclasses
	}
}
