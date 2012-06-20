/* Component.java is part of CosiXTK
 * created 18.11.2011 
 *
 *
 * Copyright (c) 2011, The Cosi Project
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *    * Redistributions of source code must retain the above copyright
 *      notice, this list of conditions and the following disclaimer.
 *   * Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *   * Neither the name of the <organization> nor the
 *     names of its contributors may be used to endorse or promote products
 *     derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.  
 * 
 * @author lotherk
 *
 * 
 */
package org.cosiproject.xtoolkit;

// TODO: Auto-generated Javadoc
/**
 * The Interface Component.
 */
public interface Component extends GUIWrapper {
	
	/**
	 * Checks if is visible.
	 * 
	 * @return true, if is visible
	 */
	boolean isVisible();
	
	/**
	 * Sets the visible.
	 * 
	 * @param bool
	 *            the new visible
	 */
	void setVisible(boolean bool);
	
	/**
	 * Sets the bounds.
	 * 
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 */
	void setBounds (int x, int y, int width, int height);
	
	/**
	 * Gets the bounds.
	 * 
	 * @return the bounds
	 */
	Rectangle getBounds();
	
	/**
	 * Gets the layout.
	 * 
	 * @return the layout
	 */
	Layout getLayout();
	
	/**
	 * Sets the layout.
	 * 
	 * @param layout
	 *            the new layout
	 */
	void setLayout(Layout layout);
	
	/**
	 * Adds the.
	 * 
	 * @param component
	 *            the component
	 * @param constratins
	 *            the constratins
	 */
	void add(Component component, Object constratins);
	
	/**
	 * Adds the.
	 * 
	 * @param component
	 *            the component
	 */
	void add(Component component);
	
	/**
	 * Sets the background.
	 * 
	 * @param background
	 *            the new background
	 */
	void setBackground(Color background);
	
	/**
	 * Gets the background.
	 * 
	 * @return the background
	 */
	Color getBackground();
	
	/**
	 * Sets the foreground.
	 * 
	 * @param foreground
	 *            the new foreground
	 */
	void setForeground(Color foreground);
	
	/**
	 * Gets the foreground.
	 * 
	 * @return the foreground
	 */
	Color getForeground();
	
	/**
	 * Update ui.
	 */
	void updateUI();
	
	/**
	 * Sets the bounds.
	 * 
	 * @param r
	 *            the new bounds
	 */
	void setBounds(Rectangle r);
}
