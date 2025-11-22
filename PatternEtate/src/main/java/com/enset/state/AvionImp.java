package com.enset.state;

public class AvionImp implements Avion {
    private State state;
    public AvionImp() {
        state= new EtatEnPiste(this);
    }
    @Override
    public void sortirDuGarage() {
        state.executesortirDuGarage();
    }

    @Override
    public void entrerAuGarage() {
        state.executeentrerAuGarage();
    }

    @Override
    public void decoller() {
        state.executedecoller();
    }

    @Override
    public void atterir() {
        state.executeatterir();
    }

    @Override
    public void doActivity() {
        state.executedoActivity();
    }

    abstract class State {
        protected AvionImp avionImp;
        public State(AvionImp avionImp) {
            this.avionImp = avionImp;
        }
       abstract void executesortirDuGarage();
        abstract void executeentrerAuGarage();
        abstract  void executedecoller();
        abstract void executeatterir();
        abstract void executedoActivity();
    }
    class EtatEnPiste extends State {

        public EtatEnPiste(AvionImp avionImp) {
            super(avionImp);
        }

        @Override
        void executesortirDuGarage() {
            System.out.println("Impossible de sortir du garage");
        }

        @Override
        void executeentrerAuGarage() {
            System.out.println("Transition d'etat de  En Piste => Garage");
         avionImp.state= new EtatAuGarage(avionImp);
        }

        @Override
        void executedecoller() {
            System.out.println("Transition d'etat de  En Piste => decollage");
            avionImp.state= new EtatEnLair(avionImp);
        }

        @Override
        void executeatterir() {
            System.out.println("Impossible je suis en piste");

        }

        @Override
        void executedoActivity() {
            for(int i = 0 ; i<10 ;i++){
                System.out.println("Activité de l'etat en piste .................");
            }
        }
    }
    class EtatAuGarage extends State {


        public EtatAuGarage(AvionImp avionImp) {
            super(avionImp);
        }

        @Override
        void executesortirDuGarage() {
            System.out.println("Transition d'etat de  Garage => Piste");
            avionImp.state= new EtatEnPiste(avionImp);

        }

        @Override
        void executeentrerAuGarage() {
            System.out.println("imposible je suis au garage");

        }

        @Override
        void executedecoller() {
            System.out.println("imposible de decoller  je suis au garage");
        }

        @Override
        void executeatterir() {
            System.out.println("imposible d'etterir je suis au garage");
        }

        @Override
        void executedoActivity() {
            for(int i = 0 ; i<10 ;i++){
                System.out.println("Activité de l'etat au garage  ................."+i);
            }
        }
    }
    class EtatEnLair extends State {

        public EtatEnLair(AvionImp avionImp) {
            super(avionImp);
        }

        @Override
        void executesortirDuGarage() {
            System.out.println("impossible de sortir de garage je suis en laire");
        }

        @Override
        void executeentrerAuGarage() {
            System.out.println("impossible de entrer de garage je suis en laire");

        }

        @Override
        void executedecoller() {
            System.out.println("impossible de decoller  je suis en laire");

        }

        @Override
        void executeatterir() {
            System.out.println("Transition d'etat de  en l'air => Piste");
            avionImp.state= new EtatEnPiste(avionImp);


        }

        @Override
        void executedoActivity() {
            for(int i = 0 ; i<10 ;i++){
                System.out.println("Activité de l'etat en l'air .................");
            }

        }
    }
}
