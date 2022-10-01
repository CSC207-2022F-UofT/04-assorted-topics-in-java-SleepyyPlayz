/* Below is the DrivableMap class, which is a map that contains a
 * HashMap mapping Strings to Drivable objects.
 * (Think of Python dictionaries as a comparison -- the concept is
 * similar!)
 *
 * Implement the requested methods as stated in the TODOs. We've
 * created the constructor for you already.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class DrivableMap {
    HashMap<String, Drivable> drivable_map;

    /**
     * A generic constructor that initializes car_map
     * as an empty HashMap.
     */
    public DrivableMap() {
        drivable_map = new HashMap<>();
    }

    /**
     * This method takes a String (the ID) and a Drivable object.
     * If the ID string does not appear as a key in drivable_map,
     * it adds the pair to drivable_map.
     * Returns true if the Drivable was added to drivable_map.
     *
     * @param id String id of the object
     * @param item Drivable item
     */
    public boolean addDrivable(String id, Drivable item){
        if(drivable_map.containsKey(id)){
            return false;
        }else{
            drivable_map.put(id, item);
            return true;
        }
    }


    /**
     * This method takes an int (a speed) and returns true iff
     * there is at least one item in drivable_map that has a maxSpeed >= the speed given.
     *
     * @param speed speed to be desired
     */
    public boolean hasFasterThan(int speed){
        for(Drivable item: drivable_map.values()){
            if(item.getMaxSpeed() >= speed){
                return true;
            }
        }
        return false;
    }


    /* TODO: Write a method named getTradable that takes no arguments and
     *       returns a List containing all of the Tradable items in
     *       drivable_map.
     */
    public List<Tradable> getTradable(){
        List<Tradable> lst = new ArrayList<Tradable>();

        for(Drivable item: drivable_map.values()){
            if(item instanceof Tradable){
                lst.add((Tradable) item);
            }
        }

        return lst;
    }


    
}