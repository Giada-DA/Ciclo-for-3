public class Start {
    public static void main(String[] args) {
        String[] arr = new String[]{
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        };
        for(int i = 0; i < arr.length; i++){
            if(i % 2 == 0){
                System.out.println("giorno: " + arr[i]);
            }else System.out.println("giorno: " + arr[i].toUpperCase());
        }
    }
}


