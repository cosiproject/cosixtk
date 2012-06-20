/* FlowLayout.java is part of CosiXTK
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
 * The Interface FlowLayout.
 */
public interface FlowLayout extends Layout {

	/** The Constant CENTER. */
	public static final String CENTER = null;
	
	/**
	 * Gets the alignment.
	 * 
	 * @return the alignment
	 */
	public String getAlignment();
	
	/**
	 * Sets the alignment.
	 * 
	 * @param alignment
	 *            the new alignment
	 */
	public void setAlignment(String alignment);
	
	/**
	 * Gets the hgap.
	 * 
	 * @return the hgap
	 */
	public int getHgap();
	
	/**
	 * Sets the hgap.
	 * 
	 * @param hgap
	 *            the new hgap
	 */
	public void setHgap(int hgap);
	
	/**
	 * Gets the vgap.
	 * 
	 * @return the vgap
	 */
	public int getVgap();
	
	/**
	 * Sets the vgap.
	 * 
	 * @param vgap
	 *            the new vgap
	 */
	public void setVgap(int vgap);
	
	

}
