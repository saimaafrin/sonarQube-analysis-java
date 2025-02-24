import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // There are eight planets in our solar system: the closerst to the Sun 
    // is Mercury, the next one is Venus, then Earth, Mars, Jupiter, Saturn, 
    // Uranus, Neptune.
    // Write a function that takes two planet names as strings planet1 and planet2. 
    // The function should return a pair containing all planets whose orbits are 
    // located between the orbit of planet1 and the orbit of planet2, sorted by 
    // the proximity to the sun. 
    // The function should return an empty pair if planet1 or planet2
    // are not correct planet names. 
    // Examples
    // >>> bf(("Jupiter"), ("Neptune"))
    // (new ArrayList<String>(Arrays.asList((String)"Saturn", (String)"Uranus")))
    // >>> bf(("Earth"), ("Mercury"))
    // (ArrayList<String>("Venus"))
    // >>> bf(("Mercury"), ("Uranus"))
    // (new ArrayList<String>(Arrays.asList((String)"Venus", (String)"Earth", (String)"Mars", (String)"Jupiter", (String)"Saturn")))
    public static ArrayList<String> bf(String planet1, String planet2) {

        // list of planets
        ArrayList<String> planets = new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"));
        // list of planets between orbit of planet1 and planet2
        ArrayList<String> between = new ArrayList<String>();
        // check if planet1 and planet2 are in the list of planets
        int index1 = planets.indexOf(planet1);
        int index2 = planets.indexOf(planet2);
        if (index1 == -1 || index2 == -1) {
            // if planet1 or planet2 not in the list of planets
            return new ArrayList<String>();
        }
        // if planet1 and planet2 are in the list of planets
        // sort the list of planets
        planets.sort((String) null);
        // add planets between orbit of planet1 and orbit of planet2 to the list of planets between orbit of planet1 and planet2
        for (int i = index1 + 1; i < index2; i++) {
            // add the planet to the list of planets between orbit of planet1 and planet2
            between.add(planets.get(i));
        }
        // return the list of planets between orbit of planet1 and planet2
        return between;
    }
    public static void main(String[] args) {
    assert(bf(("Jupiter"), ("Neptune")).equals((new ArrayList<String>(Arrays.asList((String)"Saturn", (String)"Uranus")))));
    assert(bf(("Earth"), ("Mercury")).equals((new ArrayList<String>(Arrays.asList((String)"Venus")))));
    assert(bf(("Mercury"), ("Uranus")).equals((new ArrayList<String>(Arrays.asList((String)"Venus", (String)"Earth", (String)"Mars", (String)"Jupiter", (String)"Saturn")))));
    assert(bf(("Neptune"), ("Venus")).equals((new ArrayList<String>(Arrays.asList((String)"Earth", (String)"Mars", (String)"Jupiter", (String)"Saturn", (String)"Uranus")))));
    assert(bf(("Earth"), ("Earth")).equals((new ArrayList<String>(Arrays.asList()))));
    assert(bf(("Mars"), ("Earth")).equals((new ArrayList<String>(Arrays.asList()))));
    assert(bf(("Jupiter"), ("Makemake")).equals((new ArrayList<String>(Arrays.asList()))));
    }

}
