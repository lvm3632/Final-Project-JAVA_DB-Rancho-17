package ProyectoRancho17;

import java.util.Random;

public class RandomAll {

    private static Random rand = new Random();
    private static String[] Beginning = {"Al", "Bal", "Ca", "Da", "Eb",
        "Fa", "Ga", "He", "Ig", "Ja", "Ka", "La", "Ma", "Na",
        "Ob", "Pa", "Qui", "Ra", "Sa", "Te", "Ur", "Vi", "Wo",
        "Xe", "Yo", "Za"};
    private static String[] Middle = {"el", "hel", "mi", "sor", "mee", "clo",
        "red", "cra", "ark", "arc", "miri", "lori", "cres", "mur", "zer",
        "marac", "zoir", "slamar", "salmar", "urak"};
    private static String[] End = {"d", "ed", "ark", "arc", "es", "er", "der",
        "tron", "med", "ure", "zur", "cred", "mur"};

    private static String[] Email = {
        "@hotmail.com", "@gmail.com", "@yahoo.com", "@univa.mx", "@microsoft.com", "@apple.com", "@riotgames.com",
        "@facebook.com", "@skype.com", "@amazon.com", "@ebay.com", "@spacex.com", "@solarcity.com", "@nasa.gov", "@oracle.com",
        "@blizzard.com", "@ibm.com", "@dell.com", "@google.com", "@steam.com", "@redbull.com", "@leagueoflegends.com"

    };

    private static String[] Address = {
        "25 Oak Meadow Road La Vergne", "455 Liberty Street", "539 Highland Lane", "94 West Oak Meadow Street", "8585 North Courtland Lane", "87 SE Surrey Lane", "7467 Redwood Ave",
        "636 Cemetery Street", "195 Washington Rd", "602 E. 8th Lane", "876 Iroquois Street Palm Harbor", "740 Euclid Street", "25 High Noon Street", "8465 Oxford Street",
        "9369 Cherry Hill Drive", "9213 Shadow Brook", "83 Rock Creek Drive", "6 Marsh Street", "83 Rock Creek Drive", "7041 Wayne Ave", "466 James Street"

    };

    private static int[] CodeCountry = {
        1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 39, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128,
        129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160,
        161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 179, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197

    };

 

 

    private static String[] UserID = {
        "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "100", "101", "102", "103", "104", "105", "1005",
        "1006", "1007", "25", "26", "27", "309", "102", "69", "483", "591", "9123", "182", "21", "123", "123", "1119"

    };

  

    private static String[] City = {
        "Busan", "El Cairo", "Bogota", "Seoul", "Chennai", "Ankara", "Yangon",
        "Moscow", "Lima", "Johannesburg", "Hyderabad", "Bangkok", "Dhaka", "Saint Petersburg", "New Taipei City",
        "Berlin", "Bangalore", "Hong Kong", "Delhi", "Sao Paulo", "Istanbul", "Rio de Janeiro", "Madrid", "Yokohama", "Singapore",
        "Santiago", "Beijing", "Mumbal", "Cairo", "Lahore", "Dubai", "Miami"

    };

    private static String[] State = {
        "Busan", "El Cairo", "Bogota", "Seoul", "Chennai", "Ankara", "Yangon",
        "Moscow", "Lima", "Johannesburg", "Hyderabad", "Bangkok", "Dhaka", "Saint Petersburg", "New Taipei City",
        "Berlin", "Bangalore", "Hong Kong", "Delhi", "Sao Paulo", "Istanbul", "Rio de Janeiro", "Madrid", "Yokohama", "Singapore",
        "Santiago", "Beijing", "Mumbal", "Cairo", "Lahore", "Dubai", "Miami"

    };

    private static String[] Zip = {
        "45079", "20354", "12354", "10001", "25661", "13254", "13542", "16548", "30634", "40569", "77451", "15971", "12361", "12524", "12347", "13543",
        "19785", "97125", "11113", "12541", "19742", "14568", "13347", "87152", "13478", "98741", "31452", "45010", "14789", "11471", "13741", "22582", "12544",
        "21542", "14215", "24854", "98714", "45555", "12321", "45610", "54621", "64541", "21412", "54871", "54147"

    };

    private static String[] Telephone = {
        "45079251", "20354251", "12354987", "10001203", "25661214", "13254555", "13542642", "16548123", "30634254", "40569147", "77451256", "15971124", "12361879", "12524456", "12347321", "13543147",
        "19785897", "97125741", "11113257", "12541214", "19742874", "14568695", "13347541", "87152258", "13478147", "98741658", "31452247", "45010456", "14789987", "11471852", "13741123", "22582471", "12544658",
        "21542712", "14215454", "24854120", "98714025", "45555457", "12321247", "45610014", "54621365", "64541874", "21412102", "54871147", "54147265"

    };

    public static String generateName() {

        return Beginning[rand.nextInt(Beginning.length)]
                + Middle[rand.nextInt(Middle.length)]
                + End[rand.nextInt(End.length)];

    }

    public static String generateLastName() {

        return Beginning[rand.nextInt(Beginning.length)]
                + Middle[rand.nextInt(Middle.length)]
                + " "
                + Beginning[rand.nextInt(Beginning.length)] + End[rand.nextInt(End.length)];

    }

    public static String generateEmail() {

        return Middle[rand.nextInt(Middle.length)]
                + End[rand.nextInt(End.length)] + Email[rand.nextInt(Email.length)];

    }

    public static String generateAddress() {

        return Address[rand.nextInt(Address.length)];

    }

    ;

 

    

    
 
    
        public static String generateUserID() {
        Random r = new Random();
        String randomNumber = String.format("%4d", r.nextInt(9999));

        return randomNumber;

    }

    ;

        public static String generateProductID(){
    
        Random r = new Random();
         String number = String.format("%8d", rand.nextInt(90000000) + 10000000);
        return number;
}
        
            
        public static String generateNoOrder(){
              Random r = new Random();
            /*String randomNumber = String.format("%5d", r.nextInt(99999));
            String randomNumber2 = String.format("%5d", r.nextInt(99999));
            String total = randomNumber + randomNumber2;*/
            String number = String.format("%5d", rand.nextInt(90000) + 10000);
                  String number2 = String.format("%5d", rand.nextInt(90000) + 10000);
             return number+number2;
            
        }

    public static String generateTelephone() {

        return Telephone[rand.nextInt(Telephone.length)];

    }
;

;


}
