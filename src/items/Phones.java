public class Phones {

private String phoneName;
private String phoneModel;
private String phoneCompany;

private String phoneImei;
private String phoneColor;

private Long phoneNumber;

Boolean network3g;
Boolean network4g;

//Phonecompany

public String getPhoneCompany () {
  return this.phoneCompany;
}

public void setPhoneCompany (String pc) {
  String [] a = {"Samsung", "Apple", "Microsoft", "Huawei"};
}

//phoneName
public String getPhoneName () {
  return this.phoneName;
}

public void setPhoneName (String pn) {
  this.phoneName = pn;
}


}
