/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algorithmsproject_longestpath;

/**
 *
 * @author pojan
 */
public class Path {
    public Node dest;
    public int weight;
    
    public Path(Node m, int w){
        this.dest = m;
        this.weight = w;
        
    }
    
    /*public int compareTo(Path p){
        int otherWeights = p.weight;
        return weight <otherWeights?-1:weight> otherWeights?1:0;
    
    implements Comparable<Path>
    }*/
}

