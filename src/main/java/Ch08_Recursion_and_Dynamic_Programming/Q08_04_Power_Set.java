package Ch08_Recursion_and_Dynamic_Programming;

import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;

public class Q08_04_Power_Set {
    public Set<Set<Integer>> subSets(Set<Integer> set) {
        Set<Set<Integer>> newSets = new HashSet<>();
        ArrayList<Integer> arrayListOfSet = new ArrayList<>(set);
        for(int i = 0; i < set.size(); i++) {
            for(int j = i; j < set.size(); j++) {
                Set<Integer> newSet = new HashSet<>();
                for(int k = i; k <= j; k++) {
                    newSet.add(arrayListOfSet.get(k));
                }
                newSets.add(newSet);
            }
        }
        if(set.size() != 0) {
            newSets.add(new HashSet<>());
        }
        return newSets;
    }
}