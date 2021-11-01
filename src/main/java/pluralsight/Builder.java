package pluralsight;

/*
A builder handles comploex constructors
has a large number of parameters
immutability after creating a contructor

tellescoping is when you are creating lots of constructors.
telescoping is worse than builder.
basically use builder
 */
public class Builder {
    public static void main(String[] args) {
        // simple demo of string builder object

        StringBuilder builder = new StringBuilder();

        builder.append("this is an example ");
        builder.append("of the builder pattern. ");
        builder.append("It has methods to append ");
        builder.append("almost everything we want to a string. ");
        builder.append(42);

        System.out.println(builder.toString());

    }

    // builder method in use
    // didint name it builder because i already used that as the class name
    public static class Builder1{
        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        public Builder1(){

        }

        //we couldve named this lunch order but due to our class name we are forced to call it Builder
//        public  Builder build(){
//          //  return new Builder(this);
//        }

        public Builder1 bread(String bread){
            this.bread = bread;
            return this;
        }
        public Builder1 condiments(String condiments){
            this.condiments = condiments;
            return this;
        }
        public Builder1 dressing(String dressing){
            this.dressing = dressing;
            return this;
        }
        public Builder1 meat(String meat){
            this.meat = meat;
            return this;
        }



    }

    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    private static void LunchOrder(Builder1 builder1){

    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }
}
