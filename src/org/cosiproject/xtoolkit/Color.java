/* Color.java is part of CosiXTK
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
 * The Class Color.
 */
public class Color {
	
	/** The Constant RED. */
	public static final Color RED = new Color(255, 0, 0);
	
	/** The Constant GREEN. */
	public static final Color GREEN = null;
	
	/** The Constant BLUE. */
	public static final Color BLUE = null;
	
	/** The Constant BLACK. */
	public static final Color BLACK = null;
	
	/** The a. */
	private int r = 0, g = 0, b = 0, a = 0;
	
	/**
	 * Gets the red.
	 * 
	 * @return the red
	 */
	public int getRed() {
		return r;
	}
	
	/**
	 * Gets the blue.
	 * 
	 * @return the blue
	 */
	public int getBlue() {
		return b;
	}
	
	/**
	 * Gets the green.
	 * 
	 * @return the green
	 */
	public int getGreen() {
		return g;
	}
	
	/**
	 * Gets the alpha.
	 * 
	 * @return the alpha
	 */
	public int getAlpha() {
		return a;
	}
	
	/**
	 * Instantiates a new color.
	 * 
	 * @param r
	 *            the r
	 * @param g
	 *            the g
	 * @param b
	 *            the b
	 */
	public Color(int r, int g, int b) {
		this(r, g, b, 255);
	}
	
	/**
	 * Instantiates a new color.
	 * 
	 * @param r
	 *            the r
	 * @param g
	 *            the g
	 * @param b
	 *            the b
	 * @param a
	 *            the a
	 */
	public Color(int r, int g, int b, int a) {
		this.r = r;
		this.g = g;
		this.b = b;
		this.a = a;
	}
}
