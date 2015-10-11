package teema1;

import javafx.application.Application;
import javafx.stage.Stage;
import lib.Foor;

/**
 * Täpselt nagu oli fooriga, on nüüd ristmikuga. Kuidas esiteks
 * ristmik üles ehitada loe Foori README.md-st: https://github.com/KristerV/javaHarjutused
 */
public class Peamurdja2_ristmik extends Application {

    public void start(Stage primaryStage) throws Exception {

        Foor foor = new Foor(Foor.YLEMINE, primaryStage);
        foor.vahetaPunast();
        foor.paus(4.4);

        int count = 0;
        while (count < 5) {

            foor.vahetaPunast();
            foor.vahetaKollast();
            foor.paus(0.5);
            foor.vahetaKollast();
            foor.vahetaRohelist();
            foor.paus(1.5);
            foor.vahetaRohelist();
            foor.paus(0.3);
            foor.vahetaRohelist();
            foor.paus(0.3);
            foor.vahetaRohelist();
            foor.paus(0.3);
            foor.vahetaRohelist();
            foor.paus(0.3);
            foor.vahetaRohelist();
            foor.vahetaKollast();
            foor.paus(0.5);
            foor.vahetaKollast();
            foor.vahetaPunast();
            foor.paus(4.4);

            count = count + 1;
        }

        foor.vahetaPunast();

        Foor foor2 = new Foor(Foor.ALUMINE, primaryStage);
        foor2.vahetaPunast();
        foor2.paus(4.4);

        int count2 = 0;
        while (count2 < 5) {

            foor2.vahetaPunast();
            foor2.vahetaKollast();
            foor2.paus(0.5);
            foor2.vahetaKollast();
            foor2.vahetaRohelist();
            foor2.paus(1.5);
            foor2.vahetaRohelist();
            foor2.paus(0.3);
            foor2.vahetaRohelist();
            foor2.paus(0.3);
            foor2.vahetaRohelist();
            foor2.paus(0.3);
            foor2.vahetaRohelist();
            foor2.paus(0.3);
            foor2.vahetaRohelist();
            foor2.vahetaKollast();
            foor2.paus(0.5);
            foor2.vahetaKollast();
            foor2.vahetaPunast();
            foor2.paus(4.4);


            count2 = count2 + 1;
        }

        foor2.vahetaPunast();

        Foor foor3 = new Foor(Foor.VASAK, primaryStage);
        foor3.vahetaRohelist();
        foor3.paus(1.5);

        int count3 = 0;
        while (count3 < 5) {

            foor3.vahetaRohelist();
            foor3.paus(0.3);
            foor3.vahetaRohelist();
            foor3.paus(0.3);
            foor3.vahetaRohelist();
            foor3.paus(0.3);
            foor3.vahetaRohelist();
            foor3.paus(0.3);
            foor3.vahetaRohelist();
            foor3.vahetaKollast();
            foor3.paus(0.5);
            foor3.vahetaKollast();
            foor3.vahetaPunast();
            foor3.paus(4.8);
            foor3.vahetaPunast();
            foor3.vahetaKollast();
            foor3.paus(0.5);
            foor3.vahetaKollast();
            foor3.vahetaRohelist();
            foor3.paus(1.5);


            count3 = count3 + 1;
        }

        foor3.vahetaRohelist();

        Foor foor4 = new Foor(Foor.PAREM, primaryStage);
        foor4.vahetaRohelist();
        foor4.paus(1.5);

        int count4 = 0;
        while (count4 < 5) {

            foor4.vahetaRohelist();
            foor4.paus(0.3);
            foor4.vahetaRohelist();
            foor4.paus(0.3);
            foor4.vahetaRohelist();
            foor4.paus(0.3);
            foor4.vahetaRohelist();
            foor4.paus(0.3);
            foor4.vahetaRohelist();
            foor4.vahetaKollast();
            foor4.paus(0.5);
            foor4.vahetaKollast();
            foor4.vahetaPunast();
            foor4.paus(4.8);
            foor4.vahetaPunast();
            foor4.vahetaKollast();
            foor4.paus(0.5);
            foor4.vahetaKollast();
            foor4.vahetaRohelist();
            foor4.paus(1.5);


            count4 = count4 + 1;
        }

        foor4.vahetaRohelist();


    }
}
