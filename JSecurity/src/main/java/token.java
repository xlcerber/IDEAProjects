import java.io.FileInputStream;
import java.io.InputStream;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

// tag::T1[]
public class token {
    public static void main(String[] args) throws Exception {
        FileInputStream fr = new FileInputStream("D:\\WorkSpaces\\IdeaProjects\\Security\\src\\main\\java\\sdo.cer");
        CertificateFactory cf = CertificateFactory.getInstance("X509");
        X509Certificate c = (X509Certificate) cf.generateCertificate(fr);
        fr.close();

        System.out.println("\tVersion: " + c.getVersion());
        System.out.println("\tCertificate SN# " + c.getSerialNumber()); // <1>
        System.out.println("\tSignature: " + c.getSigAlgOID());
        System.out.println("\tCertificate issued by: " + c.getIssuerDN());
        System.out.println("\tPublic key: " + c.getPublicKey());
        System.out.println("\tCertificate for: " + c.getSubjectDN());

        System.out.println("\tThe certificate is valid from " + c.getNotBefore() + " to "
                + c.getNotAfter());

        System.out.println("\tGenerated with " + c.getSigAlgName());

        byte[] pbk = c.getPublicKey().getEncoded();
        for (int j = 0; j < pbk.length; j++) {
            System.out.print(pbk[j] + ",");
        }




        return;
    }
}
