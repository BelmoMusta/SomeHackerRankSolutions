/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaProblems.dataStructure.comparator;
/**
 * <a href="https://www.hackerrank.com/challenges/java-comparator">Problem statement</a>
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class Player
{
	String name;
	int score;
}
class Checker {
    Comparator<Player> desc;

        public Checker() {
            desc= new Comparator<Player>() {

                @Override
                public int compare(Player a, Player b) {
                  if(a.score==b.score)
                      return b.name.compareToIgnoreCase(a.name);
                  
                  return b.score-a.score;
                }
            };
        }
    }

public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       
	  int N=Integer.parseInt(br.readLine().trim());
	  String s;
	  StringTokenizer st;
	  Player Player[]=new Player[N];
	  Checker check=new Checker();
	  for(int i=0;i<N;i++)
	  {
		  s=br.readLine().trim();
		  st=new StringTokenizer(s);
		  Player[i]=new Player();
		  Player[i].name=st.nextToken();
		  Player[i].score=Integer.parseInt(st.nextToken());
	  }
	 
	  Arrays.sort(Player,check.desc);
	  for(int i=0;i<Player.length;i++)
	  {
			System.out.printf("%s %s\n",Player[i].name,Player[i].score);
	  }

		
    }
  
}

