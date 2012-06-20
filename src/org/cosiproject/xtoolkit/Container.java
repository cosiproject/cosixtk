/* Container.java is part of CosiXTK
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

import java.util.HashMap;
import java.util.Map;

// TODO: Auto-generated Javadoc
/**
 * The Class Container.
 */
public class Container implements Component {

	/** The gui container. */
	private Object guiContainer;

	/** The visible. */
	private boolean visible = false;
	
	/** The bounds. */
	private Rectangle bounds;
	
	/** The height. */
	public int x, y, width, height;
	
	/** The map container. */
	private Map<Component, Object> mapContainer = new HashMap<Component, Object>();
	
	/** The layout. */
	private Layout layout = null;

	/** The background. */
	private Color background;
	
	/** The foreground. */
	private Color foreground;

	/* (non-Javadoc)
	 * @see org.cosiproject.xtoolkit.Component#isVisible()
	 */
	@Override
	public boolean isVisible() {
		// TODO Auto-generated method stub
		return visible;
	}

	/* (non-Javadoc)
	 * @see org.cosiproject.xtoolkit.Component#setVisible(boolean)
	 */
	@Override
	public void setVisible(boolean bool) {
		// TODO Auto-generated method stub
		visible = bool;
	}

	/* (non-Javadoc)
	 * @see org.cosiproject.xtoolkit.Component#setBounds(org.cosiproject.xtoolkit.Rectangle)
	 */
	@Override
	public void setBounds(Rectangle r) {
		// TODO Auto-generated method stub
		bounds = r;
	}

	/* (non-Javadoc)
	 * @see org.cosiproject.xtoolkit.Component#getBounds()
	 */
	@Override
	public Rectangle getBounds() {
		// TODO Auto-generated method stub
		return bounds;
	}

	/* (non-Javadoc)
	 * @see org.cosiproject.xtoolkit.Component#setBounds(int, int, int, int)
	 */
	@Override
	public void setBounds(int x, int y, int width, int height) {
		// TODO Auto-generated method stub
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	/* (non-Javadoc)
	 * @see org.cosiproject.xtoolkit.Component#add(org.cosiproject.xtoolkit.Component, java.lang.Object)
	 */
	@Override
	public void add(Component component, Object constrains) {
		// TODO Auto-generated method stub
		mapContainer.put(component, constrains);
	}

	/* (non-Javadoc)
	 * @see org.cosiproject.xtoolkit.Component#add(org.cosiproject.xtoolkit.Component)
	 */
	@Override
	public void add(Component component) {
		// TODO Auto-generated method stub
		mapContainer.put(component, null);
	}

	/* (non-Javadoc)
	 * @see org.cosiproject.xtoolkit.Component#getLayout()
	 */
	@Override
	public Layout getLayout() {
		// TODO Auto-generated method stub
		return layout;
	}

	/* (non-Javadoc)
	 * @see org.cosiproject.xtoolkit.Component#setLayout(org.cosiproject.xtoolkit.Layout)
	 */
	@Override
	public void setLayout(Layout layout) {
		// TODO Auto-generated method stub
		this.layout = layout;
	}

	/* (non-Javadoc)
	 * @see org.cosiproject.xtoolkit.Component#setBackground(org.cosiproject.xtoolkit.Color)
	 */
	@Override
	public void setBackground(Color background) {
		// TODO Auto-generated method stub
		this.background = background;
	}

	/* (non-Javadoc)
	 * @see org.cosiproject.xtoolkit.Component#setForeground(org.cosiproject.xtoolkit.Color)
	 */
	@Override
	public void setForeground(Color foreground) {
		// TODO Auto-generated method stub
		this.foreground = foreground;
	}

	/* (non-Javadoc)
	 * @see org.cosiproject.xtoolkit.Component#getBackground()
	 */
	@Override
	public Color getBackground() {
		// TODO Auto-generated method stub
		return this.background;
	}

	/* (non-Javadoc)
	 * @see org.cosiproject.xtoolkit.Component#getForeground()
	 */
	@Override
	public Color getForeground() {
		// TODO Auto-generated method stub
		return this.foreground;
	}

	/* (non-Javadoc)
	 * @see org.cosiproject.xtoolkit.Component#updateUI()
	 */
	@Override
	public void updateUI() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.cosiproject.xtoolkit.GUIWrapper#getGUIContainer()
	 */
	@Override
	public Object getGUIContainer() {
		// TODO Auto-generated method stub
		return guiContainer;
	}

	/* (non-Javadoc)
	 * @see org.cosiproject.xtoolkit.GUIWrapper#setGUIContainer(java.lang.Object)
	 */
	@Override
	public void setGUIContainer(Object container) {
		// TODO Auto-generated method stub
		guiContainer = container;
	}

	

}
