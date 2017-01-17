package javaProblems.orientedObject.methodOverriding;

/**
 * Created by DELL on 17/01/2017.
 * <a href="https://www.hackerrank.com/challenges/java-method-overriding">Problem statement</a>
 */

class Sports{

    String getName(){
        return "Generic Sports";
    }

    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}

class Soccer extends Sports {
    @Override
    String getName() {
        return "Soccer Class";
    }

    @Override

    void getNumberOfTeamMembers()
    {
        System.out.println("Each team has 11 players in "+getName());
    }


    String getf_name()
    {
        return "Soccer Class";
    }

}




public class Solution{

    public static void main(String []args){
        Sports c1 = new Sports();
        Soccer c2 = new Soccer();
        System.out.println(c1.getName());
        c1.getNumberOfTeamMembers();
        System.out.println(c2.getName());
        c2.getNumberOfTeamMembers();
    }
}
