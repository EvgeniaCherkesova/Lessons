public class PhoneList {
    public String[][] phoneList = new String[2][100];
    int size;

    public String add(String name, String phone){
        String str = "";
        int newSize = size + 1;
        String[][] newPhoneList = new String[2][newSize];
        for (int i = 0; i < size; i++) {
            newPhoneList[0][i] = phoneList[0][i];
            newPhoneList[1][i] = phoneList[1][i];
            if(name == phoneList[0][i]){
                str = phoneList[1][i];
                newPhoneList[1][i] = phone;
            }
        }
        if (str == "") {
            newPhoneList[0][newSize] = name;
            newPhoneList[1][newSize] = phone;
            size++;
        }
        phoneList = newPhoneList;
        return str;
    }

    public void remove(String name){
        for (int i = 0; i < size; i++) {
            if (name == phoneList[0][i]){
                for (int j = i+1; j < size; j++) {
                    phoneList[0][j-1] = phoneList[0][j];
                    phoneList[1][j-1] = phoneList[1][j];
                }
                phoneList[0][size-1] = null;
                phoneList[1][size-1] = null;
                size--;
            }
            return;
        }
    }

}
