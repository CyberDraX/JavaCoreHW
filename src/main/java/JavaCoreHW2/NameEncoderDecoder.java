package JavaCoreHW2;

public class NameEncoderDecoder {

    public String encode (String name){
        String code = name.trim().replace("e","1")
                                 .replace("u","2")
                                 .replace("i","3")
                                 .replace("o","4")
                                 .replace("a","5");
        return "NOTFORYOU" + code + "YESNOTFORYOU";
    }

    public String decode (String name){
        String replaceFistPart = name.substring(9).replace("YESNOTFORYOU", "").strip();
        return replaceFistPart.replace("1","e")
                              .replace("2","u")
                              .replace("3","i")
                              .replace("4","o")
                              .replace("5","a");
    }

    static void main(String[] args) {
        NameEncoderDecoder ned = new NameEncoderDecoder();

        //Should be "NOTFORYOUCr5bYESNOTFORYOU"
        String encodedName = ned.encode("Crab");
        System.out.println("ned.encode(\"Crab\") = " + encodedName);

        //Should be "Crab"
        String decodedName = ned.decode("NOTFORYOUCr5bYESNOTFORYOU");
        System.out.println("ned.decode(\"NOTFORYOUCr5bYESNOTFORYOU\") = " + decodedName);

        //Should be "NOTFORYOU"
        String encodedName2 = ned.encode("NOTFORYOUNOTFORYOUYESNOTFORYOU");
        System.out.println("ned.encode(\"NOTFORYOUNOTFORYOUYESNOTFORYOU\") = " + encodedName2);
    }
}
