package com.cc.java;

public class Cat 
{

    // // this -- Instanzvariable
    // void tellYourAddress(){
    //     App.output("Blick von innen: " + this);
    // }
public Cat getinstanceVariable() {
    return this;

}

public void tellYourAddress() {
	
}

public void showAddress() {
    System.out.println("Blick von innen: " + this);
}


}