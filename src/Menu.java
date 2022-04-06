package src;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Menu {
    Map<Integer, MenuRow> menu = new HashMap<>();

    public Menu(MenuRow[] rows) {
        int i = 0;
        for (MenuRow row : rows) {
            // Build HashMap for lookup convenience
            menu.put(i++, new MenuRow(row.getTitle(), row.getAction()));
        }
    }
    public MenuRow get(int i) {
        return menu.get(i);
    }

    public void print() {
        for (Map.Entry<Integer, MenuRow> pair : menu.entrySet()) {
            System.out.println(pair.getKey() + " :  " + pair.getValue().getTitle());
        }
    }

    public static void main(String[] args) {
        Driver.main(args);
    }

}

// The MenuRow Class has title and action for individual line item in menu
class MenuRow {
    String title;     
    Runnable action;    

    public MenuRow(String title, Runnable action) {
        this.title = title;
        this.action = action;
    }

    public String getTitle() {
        return this.title;
    }
    public Runnable getAction() {
        return this.action;
    }

    public void run() {
        action.run();
    }

}

class Driver {
  public static void runMenu(Menu current){
      while (true) {
  
              System.out.println("Choose:");
              // print rows
              current.print();
  
              // Scan for input
              try {
                  Scanner sc = new Scanner(System.in);
                  int selection = sc.nextInt();
  
                  // menu action
                  try {
                      MenuRow row = current.get(selection);
                      // stop menu condition
                      if (row.getTitle().equals("Exit"))
                          return;
                      // run option
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();
                    System.out.println(row.getTitle());
                      row.run();
                  } catch (Exception e) {
                      System.out.printf("Invalid selection %d\n", selection);
                  }
              } catch (Exception e) {
                  System.out.println("Not a number");
              }
          }
    }

  
    public static void main(String[] args) {
        // Row initialize
        MenuRow[] rows = new MenuRow[]{
                new MenuRow("Back", () -> main(null)),
                new MenuRow("IntByReference", () -> IntByReference.main(null)), 
                new MenuRow("Matrix", () -> Matrix.main(null))
        };


        // Menu construction
        Menu menu0 = new Menu(rows);
      

      MenuRow[] techtalks = new MenuRow[]{
        new MenuRow("TechTalk 0", () -> runMenu(menu0))
      };

      Menu techtalksmenu = new Menu(techtalks);

      runMenu(techtalksmenu);
    }
}
