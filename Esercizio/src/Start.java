public class Start {
    public static void main(String[] args) {
        String[] arr = new String[]{
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        };
        for(int i = 0; i < arr.length; i++){
            String value = arr[i];

            if(i % 2 == 0){
                String theValue = arr[i].toUpperCase();
                System.out.println("giorno: " + theValue);
            }else System.out.println("giorno: " + value);
        }
    }
}


