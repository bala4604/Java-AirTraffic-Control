/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package air.traffic.control;

/**
 *
 * @author Balaji
 */
public class runWay extends Thread
{
    String name;
    int time;
    boolean status;//true - free and false - busy
    runWay(String name,int time,boolean status)
    {
    	this.name=name;
	this.time=time;
	this.status=status;
    }
}