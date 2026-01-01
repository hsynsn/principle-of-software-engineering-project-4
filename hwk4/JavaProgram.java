class JavaProgram {

    static void function(int n1, int n2){
        for(int i = n1 + 1; i<n2; i++){
            if(i%2 == 1){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        function(1,10);
    }
}

