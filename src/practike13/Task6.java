package practike13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * В методе main считай с консоли имя файла, который
 * содержит слова, разделенные пробелом.
 *
 * В методе getLine() используя StringBuilder расставьте все слова в таком порядке, чтобы последняя буква
 * данного слова совпадала с первой буквой следующего не учитывая регистр.
 * Каждое слово должно участвовать 1 раз.
 */
public class Task6 {

    //resources/images/java

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();
        scanner.close();
        BufferedReader reader = new BufferedReader(new FileReader("resources/task6/"+filename));
        String line;
        ArrayList<String> wordsList = new ArrayList<>();
        while((line = reader.readLine()) != null){
            String[] splitLine = line.split(" ");
            for(String s: splitLine) {
                wordsList.add(s);
            }
        }
        reader.close();
        StringBuilder result = getLine(wordsList);
        System.out.println(result);
    }


    /**
     * Используя StringBuilder расставьте все слова в таком порядке, чтобы последняя буква
     *  * данного слова совпадала с первой буквой следующего не учитывая регистр.
     *  * Каждое слово должно участвовать 1 раз.
     * @param wordsList
     * @return
     */
    public static StringBuilder getLine(ArrayList<String> wordsList) {
        Queue<String> toAdd = new ArrayDeque<>(wordsList); //lifo

        Set<String> added = new HashSet<>();
        added.add(toAdd.peek());

        StringBuilder sb = new StringBuilder(toAdd.remove());
        boolean wasAdded = true;
        while(!toAdd.isEmpty() && wasAdded){
            wasAdded = false;
            int i = 0;

            for (; i < toAdd.size(); i++) {
                String cur = toAdd.remove();
                if(added.contains(cur)) continue;
                if(cur.startsWith(sb.substring(sb.length()-1).toLowerCase()) ||
                        cur.startsWith(sb.substring(sb.length()-1).toUpperCase())){

                    sb.append(" ").append(cur);
                    wasAdded = true;
                    added.add(cur);
                    break;
                }
                toAdd.add(cur);
            }

            // region чистим если слово входит в коллекцию
            for(; i< toAdd.size(); i++){
                String cur = toAdd.remove();
                if(added.contains(cur)) continue;
                toAdd.add(cur);
            }
            // endregion
        }
        return sb;
    }

}
