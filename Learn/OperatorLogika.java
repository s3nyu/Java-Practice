package Learn;

public class OperatorLogika {

    public static void main(String[] args){

        boolean a,b,c;
        
        // Operasi OR 
        System.out.println(" ---- OR ( || ) ---- ");
        a=false;
        b=false;
        c=(a || b);
        System.out.println(a + " || " + b + " = " + c);

        a=false;
        b=true;
        c=(a || b);
        System.out.println(a + " || " + b + " = " + c);

        a=true;
        b=false;
        c=(a || b);
        System.out.println(a + " || " + b + " = " + c);

        a=true;
        b=true;
        c=(a || b);
        System.out.println(a + " || " + b + " = " + c);

        // Operasi AND
        System.out.println(" ---- AND ( && ) ---- ");
        a=false;
        b=false;
        c=(a && b);
        System.out.println(a + " && " + b + " = " + c);

        a=false;
        b=true;
        c=(a && b);
        System.out.println(a + " && " + b + " = " + c);

        a=true;
        b=false;
        c=(a && b);
        System.out.println(a + " && " + b + " = " + c);

        a=true;
        b=true;
        c=(a && b);
        System.out.println(a + " && " + b + " = " + c);

        // Operasi XOR 
        System.out.println(" ---- Exclusive OR ( ^ ) ---- ");
        a=false;
        b=false;
        c=(a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);

        a=false;
        b=true;
        c=(a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);

        a=true;
        b=false;
        c=(a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);

        a=true;
        b=true;
        c=(a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);

        //Operasi Negasi / Not
        System.out.println(" ---- Negasi ( ! ) ---- ");
        a=true;
        b=!a;
        System.out.println(a + " -->(!) = " + b);

        a=false;
        b=!a;
        System.out.println(a + " -->(!) = " + b);
        



    }
}
