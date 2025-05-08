
/**
 * Rhett Brink - RBrin0551
 * CIT 4423 01
 * Sep 16, 2022
 * macOS Sierra Version 10.12.6
 */

import javax.swing.JOptionPane;

public class Main {

    protected enum mpgRating {
        Poor, Fair, Good, Excellent, Error
    }//enumerated values representing the different conditions of a vehicle

    public static void main(String[] args) throws NumberFormatException, Exception {

        JOptionPane.showInputDialog(null, "What style of vehicle do you have?", null, JOptionPane.INFORMATION_MESSAGE);

        try {
            mpgRating mpgRating = getmpgRating(Double.parseDouble(String.valueOf(JOptionPane.showInputDialog(null,
                    "How many miles per gallon does your vehicle get?", null, JOptionPane.INFORMATION_MESSAGE))));
            if (mpgRating == mpgRating.Error) {
                JOptionPane.showMessageDialog(null, "Something went wrong.", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (mpgRating == mpgRating.Excellent) {
                JOptionPane.showMessageDialog(null, "Your vehicle has excellent gas milage.", "Excellent",
                        JOptionPane.INFORMATION_MESSAGE);
            } else if (mpgRating == mpgRating.Good) {
                JOptionPane.showMessageDialog(null, "Your vehicle has good gas milage.", "Good",
                        JOptionPane.INFORMATION_MESSAGE);
            } else if (mpgRating == mpgRating.Poor) {
                JOptionPane.showMessageDialog(null, "Your vehicle has poor gas milage.", "Poor",
                        JOptionPane.INFORMATION_MESSAGE);
            } else if (mpgRating == mpgRating.Fair) {
                JOptionPane.showMessageDialog(null, "Your vehicle has fair gas milage.", "Fair",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Something went wrong.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }// prompts for user input then returns a joptionpane corresponding to their chosen rating, numberformatexception in case user doesn't input a number

    public static mpgRating getmpgRating(double mpg) {
        try {
            if (mpg > 0 && mpg < 20) {
                return mpgRating.Poor;
            } else if (mpg >= 20 && mpg < 30) {
                return mpgRating.Fair;
            } else if (mpg >= 30 && mpg < 40) {
                return mpgRating.Good;
            } else if (mpg >= 40) {
                return mpgRating.Excellent;
            } else if (mpg <= 0) {
                return mpgRating.Error;
            }
        } catch (Exception e) {
            return mpgRating.Error;
        }
        return mpgRating.Error;
    }// takes user input mpg givtes it a rating that is returned, if userinput is 0 or less returns error
}// end of class