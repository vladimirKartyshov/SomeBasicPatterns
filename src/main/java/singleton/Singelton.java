package singleton;

public class Singelton {

    private static Object sync = new Object();

    public static int counter = 0;

    private static  volatile Singelton instance = null;

    private Singelton(){
        counter ++;
    }

  //  public static Singelton getInstance(){// код когда в строке 7 = new Singelton (для многопоточной среды)
   //     return instance;
   // }
   //====================================================================================================
  //  public static Singelton getInstance(){ // не работает в многопоточной среде
      //  if(instance == null){
     //       instance = new Singelton();
     //   }
     //   return instance;
  //  }
    //=============================================================================================================
   // public static synchronized Singelton getInstance(){// чтобы в строке 7 instance = new Singelton (не инициал-ся
     //   if(instance == null){                          // singelton при вызове класса делаем ленивую инициализ-ю
      //      instance = new Singelton();                // чтобы инициа-ся при вызове getInstance
      //  }                                             // Будет работать в многопоточке(synchronized)
       // return instance;
   // }
   //==============================================================================================================

    public static  Singelton getInstance(){
        if(instance == null){
            synchronized (sync){    // чтобы synchronised вызывался один раз
                if(instance == null)
                    instance = new Singelton();
                }
            }
        return instance;
    }
}
