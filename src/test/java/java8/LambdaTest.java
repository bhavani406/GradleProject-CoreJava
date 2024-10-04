package java8;

    @FunctionalInterface
    interface Calculator{
        int sum(int a,int b);
    }

    public class LambdaTest{
        public static void main(String[] args) {
            Calculator cal =(a,b)-> {
                if(a>b) {
                    throw new RuntimeException("a should be bigger");
                }
                else
                    return a-b;
            };

            System.out.println(cal.sum(3,4));
            // ()->{}
        }
    }

