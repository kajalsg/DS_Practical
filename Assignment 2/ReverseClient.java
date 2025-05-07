import ReverseModule.*;
import org.omg.CosNaming.*;
import org.omg.CORBA.*;
import java.io.*;

class ReverseClient {
    public static void main(String[] args) {
        try {
            ORB orb = ORB.init(args, null);
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            String name = "Reverse";
            Reverse Reverseimpl = ReverseHelper.narrow(ncRef.resolve_str(name));

            System.out.print("Enter String: ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
            String result = Reverseimpl.reverse_string(str);

            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
