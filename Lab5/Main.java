package Lab5;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args){
        try{
            BufferedReader file = new BufferedReader(new FileReader("NFZ.csv"));
            String tempDataHolder = "";
            int numberOfPatients = 0;
            while((tempDataHolder = file.readLine()) != null)
            {
                numberOfPatients++;
            }
            file.close();

            file = new BufferedReader(new FileReader("NFZ.csv"));
            Patient [] patients = new Patient[numberOfPatients-1];
            tempDataHolder = file.readLine();
            int i = 0;
            while((tempDataHolder = file.readLine()) != null)
            {
                String [] data = tempDataHolder.split(",");
                Patient patient = new Patient(Long.valueOf(data[0]).longValue(), data[1], Long.valueOf(data[2]).longValue(), new Address(data[3], Integer.valueOf(data[4]), data[5], data[6], data[7]));
                patients[i] = patient;
                i++;
            }
            file.close();

            for (Patient patient: patients) {
                System.out.println(patient);
            }
        }
        catch(Throwable err)
        {
            System.out.println(err);
        }
    }
}