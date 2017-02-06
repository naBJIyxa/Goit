package Module2.Task1;

    public class HomeWork1 {
        public static void main(String[] args) {

            HomeWork1 homeWork1 = new HomeWork1();

            int[] arrayInt = new int[10];
            for(int i=0; i<arrayInt.length; i++) {
                arrayInt[i] = (int)((Math.random() * 200) - 100);
            }

            double[] arrayDouble = new double[10];
            for(int i=0; i<arrayInt.length; i++) {
                arrayDouble[i] = (Math.random() * 200) - 100;
            }

            homeWork1.sum(arrayInt);
            homeWork1.sum(arrayDouble);

            homeWork1.min(arrayInt);
            homeWork1.min(arrayDouble);

            homeWork1.max(arrayInt);
            homeWork1.max(arrayDouble);

            homeWork1.maxPositive(arrayInt);
            homeWork1.maxPositive(arrayDouble);

            homeWork1.multiplication(arrayInt);
            homeWork1.multiplication(arrayDouble);

            homeWork1.modulus(arrayInt);
            homeWork1.modulus(arrayDouble);

            homeWork1.secondLargest(arrayInt);
            homeWork1.secondLargest(arrayDouble);

        }

        public void sum(int array[]){
            int sum=0;
            for (int anArray : array) {
                sum = sum + anArray;
            }
            System.out.println("int sum = " + sum);
        }

        public void sum(double array[]){
            double sum=0;
            for (double anArray : array) {
                sum = sum + anArray;
            }
            System.out.println("double sum = " + sum);
        }

        public void min(int array[]){
            int min = array[0];
            for (int anArray : array) {
                if (min > anArray) {
                    min = anArray;
                }
            }
            System.out.println("int min = " + min);
        }

        public void min(double array[]){
            double min = array[0];
            for (double anArray : array) {
                if (min > anArray) {
                    min = anArray;
                }
            }
            System.out.println("double min = " + min);
        }

        public void max(int array[]){
            int max = array[0];
            for (int anArray : array) {
                if (max < anArray) {
                    max = anArray;
                }
            }
            System.out.println("int max = " + max);
        }

        public void max(double array[]){
            double max = array[0];
            for (double anArray : array) {
                if (max < anArray) {
                    max = anArray;
                }
            }
            System.out.println("double max = " + max);
        }

        public void maxPositive(int array[]){
            int maxPos = array[0];
            for (int anArray : array) {

                if (maxPos < anArray) {
                    maxPos = anArray;
                }
            }
            if (maxPos <= 0) System.out.println("int maxPositive = all values with a sign \"-\"");
            else System.out.println("int maxPositive = " + maxPos);
        }

        public void maxPositive(double array[]){
            double maxPos = array[0];
            for (double anArray : array) {
                if (maxPos < anArray) {
                    maxPos = anArray;
                }
            }
            if (maxPos <= 0) System.out.println("double maxPositive = all values with a sign \"-\"");
            else System.out.println("double maxPositive = " + maxPos);
        }

        public void multiplication(int array[]){
            int multip = array[0];
            for (int anArray : array) {
                multip = multip * anArray;
            }
            System.out.println("int multiplication = " + multip);
        }

        public void multiplication(double array[]){
            double multip = array[0];
            for(double anArray : array) {
                multip = multip * anArray;
            }
            System.out.println("double multiplication = " + multip);
        }

        public void modulus(int array[]){
            int mod = array[0];
            mod = mod % array[array.length-1];
            System.out.println("int modulus = " + mod);
        }

        public void modulus(double array[]){
            double mod = array[0];
            mod = mod % array[array.length-1];
            System.out.println("double modulus = " + mod);
        }

        public void secondLargest(int array[]){
            int secLarg = array[0];
            int largest = array[1];

            if (secLarg > largest) {
                secLarg = array[1];
                largest = array[0];
            }

            for (int i=2; i<array.length; i++) {
                if ( array[i] <= largest && array[i] > secLarg ) {
                    secLarg = array[i];
                }
                if (array[i] > largest) {
                    secLarg = largest;
                    largest = array[i];
                }
            }
            System.out.println("int secondLargest = " + secLarg);
        }

        public void secondLargest(double array[]){
            double secLarg = array[0];
            double largest = array[1];

            if (secLarg > largest) {
                secLarg = array[1];
                largest = array[0];
            }

            for (int i=2; i<array.length; i++) {
                if ( array[i] <= largest && array[i] > secLarg ) {
                    secLarg = array[i];
                }
                if (array[i] > largest) {
                    secLarg = largest;
                    largest = array[i];
                }
            }
            System.out.println("double secondLargest = " + secLarg);
        }

    }