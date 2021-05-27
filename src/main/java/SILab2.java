import java.util.ArrayList;
import java.util.List;

class Time {
    int hours;
    int minutes;
    int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
};

public class SILab2 {

    public List<Integer> function(List<Time> timesList) {//NODE 0
        List<Integer> result = new ArrayList<>();//NODE 1

        for (int i = 0; i < timesList.size(); i++) {//NODE 2
            int hr = timesList.get(i).getHours();//NODE 3
            int min = timesList.get(i).getMinutes();//NODE 4
            int sec = timesList.get(i).getSeconds();//NODE 5
            if (hr < 0 || hr > 24){//NODE 6
                if (hr < 0){//NODE 7
                    throw new RuntimeException("The hours are smaller than the minimum");//NODE 8
                }
                else {//NODE 9
                    throw new RuntimeException("The hours are grater than the maximum");//NODE 10
                }
            }
            else if (hr < 24) {//NODE 11
                if (min < 0 || min > 59) //NODE 12
                    throw new RuntimeException("The minutes are not valid!"); //NODE 13
                else { //NODE 14
                    if (sec >= 0 && sec <= 59) //NODE 15
                        result.add(hr * 3600 + min * 60 + sec);//NODE 16
                    else//NODE 17
                        throw new RuntimeException("The seconds are not valid");//NODE 18
                }
            }
            else if (hr == 24 && min == 0 && sec == 0) {//NODE 19
                result.add(hr * 3600 + min * 60 + sec);//NODE 20
            }
            else {//NODE 21
                throw new RuntimeException("The time is greater than the maximum");//NODE 22
            }
        }
        return result;//NODE 23
    }
}