public interface Vehicle {

       //ABSTRACT METHODS
       void move(int amount);
       void applyBreak(int amount);
       int getSpeed();

       //CONSTANTS

       Double PURCHASE_RATE=0.5;

       //DEFAULT METHODS

       default double kmToMeter(){
              return (getSpeed()*18)/5;
       }

}
