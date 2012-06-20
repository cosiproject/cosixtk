/* FormularCreator.java is part of CosiXTK
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
package org.cosiproject.xtoolkit.formular;

import java.io.File;

import org.apache.log4j.Logger;
import org.cosiproject.toolkit.conf.Conf;
import org.cosiproject.xtoolkit.Component;
import org.cosiproject.xtoolkit.TKProvider;

// TODO: Auto-generated Javadoc
/**
 * The Class FormularCreator.
 */
public abstract class FormularCreator {

	/** The logger. */
	private static Logger logger = Logger.getLogger(FormularCreator.class);
	
	/**
	 * Creates the.
	 * 
	 * @param conf
	 *            the conf
	 * @return the component
	 */
	public static Component create(Conf conf) {
		logger.debug("Creating Formular from " + conf);
		Component retVal = null;
		
		retVal = (Component) TKProvider.newInstance(conf.getCfg().getValue("guiComponent").getText());
		
		
		return retVal;
	}
	
	
	
	
	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		create(Conf.loadFromFile(new File("../Kloud/kloud.xml")));
		
	}

}
