package Paper2020;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Question4 {
    public static void main(String[] args) {
        String pathFile = "sampleLog.txt";
        int countWeng = 0;
        int countWilliam = 0;
        int countSharif = 0;
        int countAfandi = 0;
        ArrayList<ArrayList<String>> stat = new ArrayList<>();


        try (BufferedReader br = new BufferedReader(new FileReader(pathFile))) {
            String line;
            int i = 1;
            while ((line = br.readLine()) != null) {
                System.out.println("Record" + i);
                String[] parts = line.split(" ");
                for (String part : parts) {
                    System.out.println("\t" + part);
                }
                String[] checkSubmit = parts[1].split(";");// split the second part of the line
                //{2020-10-01, S , 14126.c=2.dicc.um.edu.my,user=weng}
                if (checkSubmit[1].equals("S") || checkSubmit[1].equals("E")) {// check if the second part is S
                    String[] users = checkSubmit[3].split("=");// split the user part
                    ArrayList<String> record = new ArrayList<>();
                    if (checkSubmit[1].equals("S")) {
                        for (String user : users) {
                            switch (user.toLowerCase()) {
                                case "weng" -> countWeng++;
                                case "william" -> countWilliam++;
                                case "sharif" -> countSharif++;
                                case "afandi" -> countAfandi++;
                            }
                        }
                        record.add(checkSubmit[2].split(".c=2.dicc.um.edu.my")[0]);// add the job id to the record
                        record.add(parts[4].split("queue=")[1]);// add the queue to the record
                        record.add(parts[8].split("start=")[1]);// add the start time to the record
                        if (parts.length > 17) {
                            if (parts[18].split("Exit_status=")[1].equals("1")) {
                                record.add(parts[17].split("end=")[1]);// add the end time to the record
                            } else {
                                record.add("Error: Exit status " + parts[18].split("Exit_status=")[1]);// add the error to the record
                            }
                        }else {
                            record.add("null");
                        }
                    }

                    if (checkSubmit[1].equals("E")) {
                        record.add(checkSubmit[2].split(".c=2.dicc.um.edu.my")[0]);// add the job id to the record
                        record.add(parts[4].split("queue=")[1]);// add the queue to the record
                        record.add(parts[8].split("start=")[1]);// add the start time to the record
                        if (parts[18].split("Exit_status=")[1].equals("1")) {
                            record.add(parts[17].split("end=")[1]);// add the end time to the record
                        } else {
                            record.add("Error: Exit status " + parts[18].split("Exit_status=")[1]);// add the error to the record
                        }

                    }


                    stat.add(record);


                }
                i++;
            }
            System.out.println("Total records: " + (i - 1));
        } catch (IOException e) {
            System.out.println("File not found");
        }

        System.out.println("****************************************");
        System.out.println("Print user submission stat ");
        System.out.printf("\n%-20s  %-15s", "User", "Jobs Submitted");
        System.out.println("\n--------------------------------------");
        System.out.printf("\n%-26s %-15d", "Weng", countWeng);
        System.out.printf("\n%-26s %-15d", "William", countWilliam);
        System.out.printf("\n%-26s %-15d", "Sharif", countSharif);
        System.out.printf("\n%-26s %-15d", "Afandi", countAfandi);
        System.out.println("\n****************************************");
        System.out.println("Print job status.");
        System.out.printf("\n%-10s %-24s %-24s %-23s", "Job ID", "Submitted (Queue)", "Started (Start time)", "Exited (end time/error)");
        for (ArrayList<String> records : stat) {
            System.out.printf("\n%-10s Y%-24s %-24s %-23s", records.get(0), "("+ records.get(1) + ")", records.get(2), records.get(3));
        }
    }
}
