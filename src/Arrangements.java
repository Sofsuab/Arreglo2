import javax.swing.*;

public class Arrangements {
    public static void main(String[] args) {
        JOptionPane jOptionPane;
        int numberNotes = Integer.valueOf(JOptionPane.showInputDialog("Enter the number of notes: "));
        double[] notes = new double[numberNotes];
        fillNotes(notes);
        double finalGrade = calculateFinalGrade(notes);
        JOptionPane.showMessageDialog(null, "The final grade is: " + finalGrade);
        double bubbleMethod[] = calculateBubbleMethod(notes);
        JOptionPane.showMessageDialog(null, "The notes in ascending order are: " + java.util.Arrays.toString(bubbleMethod));
        double highestRating = calculateHighestRating(notes);
        summary(notes);



        }


    public static double calculateFinalGrade(double[] notes) {
        double sum = 0;
        for (double note : notes) {
            sum += note;
        }
        return sum / notes.length;




}
    public static void fillNotes(double[] notes ) {
        for (int i=0 ; i< notes.length; i++) {
            notes[i]= Double.valueOf(JOptionPane.showInputDialog("Enter note " + (i + 1) + ": "));
        }


    }
    public static double calculateHighestRating(double[] notes) {
        double highestRating = notes[0];
        for(double note: notes) {
            if(note > highestRating) {
                highestRating = note;
            }
        }
        return highestRating;


    }
        public static double calculateLowestRating(double[] notes) {
            double lowestRating = notes[0];
            for(double note: notes) {
                if(note < lowestRating) {
                    lowestRating = note;
                }
            }
            return lowestRating;


        }
        public static double[] calculateBubbleMethod(double[] notes){

        double[] bubbleMethod= new double[notes.length];
            for (int i = 0; i < notes.length; i++) {
                bubbleMethod[i] = notes[i];
            }

        for(int i=0; i< bubbleMethod.length; i++) {
            for(int j=1;j< bubbleMethod.length   ;j++) {
                if(bubbleMethod[j] > bubbleMethod[j-1]) {
                    double temp = bubbleMethod[j];
                    bubbleMethod[j] = bubbleMethod[j-1];
                    bubbleMethod[j-1] = temp;



                }
            }
        }
        return bubbleMethod;

        }

        public static void approved(double[] notes) {
            double finalGrade = calculateFinalGrade(notes);
            if (finalGrade >= 3.0) {
                JOptionPane.showMessageDialog(null, "Congratulations! You have been approved with a final grade of: " + finalGrade);
            } else {
                JOptionPane.showMessageDialog(null, "Unfortunately, you have not been approved. Your final grade is: " + finalGrade);
            }
        }

        public static void summary(double[] notes) {
            double finalGrade = calculateFinalGrade(notes);
            double highestRating = calculateHighestRating(notes);
            double lowestRating = calculateLowestRating(notes);
            approved(notes);
            calculateBubbleMethod(notes);
            JOptionPane.showMessageDialog(null, "Summary:\nFinal Grade: " +
                    finalGrade + "\nHighest Rating: " + highestRating + "\nLowest Rating: " +
                    lowestRating + "\nNotes in Ascending Order: " + java.util.Arrays.toString
                    (calculateBubbleMethod(notes))+ "nApproved: " + (finalGrade >= 3.0 ? "Yes" : "No"));
        }
        



}

