package zackstudies.finalexam;

public class RandomWordChooser {
    private String[] words;
    private int wordsRemaining;

    public RandomWordChooser(String[] values) {
        words = new String[values.length];

        for(int i = 0; i < words.length; i++)
            words[i] = values[i];

        wordsRemaining = words.length;
    }

    public String getNext() {
        if(wordsRemaining == 0)
            return "NONE";
        int index = (int) (Math.random() * wordsRemaining);

        String selected = words[index];
        words[index] = words[wordsRemaining - 1];
        wordsRemaining--;

        return selected;
    }
}