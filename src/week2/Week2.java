/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week2;

/**
 *distributed vcs - configure local rep
 * s1 : intilize versioning , .gitconfig, .gitnore , commit
 * @author shabd
 */
public class Week2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Student [] list = new Student[3];
        // TODO code application logic here
        Student s1 = new Student(); // define s1name , age
        s1.setName("Shabd");
        s1.setAge(20);
        
        Student s2 = new Student(); // define s1name , age
        s2.setName("Gaurav");
        s2.setAge(15);
        
        Student s3 = new Student(); // define s1name , age
        s3.setName("Ansh");
        s3.setAge(23);
        
        //array
        list[0] = s1;   // stored objects in array
        list[1] = s2;
        list[2] = s3;
        
        for(int i=0; i<list.length; i++)
        {
        System.out.println(list[i].getName()+ " " + list[i].getAge());
        }
            
    }
    
}
