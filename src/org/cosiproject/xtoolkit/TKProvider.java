/* TKProvider.java is part of CosiXTK
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



import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.log4j.Logger;

// TODO: Auto-generated Javadoc
/**
 * The Class TKProvider.
 */
@XmlRootElement(name="tkprovider")
public class TKProvider {
	

	/** The logger. */
	private static Logger logger = Logger.getLogger(TKProvider.class);
	
	/** The instance. */
	private static TKProvider instance;
	
	static {
		
	}
	
	/**
	 * Gets the single instance of TKProvider.
	 * 
	 * @return single instance of TKProvider
	 */
	public static TKProvider getInstance() {
		if(instance == null)
			instance = loadFromFile(new File("tkprovider.xml"));
		return instance;
	}
	
	/**
	 * Gets the single instance of TKProvider.
	 * 
	 * @param file
	 *            the file
	 * @return single instance of TKProvider
	 */
	public static TKProvider getInstance(File file) {
		if(instance == null)
			instance = loadFromFile(file);
		return instance;
	}
	
	/**
	 * New instance.
	 * 
	 * @param className
	 *            the class name
	 * @return the object
	 */
	public static Object newInstance(String className) {
		className = TKProvider.getInstance().getPackageBase() + "." + className;
		logger.debug("Creating an instance of " + className);
		try {
			Object retVal = (Object) Class.forName(className).newInstance();
			return retVal;
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			logger.error(e, e);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			logger.error(e, e);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			logger.error(e, e);
		}
		return null;
	}
	
	/**
	 * Gets the layout.
	 * 
	 * @param className
	 *            the class name
	 * @return the layout
	 */
	public static Layout getLayout(String className) {
		className = TKProvider.getInstance().getPackageBase() + "." + className;
		logger.debug("Creating an instance of " + className);
		try {
			Layout retVal = (Layout) Class.forName(className).newInstance();
			return retVal;
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			logger.error(e, e);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			logger.error(e, e);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			logger.error(e, e);
		}
		return null;
	}
	
	
	/** The package base. */
	private String packageBase;
	
	/**
	 * Gets the package base.
	 * 
	 * @return the package base
	 */
	@XmlElement(name="packageBase")
	public String getPackageBase() {
		return packageBase;
	}

	/**
	 * Sets the package base.
	 * 
	 * @param packageBase
	 *            the new package base
	 */
	public void setPackageBase(String packageBase) {
		this.packageBase = packageBase;
	}
	
	/**
	 * Load from file.
	 * 
	 * @param file
	 *            the file
	 * @return the tK provider
	 */
	public static TKProvider loadFromFile(File file) {
		TKProvider retVal = null;
		JAXBContext context;
		
			try {
				context = JAXBContext.newInstance(TKProvider.class);
				Unmarshaller um = context.createUnmarshaller();
				retVal = (TKProvider) um.unmarshal(new FileReader(file));
				return retVal;
			} catch (JAXBException e) {
				// TODO Auto-generated catch block
				logger.error(e);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				logger.error(e);
			}
		return retVal;
	}
	
	/**
	 * Save to file.
	 * 
	 * @param tkProvider
	 *            the tk provider
	 * @param file
	 *            the file
	 */
	public static void saveToFile(TKProvider tkProvider, File file) {
		logger.debug("Creating xml for " + tkProvider);
		try {
			JAXBContext context = JAXBContext.newInstance(TKProvider.class);
			Marshaller m = context.createMarshaller();
			m.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE );
			m.marshal(tkProvider, new FileWriter(file));
			logger.debug("xml written to " + file);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			logger.error(e);
		} catch (Exception e) {
			logger.error(e);

		}
	}
	
	/**
	 * Instantiates a new tK provider.
	 */
	private TKProvider() {
		
	}
	
	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		TKProvider tkp = new TKProvider();
		tkp.setPackageBase("net.lother.cosix.tk.swing");
		saveToFile(tkp, new File("tkprovider.xml"));
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return this.packageBase;
	}
	
	/**
	 * New tabbed pane.
	 * 
	 * @param tabPlacement
	 *            the tab placement
	 * @return the tabbed pane
	 */
	public static TabbedPane newTabbedPane(int tabPlacement) {
		// TODO Auto-generated method stub
		TabbedPane tp = (TabbedPane) newInstance("TabbedPane");
		tp.setTabPlacement(tabPlacement);
		return tp;
	}
	
	/**
	 * New flow layout.
	 * 
	 * @param alignment
	 *            the alignment
	 * @param hgap
	 *            the hgap
	 * @param vgap
	 *            the vgap
	 * @return the flow layout
	 */
	public static FlowLayout newFlowLayout(String alignment, int hgap, int vgap) {
		// TODO Auto-generated method stub
		FlowLayout layout = (FlowLayout) newInstance("FlowLayout");
		layout.setAlignment(alignment);
		layout.setHgap(hgap);
		layout.setVgap(vgap);
		return layout;
	}
	
	/**
	 * New border layout.
	 * 
	 * @param hgap
	 *            the hgap
	 * @param vgap
	 *            the vgap
	 * @return the border layout
	 */
	public static BorderLayout newBorderLayout(int hgap, int vgap) {
		// TODO Auto-generated method stub
		BorderLayout layout = (BorderLayout) newInstance("BorderLayout");
		layout.setHgap(hgap);
		layout.setVgap(vgap);
		return layout;
	}
	
	/**
	 * New border layout.
	 * 
	 * @return the border layout
	 */
	public static BorderLayout newBorderLayout() {
		// TODO Auto-generated method stub
		BorderLayout layout = (BorderLayout) newInstance("BorderLayout");
		return layout;
	}
	
	/**
	 * New panel.
	 * 
	 * @return the panel
	 */
	public static Panel newPanel() {
		return (Panel) newInstance("Panel");
	}
	
	/**
	 * New button.
	 * 
	 * @param text
	 *            the text
	 * @return the button
	 */
	public static Button newButton(String text) {
		Button retVal = (Button) newInstance("Button");
		retVal.setText(text);
		return retVal;
	}

	/**
	 * New grid bag layout.
	 * 
	 * @return the grid bag layout
	 */
	public static GridBagLayout newGridBagLayout() {
		// TODO Auto-generated method stub
		return (GridBagLayout) newInstance("GridBagLayout");
	}

	/**
	 * New label.
	 * 
	 * @param text
	 *            the text
	 * @return the label
	 */
	public static Label newLabel(String text) {
		// TODO Auto-generated method stub
		Label retVal = (Label) newInstance("Label");
		retVal.setText(text);
		return retVal;
	}

	/**
	 * New combo box.
	 * 
	 * @return the combo box
	 */
	public static ComboBox newComboBox() {
		// TODO Auto-generated method stub
		return (ComboBox) newInstance("ComboBox");
	}
	
	/**
	 * New menu item.
	 * 
	 * @param key
	 *            the key
	 * @return the menu item
	 */
	public static MenuItem newMenuItem(String key) {
		// TODO Auto-generated method stub
		MenuItem retVal = (MenuItem) newInstance("MenuItem");
		retVal.setText(key);
		return retVal;
	}
	
	/**
	 * New tray.
	 * 
	 * @param menu
	 *            the menu
	 * @return the tray
	 */
	public static Tray newTray(PopupMenu menu) {
		// TODO Auto-generated method stub
		Tray retVal = (Tray) newInstance("Tray");
		retVal.setPopupMenu(menu);
		return retVal;
	}
	
	
}
