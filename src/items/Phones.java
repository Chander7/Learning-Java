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
  Switch (pc) {
    case "Samsung":
      pca = "This is a Samsung Phone";
      break;
    case "Apple":
      pca = "This is an Apple Phone";
      break;
    case "Microsoft":
      pca = "This is a Microsoft Phone";
      break;
    case "Huawei":
      pca = "This is a Huawei Phone";
      break;
    default:
      Throw new IllegalArgumentException ("This is an invalid entry" + pc);
  }
return pca;
}





//phoneName
public String getPhoneName () {
  return this.phoneName;
}

public void setPhoneName (String pn) {
  this.phoneName = pn;
}


//phoneModel
public String getPhoneModel () {
  return this.phoneModel;
}

public void setPhoneModel (String pm) {
  this.phoneModel = pm;
}


}
