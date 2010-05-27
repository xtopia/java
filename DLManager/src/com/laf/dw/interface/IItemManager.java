package com.laf.dw.interface;
/*
    IItemManager.java

    This is an interface to define functions, which can be accessed from 
    the outside of the regional scope.

 * @Author : J.Hwang
 * @Version: Draft
 */
import com.laf.dw.base.ItemReader;

public interface IItemManager {

    // the max of threads that can be run simultaneously at once.
    public static final int MAX_MULTITHREAD = 5;

    // get the item index
	public Integer getItemIndex(ItemReader itemReader);

    // delete the item
	public void deleteItem(ItemReader itemReader);

    // notify Message to Observers
    // should be synchrnoized
	public synchronized void notifyObservers();

    // update the item
	public void updateItem(ItemReader itemReader);

    // update the current status
	public void updateItemStatus(ItemReader itemReader, String status); 

    // startNext
    // should be synchrnoized
	public synchronized void startNext(); 

    // start downloading.
	public void start(); 

    // quit the current work;
	public void quit();

    // add a new item to the downloading list
    // should be synchrnoized
	public synchronized void addItem(String filename) throws Exception; 

    // add a new item to the downloading list with delaying time in milliseconds.
    // should be synchrnoized
	public synchronized void addItem(String filename, int delay) throws Exception; 

    // process the actual downloading..
	public void process();

    // if provided, load a list on starting up.
	public void loadOnStartup();

    // handles any errors during the main process.
	public void processErrorHandler(Exception e, String str) ;

}
