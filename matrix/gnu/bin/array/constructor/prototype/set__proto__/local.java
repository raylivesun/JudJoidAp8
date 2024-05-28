package matrix.gnu.bin.array.constructor.prototype.set__proto__;

import matrix.gnu.bin.option.prototype.hasOwnProperty.StartProperty;

public interface local {
    String names = "toLocaleString";
    /**
     * @param localString
     * @throws Exception
     */
    @SuppressWarnings("deprecation")
    public static void toLocaleString(String localString) throws Exception {
        @SuppressWarnings("unused")
        int length = localString.length();
        String[] parts = localString.split(localString);
        StartProperty.submit(parts);  
    }

    @SuppressWarnings("unlikely-arg-type")
    static boolean submit(String[] parts) {
        return StartProperty.local = names.equals(parts);
    }
}
