/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interactions;

/**
 *
 * @author filip
 */
public class Occupation extends Human{
    String Position;
    double Salary;
    boolean Melancholy;
    int Enjoyment;
    
    Occupation (){}

    public Occupation(String Position, double Salary, boolean Melancholy, int Enjoyment) {
        this.Position = Position;
        this.Salary = Salary;
        this.Melancholy = Melancholy;
        this.Enjoyment = Enjoyment;
    }
    
    public void ListJobs (){
        System.out.print("1. Teacher\n2. Artist\n3. Programmer\n4. Bussinessman\n5. Other\n");
    }
    
    public int PickJob(){
        int s = 0;
        boolean T = true;
        while (T == true){
            if(s > 5 && s < 1){
                System.out.println("Error, try again");
            }else{
                T = false;
            }
        }
        switch(s){
            case 1: System.out.print("You chose " + s + "Teacher"); break;
            case 2: System.out.print("You chose " + s + "Artist"); break;
            case 3: System.out.print("You chose " + s + "Programmer"); break;
            case 4: System.out.print("You chose " + s + "Bussinessman"); break;
            case 5: System.out.print("You chose " + s + "Other"); break;
                    
        }
        return s;
    }
    
    public void gotoWork(String Name, String Surname){
        System.out.println(Name + Surname + "is going to work");
    }
    
    public void backfromWork(String Name, String Surname){
        System.out.println(Name + Surname + "is going home");
        System.out.println(Name + Surname + "has earned " + Salary);
    }
     
    public void Fulfilment (int Enjoyment, boolean Melancholy, int Will, boolean Ambition){
        if(Melancholy == true){
            if(Will > 2){
                if(Ambition == true){
                    //quit job
                }else{
                    //think method which randomly chooses a number, if it's >x then Ambition = true 
                }
            }else{
                // Salary increase
            }
        }else{
            Will++;
            if(Ambition == true){
                    //increase Salary greatly 
                }else{
                    // Salary increase
                    //Incease chance of think()
                }
        }        
    }    
}
