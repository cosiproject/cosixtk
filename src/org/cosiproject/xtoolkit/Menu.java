/* Menu.java is part of CosiXTK
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
 * The Interface Menu.
 */
public interface Menu {
	
	/**
	 * Adds the.
	 * 
	 * @param menu
	 *            the menu
	 */
	void add(PopupMenu menu);
	
	/**
	 * Adds the.
	 * 
	 * @param menu
	 *            the menu
	 */
	void add(Menu menu);
	
	/**
	 * Adds the.
	 * 
	 * @param menuItem
	 *            the menu item
	 */
	void add(MenuItem menuItem);
	
	/**
	 * Removes the.
	 * 
	 * @param menu
	 *            the menu
	 */
	void remove(PopupMenu menu);
	
	/**
	 * Removes the.
	 * 
	 * @param menu
	 *            the menu
	 */
	void remove(Menu menu);
	
	/**
	 * Removes the.
	 * 
	 * @param menu
	 *            the menu
	 */
	void remove(MenuItem menu);
	
	/**
	 * Sets the icon.
	 * 
	 * @param icon
	 *            the new icon
	 */
	void setIcon(Icon icon);
	
	/**
	 * Gets the icon.
	 * 
	 * @return the icon
	 */
	Icon getIcon();
	
	/**
	 * Sets the text.
	 * 
	 * @param text
	 *            the new text
	 */
	void setText(String text);
	
	/**
	 * Gets the text.
	 * 
	 * @return the text
	 */
	String getText();
	
	/**
	 * Sets the visible.
	 * 
	 * @param b
	 *            the new visible
	 */
	void setVisible(boolean b);
	
	/**
	 * Checks if is visible.
	 * 
	 * @return true, if is visible
	 */
	boolean isVisible();
	
	/**
	 * Gets the gUI container.
	 * 
	 * @return the gUI container
	 */
	Object getGUIContainer();
	
	/**
	 * Sets the gUI container.
	 * 
	 * @param container
	 *            the new gUI container
	 */
	void setGUIContainer(Object container);
	
	/**
	 * Sets the tool tip.
	 * 
	 * @param text
	 *            the new tool tip
	 */
	void setToolTip(String text);
	
	/**
	 * Gets the tool tip.
	 * 
	 * @return the tool tip
	 */
	String getToolTip();
	
	
}
