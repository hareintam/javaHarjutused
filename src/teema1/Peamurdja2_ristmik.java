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

        Foor foor1 = new Foor(Foor.YLEMINE, primaryStage);
        Foor foor2 = new Foor(Foor.ALUMINE, primaryStage);
        Foor foor3 = new Foor(Foor.VASAK, primaryStage);
        Foor foor4 = new Foor(Foor.PAREM, primaryStage);
        vertikaalne(foor1);
        vertikaalne(foor2);
        horisontaalne(foor3);
        horisontaalne(foor4);

    }


        public void vertikaalne(Foor foor) {

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
        }



        public void horisontaalne(Foor foor) {

        foor.vahetaRohelist();
        foor.paus(1.5);

        int count3 = 0;
        while (count3 < 5) {

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
            foor.paus(4.8);
            foor.vahetaPunast();
            foor.vahetaKollast();
            foor.paus(0.5);
            foor.vahetaKollast();
            foor.vahetaRohelist();
            foor.paus(1.5);


            count3 = count3 + 1;
        }

        foor.vahetaRohelist();


    }



    }
