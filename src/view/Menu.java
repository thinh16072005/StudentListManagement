package view;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Menu<T> {
    protected String title;
    protected ArrayList<T> mChon;
    
    public Menu() {}
    
    public Menu(String td, String[] mc){
        title = td;
        mChon = new ArrayList<>();
        for (String s : mc) mChon.add((T) s);
    }
//-------------------------------------------
    public void displayMenu(){
        System.out.println(title);
        System.out.println("--------------------------------");
        for(int i = 0; i < mChon.size(); i++)
            System.out.println((i + 1) + "." + mChon.get(i));
        System.out.println("--------------------------------");
    }
//-------------------------------------------
    public int getSelected(){
        displayMenu();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter selection..");
        return sc.nextInt();
    }
//-------------------------------------------
    public abstract void executeOptions(int n);
//-------------------------------------------
    public void run() {
        while(true) {
            int n = getSelected();
            executeOptions(n);
            if (n > mChon.size()) break;
        }
    }
//-------------------------------------------    
}

