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
public class request extends Thread
{
    String aName;//flight name
    int weightA;//flight weight 
    int compTime;
    String type;
    runWay rw;
    
    public request(String aName,int weightA,String cho,int compTime,runWay rw)
    {
        this.aName=aName;
	this.weightA=weightA;
	this.rw=rw;
	this.compTime=compTime;
	this.type=cho;
    }
    //public void set(runWay rw){this.rw=rw;}
    
    @Override
    public void run()
    {
	rw.status=false;
	try
        {
            System.out.println("---------------------------------------------------------------------------------");
            System.out.println(type+" Approved for "+aName+" with "+weightA+" tons of weight in "+rw.name);
            System.out.println("Touch down will happen in 15 sec");
            System.out.println("the plane will stop after "+compTime+" sec of touch down");
            System.out.println(rw.name+" will be ready for next request in "+compTime+" sec");
            System.out.println("---------------------------------------------------------------------------------");
            Thread.sleep(1000*compTime);
            rw.status=true;
	}
	catch(InterruptedException e)
        { 
            System.out.println(e);
	}
    }
}