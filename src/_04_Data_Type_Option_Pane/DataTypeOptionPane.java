package _04_Data_Type_Option_Pane;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import _03_Intro_to_Enums.EnumDemo.Planets;

public class DataTypeOptionPane {
    public static void main(String[] args) {
    		DataType[] dataTypes;
        dataTypes = DataType.values();
        int input = JOptionPane.showOptionDialog(null, "Pick one of the variable types.", "Var Choice", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, new ImageIcon("dataTypes.png"), dataTypes, 0);
        switch (input) {
        case 0: {
        	System.out.println("The variable type is " + dataTypes[0] + " and it has " + dataTypes[0].getBits() + " bits");
        	break;
        }
        case 1: {
        	System.out.println("The variable type is " + dataTypes[1] + " and it has " + dataTypes[1].getBits() + " bits");
        	break;
        }
        case 2: {
        	System.out.println("The variable type is " + dataTypes[2] + " and it has " + dataTypes[2].getBits() + " bits");
        	break;
        }
        case 3: {
        	System.out.println("The variable type is " + dataTypes[3] + " and it has " + dataTypes[3].getBits() + " bits");
        	break;
        }
        case 4: {
        	System.out.println("The variable type is " + dataTypes[4] + " and it has " + dataTypes[4].getBits() + " bits");
        	break;
        }
        case 5: {
        	System.out.println("The variable type is " + dataTypes[5] + " and it has " + dataTypes[5].getBits() + " bits");
        	break;
        }
        case 6: {
        	System.out.println("The variable type is " + dataTypes[6] + " and it has " + dataTypes[6].getBits() + " bits");
        	break;
        }
        case 7: {
        	System.out.println("The variable type is " + dataTypes[7] + " and it has " + dataTypes[7].getBits() + " bits");
        	break;
        }
        }

    }
    enum DataType {
    		BYTE(8),SHORT(16),INT(32),LONG(64),FLOAT(32),DOUBLE(64),BOOLEAN(1),CHAR(16);
    		
    		private final int bits;
    		
    		private DataType (int bits) {
        		this.bits = bits;
        }
        public int getBits() {
        		return this.bits;
        }
    }

}
