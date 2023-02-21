public class Start {
    public static void main(String[] args) {
        String[] arr = new String[]{
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        };
        for(int i = 0; i < arr.length;){
            arr[i] = arr[i].toUpperCase();
            i += 2;
        }
        for(String giorno: arr){
            System.out.println(giorno);
        }
    }
}


