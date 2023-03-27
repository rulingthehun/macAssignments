package _17_07_11_2022_Selenium_Wait_Scroll_Odevleri_Robot_Class;

import Utility.BaseDriverEdge;
import org.junit.Test;

public class Q7 extends BaseDriverEdge {
    /*
                7-Senaryo
            https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
            1) “Add Element” butona basin
            2) “Delete” butonu gorunur oluncaya kadar bekleyin
            3) “Delete” butonunun gorunur oldugunu test edin
            4) Delete butonuna basarak butonu silin
            5) Delete butonunun gorunmedigini test edin
     */
    @Test
    public void Test(){
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        driverStop();
    }
}