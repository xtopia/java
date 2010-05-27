package com.laf.dw.interface;

/*
    IItemReader.java

 * @Author: J.Hwang 
 * @Verion: Draft;
 */
import com.laf.dw.items.FileItem;
import java.io.InputStream;
import java.io.OutputStream;

public class IItemReader extends Runnable {

	public FileItem getItem() ;

	public String getFilename() ;

	public void setSize(long size) ;

	public long getSize() ;

	public void setAutoLazyDelay() ;
	
	public void setDelay(int delay) ;

	public boolean remains() ;

	public void setInputStream(InputStream in) ;

	public InputStream getInputStream() ;
	
	public void setOutputStream(OutputStream out) ;

	public void update() ;

	public void runNext() ;

	public void setCurrent(long current) ;
	
	public void close() ;

	public int getDelay() ;

	public void delayTime() ;
}
