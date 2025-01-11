package Question5;

import java.io.*;

public class CheckPairing {
    public static void main(String[] args) {
        String filePath = "participant.txt";
        String outputFile = "output.txt";
        String[][] participants = new String[4][4];
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int row = 0;
            while ((line = br.readLine()) != null && row < 4) {
                String[] parts = line.split(",", 4);
                for (int col = 0; col < 4; col++) {
                    participants[row][col] = parts[col].trim();
                }
                row++;
            }
        } catch (IOException e) {
            System.out.println("File not found");
        }
            // print the participant information
            for (String[] participant : participants) {
                System.out.printf("%-15s %-3s %-3s %-40s%n",
                        participant[0], // Name
                        participant[1], // Gender
                        participant[2], // Age
                        participant[3]  // Address
                );
            }

            //normalize the address
            for (int i = 0; i < participants.length; i++) {
                participants[i][3] = participants[i][3].replaceAll("\\s", "").toLowerCase();
                // remove the spaces and convert to lowercase
                // \\s so that it can match any whitespace character such as space, tab, newline
            }
            //check for debugging
//            System.out.println("Normalized addresses:");
//            for (String[] participant : participants) {
//                System.out.println(participant[3]);
//            }
            //check for pairing
            boolean[] isPaired = new boolean[4];

            int pairCount = 0;
            for (int i = 0; i < 4; i++) {
                if (!isPaired[i]) {
                    for (int j = i + 1; j < 4; j++) {
                        if (!isPaired[j]) {
                            if (participants[i][3].equals(participants[j][3]) && !participants[i][1].equals(participants[j][1])) {
                                //compare address and gender not equal
                                isPaired[i] = true;
                                isPaired[j] = true;
                                pairCount++;
                                break;// break the inner loop

                            }
                        }
                    }
                }

            }

            if (pairCount == 2) {
                System.out.println("Pairing is successful");
                String[] seats = {"A", "B", "C", "D"};
                String[][] seating = new String[4][4];//seat name age


                int seatIndex = 0;
                for (int i = 0; i < 4; i++) {
                    if (!isPaired[i]) continue;
                    for (int j = i + 1; j < 4; j++) {
                        if (isPaired[j] && participants[i][3].equals(participants[j][3]) && !participants[i][1].equals(participants[j][1])) {
                         seating[seatIndex][0] = seats[seatIndex];
                            seating[seatIndex][1] = participants[i][0];
                            seating[seatIndex][2] = participants[i][2];
                            seatIndex++;
                            seating[seatIndex][0] = seats[seatIndex];
                            seating[seatIndex][1] = participants[j][0];
                            seating[seatIndex][2] = participants[j][2];
                            seatIndex++;
                        }

                    }

                }
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
                    for (String[] seat : seating) {
                        bw.write("seat: "+ seat[0] + " : " + seat[1] + ", " + seat[2] + " years old");
                        bw.newLine();
                    }
                    System.out.println("Seating arrangement saved to " + outputFile);
                } catch (IOException e) {
                    System.out.println("Error writing to file");
                }
            }else{
                System.out.println("Pairing is unsuccessful");
            }

        }


}
