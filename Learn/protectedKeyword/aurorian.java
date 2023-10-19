package Learn.protectedKeyword;

    public class aurorian{


        // protected hanya bisa digunakan pada subclass
        protected String name;

        aurorian(String name){
            this.name = name;
        }

        protected String getName(){
            String name = this.name;
            return name;
        }

        protected void SetName(String name){
            this.name = name;
         // name = this.name;
        }

        protected void display(){
            System.out.println("Name : " + name);
        }
    }