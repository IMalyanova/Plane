import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Plane {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> parking = new ArrayList<>();
        String deleteElement;
        final int COUNT_PLANE = 5;

        for (;;){

            System.out.println("Введите номер бортового самолета или команду: ");
            String command = reader.readLine().trim();

            if (command.equals("exit")) {
                    System.out.println("До новых встреч!");
                    break;
            }else {

                if (command.equals("exitLast")) {
                    if (parking.isEmpty()){
                        System.out.println("Стоянка пуста");
                    }else {
                        deleteElement = parking.remove(parking.size() - 1);
                        System.out.println("На вылет самолет с номером " + deleteElement);
                        }

                }else if (command.equals("exitAll")) {
                    if (parking.isEmpty()){
                        System.out.println("Стоянка пуста");
                    }else {
                        for (int i = parking.size() - 1; i >= 0; i --) {
                            System.out.println(parking.get(i));
                         }
                         parking.clear();
                    }

                }else if(parking.size() < COUNT_PLANE){
                    parking.add(command);
                }else {
                    System.out.println("Команда введена неверно! Стоянка самолетов заполнена.");
                }
            }
        }


    }
}
