import javax.swing.JOptionPane;

public class quizManagement {
	
	
	public static int showMenuOptions(){

		String[] options = {"DNA", "PLANT"};

	    int x = JOptionPane.showOptionDialog(null, "Select a subject for starting Quiz.",
	            "Quiz Management System",
	            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
		return x;
    }
	
	public static void quiz1_dna() {
		OnlineTest onlineTest=new OnlineTest("Quiz System");
		onlineTest.set();
	}
	public static void quiz2_dna() {
		OnlineTest1 onlineTest1=new OnlineTest1("Quiz System");
		onlineTest1.set();
	}
	public static void quiz3_dna() {
		OnlineTest2 onlineTest2=new OnlineTest2("Quiz System");
		onlineTest2.set();
	}
	public static void quiz4_dna() {
		OnlineTest3 onlineTest3=new OnlineTest3("Quiz System");
		onlineTest3.set();
	}
	public static void quiz5_plant() {
		OnlineTest4 onlineTest4=new OnlineTest4("Quiz System");
		onlineTest4.set();
	}
	public static void quiz6_plant() {
		OnlineTest5 onlineTest5=new OnlineTest5("Quiz System");
		onlineTest5.set();
	}
	public static void quiz7_plant() {
		OnlineTest6 onlineTest6=new OnlineTest6("Quiz System");
		onlineTest6.set();
	}
	public static void quiz8_plant() {
		OnlineTest7 onlineTest7=new OnlineTest7("Quiz System");
		onlineTest7.set();
	}
	
	
	public static void showQuizzez_dna() {
		String[] options = {"Quiz1", "Quiz2", "Quiz3", "Quiz4"};

	    int x = JOptionPane.showOptionDialog(null, "Select a Quiz number for starting Quiz.",
	            "Quiz Management System",
	            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
	    boolean run = true;
        while(run){
            switch (x){
                case 0:
                    quiz1_dna();
                    run=false;
                    break;

                case 1:
                	quiz2_dna();
                    run=false;
                    break;
                case 2:
                	quiz3_dna();
                    run=false;
                    break;
                case 3:
                	quiz4_dna();
                    run=false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Invalid option selected");

            }//end of switch block

        } //end of while
		
	}
	public static void showQuizzez_plant() {
		String[] options = {"Quiz1", "Quiz2", "Quiz3", "Quiz4"};

	    int x = JOptionPane.showOptionDialog(null, "Select a Quiz number for starting Quiz.",
	            "Quiz Management System",
	            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
	    boolean run = true;
        while(run){
            switch (x){
                case 0:
                    quiz5_plant();
                    run=false;
                    break;

                case 1:
                	quiz6_plant();
                    run=false;
                    break;
                case 2:
                	quiz7_plant();
                    run=false;
                    break;
                case 3:
                	quiz8_plant();
                    run=false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Invalid option selected");

            }//end of switch block

        } //end of while
		
	}
	 
    public static void selectSubject(int x){

        boolean run = true;
        while(run){
            switch (x){
                case 0:
                    showQuizzez_dna();
                    run=false;
                    break;

                case 1:
                	showQuizzez_plant();
                	run=false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Invalid option selected");

            }//end of switch block

        } //end of while
    }
	
	
	public static void main(String args[]) {
		
		   
	    
		selectSubject(showMenuOptions());
	    	
		
		    

	    
	
	}
}

/*
import javax.swing.JOptionPane;

public class AddressBookController {

    private AddressBookManager addBookManager;

    public AddressBookController(){
        addBookManager = new AddressBookManager();
    }

    private String showMenuOptions(){
        return JOptionPane.showInputDialog("Press 1 input movie name and ratting from 1 to 5\n Press 2 display the rating of specific movie\n Press 3 display the rating of the top movie\n Press 0 to Exit");
    }

    private void addContact(){
        String name = JOptionPane.showInputDialog("Please enter Movie name");
        String ph = JOptionPane.showInputDialog("Please enter the rating");
        addBookManager.addContact(name, ph);

    }

    private void searchContact(){
        String keyword = JOptionPane.showInputDialog("Please enter the name which you want to search");
        String result = addBookManager.searchContactByName(keyword);
        JOptionPane.showMessageDialog(null, result);
    }

    public void startAddressBook(){

        boolean run = true;
        while(run){
            String option = showMenuOptions();
            switch (option){
                case "1":
                    addContact();
                    break;

                case "2":
                    searchContact();
                    break;

                case "3":
                  //  topMovie();
                    break;

                case "0":
                    run = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Invalid option selected");

            }//end of switch block

        } //end of while
    }
    public static void main(String[] args){
        AddressBookController controller = new AddressBookController();
        controller.startAddressBook();
    }
}

*/