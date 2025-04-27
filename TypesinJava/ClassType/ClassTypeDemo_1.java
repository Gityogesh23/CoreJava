
     class Car {
        private String model;
        private int year;
    
        public Car(String model, int year) {
            this.model = model;
            this.year = year;
        }
    
        public void displayInfo() {
            System.out.println("Model: " + model + ", Year: " + year);
        }
        @Override
        public String toString(){
            return "Model ="+model+",Year= "+year;
        }
    }
       public  class ClassTypeDemo_1 {
        public static void main(String[] args) {
            Car c1=new Car("Fortuner SUV800",2024 );
            System.out.println(c1);
        }
      }  

