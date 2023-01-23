package OOPHomeWork;

public class PhoneTest {
    public static void main(String[] args) {
        Phone Samsung=new Phone();
        Samsung.brand="Samsung";
        Samsung.color="Black";
        Samsung.model="S22";
        Samsung.ScreenSize=6.9;
        Samsung.Functions="Touch";
        Samsung.PriceRange=1200;

        Samsung.VoiceTone();
        Samsung.Vibration();
        Samsung.RingTone();
        Samsung.Camera();
        Samsung.Internet();



        Phone IPhone=new Phone();
        IPhone.model="13ProMax";
        IPhone.brand="Apple";
        IPhone.color="Black";
        IPhone.Functions="Touch";
        IPhone.ScreenSize=6.0;
        IPhone.PriceRange=1400;

        IPhone.RingTone();
        IPhone.Vibration();
        IPhone.VoiceTone();
        IPhone.Camera();
        IPhone.Internet();


        Phone Pixel=new Phone();
        Pixel.model="Pixel";
        Pixel.brand="Pixel Pro 7";
        Pixel.color="White";
        Pixel.Functions="Touch";
        Pixel.ScreenSize=849;
        Pixel.PriceRange=900;

        Pixel.RingTone();
        Pixel.Vibration();
        Pixel.VoiceTone();
        Pixel.Camera();
        Pixel.Internet();

    }

}
