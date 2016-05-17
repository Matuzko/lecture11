package lecture10;

import java.io.*;


public class TextToFileWithCaesar {
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter = null;
    private String inputAddress;
    private String outputAddress;

    public TextToFileWithCaesar(String outputAddress, String inputAddress) {
        this.outputAddress = outputAddress;
        this.inputAddress = inputAddress;
    }

    public void doSomethind() throws IOException {
        try {
            bufferedReader = new BufferedReader(new FileReader(this.inputAddress));
            bufferedWriter = new BufferedWriter(new FileWriter(this.outputAddress));

            String s = bufferedReader.readLine();
            bufferedWriter.write(Caesar.fromNormalToCaesar(s));

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        }
    }


}
