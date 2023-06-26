package com.upax.zeus.locator.livestream;

import com.upax.zeus.core.BaseLocator;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FormularioLiveStreamLocator extends BaseLocator {

    @AndroidFindBy(id = "com.upax.zeusgeneric:id/zsl_edt_add_title_live_stream")
    public WebElement titulo;

    @AndroidFindBy(id = "com.upax.zeusgeneric:id/zsl_txt_add_date")
    public WebElement fecha;

    @AndroidFindBy(className = "android.widget.CheckedTextView")
    public List<WebElement> diasCalendario;

    @AndroidFindBy(id = "com.upax.zeusgeneric:id/zsl_txt_add_start_hour")
    public WebElement horaInicio;

    @AndroidFindBy(id = "com.upax.zeusgeneric:id/zsl_number_picker_hour")
    public WebElement hora;

    @AndroidFindBy(id = "com.upax.zeusgeneric:id/zsl_btn_time_picker_select")
    public WebElement timePickerButton;

    @AndroidFindBy(id ="com.upax.zeusgeneric:id/zsl_txt_add_end_hour")
    public WebElement horaFin;

    @AndroidFindBy(id = "com.upax.zeusgeneric:id/zsl_edt_add_link")
    public WebElement linkEvento;

    @AndroidFindBy(id = "com.upax.zeusgeneric:id/radio10ThousandOption")
    public WebElement radio10kParticipantes;

    @AndroidFindBy(id = "com.upax.zeusgeneric:id/zsl_btn_add_schedule")
    public WebElement agendarButton;

    @AndroidFindBy(id = "com.upax.zeusgeneric:id/zsl_btn_dialog_confirm")
    public WebElement confirmarButton;

    @AndroidFindBy(id = "com.upax.zeusgeneric:id/zsl_btn_dialog_success_continue")
    public WebElement continuarButton;
}
