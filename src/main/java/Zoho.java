import io.restassured.response.Response;

import static io.restassured.RestAssured.*;


public class Zoho {

    //check changegit

    //hello

    public static void main(String[] args) {

        int applied = 0;
        int notApplied = 0;
        //String email = "abdimazhitovm@gmail.com";
        String appliedEmails= "";
        String notAppliedEmails = "";
        int counter=0;

        //variables for using
        int il = 0; // same line changes
        int va = 0; //second same line changegit s

        int online = 0;

    for(String email : emails) {
        System.out.println(++counter);
        Response re = given().params("authtoken", "32ecc7f456551465b0a2f91fa4b7f187", "scope", "crmapi", "selectColumns", "Leads(Programs)",
                "searchColumn", "email", "searchValue", email)
                .when().get("https://crm.zoho.com/crm/private/json/Leads/getSearchRecordsByPDC");

        Response re2 = given().params("authtoken", "32ecc7f456551465b0a2f91fa4b7f187", "scope", "crmapi", "selectColumns", "Contacts(Programs)",
                "searchColumn", "email", "searchValue", email)
                .when().get("https://crm.zoho.com/crm/private/json/Contacts/getSearchRecordsByPDC");


        String leadProgram = re.body().jsonPath().getString("response.result.Leads.row.FL[1].content");
        String contactProgram = re2.body().jsonPath().getString("response.result.Contacts.row.FL[1].content");

        String check = "";
        if (leadProgram != null || contactProgram != null) {
            if (leadProgram != null) {
                check = leadProgram;
            }else{
                check = contactProgram;
            }

        }
        if (re.body().asString().contains("There is no data to show") && re2.body().asString().contains("There is no data to show")) {
            notApplied++;
            notAppliedEmails += email + "\n";
        } else {
            applied++;
            appliedEmails += email + "\n";

            if (check.contains("Illinois") ) {
                il++;


            }else if (check.contains("Virginia") ) {
                va++;


            }else if (check.contains("Online")) {
                online++;


            }
        }
    }
        System.out.println("APPLIED TOTAL: " + applied);
        System.out.println("NOT APPLIED TOTAL: " + notApplied);

        System.out.println("VA Campus: " + va +", IL campus: " + il +", online: " + online);

//        System.out.println("");
//        System.out.println("NOT APPLIED TOTAL: " + notApplied);
//
//        System.out.println("APPLIED TOTAL: " + applied);
//        System.out.println("NOT APPLIED TOTAL: " + notApplied);



    }

    static String[] emails = {"desiretank01@gmail.com",
            "abdimazhitovm@gmail.com",
            "Mtayir4444@gmail.com",
            "malik.abdulhamidov@yahoo.com",
            "amer82tiger@gmail.com",
            "rabduwayit@gmail.com",
            "mubarek.ehmat@gmail.com",
            "azamatlimo@gmail.com",
            "abilkadirov.ra@gmail.com",
            "ablizm21@gmail.com",
            "abide0927@gmail.com",
            "adanbaevk@gmail.com",
            "ferganeagayeva@gmail.com",
            "my.agirbas@gmail.com",
            "nurcanagirbas1@gmail.com",
            "tarana82a@gmail.com",
            "dinaraaidarova88@gmail.com",
            "makpal.aitkazinova@gmail.com",
            "aytmatovpage@yahoo.com",
            "elvirka7@gmail.com",
            "aizhanim@gmail.com",
            "esranur@gmail.com",
            "Akcay10@hotmail.com",
            "ie8116@gmail.com",
            "tunaakdemir34@gmail.com",
            "nurayaksoy09@hotmail.com",
            "Bayas2000@gmail.com",
            "yousif.alkhafagi.harmony@gmail.com",
            "homsileather@aol.com",
            "calabacak@gmail.com",
            "betulalaparmak1@gmail.com",
            "betulalaz@hotmail.com",
            "mary4_ik@mail.ru",
            "abdallah_aleies@hotmail.com",
            "kaysar09@gmail.com",
            "mevlude.alic@gmail.com",
            "merzet.alip@gmail.com",
            "fuad88fuad@gmail.com",
            "dilmuratd@gmail.com",
            "0615cholpon@gmail.com",
            "sharif.amiri4@gmail.com",
            "ahmet6388@gmail.com",
            "abmn85@yahoo.com",
            "gaslanova87@gmail.com",
            "eatakahraman@gmail.com",
            "bahargula@gmail.com",
            "dowletmammet@icloud.com",
            "atambaev.urmat@mail.ru",
            "ozkanayata@yahoo.com",
            "aydoner91@hotmail.com",
            "diakamran@gmail.com",
            "azizlijahan@gmail.com",
            "yusuf_bayer@hotmail.com",
            "44aslantepe@gmail.com",
            "hakuban@yahoo.com",
            "donik_b@yahoo.com",
            "montano2015@mail.ru",
            "ruslanbaltabayev1983@gmail.com",
            "minakosta91@gmail.com",
            "bsrbym@hotmail.com",
            "lbayramli92@gmail.com",
            "fizuli@gmail.com",
            "jova_94@inbox.ru",
            "mansurbekmurodov@yahoo.com",
            "makifbektas@gmail.com",
            "begimay21@yahoo.com",
            "serapgungor@ymail.com",
            "esilturanbilgen@gmail.com",
            "betlmath@gmail.com",
            "ali.h.bozdogan@gmail.com",
            "bozkurt091@gmail.com",
            "ibozkurt79@yahoo.com",
            "mtbulut@gmail.com",
            "asselbuzheyeva@gmail.com",
            "mehmetcamalan@gmail.com",
            "serdar2225@hotmail.com",
            "celikesref@gmail.com",
            "sumeyye.cetintas@yahoo.com",
            "franchapman805@gmail.com",
            "charyeva@gmail.com",
            "integral38@hotmail.com",
            "karencontf24@gmail.com",
            "nicu_c@mail.ru",
            "suleymandaglar@gmail.com",
            "azrademirli@gmail.com",
            "demirfahri45@gmail.com",
            "anewlife044@gmail.com",
            "erdemdenizli@yahoo.com",
            "cetinberkadem@gmail.com",
            "bdimitrovbgd@gmail.com",
            "omerdoganguzel@gmail.com",
            "senelduman2015@gmail.com",
            "gokdar@gmail.com",
            "alikemaldurhan@gmail.com",
            "cevaderkoc@hotmail.com",
            "m.ezgu@yahoo.com",
            "aysegulkucuk06006@gmail.com",
            "marikrusmira@gmail.com",
            "emreekinci83@hotmail.com",
            "eva.arican@gmail.com",
            "ver4us@gmail.com",
            "aisuluu_11@mail.ru",
            "physic85@hotmail.com",
            "hamzaertugrul72@gmail.com",
            "azamatesenamanov@gmail.com",
            "af4work@gmail.com",
            "fgaforov93@gmail.com",
            "sgaforov@gmail.com",
            "zahidgahramanov@gmail.com",
            "amirhamza.gayurzoda112@gmail.com",
            "gogebakanalia@gmail.com",
            "hsyngkmn@gmail.com",
            "fatihgul@gmail.com",
            "growthmindset42@gmail.com",
            "tuberose11kc@gmail.com",
            "gnaci1026@gmail.com",
            "vugargurbanov.aze@gmail.com",
            "htayier@ashland.edu",
            "hansahasgur@gmail.com",
            "haidari.mohammadzaki@gmail.com",
            "arslanh@gmail.com",
            "hurmahm@gmail.com",
            "hojayev@gmail.com",
            "hhulagu@hotmail.com",
            "ilhanatike@gmail.com",
            "tezcan@cybertekschool.com",
            "incefree@hotmail.com",
            "sebneminegol@gmail.com",
            "firdevsisci@gmail.com",
            "iskenderovachynar10@gmail.com",
            "ismayilovmehrac@gmail.com",
            "ardian27@icloud.com",
            "b.janyew@gmail.com",
            "maratckg@gmail.com",
            "jumagylyjova@gmail.com",
            "fakilic@gmail.com",
            "alikocaaga@gmail.com",
            "ofkurban@gmail.com",
            "sarakadirovaewima@gmail.com",
            "adidon24@gmail.com",
            "aelwahit@gmail.com",
            "emilsoncorp@gmail.com",
            "kalemev@gmail.com",
            "gulia-sweet-89@mail.ru",
            "dmitriy_kalinin@vseyfe.com",
            "shaymaakalkan@gmail.com",
            "asalimi201012@gmail.com",
            "89krblt.27@gmail.com",
            "mervekaraks11@gmail.com",
            "bthnkaraman@outlook.com",
            "gursoyk@hotmail.com",
            "osmankaryagdi@gmail.com",
            "monchok30@gmail.com",
            "aselisa2030@gmail.com",
            "nuken2004@yahoo.com",
            "melihkasti@gmail.com",
            "ozlisongulkaya@gmail.com",
            "elmirakazakbaeva@yahoo.com",
            "yunus_kazan_81@hotmail.com",
            "miniandrii@hotmail.com",
            "mketenci3883@gmail.com",
            "AAKHALIL77@GMAIL.COM",
            "guliyarkhassanova@yahoo.com",
            "zelihaerkocak@gmail.com",
            "enkkurt90@gmail.com",
            "mkocer058@gmail.com",
            "tkorekoglu@gmail.com",
            "km.kosemelek@gmail.com",
            "kozanseref@gmail.com",
            "ik011583@gmail.com",
            "Elnurok@gmail.com",
            "kulmatkyzycholpon@gmail.com",
            "mivenedirova@gmail.com",
            "s.kulyyeva13@gmail.com",
            "deryakurt1976@gmail.com",
            "eldiar335@gmail.com",
            "muradlatifov90@gmail.com",
            "meerim.madakimova@jjay.cuny.edu",
            "nurulla30@gmail.com",
            "mansurov.r@gmail.com",
            "eamashkina@gmail.com",
            "mavlyanovf@gmail.com",
            "mavlyanovan@gmail.com",
            "katusha_2402@mail.ru",
            "metelskyi88@gmail.com",
            "mirakhmad77@yahoo.com",
            "misirova90@gmail.com",
            "ibrahimhalil.munigu@gmail.com",
            "arthur.muratov@gmail.com",
            "maral@nuriles.com",
            "anikuttu05@gmail.com",
            "bakitgulmira@gmail.com",
            "yakupnepesov83@gmail.com",
            "begmurad@gmail.com",
            "a.sinanoduncu@gmail.com",
            "joe.olmez@gmail.com",
            "asylbek020289@gmail.com",
            "novruzorayev55@gmail.com",
            "adiletorozbaev@gmail.com",
            "shodiyor81@gmail.com",
            "di.otonova@gmail.com",
            "natalieovdina@gmail.com",
            "menazat82@gmail.com",
            "busramozdemir1@gmail.com",
            "gamzeozr52@gmail.com",
            "mtarikozgur@gmail.com",
            "platoon20033@gmail.com",
            "mrt.ztrk33@gmail.com",
            "alphantoygar@gmail.com",
            "ozzfrkn@gmail.com",
            "sergeypakhotin@gmail.com",
            "bolinm@gmail.com",
            "zoyapen@gmail.com",
            "dowletogly@hotmail.com",
            "y.rahymov@gmail.com",
            "builder.dr@gmail.com",
            "rodintseva@gmail.com",
            "Scooterzt@gmaoil.com",
            "nestana.rysbekova@aiesec.net",
            "dianna68ru@gmail.com",
            "113liberty@gmail.com",
            "sabirov.erlan@gmail.com",
            "hsahiner10@gmail.com",
            "mmsalci@gmail.com",
            "ZUHRASALIEVA@GMAIL.COM",
            "mirfayz80@yahoo.com",
            "sanlialpmerve@gmail.com",
            "csavas22@gmail.com",
            "vdolontaeva@gmail.com",
            "maseker11@gmail.com",
            "philsencan@gmail.com",
            "mtsngzr168@gmail.com",
            "sensoy.reyhan@gmail.com",
            "irina_serafimova@hotmail.com",
            "seriakova.nataly@gmail.com",
            "mseyitoglu@outlook.com",
            "afsheensiddiki94@gmail.com",
            "olesyabuyselldc@gmail.com",
            "slusarchuk.roman@gmail.com",
            "tsmadiyar@gmail.com",
            "cemsoker45@gmail.com",
            "solikhonov@gmail.com",
            "suaybsoyubelli@hotmail.com",
            "izzetsozucok_35@hotmail.com",
            "adelsuleymanov1986@gmail.com",
            "fanissoul@yandex.ru",
            "sinenko.katya7771@gmail.com",
            "ethemsoylemez@hotmail.com",
            "saidtas71@gmail.com",
            "mustafaerentopal@hotmail.com",
            "mirshod.tairov@gmail.com",
            "serter57@hotmail.com",
            "atartar34@gmail.com",
            "ozcantayanc.ot@gmail.com",
            "adem469810@gmail.com",
            "shepket1@gmail.com",
            "izci@hotmail.com",
            "tkmnie2017@gmail.com",
            "oyun9121@gmail.com",
            "sayanamail@gmail.com",
            "osturkakin@gmail.com",
            "esadturkan@gmail.com",
            "devletmurat@gmail.com",
            "erkanerkanu2018@gmail.com",
            "hederubaldo@gmail.com",
            "slnucartx@gmail.com",
            "omerfarukugurlu@gmail.com",
            "dbuludag@gmail.com",
            "urkmezbilal07@gmail.com",
            "ustabekov_bek@mail.ru",
            "elvira.bizhanova@gmail.com",
            "waqif2017@hotmail.com",
            "merdany83@yahoo.com",
            "muhammet042899@icloud.com",
            "busrayalaza@gmail.com",
            "wiaam.yasin@gmail.com",
            "Seyfullahtx@gmail.com",
            "moymoy.oguzhan@gmail.com",
            "frdvs.2029.crkn@gmail.com",
            "senihyildirim@gmail.com",
            "yldrm.emine035@gmail.com",
            "yildirimervenur@gmail.com",
            "faatihyucel@gmail.com",
            "senihyurttakal@gmail.com",
            "khojiyusupov@gmail.com",
            "hotam.yusupov@gmail.com",
            "irfan@cybertekschool.com",
            "zeballos.veronica@gmail.com",
            "zzhangabatyrova@gmail.com",
            "zhigitek@gmail.com",
            "aiperizh@gmail.com",
            "ezhusupova88@gmail.com",
            "acar59@gmail.com",
            "orazovserdar@yahoo.com",
            "aytaclv@gmail.com",
            "ademoban@gmail.com",
            "antoonio.carlos@hotmail.com",
            "mehmet_durkan@icloud.com",
            "abuabaydaelsheikh@gmail.com",
            "halid.fer@msn.com",
            "bgthemanofsteel@gmail.com",
            "rcpkn@hotmail.com",
            "manshuk.karasaeva@gmail.com",
            "edynewjersey@gmail.com",
            "alinail13.ank@gmail.com",
            "izden@outlook.com",
            "amasroor88@gmail.com",
            "waelmouala@yahoo.com",
            "djale2008@gmail.com",
            "abfairfax@gmail.com",
            "arazzak9876@gmail.com",
            "aprilwells04@gmail.com",
            "feyzaozcan90@hotmail.com"};

}
